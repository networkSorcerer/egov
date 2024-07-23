<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	
	<c:forEach items="${deliveryList}" var="deliveryItem">
	    <tr>
	       	<td>${deliveryItem.delivery_num}</td>
	       	<td>
	       		<fmt:formatDate pattern = "yyyy-MM-dd" value="${deliveryItem.delivery_date}"/>
	       	</td>
	       	<td>${deliveryItem.delivery_name}</td>
	        <td>${deliveryItem.delivery_start_loc}</td>
	        <td>${deliveryItem.delivery_end_loc}</td>
	        <td>${deliveryItem.obtain_count}</td>
	        <td>${deliveryItem.delivery_state}</td>
	    </tr>
	</c:forEach>
	
