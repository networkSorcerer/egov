<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${cCnt eq 0 }">
	<tr>
		<td>데이터가 존재하지 않습ㄴ디ㅏ </td>
	</tr>
</c:if>
<c:if test="${cCnt > 0 }">
	<c:forEach items="${cList }" var="list">
	<tr>
		<td>${list.cust_id }</td>
		<td>${list.cust_name }</td>
		<td>${list.cust_person }</td>
		<td>${list.cust_person_ph }</td>
	</tr>
</c:forEach>
</c:if>


 <input type="hidden" id="totcnt" name="totcnt" value="${cCnt}"/>