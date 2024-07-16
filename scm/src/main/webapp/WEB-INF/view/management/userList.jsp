<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!-- 갯수가 0인 경우  -->
		<c:if test="${userCnt eq 0 }">
			<tr>
				<td colspan="4">데이터가 존재하지 않습니다.</td>
			</tr>
		</c:if>



        <c:if test="${userCnt > 0 }">
			<c:set var="nRow" value="${pageSize*(currentPage-1)}" /> 
            <c:forEach var="list" items="${user}">
                <tr>
                	<c:if test="${list.user_type eq 'B'}" >
                		<td class="detailView" data-custid="${list.loginID}" >기업 고객</td>
                	</c:if>
                	<c:if  test="${list.user_type != 'B'}" >
                		<td class="detailView" data-loginid="${list.loginID}">내부 직원</td>
                	</c:if>
                	
                    <td >${list.name}</td>
                    <td>${list.job_code}</td>
                    <td>${list.cust_person}</td>
                    <td>${list.phone}</td>
                </tr>
               <c:set var="nRow" value="${nRow + 1}" />
            </c:forEach>
        </c:if>
            
            <input type="hidden" id="totcnt" name="totcnt" value="${noticeCnt}"/>
      
<script>
$(document).ready(function() {
	
    $('.detailView').click(function() {
    	$("#deleteBtn").show();
    	$("#new").hide();
        var type = ($(this).data('custid') != 'undefined' && $(this).data('custid') != null) ? "기업고객" : "내부직원"; // 클릭된 요소의 type을 확인하고 저장
        
        var callBackFunction = function(response){
    		$("#detail").empty().append(response);
    	}
        
        if(type == "기업고객"){
        	var param =  {searchTitle : $(this).data('custid')};
        	callAjax("/management/custDetail.do", "post", "text", false, param,callBackFunction);
        }
        else if(type == "내부직원") {
        	var param = { searchTitle : $(this).data('loginid')};
        	callAjax("/management/userDetail.do", "post", "text", false, param,callBackFunction);
        }
    });
});
</script>
    
    
