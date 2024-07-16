<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/view/common/common_include.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
$(document).ready(function(){
    $.ajax({
        url: "/order/orderList.do",
        type: "post",
        dataType: "json",
        success: function(response) {
            var orderList = response.oList;
            var html = "";
            
            orderList.forEach(function(item){
                html += "<option value='" + item.seq + "'>" + item.product_name + "</option>";
            });
            
            $("#list1").html(html);
        },
        error: function(xhr, status, error) {
            console.error("AJAX 오류 발생:", error);
        }
       
    });
    
});
</script>
</head>
<body>
<div>
    <div>
        <h1>주문 목록</h1>
    </div>
    <div>
        <select id="list1">
            <!-- Options dynamically populated by JavaScript -->
        </select>
    </div>
</div>
</body>
</html>
