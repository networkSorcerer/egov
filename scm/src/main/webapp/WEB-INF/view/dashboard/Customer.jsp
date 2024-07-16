<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/view/common/common_include.jsp"></jsp:include>
<script type="text/javascript">
	
</script>
</head>

<body>
	<div>
		<div>
			<div>
				<div>
					<h1>고객명단</h1>
				</div>
				
				<div class="divCustomerList">
					<table class="col">
						<caption>caption</caption>
                            <colgroup>
				                   <col width="50px">
				                   <col width="200px">
				                    <col width="60px">
				                   <col width="50px">
			                 </colgroup>
						<thead>
							<tr>
					              <th scope="col">고객 ID 번호</th>
					              <th scope="col">고객 회사명</th>
					              <th scope="col">담당자명</th>
					              <th scope="col">담당자 전화번호</th>
					              
							</tr>
						</thead>
						<tbody id="customerList">
							<c:forEach items="${cList }" var="list">
								<tr>
									<td>${list.cust_id }</td>
									<td>${list.cust_name }</td>
									<td>${list.cust_person }</td>
									<td>${list.cust_person_ph }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					
					<!-- 페이징 처리  -->
					<!-- <div class="paging_area" id="pagingNavi"> -->
					</div>
									
				</div>
			</div>
		</div>
</body>
</html>