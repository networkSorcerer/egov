<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	
	<c:forEach items="${obtainList}" var="obtainListItem">
	    <tr>
	        <td style="display:none" id="obtain_item_code">${obtainListItem.item_code}</td>
	        <td id="obtain_seq">${obtainListItem.seq}</td>
	        <td id="obtain_obtain_date">${obtainListItem.obtain_date}</td>
	        <td id="obtain_cust_name">${obtainListItem.cust_name}</td>
	        <td id="obtain_item_name">${obtainListItem.item_name}</td>
	        <td id="obtain_obtain_count">${obtainListItem.obtain_count}</td>
	        <td id="obtain_inventory_count">${obtainListItem.inventory_count}</td>
	        <td id="obtain_depositYN">${obtainListItem.depositYN}</td>
	        <td style="display:none"id="obtain_addr">${obtainListItem.addr}</td>

	        <td>
	            <c:if test="${obtainListItem.depositYN eq 'Y'}">
	                <c:if test="${obtainListItem.obtain_count <= obtainListItem.inventory_count}">
	                    <button type="button" class="btn btn-primary btn-sm openDeliverybtn" 
	                            id="openDeliverybtn-${status.index}" 
	                            data-order-id="<c:out value='${obtainListItem.loginID}'/>" 
	                            onClick="javascript:deliveryModal(this);">배송지시서작성</button>
	                </c:if>
	            </c:if>
	        </td>
<%-- 	        id가 겹칠 수 있으니까 id="openDeliverybtn-${status.index}"  --%>
	    </tr>
	</c:forEach>							 
