<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/view/common/common_include.jsp"></jsp:include>
<script type="text/javascript">
	var pageSize = 5;
	var pageBlockPage = 10;
	
	$(function() {
		customerSearch();

	})
	
	function customerSearch(cpage) {
		var param ={};
		/* cpage = cpage || 1;
		var param = {
				searchTitle : $("#searchTitle").val(),
				searchStDate : $("#searchStDate").val(),
				searchEdDate : $("#searchEdDate").val(),
				currentPage : cpage,
				pageSize : pageSize
				
		}; */
		var callBackFunction = function(response) {
			$("#customerList").empty().append(response);
			
		}
		callAjax("/system/customerList.do", "post", "text", false, param, callBackFunction);
		
	}
	
	function insertModal(){
		$("#loginId").val("");
		$("#cust_name").val("");
		$("#cust_id").val("");
		$("#btnUpdate").hide();
		$("#btnSave").show();
		$("#btnDelete").hide();
		
		gfModalPop("#InsertModal");
	}
	
	
</script>
</head>

<body>
	<div>
		<div>
			<div>
				
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
						<tbody id="customerList"></tbody>
					</table>
					
					<!-- 페이징 처리  -->
					<div class="paging_area" id="pagingNavi">
					</div>
									
				</div>
			</div>
		</div>
	</div>
</body>
</html>