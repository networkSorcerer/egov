<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<c:forEach items="${list}" var="list" varStatus="i">
		<tr class="storageDetail">
			<td>${list.company_seq}</td>		
			<td>${list.company_name}</td>							
			<td><a href="javascript:orderComponyDelete(${list.company_seq});"><button>삭제</button></a></td>							
		</tr>
	</c:forEach>
