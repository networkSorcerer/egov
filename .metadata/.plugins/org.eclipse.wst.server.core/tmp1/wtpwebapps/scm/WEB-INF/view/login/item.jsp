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
	var param ={};
	$.ajax({
		url:"/item/itemList.do",
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
$(document).ready(function(){
	$("#modeItem").click(function(){
		var param = {
				item_code : $("#item_code").val(),
				item_name : $("#mode_item_name").val(),
				manufac : $("#mode_manufac").val(),
				provide_value : $("#mode_provide_value").val()
				
		}
		$.ajax({
			url : "/item/itemModify.do",
			type : "post",
			dataType : "json",
			data : param,
			success : function(response) {
				alert(response.resultMsg);
				itemDetail();
			}
		})
	})
	$("#itemList1").click(function(){
		$("#main_item").hide();
        $("#layer30").show();
        console.log("확인");
        $.ajax({
        	url :"/item/itemList.do",
        	type:"post",
        	dataType:"json",
        	success : function(response){
        		var itemList = response.itemList;
        		var html="";
        		
        		itemList.forEach(function(item){
        			html+="<tr>";
        			html+="<td>"+item.item_code+"</td>";
        			html+="<td>"+item.item_name+"</td>";
        			html+="<td>"+item.manufac+"</td>";
        			html+="<td>"+item.provide_value+"</td>";
        			html+="</tr>";


        		})
        		$("#itemList2").html(html);
        	}
        })
        
    });
})
function itemOption(){
	$("#main_item").show();
	$("#layer30").hide();
	
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
                            	<option>상품명을 선택하세요</option>
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
		<div>
			<div>
				<h1>상품 리스트</h1> 
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
			<br>
			<div>
				<a href="javascript:itemOption();" class="btn btn-success">옵션으로 보기</a>
				<a href="#" onclick='deleteCust();' class="btn btn-danger">삭제</a>
				<a href="javascript:close();" class="btn btn-secondary">닫기</a>
			</div>
			<div>
				
			</div>
			
		</div>
	</div>
</body>
</html>