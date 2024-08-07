<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="{noticeCnt eq 0 }">
	<tr>
		<td colspan="4">데이터가 존재하지 않습니다</td>
	</tr>
</c:if>

<c:if test="${noticeCnt > 0}">
	<c:set var ="nRow" value="${pageSize*(currentPage -1) }"/>
	<c:forEach items="${nList }" var="list">
		<tr>
			<td>${list.noti_seq }</td>
			<td><a href="javascript:noticeDetailModal(${list.noti_seq});">${list.noti_title}</a></td>
			<%-- <td><a href="javascript:noticeDetailFileModal(${ list.noti_seq});">${list.noti_title }</a></td> --%>
			<td>${list.noti_date }</td>
			<td>${list.loginID }</td>
		</tr>
		<c:set var="nRow" value="${nRow + 1 }"/>
	</c:forEach>
</c:if>

<input type="hidden" id="totcnt" name="totcnt" value="${noticeCnt }"/>