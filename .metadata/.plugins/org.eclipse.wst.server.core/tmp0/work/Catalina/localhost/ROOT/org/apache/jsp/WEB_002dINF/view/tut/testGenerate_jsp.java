/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-06-15 08:25:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.tut;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testGenerate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1717304976992L));
    _jspx_dependants.put("jar:file:/C:/Users/user/git/egov/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/marlmsone1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<title>강의목록</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/common_include.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tvar pageSize = 10;\t\t//한 페이지당 몇개 보여줄 지\r\n");
      out.write("\tvar pageBlockSize = 5;\t//페이지 당 번호\r\n");
      out.write("\r\n");
      out.write("\t/** OnLoad event */\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t//강사의 시험출제 목록 조회s\r\n");
      out.write("\t\tfSearch_tutLecList();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//버튼 이벤트 등록\r\n");
      out.write("\t\tfRegisterButtonClickEvent();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#start_datepicker\").datepicker({minDate: 0});\r\n");
      out.write("\t\t$(\"#end_datepicker\").datepicker({minDate: 0});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/** 버튼 이벤트 등록 */\r\n");
      out.write("\tfunction fRegisterButtonClickEvent() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('a[name=btn]').click(function(e) {\r\n");
      out.write("\t\t\te.preventDefault();\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar btnId = $(this).attr('id');\r\n");
      out.write("\r\n");
      out.write("\t\t\tswitch (btnId) {\r\n");
      out.write("\t\t\tcase 'btnGenerateTest':\r\n");
      out.write("\t\t\t\tfGenerate_test();\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase 'btnClose':\r\n");
      out.write("\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/** 강사의 시험출제 목록 조회 */\r\n");
      out.write("\tfunction fSearch_tutLecList(currentPage){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log(\"currentPage : \" + currentPage);\r\n");
      out.write("\t\tcurrentPage = currentPage || 1;\t// undefined 일 때 1값 나오게 설정\r\n");
      out.write("\t\tvar searchKey = $(\"#searchKey\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// key : value 의 JSON 형태로 데이터 넘기기\r\n");
      out.write("\t\tvar param = {\t\t\t\t\t\t\r\n");
      out.write("\t\t\tcurrentPage : currentPage,\r\n");
      out.write("\t\t\tpageSize : pageSize,\r\n");
      out.write("\t\t\tsearchKey : searchKey,\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar callback = function(response) {\r\n");
      out.write("\t\t\tfCallback_tutTestList(response, currentPage);\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcallAjax(\"/tut/tutTestList.do\", \"post\", \"text\", false, param, callback);\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t/** 강사의 시험출제 목록 조회 콜백 함수 */\r\n");
      out.write("\tfunction fCallback_tutTestList(response, currentPage) {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log(\"fCallback_tutTestList's response : \" + response);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 나의 시험응시 목록 초기화 후 생성\r\n");
      out.write("\t\t$(\"#tutTestListBody\").empty().append(response);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 나의 시험응시 목록 총 개수 추출\r\n");
      out.write("\t\tvar tutTestListCnt = $(\"#listCnt\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 페이지 네비게이션 생성\r\n");
      out.write("\t\tvar paginationHtml = getPaginationHtml( currentPage, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttutTestListCnt, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tpageSize, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tpageBlockSize, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'fSearch_tutLecList' );\r\n");
      out.write("\t\tconsole.log(paginationHtml);\t\t\r\n");
      out.write("\t\t$(\"#tutTestPagination\").empty().append( paginationHtml );\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 나의 시험응시 목록 현재 페이지 임시 저장\r\n");
      out.write("\t\t$(\"#tmp_currentPage\").val(currentPage);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/** 시험문제 출제 모달 실행 */\r\n");
      out.write("\tfunction fPopModal_generateTest(lec_id, lec_name, lec_type_id, lec_type_name) {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log(\"lec_id : \" + lec_id);\r\n");
      out.write("\t\tconsole.log(\"lec_name : \" + lec_name);\r\n");
      out.write("\t\tconsole.log(\"lec_type_id : \" + lec_type_id);\r\n");
      out.write("\t\tconsole.log(\"lec_type_name : \" + lec_type_name);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 시험문제 출제 모달 초기화 \r\n");
      out.write("\t\tfInit_generateTest(lec_id, lec_name, lec_type_id, lec_type_name);\r\n");
      out.write("\t\t//mfSearch_lecList(lec_id, lec_name, lec_type_name);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 모달 팝업\r\n");
      out.write("\t\tgfModalPop(\"#ModalPop_generateTest\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction fInit_generateTest(lec_id, lec_name, lec_type_id, lec_type_name) {\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#lecId\").val(lec_id);\r\n");
      out.write("\t\t$(\"#lecName\").val(lec_name);\r\n");
      out.write("\t\t$(\"#lecTypeId\").val(lec_type_id);\r\n");
      out.write("\t\t$(\"#lecTypeName\").val(lec_type_name);\r\n");
      out.write("\t\t$(\"#testName\").val(\"\");\r\n");
      out.write("\t\t$(\"#testItemCnt\").val(\"\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/** 시험문제 출제 */\r\n");
      out.write("\tfunction fGenerate_test() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// validation 체크\r\n");
      out.write("\t\tif (!fValidate_generateTest()) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log(\"lec_id : \" + $(\"#lecId\").val());\t\t\t\t\r\n");
      out.write("\t\tconsole.log(\"lec_type_id : \" + $(\"#lecTypeId\").val());\r\n");
      out.write("\t\tconsole.log(\"test_name : \" + $(\"#testName\").val());\r\n");
      out.write("\t\tconsole.log(\"test_item_cnt : \" + $(\"#testItemCnt\").val());\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write(" \t\t\t\tlec_id : $(\"#lecId\").val(),\t\t\t\t\r\n");
      out.write("\t\t\t\tlec_type_id : $(\"#lecTypeId\").val(),\r\n");
      out.write("\t\t\t\ttest_name : $(\"#testName\").val(),\r\n");
      out.write("\t\t\t\tgenerate_cnt : $(\"#testItemCnt\").val(),\r\n");
      out.write("\t\t\t\ttest_start : $(\"#start_datepicker\").val(),\r\n");
      out.write("\t\t\t\ttest_end : $(\"#end_datepicker\").val(),\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tvar callback = function(data) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif (data.result == 'SUCCESS') {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 응답 메시지 출력\r\n");
      out.write("\t\t\t\talert(data.resultMsg);\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 모달 닫기\r\n");
      out.write("\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 강사의 시험출제 목록 조회\t\r\n");
      out.write("\t\t\t\tvar currentPage = $(\"#tmp_currentPage\").val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfSearch_tutLecList(currentPage);\r\n");
      out.write("\t\t\t}\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t};\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcallAjax(\"/tut/generateTest.do\", \"post\", \"json\", true, param, callback);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/** 시험문제지 상세보기 */\r\n");
      out.write("\tfunction fView_testDetail(lec_name, test_id) {\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log(\"(fView_testDetail) test_id : \" + test_id);\r\n");
      out.write("\t\tgfModalPop(\"#ModalPop_testDetail\");\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\tvar param = { \t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\tlec_name : lec_name,\r\n");
      out.write("\t\t\t\ttest_id : test_id,\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar callback = function(response) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tconsole.log(\"fView_testDetail's response : \" + response);\t\t\t\t\r\n");
      out.write("\t\t\t$(\"#testDetailBody\").empty().append(response);\t\t\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcallAjax(\"/tut/tutTestDetail.do\", \"post\", \"text\", true, param, callback);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/** 시험응시 확인, 시험문제 조회 */\r\n");
      out.write("\tfunction fApply_test(lec_id, lec_name, test_id, test_name, tut_name) {\t\r\n");
      out.write("\r\n");
      out.write("\t\tconsole.log(\"lec_id : \" + lec_id);\r\n");
      out.write("\t\tconsole.log(\"lec_name : \" + lec_name);\r\n");
      out.write("\t\tconsole.log(\"test_id : \" + test_id);\r\n");
      out.write("\t\tconsole.log(\"test_name : \" + test_name);\r\n");
      out.write("\t\tconsole.log(\"tut_name : \" + tut_name);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#lec_id\").val(lec_id);\r\n");
      out.write("\t\tconsole.log($(\"#lec_id\").val());\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\tif (confirm(\"시험에 응시하겠습니까?\")) {\r\n");
      out.write("\t\t\tgfModalPop(\"#ModalPop_testApply\");\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\tvar param = {\r\n");
      out.write(" \t\t\t\tlec_id : lec_id,\t\t\t\t\r\n");
      out.write("\t\t\t\tlec_name : lec_name,\r\n");
      out.write("\t\t\t\ttest_id : test_id,\r\n");
      out.write("\t\t\t\ttest_name : test_name,\r\n");
      out.write("\t\t\t\ttut_name : tut_name,\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar callback = function(response) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tconsole.log(response);\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#testItemBody\").empty().append(response);\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcallAjax(\"/std/testItemList.do\", \"post\", \"text\", true, param, callback);\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/** 시험지 생성모달 validation */\r\n");
      out.write("\tfunction fValidate_generateTest() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar chk;\t\t\r\n");
      out.write("\t\tchk = checkNotEmpty([ \t[ \"testName\", \"시험명을 입력해 주세요.\" ]\r\n");
      out.write("\t\t  \t\t\t\t\t  , [ \"testItemCnt\", \"시험항목 수를 입력해 주세요.\" ] ]);\r\n");
      out.write("\t\r\n");
      out.write("\t\tif (!chk) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tconsole.log(\"valid OK\");\r\n");
      out.write("\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/** 시험응시 취소시 확인 */\r\n");
      out.write("\tfunction fConfirm_close(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(confirm(\"정말 시험 응시를 취소하시겠습니까?\")){\r\n");
      out.write("\t\t\tgfCloseModal();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/** 시험응시 후 시험제출 */\r\n");
      out.write("\tfunction fSubmit_test() {\r\n");
      out.write("\r\n");
      out.write("\t\tif (confirm(\"정말 제출하시겠습니까?\")){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar callback = function(data) {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (data.result == 'SUCCESS') {\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t// 응답 메시지 출력\r\n");
      out.write("\t\t\t\t\talert(data.resultMsg);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t// 모달 닫기\r\n");
      out.write("\t\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t// 시험 결과 확인\r\n");
      out.write("\t\t\t\t\tfView_testResult(lec_id, test_id);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t};\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcallAjax(\"/std/submitTest.do\", \"post\", \"json\", true, $(\"#testApplyForm\").serialize(), callback);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/** 시험 결과 확인 */\r\n");
      out.write("\tfunction fView_testResult(lec_id, test_id) {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log(\"lec_id : \" + lec_id);\r\n");
      out.write("\t\tconsole.log(\"test_id : \" + test_id);\r\n");
      out.write("\r\n");
      out.write(" \t\tvar param = {\r\n");
      out.write(" \t\t\t\tlec_id : lec_id,\t\t\t\t\r\n");
      out.write("\t\t\t\ttest_id : test_id,\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar callback = function(response) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tconsole.log(\"fView_testResult's response : \" + response);\t\t\t\t\r\n");
      out.write("\t\t\t$(\"#testResultBody\").empty().append(response);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 나의 시험응시 목록 조회\t\r\n");
      out.write("\t\t\tvar currentPage = $(\"#tmp_currentPage\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfSearch_myTestList(currentPage);\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcallAjax(\"/std/testResult.do\", \"post\", \"text\", true, param, callback);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"tutTestForm\" action=\"\" method=\"\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"tmp_lec_id\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"tmp_std_id\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"tmp_currentPage\" value=\"\">\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 모달 배경 -->\r\n");
      out.write("\t<div id=\"mask\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrap_area\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<h2 class=\"hidden\">header 영역</h2>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<h2 class=\"hidden\">컨텐츠 영역</h2>\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"lnb\">\r\n");
      out.write("\t\t\t\t\t<!-- lnb 영역 --> \r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/lnbMenu.jsp", out, false);
      out.write(" \r\n");
      out.write("\t\t\t\t\t<!--// lnb 영역 -->\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"contents\">\r\n");
      out.write("\t\t\t\t\t<!-- contents -->\r\n");
      out.write("\t\t\t\t\t<h3 class=\"hidden\">contents 영역</h3> <!-- content -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Location\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"../dashboard/dashboard.do\" \r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_set home\">메인으로</a> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_nav bold\">학습관리</span> <span \r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_nav bold\">시험출제</span> <a href=\"../tut/testGenerate.do\" \r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_set refresh\">새로고침</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<p class=\"conTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>시험출제 목록</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fr\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select id=\"searchKey\" name=\"searchKey\" style=\"width: 130px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonchange=\"fSearch_tutLecList()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option id=\"option1\" value=\"AllTest\" selected=\"selected\">전체 강의목록</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option id=\"option1\" value=\"ProceedingTest\">진행중인 강의</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option id=\"option1\" value=\"LastTest\" >종료된 강의</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\t\t\t\t\t\r\n");
      out.write("       \r\n");
      out.write("\t\t\t\t\t\t<div class=\"divList\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\t\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"30%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"30%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"20%\">\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">강의명</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">강의분류</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">강의기간</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">시험문제</th>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody id=\"tutTestListBody\"></tbody>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t                \r\n");
      out.write("\t\t\t\t\t\t<div class=\"paging_area\"  id=\"tutTestPagination\"> </div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div> <!--// content -->\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h3 class=\"hidden\">풋터 영역</h3>\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div><!--// container -->\r\n");
      out.write("\t</div><!--// wrap_area -->\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 시험문제 출제 모달팝업 -->\r\n");
      out.write("\t<div id=\"ModalPop_generateTest\" class=\"layerPop layerType2\" style=\"width: 800px;\">\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt>\r\n");
      out.write("\t\t\t\t<strong>시험문제 출제</strong>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd class=\"content\">\r\n");
      out.write("\t\t\t\t<!-- s : 여기에 내용입력 -->\r\n");
      out.write("\t\t\t\t<table class=\"row\">\r\n");
      out.write("\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"30%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"30%\">\r\n");
      out.write("\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>강의명 </th>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"lecId\" value=\"\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputTxt p100\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"lecName\" name=\"lecName\" disabled=\"disabled\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<th>강의분류 </th>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"lecTypeId\" value=\"\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputTxt p100\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"lecTypeName\" name=\"lecTypeName\" disabled=\"disabled\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>시험명 </th>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputTxt p100\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"testName\" name=\"testName\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<th>문항 수 </th>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"number\" class=\"inputTxt p100\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"testItemCnt\" name=\"testItemCnt\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>시험 시작일 </th>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputTxt p100\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"start_datepicker\" name=\"testStartDate\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-date-format='yyyy.mm.dd'/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<th>시험 종료일 </th>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputTxt p100\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"end_datepicker\" name=\"testEndDate\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-date-format='yyyy.mm.dd'/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- e : 여기에 내용입력 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"btn_areaC mt30\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"btnType blue\" id=\"btnGenerateTest\" name=\"btn\"><span>시험지 생성</span></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"\"\tclass=\"btnType gray\"  id=\"btnClose\" name=\"btn\"><span>취소</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<a href=\"\" class=\"closePop\"><span class=\"hidden\">닫기</span></a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div><!--// 시험문제 출제 모달팝업 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 시험문제지 상세보기 팝업창 -->\r\n");
      out.write("\t<div id=\"ModalPop_testDetail\" class=\"layerPop layerType2\" style=\"width: 650px; top: 100px !important;\">\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt>\r\n");
      out.write("\t\t\t\t<strong>시험문제지 확인</strong>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd class=\"content\" style=\"height: 600px !important; overflow: auto !important;\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<!-- s : 여기에 내용입력 -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<table class=\"row\" >\r\n");
      out.write("\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t<col width=\"15%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"40%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"15%\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tbody id=\"testDetailBody\"></tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<!-- e : 여기에 내용입력 -->\r\n");
      out.write("\t\t\t\t<div class=\"btn_areaC mt30\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:gfCloseModal();\" class=\"btnType gray\" id=\"\"><span id=\"popupReload\">확인</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<a href=\"\" class=\"closePop\"><span class=\"hidden\">닫기</span></a>\r\n");
      out.write("\t</div><!--// end 시험지 상세보기 팝업창 -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}