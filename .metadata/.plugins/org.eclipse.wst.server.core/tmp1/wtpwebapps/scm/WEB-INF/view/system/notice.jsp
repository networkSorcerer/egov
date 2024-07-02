<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<title> 공지사항  </title>

<jsp:include page="/WEB-INF/view/common/common_include.jsp"></jsp:include>

<script type="text/javascript">
	
	var pageSize = 5;
	var pageBlockPage = 10;
	
	$(function(){// 약간 뷰 에서 배웠던 onMounted 느낌임 
		noticeSearch();
		registerBtnEvent();
	})
	
	function registerBtnEvent() {
		$("a[name=btn]").click(function(e){//name이 btn인 것들을 제어함 
			e.preventDefault();
			
			var btnId = $(this).attr("id"); //name은 다 btn이지만 id로 특정해서 구분 하겠다
			switch(btnId){
			case "btnSaveNotice":
				saveNotice();
				break;
			case "btnUpdateNotice":
				saveNotice();
				break;
			case "btnDeleteNotice":
				saveNotice();
				break;
			case "btnClose":
				saveNotice();
				break;
			}
		})
		
	}
	
	function noticeSearch(cpage){
		
		cpage = cpage || 1;
		// 공지 사항 데이터 보여주는 로직 
		var param = { //let param 느낌 
				currentPage : cpage,
				pageSize: pageSize
				};
		
		/* $.ajax({
			url: "/system/noticeList.do",
			type: "post",
			dataType:"text",
			data: param,
			async: false, // 동기적으로 보내는게 좋은지 비동기로 보내는게 좋은지 선택.  리액트에서 많이 하게 됨 
			success: function(data){
				$("#noticeList").empty().append(data);
			}
		}); */
		
		var callBackFunction = function(response) {
			$("#noticeList").empty().append(response);
			
			var pagieNavigateHtml = getPaginationHtml(cpage,$("#totcnt").val(), pageSize, pageBlockPage, "noticeSearch")
			$("#pagingNavi").empty().append(pagieNavigateHtml)
		}
		callAjax("/system/noticeList.do", "post","text", false, param, callBackFunction)
	}
	
	function insertModal() {
		//모달 열어주는 함수
		gfModalPop("#noticeInsertModal")
	}
	
	function saveNotice(){
		var param ={
			title : $("#noticeTitle").val(),
			content : $("#noticeContent").val()
		}
		var callBackFunction = function(response) {
			if(response.result == "SUCCESS"){
				alert("저장이 되었습니다");
				gfCloseModal();
				noticeSearch();
			}
			
		}
		callAjax("/system/noticeSave.do", "post","json",false, param, callBackFunction);
		
	}
</script> 
</head>
<body>
	<!-- ///////////////////// html 페이지  ///////////////////////////// -->

<form id="myNotice" action="" method="">
	
	<input type="hidden" id="currentPage" value="1">  <!-- 현재페이지는 처음에 항상 1로 설정하여 넘김  -->
	<input type="hidden" id="tmpList" value=""> <!-- ★ 이거뭐임??? -->
	<input type="hidden" id="tmpListNum" value=""> <!-- 스크립트에서 값을 설정해서 넘길거임 / 임시 리스트 넘버 -->
	<input type="hidden" name="action" id="action" value=""> 
	<input type="hidden" id="swriter" value="${loginId}"> <!-- 작성자 session에서 java에서 넘어온값 -->

	<div id="wrap_area">

		<h2 class="hidden">header 영역</h2> 
		<jsp:include page="/WEB-INF/view/common/header.jsp"></jsp:include>

		<h2 class="hidden">컨텐츠 영역</h2>
		<div id="container">
			<ul>
				<li class="lnb">
					<!-- lnb 영역 --> 
					<jsp:include page="/WEB-INF/view/common/lnbMenu.jsp"></jsp:include> <!--// lnb 영역 -->
				</li>
				<li class="contents">
					<!-- contents -->
					<h3 class="hidden">contents 영역</h3> <!-- content -->
					<div class="content">
						<p class="Location">
							<a href="#" class="btn_set home">메인으로</a> 
							<a href="#" class="btn_nav bold">시스템 관리</a> 
							<span class="btn_nav bold">공지 사항</span> 
							<a href="#" class="btn_set refresh">새로고침</a>
						</p>
						
					<p class="conTitle">
						<span>공지사항</span> 
						<span class="fr">					
 	                         	 제목
                          <input type="text" id="searchTitle" name="searchTitle" style="height: 25px; margin-right: 10px;"/>
                          	기간
                          <input type="date" id="searchStDate" name="searchStDate" style="height: 25px; margin-right: 10px;"/> 
                          ~ 
                          <input type="date" id="searchEdDate" name="searchEdDate" style="height: 25px; margin-right: 10px;"/>
						  <a class="btnType red" href="" name="searchbtn"  id="searchBtn"><span>검색</span></a>
						  <a class="btnType blue" href="javascript:insertModal();" name="modal"><span>신규</span></a>
						  <a class="btnType blue" href="javascript:insertFileModal();" name="modal"><span>신규(파일)</span></a>
						</span>
					</p> 
						
						
						<div class="divNoticeList">
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
							              <th scope="col">공지 번호</th>
							              <th scope="col">공지 제목</th>
							              <th scope="col">공지 날짜</th>
							              <th scope="col">작성자</th>
							              
									</tr>
								</thead>
								<tbody id="noticeList"></tbody>
							</table>
							
							<!-- 페이징 처리  -->
							<div class="paging_area" id="pagingNavi">
							</div>
											
						</div>

		
					</div> <!--// content -->

					<h3 class="hidden">풋터 영역</h3>
						<jsp:include page="/WEB-INF/view/common/footer.jsp"></jsp:include>
				</li>
			</ul>
		</div>
	</div>


	<!-- 모달팝업 -->
	<div id="noticeInsertModal" class="layerPop layerType2" style="width: 600px;">
		<input type="hidden" id="noticeNo" name="noticeNo" value="${noticeNo}"> <!-- 수정시 필요한 num 값을 넘김  -->
		   
		<dl>
			<dt>
				<strong>공지사항</strong>
			</dt>
			<dd class="content">
				<!-- s : 여기에 내용입력 -->
				<table class="row">
					<caption>caption</caption>

					<tbody>
						<tr>
							<th scope="row">작성자 <span class="font_red">*</span></th>
							<td><input type="text" class="inputTxt p100" name="loginId" id="loginId" readonly/></td>
							<!-- <th scope="row">작성일<span class="font_red">*</span></th>
							<td><input type="text" class="inputTxt p100" name="write_date" id="write_date" /></td> -->
						</tr>
						<tr>
							<th scope="row">제목 <span class="font_red">*</span></th>
							<td colspan="3"><input type="text" class="inputTxt p100"
								name="noticeTitle" id="noticeTitle" /></td>
						</tr>
						<tr>
							<th scope="row">내용</th>
							<td colspan="3">
								<textarea class="inputTxt p100" name="noticeContent" id="noticeContent">
								</textarea>
							</td>
						</tr>
						
					</tbody>
				</table>

				<!-- e : 여기에 내용입력 -->

				<div class="btn_areaC mt30">
					<a href="" class="btnType blue" id="btnSaveNotice" name="btn"><span>저장</span></a> 
					<a href="" class="btnType blue" id="btnUpdateNotice" name="btn" style="display:none"><span>수정</span></a> 
					<a href="" class="btnType blue" id="btnDeleteNotice" name="btn"><span>삭제</span></a> 
					<a href=""	class="btnType gray"  id="btnClose" name="btn"><span>취소</span></a>
				</div>
			</dd>

		</dl>
		<a href="" class="closePop"><span class="hidden">닫기</span></a>
	</div>
	
	


</form>

</body>
</html>
