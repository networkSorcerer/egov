<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
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
   
    
    $("#list").change(function(){
    	var cust_id = $(this).val();
    	$("#show").show();
    	$.ajax({
    		url:"/cust/custDetail.do",
    		type:"post",
    		dataType:"json",
    		data: { cust_id: cust_id },
    		 success: function (response) {
                 var custDetail = response.custDetail;
				var html= "";
                 // 기존에 있던 데이터 삭제
                 $("#customerDetail").empty();

                 // 고객 상세 정보 테이블에 행 추가
                 custDetail.forEach(function(item){
                	 html += "<td>" + item.cust_id + "</td>";
                     html += "<td><a href='javascript:custDetail();''>" + item.cust_name + "</a></td>";
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
    
    function custDetail(){
    	gfModalPop("#layer7");
    }
    
});
</script>
<body>
	<div>
		<div>
			<div>
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
				
			</div>
		</div>
	</div>
<!-- 신규로 작성할수 있는 모달 창과 수정 할수 있는 모달 창을 추가 하도록 하자  
회사명을 클릭하면 수정화면으로 가게 되고 거기서 삭제도 가능 신규 버튼을 클릭 하면 신규로 cust_info 에 회사 정보를 입력할수 있도록 해보자 
-->	
	<div id="layer7" class="layerPosition layerPop layerType2" style="width: 600px; height : 600px">
		<div>
			<div>
				안녕? 7층
			</div>
		</div>
	</div>
</body>
</html>