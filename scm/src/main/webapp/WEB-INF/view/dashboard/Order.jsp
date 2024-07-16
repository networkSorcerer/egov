<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
					              <th scope="col">주문 번호</th>
					              <th scope="col">상품 명</th>
					              <th scope="col">상품 수</th>
					              <th scope="col">주문자</th>
					              <th scope="col">주문일</th>
							</tr>
						</thead>
						<tbody id="customerList">
							<c:forEach items="${oList }" var="list">
								<tr>
									<td>${list.seq}</td>
									<td>${list.product_name }</td>
									<td>${list.oerder_count }</td>
									<td>${list.order_company }</td>
									<td>${list.order_date }</td>
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