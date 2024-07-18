<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/view/common/common_include.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
</head>
<script type="text/javascript">
var pageSize=5;
var pageBlockPage=10;

$(function(){
	productList(1);
})
function productList(cpage) {
	cpage = cpage || 1;
	
	var param = {
			currentPage : cpage,
			pageSize : pageSize
	}
	console.log(param);
	$.ajax({
		url: "/product/productList.do",
		type:"post",
		dataType:"json",
		data: param,
		success : function(response){
			var productList = response.productList;
			var html ="";
			var nRow = pageSize*(cpage -1);
			
			productList.forEach(function(item, index){
				nRow++;
				html+="<tr>";
				html+="<td>"+item.item_code+"</td>";
				html+="<td>"+item.item_name+"</td>"
				html+="<td>"+item.manufac+"</td>"
				html+="<td>"+item.provide_value+"</td>"
				html+="</tr>";
				
				$("#item_code").val(item.item_code);
				
				
			
			})
			$("#productList").html(html);
			
			$("#totcnt").val(response.productCnt);
			$("#nRow").val(nRow);
			$("#currentPage").val(cpage);
			
			var pagieNavigateHtml = getPaginationHtml(cpage, $("#totcnt").val(), pageSize, pageBlockPage, "productList")
			$("#pagingNavi").empty().append(pagieNavigateHtml);
			$("#currentPage").val(cpage);
			
			console.log("Total Count: ", response.productCnt);
		}
	})
}
</script>
<body>
	 <input type="hidden" id="currentPage" value="">
    <input type="hidden" name="action" id="action" value="">
    <div id="wrap_area">
        <h2 class="hidden">header 영역</h2>
        <jsp:include page="/WEB-INF/view/common/header.jsp"></jsp:include>

        <h2 class="hidden">컨텐츠 영역</h2>
        <div id="container">
            <ul>
                <li class="lnb">
                    <jsp:include page="/WEB-INF/view/common/lnbMenu.jsp"></jsp:include>
                </li>
                <li class="contents">
                    <h3 class="hidden">contents 영역</h3>
                    <div class="content">
                        <p class="Location">
                            <a href="#" class="btn_set home">메인으로</a>
                            <a href="#" class="btn_nav bold">담당업무</a>
                            <span class="btn_nav bold">배송처리</span>
                            <a href="#" class="btn_set refresh">새로고침</a>
                        </p>

                        <div>
                            <div class="deliveryList">
                                <p class="conTitle">
                                    <span>상품 목록</span>
                                    <span class="fr">
                                        	상품명
                                        <input type="text" id="searchTitle" name="searchTitle" style="height: 25px; margin-right: 10px;"/>
                                        	기간 (기간 검색 필요한가요? )
                                        <input type="date" id="searchStDate" name="searchStDate" style="height: 25px; margin-right: 10px;"/> 
                                        ~ 
                                        <input type="date" id="searchEdDate" name="searchEdDate" style="height: 25px; margin-right: 10px;"/>
                                        <a class="btnType red" href="#" name="searchbtn" id="searchBtn"><span>검색</span></a>
                                    </span>
                                </p>
                                <div class="radio">
                                    <input type="radio" value="" name="deliveryRadio" checked>전체
                                    <input type="radio" value="ing" name="deliveryRadio">배송중
                                    <input type="radio" value="done" name="deliveryRadio">배송완
                                </div>
                            </div>
							<div>
								<input type="hidden" id="item_code" name="item_code">
								<input type="hidden" id="totcnt" name="totcnt">
								<input type="hidden" id="nRow" name="nRow">
								
							</div>
							<div>
								<table class="col">
	                                <tr>
	                                	<td>상품코드</td>
	                                	<td>상품명</td>
	                                	<td>제조사</td>
	                                	<td>판매가</td>
	                                </tr>
	                                <tbody id="productList">
	                                
	                                </tbody>                              
	                            </table>
							</div>
							
							
                        	<div class="paging_area" id="pagingNavi">
							</div>
							
							
                            <div id="layer1" style="display: none;">
                                <h4>상세 정보</h4>
                                <table id="returnDetail">
                                    <!-- 상세 정보가 여기에 표시됩니다. -->
                                </table>
                                <input type="hidden" id="seq">
                                <input type="hidden" id="item_code">
                                <input type="hidden" id="return_count">
                                <button id="close">닫기</button>
                            </div>

                            <button id="insert" style="display: none;">추가</button>
                            <button id="modify" style="display: none;" onClick="practice();">수정</button>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</body>
</html>