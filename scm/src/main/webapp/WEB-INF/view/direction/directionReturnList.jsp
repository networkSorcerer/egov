<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	
	<c:forEach items="${returnList}" var="returnItem">
	    <tr>
	       	<td>${returnItem.return_order_date}</td>
	       	<td>${returnItem.item_name }</td>
	        <td>${returnItem.return_count}</td>
	        <td>
	        	<fmt:formatNumber value="${returnItem.return_price}" pattern="#,###"/>원
	        </td>
	        <td>${returnItem.signYN}</td>
	    </tr>
	</c:forEach>