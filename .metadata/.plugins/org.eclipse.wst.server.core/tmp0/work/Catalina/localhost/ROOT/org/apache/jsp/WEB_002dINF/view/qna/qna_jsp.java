/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-06-15 08:07:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.qna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class qna_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>공지사항</title>\r\n");
      out.write("<!-- sweet alert import -->\r\n");
      out.write("<script src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CTX_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/sweetalert/sweetalert.min.js'></script>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/common_include.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- sweet swal import -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\t\r\n");
      out.write("\r\n");
      out.write("\t/*페이징 처리를 위한 (전역)변수*/\r\n");
      out.write("\tvar pagesize = 5;\t// -- 한 페이지 당 몇개 보여줄 지\r\n");
      out.write("\tvar pageblocksize =5;\t// -- 페이지 당 번호\r\n");
      out.write("\t\r\n");
      out.write("\tvar pagesize2 =10;\r\n");
      out.write("\tvar pageblocksize2=5;\r\n");
      out.write("\t\r\n");
      out.write("\t/*수정,삭제 후 페이지 유지를 위한 변수*/\r\n");
      out.write("\tvar qnaPage=0;\r\n");
      out.write("\tvar commentPage=0;\r\n");
      out.write("\t/*글 수정을 위해 글번호 받아두기 위해 */\r\n");
      out.write("\tvar qnaNo=0;\r\n");
      out.write("\t\r\n");
      out.write("\t/*댓글 수정,삭제를 위해*/\r\n");
      out.write("\t//var rv_id=0;\r\n");
      out.write("\tvar mrv_con=\"\"; //수정 시 기존 내용을 가져오기 위해 변수 선언\r\n");
      out.write("\t\r\n");
      out.write("\t//hidden에 담긴 값 사용하기\r\n");
      out.write("\t//$(\"#user_type\").val()\r\n");
      out.write("\t\r\n");
      out.write("\t/** OnLoad event */ \r\n");
      out.write("\t$(function() {\t\r\n");
      out.write("\t\tqnaList();\r\n");
      out.write("\r\n");
      out.write("\t\tif($(\"#user_type\").val()=='A'){\r\n");
      out.write("\t\t\t$(\"#newreg\").show();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$(\"#newreg\").hide();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/**게시글 출력 함수(+검색 기능)*/\r\n");
      out.write("\tfunction qnaList(cpage) {\r\n");
      out.write("\t\tcpage = cpage || 1; //cpage가 null일 때 'OR' 연산자를 사용한 표현\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tqnaPage=cpage;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\t\tsearchtitle : $(\"#searchtitle\").val(),\r\n");
      out.write("\t\t\t\tcpage:cpage,\r\n");
      out.write("\t\t\t\tpagesize:pagesize\t\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar listcallback = function(res) {\r\n");
      out.write("\t\t\tconsole.log('출력페이지')\r\n");
      out.write("\t\t\t$(\"#qnaList\").empty().append(res); //<tbody> 아래 내용 지우고 받아온 내용 더하기\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//$(\"#listcnt\").val() : qnaList.jsp에서 <input> hidden으로 해서 listcnt 가져왔음\r\n");
      out.write("\t\t\tvar paginationHtml = getPaginationHtml(cpage, $(\"#listcnt\").val(), pagesize, pageblocksize, 'qnaList'); \r\n");
      out.write("\t\t\t$(\"#qnaPagination\").empty().append(paginationHtml); \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//text : html로 불러옴\r\n");
      out.write("\t\tcallAjax(\"/qnaList.do\", \"post\", \"text\", false, param, listcallback);\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t/**글쓰기 팝업 */\r\n");
      out.write("\tfunction wirteBtn(){\r\n");
      out.write("\t\t init();\r\n");
      out.write("\t\tgfModalPop(\"#layer1\")//모달창 띄우기(jquery.model.js 함수 사용)\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/**글 등록 함수*/\r\n");
      out.write("\tfunction qnaSave(){\r\n");
      out.write("\t\tvar qna_title = $(\"#qna_title\").val();\r\n");
      out.write("\t\tvar qna_con = $(\"#qna_con\").val().replace(/\\n/g, \"<br>\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//유효성검사\r\n");
      out.write("\t\tif(!fValidate()) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//저장 내용\r\n");
      out.write("\t\t var param = {\r\n");
      out.write("\t\t\t\tqna_title: qna_title,\r\n");
      out.write("\t\t\t\tqna_con:qna_con,\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 콜백할 함수\r\n");
      out.write("\t\tvar saveCallback = function(r){\r\n");
      out.write("\t\t\t//백단에서 msg도 map에 담아 보냈음\r\n");
      out.write("\t\t\talert(r.msg);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(r.result == \"S\") {\r\n");
      out.write("\t\t\t\tqnaList();\r\n");
      out.write("\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t//json: 전달 받을 데이터 타입.\r\n");
      out.write("\t\tcallAjax(\"/qnaSave.do\", \"post\", \"json\", false, param, saveCallback);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t/**form 비우기*/\r\n");
      out.write("\tfunction init(data){\r\n");
      out.write("\t\tif(data!=null){\r\n");
      out.write("\t\t\t//$(\"#qna_id\").val(data.qna_id);\r\n");
      out.write("\t\t\t$(\"#qna_title\").val(data.qna_title);\r\n");
      out.write("\t\t\t$(\"#qna_con\").val(data.qna_con);\r\n");
      out.write("\t\t\t//$(\"#action\").val(\"U\");\t// 수정일 때 U 값으로 초기화\r\n");
      out.write("\t\t\t//$(\"#btnDelete\").show();\t// 신규 등록일 때 삭제 버튼을 드러내기\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t//$(\"#notice_id\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#qna_title\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#qna_con\").val(\"\");\r\n");
      out.write("\t\t\t//$(\"#action\").val(\"I\");\t// 신규 등록일 때 I 값으로 초기화\r\n");
      out.write("\t\t\t//$(\"#btnDelete\").hide();\t// 신규 등록일 때 삭제 버튼을 숨기기\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/**유효성 검사: 빈 값 없도록*/\r\n");
      out.write("\tfunction fValidate() {\r\n");
      out.write("\t\t\t\t\t// common.js 함수 호출\r\n");
      out.write("\t\tvar chk = checkNotEmpty(\r\n");
      out.write("\t\t\t\t[\r\n");
      out.write("\t\t\t\t\t\t[ \"qna_title\", \"제목을 입력해 주세요.\" ]\r\n");
      out.write("\t\t\t\t\t,\t[ \"qna_con\", \"내용을 입력해 주세요\" ]\r\n");
      out.write("\t\t\t\t]\r\n");
      out.write("\t\t);\r\n");
      out.write("\r\n");
      out.write("\t\tif (!chk) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/**상세조회*/\r\n");
      out.write("\tfunction qnaView(qna_id){\r\n");
      out.write("\r\n");
      out.write("\t\tqnaNo = qna_id;\r\n");
      out.write("\t\t//댓글\r\n");
      out.write("\t\t//commentList(qnaNo);\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\t\tqna_id :qna_id\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar viewCallback = function(r){\r\n");
      out.write("\t\t\t// console.log(r);\r\n");
      out.write("\t\t\t $(\"#viewPop\").empty().append(r);\r\n");
      out.write("\t\t\t gfModalPop(\"#viewPop\") //팝업열기\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tcallAjax(\"/qnaView.do\", \"get\", \"text\", false, param, viewCallback);\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t/**수정 모달창 열고 기존 내용 가져오기*/\r\n");
      out.write("\tfunction qnaModifyPop(){\r\n");
      out.write("\t\t//1. 새로운 모달창 띄우기 (등록/취소 버튼)\r\n");
      out.write("\t\tgfModalPop(\"#modifyPop\")\r\n");
      out.write("\t\t//2.기존 내용 가져오기\r\n");
      out.write("\t\t\t//2-1. 가져올 게시글 번호 전달\r\n");
      out.write("\t\tvar param= {\r\n");
      out.write("\t\t\tqna_id : qnaNo\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t//2-2. ajax 통신을 위한 함수\r\n");
      out.write("\t\tvar getContent = function(r){\r\n");
      out.write("\t\t\t//console.log('수정을 위해 기존 내용 가져올 함수 실행'); console.log(r);\r\n");
      out.write("\t\t\t$(\"#modify_title\").val(r.vo.qna_title);\r\n");
      out.write("\t\t\t$(\"#modify_con\").val(r.vo.qna_con);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t//2-2. ajax로 값 가져오기\t\t\r\n");
      out.write("\t\tcallAjax(\"/qnaOldView.do\", \"get\", \"json\", false, param, getContent);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/**수정(업데이트)*/\r\n");
      out.write("\tfunction qnaModify(){\r\n");
      out.write("\r\n");
      out.write("\t\t//1. 유효성: 빈칸일 때 알림창\r\n");
      out.write("\t\tif(!fValidateModify()){return;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//2. 전달 데이터 (+줄바꿈처리로직)\r\n");
      out.write("\t\tvar newTitle = $(\"#modify_title\").val();\r\n");
      out.write("\t\tvar newCon = $(\"#modify_con\").val().replace(/\\n/g, \"<br>\");\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tvar modifyData ={\r\n");
      out.write("\t\t\t\tqna_id: qnaNo\r\n");
      out.write("\t\t\t\t,qna_title: newTitle\r\n");
      out.write("\t\t\t\t,qna_con: newCon\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t//3. 등록 누를 시 업데이트 [성공(실패)시 메시지]\r\n");
      out.write("\t\tvar modifyCallback = function(r){\r\n");
      out.write("\t\t\tif(r.success==true){\r\n");
      out.write("\t\t\t\talert(r.msg);\r\n");
      out.write("\t\t\t\tqnaList(qnaPage)\r\n");
      out.write("\t\t\t\tgfCloseModal()\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(r.msg);\r\n");
      out.write("\t\t\t\tqnaList(qnaPage)\r\n");
      out.write("\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcallAjax(\"/qnaModify.do\", \"post\", \"json\", false, modifyData, modifyCallback);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t/*수정 시 빈칸 유효성 검사를 위한 함수*/\r\n");
      out.write("\tfunction fValidateModify() {\r\n");
      out.write("\t\tvar chk = checkNotEmpty(\r\n");
      out.write("\t\t\t\t[\r\n");
      out.write("\t\t\t\t\t\t[ \"modify_title\", \"제목을 입력해 주세요.\" ]\r\n");
      out.write("\t\t\t\t\t,\t[ \"modify_con\", \"내용을 입력해 주세요\" ]\r\n");
      out.write("\t\t\t\t]\r\n");
      out.write("\t\t);\r\n");
      out.write("\r\n");
      out.write("\t\tif (!chk) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t/*삭제*/\r\n");
      out.write("\tfunction qnaDelete(){\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\t\tqna_id: qnaNo\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar deleteCallback = function(r){\r\n");
      out.write("\t\t\tif(r.success==true){\r\n");
      out.write("\t\t\t\talert(r.msg);\r\n");
      out.write("\t\t\t\tqnaList(qnaPage);\r\n");
      out.write("\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(r.msg);\r\n");
      out.write("\t\t\t\tqnaList(qnaPage);\r\n");
      out.write("\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tcallAjax(\"/qnaDelete.do\", \"post\", \"json\", false, param, deleteCallback)\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//모달창 닫기\r\n");
      out.write("\tfunction viewClose(){\r\n");
      out.write("\t\t//페이지 유지\r\n");
      out.write("\t\tqnaList(qnaPage);\r\n");
      out.write("\t\t//모달닫기\r\n");
      out.write("\t\tgfCloseModal();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tfunction qnaList(cpage) {\r\n");
      out.write("\t\tcpage = cpage || 1; //cpage가 null일 때 'OR' 연산자를 사용한 표현\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tqnaPage=cpage;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\t\tsearchtitle : $(\"#searchtitle\").val(),\r\n");
      out.write("\t\t\t\tcpage:cpage,\r\n");
      out.write("\t\t\t\tpagesize:pagesize\t\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar listcallback = function(res) {\r\n");
      out.write("\t\t\t$(\"#qnaList\").empty().append(res); //<tbody> 아래 내용 지우고 받아온 내용 더하기\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar paginationHtml = getPaginationHtml(cpage, $(\"#listcnt\").val(), pagesize, pageblocksize, 'qnaList'); \r\n");
      out.write("\t\t\t$(\"#qnaPagination\").empty().append(paginationHtml); \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//text : html로 불러옴\r\n");
      out.write("\t\tcallAjax(\"/qnaList.do\", \"post\", \"text\", false, param, listcallback);\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/**댓글 전체 조회*/\r\n");
      out.write("\tfunction commentList(qnaNo){\r\n");
      out.write("\t\tvar param={\r\n");
      out.write("\t\t\t\tqna_id:qnaNo\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar commentListCallback= function(r){\r\n");
      out.write("\t\t\t//console.log('댓글 출력 ajax 함수 실행',r);\r\n");
      out.write("\t\t\t$(\"#commentList\").empty().append(r);\r\n");
      out.write("\t\t\tvar paginationHtml2 = getPaginationHtml(commentPage,$(\"commentcnt\").val(),pagesize2,pageblocksize2);\r\n");
      out.write("\t\t\t$(\"#commentPagenation\").empty().append(paginationHtml2);\r\n");
      out.write("\t\r\n");
      out.write("\t        \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tcallAjax(\"/commentList.do\", \"post\", \"text\", false, param, commentListCallback);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/**댓글 등록*/\r\n");
      out.write("\tfunction commentSave(){\r\n");
      out.write("\t\tvar rv_con = $(\"#rv_con\").val();\r\n");
      out.write("\t\tif(!cValidateSave()){return;}\r\n");
      out.write("\t\tvar param ={\r\n");
      out.write("\t\t\t\tqna_id:qnaNo,\r\n");
      out.write("\t\t\t\trv_con:rv_con\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar commentSaveCallback =function(r){\r\n");
      out.write("\t\t\t//console.log('댓글저장콜백함수실행',r);\r\n");
      out.write("\t\t\talert(r.msg);\r\n");
      out.write("\t\t\tif(r.result == \"S\") {\r\n");
      out.write("\t\t\t\tqnaView(qnaNo);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tcallAjax(\"/commentSave.do\", \"post\", \"json\", false, param, commentSaveCallback);\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//댓글 등록 유효성 검사\r\n");
      out.write("\tfunction cValidateSave() {\r\n");
      out.write("\t\tvar chk = checkNotEmpty(\r\n");
      out.write("\t\t\t\t[\r\n");
      out.write("\t\t\t\t\t\t[ \"rv_con\", \"댓글을 입력해주세요.\" ]\r\n");
      out.write("\t\t\t\t]\r\n");
      out.write("\t\t);\r\n");
      out.write("\r\n");
      out.write("\t\tif (!chk) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t/**댓글수정(업데이트)*/\r\n");
      out.write("\tfunction commentModify(rv_id){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//0. 기존 내용 가져오기\r\n");
      out.write("\t\t//commentOldView(rv_id);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//1. 유효성: 빈칸일 때 알림창\r\n");
      out.write("\t\tif(!cValidateModify()){return;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log('유효성 검사 통과');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//2. 전달 데이터 \r\n");
      out.write("\t\tvar rvN_con = $(\"#rvN_con\").val();\t\r\n");
      out.write("\t\tconsole.log('수정데이터',rvN_con);\r\n");
      out.write("\t\tconsole.log('댓글번호 : ',rv_id);\r\n");
      out.write("\t\tvar param ={\r\n");
      out.write("\t\t\t\trv_id:rv_id,\r\n");
      out.write("\t\t\t\trv_con: rvN_con\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tconsole.log('콜백함수 실행 시 보낼 데이터 > ',param)\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t//3. 수정 누를 시 업데이트 [성공(실패)시 메시지]\r\n");
      out.write("\t\tvar commentModifyCallback = function(r){\r\n");
      out.write("\t\t\tif(r.success==true){\r\n");
      out.write("\t\t\t\talert(r.msg);\r\n");
      out.write("\t\t\t\tqnaView(qnaNo);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(r.msg);\r\n");
      out.write("\t\t\t\tqnaView(qnaNo);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcallAjax(\"/commentModify.do\", \"post\", \"json\", false, param, commentModifyCallback);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/*수정 시 기존 내용 가져오기*/\r\n");
      out.write("\tfunction commentOldView(rv_id){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tparam={rv_id:rv_id}\r\n");
      out.write("\t\tvar commentOldViewCallback = function(r){\r\n");
      out.write("\t\t\tconsole.log('기존 내용 가져오는 롤백 함수 실행',r);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//console.log('기존내용',r.vo.rv_con)\r\n");
      out.write("\t\t\t$('#conditionContent').empty().append('<input type=\"text\" style=\"width:500px; height: 20px; font-size:12px; margin-right: 4px;\" id=\"rvN_con\" name=\"rvN_con\">');\r\n");
      out.write("\t\t\t$(\"#rvN_con\").val(r.vo.rv_con);\r\n");
      out.write("\t\t\t//삭제/수정 중 수정 버튼 클릭 시 등록을 수정으로 변경\r\n");
      out.write("\t\t\t$('#condition').empty().append(\"<a href='javascript:commentModify(\"+ rv_id+\");' id='commentModify' name='commentModify'>수정</a>\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tcallAjax(\"/commentOldView.do\", \"post\", \"json\", false, param, commentOldViewCallback);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*수정 시 빈칸 유효성 검사를 위한 함수*/\r\n");
      out.write("\tfunction cValidateModify() {\r\n");
      out.write("\t\tvar chk = checkNotEmpty(\r\n");
      out.write("\t\t\t\t[\r\n");
      out.write("\t\t\t\t\t\t[ \"rvN_con\", \"댓글을 입력해주세요.\" ]\r\n");
      out.write("\t\t\t\t]\r\n");
      out.write("\t\t);\r\n");
      out.write("\r\n");
      out.write("\t\tif (!chk) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t/* 삭제 */\r\n");
      out.write("\tfunction commentDelete(rv_id){\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\t\trv_id: rv_id\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar commentDeleteCallback = function(r){\r\n");
      out.write("\t\t\tif(r.success==true){\r\n");
      out.write("\t\t\t\talert(r.msg);\r\n");
      out.write("\t\t\t\tqnaList(qnaPage);\r\n");
      out.write("\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(r.msg);\r\n");
      out.write("\t\t\t\tqnaList(qnaPage);\r\n");
      out.write("\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tcallAjax(\"/commentDelete.do\", \"post\", \"json\", false, param, commentDeleteCallback);\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"qnaForm\" action=\"/qna.do\"  method=\"get\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!--\r\n");
      out.write("\t\t신규와 수정을 동일한 창으로 넘기기 때문에 flag 값을 주어 확인할 수 있도록 한다\r\n");
      out.write("\t\t초기 값 = 빈값\r\n");
      out.write("\t\t수정할 때, 게시판 번호 사용하기 위해서 hidden \r\n");
      out.write("\t\tuser_type: 타입에 따른 기능 처리를 위해 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t -->\r\n");
      out.write("\t <input type=\"hidden\" id=\"action\" name=\"action\" value=\"\"/>\r\n");
      out.write("\t <input type=\"hidden\" id=\"qna_id\" name=\"qna_id\" value=\"\"/>\r\n");
      out.write("\t <input type=\"hidden\" id=\"user_type\" name=\"user_type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t <input type=\"hidden\" id=\"rv_id\" name=\"rv_id\" value=\"\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 모달 배경 -->\r\n");
      out.write("\t<div id=\"mask\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrap_area\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h2 class=\"hidden\">header 영역</h2>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<h2 class=\"hidden\">컨텐츠 영역</h2>\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"lnb\">\r\n");
      out.write("\t\t\t\t\t<!-- lnb 영역 --> ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/lnbMenu.jsp", out, false);
      out.write(" <!--// lnb (메뉴) 영역 -->\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"contents\">\r\n");
      out.write("\t\t\t\t\t<!-- contents -->\r\n");
      out.write("\t\t\t\t\t<h3 class=\"hidden\">contents 영역</h3> <!-- content -->\r\n");
      out.write("\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Location\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"../notice/aNotice.do\" class=\"btn_set home\">메인으로</a> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_nav bold\">커뮤니티</span> <span class=\"btn_nav bold\">Q&A\r\n");
      out.write("\t\t\t\t\t\t\t\t</span> <a href=\"/qna.do\" class=\"btn_set refresh\">새로고침</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p class=\"conTitle\">\r\n");
      out.write("\t\t                     <span>Q&A게시판 </span> <span class=\"fr\">\r\n");
      out.write("\t\t                     \r\n");
      out.write("\t\t                                                  제목 <input type=\"text\" id=\"searchtitle\" name=\"searchtitle\" />\r\n");
      out.write("\t\t                       <a class=\"btnType blue\" href=\"javascript:qnaList();\" name=\"searchbtn\" id=\"searchbtn\"><span>검색</span></a>\r\n");
      out.write("\t\t                       <a type=\"hidden\" class=\"btnType blue\" href=\"javascript:wirteBtn();\" name=\"newreg\" id=\"newreg\"><span>글쓰기</span></a>\r\n");
      out.write("\t\r\n");
      out.write("\t\t                     </span>\r\n");
      out.write("                  \t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"divComGrpCodList\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\t\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"7%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"62%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"10%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"15%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"10%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">작성자</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">등록일</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">조회수</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody id=\"qnaList\"></tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"paging_area\"  id=\"qnaPagination\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t</div> <!--// content -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h3 class=\"hidden\">풋터 영역</h3>\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 게시글 등록 모달팝업 -->\r\n");
      out.write("\t<div id=\"layer1\" class=\"layerPop layerType2\" style=\"width: 600px;\">\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt>\r\n");
      out.write("\t\t\t\t<strong> Q&A 등록</strong>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd class=\"content\">\r\n");
      out.write("\t\t\t\t<!-- s : 여기에 내용입력 -->\r\n");
      out.write("\t\t\t\t<table class=\"row\">\r\n");
      out.write("\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t<col width=\"120px\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"*\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"120px\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"*\">\r\n");
      out.write("\t\t\t\t\t</colgroup>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"/qnaSave.do\" name =\"qnaSaveForm\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"row\">제목 <span class=\"font_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=3><input type=\"text\" class=\"inputTxt p100\" name=\"qna_title\" id=\"qna_title\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"row\">내용 <span class=\"font_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"qna_con\" id=\"qna_con\" cols=\"40\" rows=\"5\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- e : 여기에 내용입력 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"btn_areaC mt30\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:qnaSave();\" class=\"btnType blue\" id=\"btnSave\" name=\"btnSave\"><span>등록</span></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:viewClose();\" class=\"btnType gray\"  id=\"btnClose\" name=\"btn\"><span>취소</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<a href=\"\" class=\"closePop\"><span class=\"hidden\" >닫기</span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--// 모달팝업 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 상세조회 모달팝업 -->\r\n");
      out.write("\t<div id=\"viewPop\" class=\"layerPop layerType2\" style=\"width: 600px;\">\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--// 상세조회모달팝업 -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- 수정 모달팝업 -->\r\n");
      out.write("\t<div id=\"modifyPop\" class=\"layerPop layerType2\" style=\"width: 600px;\">\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt>\r\n");
      out.write("\t\t\t\t<strong> Q&A 수정</strong>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd class=\"content\">\r\n");
      out.write("\t\t\t\t<!-- s : 여기에 내용입력 -->\r\n");
      out.write("\t\t\t\t<table class=\"row\">\r\n");
      out.write("\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t<col width=\"120px\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"*\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"120px\">\r\n");
      out.write("\t\t\t\t\t\t<col width=\"*\">\r\n");
      out.write("\t\t\t\t\t</colgroup>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<!-- <form action=\"/qnaModify.do\" name =\"qnaModifyForm\" method=\"post\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"row\">제목 <span class=\"font_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=3><input type=\"text\" class=\"inputTxt p100\" name=\"modify_title\" id=\"modify_title\" value=\"\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"row\">내용 <span class=\"font_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"modify_con\" id=\"modify_con\" value=\"\" cols=\"40\" rows=\"5\" wrap=\"hard\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<!-- </form> -->\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- e : 여기에 내용입력 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"btn_areaC mt30\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:qnaModify();\" class=\"btnType blue\" id=\"btnUpdate\" name=\"btnUpdate\"><span>등록</span></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:viewClose();\" class=\"btnType gray\"  id=\"btnClose\" name=\"btn\"><span>취소</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("<!-- \t\t<a href=\"\" class=\"closePop\"><span class=\"hidden\">닫기</span></a> -->\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</form>\r\n");
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
