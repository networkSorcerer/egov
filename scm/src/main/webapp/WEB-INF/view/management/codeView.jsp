<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!-- 갯수가 0인 경우  -->
		<c:if test="${codeCnt eq 0 }">
			<tr>
				<td colspan="4">데이터가 존재하지 않습니다.</td>
			</tr>
		</c:if>



        <c:if test="${codeCnt > 0 }">
			<c:set var="nRow" value="${pageSize*(currentPage-1)}" /> 
            <c:forEach var="list" items="${codeList}"  varStatus="status">
                <tr>
                    <td class="codeDetailView" >${status.index + 1}</td>
                    <td id="groupCode" data-groupcode="${list.group_code}">${list.group_code}</td>
                    <td id="groupName" data-groupname="${list.group_name}">${list.group_name}</td>
                    <td id="groupYn" data-groupyn="${list.use_yn}">${list.use_yn}</td>
                    <td>${list.reg_date}</td>
                    <td><button class="ajustBtn">수정</button></td>
                    
                </tr>
               <c:set var="nRow" value="${nRow + 1}" />
            </c:forEach>
        </c:if>
        
            
      
<script>
$(document).ready(function() {
	
	
	$(".ajustBtn").click(function() {
		$("#myModal").show();
		
		<c:forEach var="list" items="${codeList}">
    		var group_code = "${list.group_code}";
    		console.log("값: "+group_code);
		</c:forEach>
		
		//var group_code = $("#groupCode").data('groupcode');
		//var group_name = $("#groupName").data('groupname');
		//var use_yn = $("#groupYn").data('groupyn');
		
		//$("#groupCodeModal").val(group_code);
		//$("#groupCodeNameModal").val(group_name);
		 
		/*if(use_yn == 'Y'){
			$("input[name='codeRadio'][value=0]").prop("checked", true);
		} else {
			$("input[name='codeRadio'][value=1]").prop("checked", true);
		}*/
		
		
	});
    
});
</script>
    
    
