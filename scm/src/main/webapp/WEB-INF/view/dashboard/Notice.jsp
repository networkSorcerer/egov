<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/view/common/common_include.jsp"></jsp:include>
<script>
function NoticeList() {
	var param = {
			
	}
	var callBackFunction (response) {
		$("#noticeList").empty.append(response);
	}
	$.ajax ({
		url: "/board/boardList.do",
		type : "post",
		dataType: "text",
		async : false,
		success : callBackFunction
	})
}
</script>
</head>
<body>
	<h1>실험 이거는 근데 왜이렇게 <br>밑에 만들어지는 걸까 알고 싶은데  </h1>
	<div>
		<div>
			<div>
				<h1>공지 사항</h1>
				<div>
					<table id="noticeList">
						<tr>
							<td>공지 번호</td>
							<td>공지 제목</td>
							<td>공지 날짜</td>
							<td>작성자</td>
						</tr>
						<tr >
							<c:forEach var="list" items="" >
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</c:forEach>
							
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>