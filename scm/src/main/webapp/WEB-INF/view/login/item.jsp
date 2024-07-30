<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/view/common/common_include.jsp"></jsp:include>
<script type="text/javascript">
$(document).ready(function(){
	$("#layer20").hide();
	$("#layer30").hide();
	$("#itemDetail").hide();
	$("#layerNewItem").hide();
	item_code();
	filePreview();
	var param ={};
	$.ajax({
		url:"/item/itemList1.do",
		type : "post",
		dataType :"json",
		data: param,
		success : function(response) {
			
			var itemList = response.itemList;
			var html ="";
				
			itemList.forEach(function(item){
				
				html+="<option  onClick='itemDetail("+item.item_code+")' value='"+item.item_code+"'>"+item.item_name+"("+item.provide_value+"원)"+"</option>"
				
				$("#item_code").val(item.item_code);
				
			})
			$("#itemList").html(html);
		}
	})
	$("#itemList").change(function(){// change를 활용할줄 알게 되는게 주용할듯 
		$("#itemDetail").show();
	
		var itemCode = $(this).val();
		itemDetail(itemCode);
	});
	$("#newItem").click(function(){
		newItem();
		console.log("확인");
	})
})

function itemDetail(itemCode) {
	$("#layer20").hide();
	var param = {
			item_code : itemCode
	};
	$.ajax({
		url:"/item/itemDetail.do",
		type:"post",
		dataType:"json",
		data: param,
		success : function(response) {
			var itemDetail = response.itemDetail;
			var html ="";
			
			$("#detail1").empty(); // 이렇게 empty를 적용해줘야 자동으로 새로고침이 된다 안하면 select 할때마다 리스트가 계속 늘어남 
			$("#modify").empty();
			itemDetail.forEach(function(item){
				html+="<td >"+item.item_code+"</td>";
				html += "<td><a href='javascript:void(0);' onclick='modify()'>" + item.item_name + "</a></td>";
				html+="<td>"+item.manufac+"</td>";
				html+="<td>"+item.provide_value+"</td>";
				
				$("#item_code").val(item.item_code);
			})
			$("#detail1").append(html);
			
		}
	})
	
	
}


function modify(){
	$("#layer20").show();
	$("#itemDetail").hide();
	var param ={
			item_code : $("#item_code").val()
	}

	$.ajax({
		url:"/item/itemDetail.do",
		data :param,
		dataType : "json",
		type : "post",
		success : function(response){
			var itemDetail = response.itemDetail;
			var html ="";
			$("#detail1").empty(); 
			$("#modify").empty();
			
			itemDetail.forEach(function(item){
				html+="<td><input style = 'width : 50px' type='text' id='mode_item_code' readonly value='"+item.item_code+"'></td>";
				html+="<td><input style = 'width : 50px' type='text' id='mode_item_name' value='"+item.item_name+"'></td>";
				html+="<td><input style = 'width : 50px' type='text' id='mode_manufac' value='"+item.manufac+"'></td>";
				html+="<td><input style = 'width : 50px' type='text' id='mode_provide_value' value='"+item.provide_value+"'></td>";

			})
			$("#modify").append(html);
		}
	})
}

var pageSize = 5; // Define pageSize here
var pageBlockPage = 5; // Define pageBlockPage here


$(document).ready(function() {
    $("#modeItem").click(function() {
        var param = {
            item_code: $("#item_code").val(),
            item_name: $("#mode_item_name").val(),
            manufac: $("#mode_manufac").val(),
            provide_value: $("#mode_provide_value").val()
        };

        $.ajax({
            url: "/item/itemModify.do",
            type: "post",
            dataType: "json",
            data: param,
            success: function(response) {
                alert(response.resultMsg);
                itemDetail();
            }
        });
    });
    $("#itemList1").click(function() {
        loadItemList(1);
    });
    $("#search").click(function(){
    	loadItemList();
    	console.log("검색");
    });
    $("#insertNewItem").click(function(){
    	InsertNewItem();
    } )
})

// 전역 범위에 함수 정의
function loadItemList(cpage) {
    $("#main_item").hide();
    $("#layer30").show();
    $("#layer20").hide();
    
    cpage = cpage || 1;

    var param = {
        currentPage: cpage,
        pageSize: pageSize,
        searchTitle : $("#searchTitle").val()
    };

    $.ajax({
        url: "/item/itemList.do",
        type: "post",
        dataType: "json",
        data: param,
        success: function(response) {
            var itemList = response.itemList;
            var html = "";
            var nRow = pageSize * (cpage - 1);

            itemList.forEach(function(item) {
                nRow++;
                html += "<tr>";
                html += "<td>" + item.item_code + "</td>";
                html += "<td>" + item.item_name + "</td>";
                html += "<td>" + item.manufac + "</td>";
                html += "<td>" + item.provide_value + "</td>";
                html += "</tr>";
            });

            $("#itemList2").html(html);
            $("#totcnt").val(response.itemCnt);
            $("#nRow").val(nRow);

            var pagieNavigateHtml = getPaginationHtml(cpage, $("#totcnt").val(), pageSize, pageBlockPage, "loadItemList");
            $("#pagingNavi").empty().append(pagieNavigateHtml);
            $("#currentPage").val(cpage);

            console.log("Total Count: ", response.itemCnt);
        }
    });
}


function itemOption(){
	$("#main_item").show();
	$("#layer30").hide();
	$("#layerNewItem").hide();
	
}

function newItem() {
	console.log("확인2");
	$("#layerNewItem").show();
	$("#fileInput").empty();
	$("#layer30").hide();
	$("#layer20").hide();
	$("#main_item").hide();
}
function InsertNewItem() {
	$.ajax({
		
	})
}

function estm_detail (){
	$.ajsx({
		url:"",
		
	})
}

function filePreview() {
    $("#fileInput").change(function(e) {
        e.preventDefault();
        
        // 파일이 있는 경우
        if (this.files && this.files[0]) {
            var file = this.files[0];
            var fileName = file.name;
            var fileExtension = fileName.split('.').pop().toLowerCase();  // 파일 확장자 추출
            
            var imgPath = "";
            var previewHtml = "";
            
            // 지원하는 이미지 형식인지 확인
            if (fileExtension === "jpg" || fileExtension === "gif" || fileExtension === "png") {
                imgPath = window.URL.createObjectURL(file);
                previewHtml = "<img src='" + imgPath + "' id='imgFile' style='width: 100px; height: 100px;' />";
                
                // 이전 미리보기 이미지 URL 해제
                if ($("#imgFile").length) {
                    URL.revokeObjectURL($("#imgFile").attr('src'));
                }
            } else {
                previewHtml = "<p>지원하지 않는 파일 형식입니다.</p>";
            }
            
            // 미리보기 HTML 업데이트
            $("#preview").empty().append(previewHtml);
        }
    });
}
function saveFileNotice(){
	if(!fValidatefile()){
		return;
	}
	
	var getForm = document.getElementById("layerNewItem");
	getForm.entype = 'multipart/form-data';
	var fileData = new FormData(getForm);
	
	var callBackFunction = function(data){
		if(data.result == "success"){
			alert("저장이 되었습니다");
			gfCloseModal();
			noticeSearch();
		}
	}
	
	callAjaxFileUploadSetFormData("/board/noticeSaveFile.do", "post", "json", false, fileData, callBackFunction);
}

function item_code () {
	$.ajax({
		url:"/item/item_code.do",
		type: "post",
		dataType : "json",
		success : function(response) {
			var dataList = response.item_code;
			var html ="";
			
			dataList.forEach(function(item){
				html+="<option>"+item.item_code+"("+item.estm_num+")"+"</option>";
			});
			$("#item_code1").html(html);
		}
	})
}
</script>
</head>
<body>
<div id="main_item">
<div class="container mt-4">
    <div class="row mb-3">
        <div class="col-12">
            <h1 class="mb-3">상품 리스트</h1>
            <button class="btn btn-primary" id="itemList1">리스트로 보기</button>
            <button class="btn btn-success" id="newItem" >아이템 신규등록</button>
        </div>
    </div>

    <div class="row">
        <div class="col-12">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>상품명(가격)</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <select id="itemList" class="form-control">
                            	
                                <!-- 옵션 항목이 동적으로 추가됨 -->
                            </select>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
    <div id="itemDetail" class="mt-4">
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>상품 코드</th>
                    <th>상품명</th>
                    <th>제조사</th>
                    <th>가격</th>
                </tr>
            </thead>
            <tbody>
                <tr id="detail1">
                    <!-- 상품 세부사항이 동적으로 추가됨 -->
                </tr>
            </tbody>
        </table>
    </div>
    <div>
    	<input type="hidden" id="item_code">
    </div>
</div>

<div id="layer20" >
    <div >
        <div >
            <div >
                <h5 class="modal-title">상품 상세 정보</h5>
               
            </div>
            <div class="modal-body">
                <table class="col" >
              	 	
                    <thead>
                        <tr>
                            <th >상품 코드</th>
                            <th>상품명</th>
                            <th>제조사</th>
                            <th>가격</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr id="modify" >
                            <!-- 상품 세부사항이 동적으로 추가됨 -->
                        </tr>
                    </tbody>
                </table>
            </div>
            <div>
            	<button id="modeItem" class="btn btn-success">수정</button>
            </div>
        </div>
    </div>
</div>



<div id="layer30" >
		<input type="hidden" id="currentPage" value="">
		<input type="hidden" id="totcnt" name="totcnt">
		<input type="hidden" id="nRow" name="nRow">
		<div>
			<div>
				<h1>상품 리스트</h1> 
			</div>
			<br>
			<div>
				<p>상품명</p>
			<input type="text" id="searchTitle" name="searchTitle" style="height: 25px; margin-right: 10px;"/>
			<button id="search" class="btn btn-success">검색</button>
			</div>
			
			
			<div>
				<table class="col">
					<tr>
						<td>상품 코드</td>
						<td>상품 명</td>
						<td>제조사</td>
						<td>가격</td>
					</tr>
					<tbody id="itemList2">
					
					</tbody>
				</table>
			</div>
			<div class="paging_area" id="pagingNavi"></div>
			<br>
			<div>
				<a href="javascript:itemOption();" class="btn btn-success">옵션으로 보기</a>
				
			</div>
			<div>
				
			</div>
			
		</div>
	</div>
	
	<div id="layerNewItem">
		<div>
			<h1>신규 item 등록</h1>
			<a href="javascript:itemOption();" class="btn btn-success">옵션으로 보기</a>
		</div>
		<div>
			<table class="col">
				<tr>
					<td>상품코드</td>
					
					<td>
						<select id="item_code1"  class="form-control">
							<!-- 아마도 여기에 나오는게 아닌가 싶다 ㄷㄷ  -->
						</select>
					</td>
					
				</tr>
		
				<tr>
					<td>상품명</td>
					<td><input  type='text' id="newItemName"></td>
				</tr>
				<tr>
					<td>제조사</td>
					<td><input  type='text' id="newManufac"></td>
				</tr>
				<tr>
					<td>가격</td>
					<td><input  type='text' id="newProvideValue"></td>
				</tr>
				<tr>
					<td>상품 이미지</td>
					<td><input type="file" name="fileInput" id="fileInput"></td>
				</tr>
				<tr>
					<td></td>
					<td >
						<div id="preview"></div>
					</td>
				</tr>
			</table>
		</div>
		<button id="insertNewItem" class="btn btn-success">등록</button>
	</div>
</body>
</html>