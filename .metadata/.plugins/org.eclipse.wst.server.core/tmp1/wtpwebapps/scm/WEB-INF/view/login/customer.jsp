<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="/WEB-INF/view/common/common_include.jsp"></jsp:include>

<!-- response append를 사용해서 ajax 데이터 출력  & select를 통해서 내용을 선택하면 화면에 상세 내용이 나오도록 하기  +CRUD 만들기 
이건 이스트 에그처럼 '아이디'를 누르면 숨어있던 메뉴 베너가 나오고 클릭했을 때 내가 연습하는 모달창을 열수 있게 하자 
-->
<!-- 해피잡 이미지를 클릭하면 레드닷 게임을 할수 있도록 해보자  -->
<script type="text/javascript">
$(document).ready(function(){
	$("#show").hide();
	
    $.ajax({
        url: "/cust/custList1.do",
        type: "POST", // POST 방식으로 요청
        dataType: "json", // 받아올 데이터 타입을 JSON으로 설정
        success: function(response) {
            var custList = response.custList; // 받아온 JSON 데이터에서 custList 배열 추출
            var html = ""; // 옵션 태그를 담을 문자열 초기화
            // custList 배열을 순회하며 옵션 태그 생성
            custList.forEach(function(item) {
                html += "<option value='" +item.cust_id+ "'>" + item.cust_name + " (" + item.cust_id + ")</option>";
                
            });
            
            // #list 요소에 생성된 옵션 태그 추가
            
            $("#list").html(html);
        },
        error: function(xhr, status, error) {
            console.error("AJAX 오류 발생:", error);
        }
    });

     
});

function custDetail(custId) {//중요하다 베리 아주 많이 data로 넣었더니 변수값에 혼동이 왔데 그래서 custId로 넣어줌
	currentCustId = custId;
    $("#layer7").show();
    console.log("cust_id", custId);
	
    var param = {
        cust_id: custId
    };

    $.ajax({
        url: "/cust/custDetail.do",
        type: "post",
        dataType: "json",
        data: param,
        success: function(response) {
            var custDetail = response.custDetail;
            var html = "";
				
            custDetail.forEach(function(item) {
                html += "<tr>";
                html += "<td><input class='cust_name' value='" + item.cust_name + "'></td>";
                html += "<td><input class='cust_person' value='" + item.cust_person + "'></td>";
                html += "<td><input class='cust_person_ph' value='" + item.cust_person_ph + "'></td>";
                html += "<td><input class='cust_ph' value='" + item.cust_ph + "'></td>";
                html += "</tr>";
            });

            $("#detail").html(html); // #detail 요소에 생성된 HTML 추가
        },
        error: function(xhr, status, error) {
            console.error("AJAX 오류 발생:", error);
        }
    });
}

$(document).ready(function(){
	$("#list").change(function(){
		var cust_id = $(this).val();
		$("#show").show();
		$.ajax({
			url:"/cust/custDetail.do",
			type:"post",
			dataType:"json",
			data: { cust_id: cust_id },// 이부분 엄청 중요했음 ㄷㄷ  근데 여러가지 내용을 수정하려면 어떻게 해야할까? 
					//var param = {cust_id : cust_id , cust_name : cust_name} 이런식으로 도전 
			 success: function (response) {
	             var custDetail = response.custDetail;
				var html= "";
	             // 기존에 있던 데이터 삭제
	             $("#customerDetail").empty();//이거 활용하면 모달창 껏다가 켜도 내용 초기화 되어있을 듯 

	             // 고객 상세 정보 테이블에 행 추가
	             custDetail.forEach(function(item){
	            	 html += "<td><a href='javascript:void(0);' onclick='custDetail(" + item.cust_id + ");' id='cust_name'>" + item.cust_id + "</td>";
	            	 html += "<td>" + item.cust_name + "</a></td>";
	                 html += "<td>" + item.cust_person + "</td>";
	                 html += "<td>" + item.cust_person_ph + "</td>";
	             })               
	             $("#customerDetail").append(html);
	         },
	         error: function(xhr, status, error) {
	             console.error("AJAX 오류 발생:", error);
	         }
		})
	})
});


function modifyCustomer() {
    var param = {
        cust_name: $(".cust_name").val(),
        cust_person: $(".cust_person").val(),
        cust_person_ph: $(".cust_person_ph").val(),
        cust_ph: $(".cust_ph").val(),
        cust_id: currentCustId 
    };
    $.ajax({
        url: "/cust/custModify.do",
        type: "post",
        dataType: "json",
        data: param,
        success: function(response) {
           alert(response.resultMsg);
        },
        error: function(xhr, status, error) {
            console.error("AJAX 오류 발생:", error);
        }
    });
}

function close() {
	$("#layer7").hide();
	$("#layer8").hide();
 	$("#list").val("");
}

function deleteCust(){
	var param ={
			cust_id : currentCustId
	}
	$.ajax({
		url:"/cust/custDelete.do",
		type:"post",
		dataType: "json",
		data:param,
		success: function(response){
			alert(response.resultMsg);
		}
	})
	
}

function newCustomer(){
	$("#layer8").show();
	$("#cust_name1").val("");
	$("#cust_ph1").val("");
	$("#cust_person1").val("");
	$("#cust_person_ph1").val("");
}

function newCustomerInsert(){
	var param ={
			cust_name :$("#cust_name1").val(),
			cust_ph:$("#cust_ph1").val(),
			cust_person:$("#cust_person1").val(),
			cust_person_ph:$("#cust_person_ph1").val()
	}
	$.ajax({
		url:"/cust/custInsert.do",
		type: "post",
		dataType:"json",
		data: param,
		success: function(response){
			alert(response.resultMsg);
		}
	})
}

</script>
<body>
	<div>
		<div>
			<div>
				<div>
					<a href="#" onclick='newCustomer();' class="btn btn-success">신규 등록</a>
				</div>
				<div > 
					
					<select id="list">
						<%-- <option>${list.cust_name }(${list.cust_id })</option> --%>
					</select>
					
				</div>
				<div>
					<table class="col" id="show">
						<tr>
							<td>고객 ID</td>
							<td>고객사</td>
							<td>고객사 담당자</td>
							<td>고객사 담당 자 번호</td>
						</tr>
						<tr id="customerDetail">
						
						</tr >
					</table>
				</div>
				<div>
					<input type="hidden" id="cust_id1" name="" >
				</div>
				
			</div>
		</div>
	</div>
<!-- 신규로 작성할수 있는 모달 창과 수정 할수 있는 모달 창을 추가 하도록 하자  
회사명을 클릭하면 수정화면으로 가게 되고 거기서 삭제도 가능 신규 버튼을 클릭 하면 신규로 cust_info 에 회사 정보를 입력할수 있도록 해보자 
-->	
	<div id="layer7" class="layerPosition layerPop layerType2" style="width: 600px; height : 450px">
		<div>
			<div>
				<h1>고객 정보 수정</h1> 
			</div>
			<div>
				<table>
					<tr id="detail">
						
					</tr>
				</table>
			</div>
			<br>
			<div>
				<a href="javascript:modifyCustomer();" class="btn btn-success">수정</a>
				<a href="#" onclick='deleteCust();' class="btn btn-danger">삭제</a>
				<a href="javascript:close();" class="btn btn-secondary">닫기</a>
			</div>
			<div>
				
			</div>
			
		</div>
	</div>
	<div id="layer8" class="layerPosition layerPop layerType2" style="width: 600px; height : 450px">
		<div>
			<div>
				<h1>신규 고객 등록</h1> 
			</div>
			<div>
				<table>
					<tr id="detail">
						<td>고객사</td>
						<td>고객사 연락처</td>
						<td>고객사 담당자</td>
						<td>고객사 담당자 연락처</td>
					</tr>
					<tr>
						<td><input type="text" id="cust_name1" name="cust_name"></td><!-- name도 넣어줘야 좋다 -->
						<td><input type="text" id="cust_ph1" name="cust_ph"></td>
						<td><input type="text" id="cust_person1" name="cust_person"></td>
						<td><input type="text" id="cust_person_ph1" name="cust_person_ph"></td>
					</tr>
				</table>
			</div>
			<br>
			<div>
				<a href="#" onClick="newCustomerInsert();" class="btn btn-success">등록</a>
				<a href="javascript:close();" class="btn btn-secondary">닫기</a>
			</div>
			<div>
				
			</div>
			
		</div>
	</div>
	
</body>
</html>