/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-06-18 11:26:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.adm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class equManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<title>시설 관리 : 장비 관리</title>\r\n");
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
      out.write("\t/** 페이징 사이즈 조절 */\r\n");
      out.write("\tvar pagesize = 10;\t\t\t// -- 한 페이지 당 몇개 보여줄 지\r\n");
      out.write("\tvar pageblocksize = 10;\t\t// -- 페이지 당 번호\r\n");
      out.write("\r\n");
      out.write("\t/** OnLoad event */ \r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tnameSearch();\r\n");
      out.write("\t\tfRegisterButtonClickEvent();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 강의실 list 모달에 등록\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t/** 버튼 이벤트 등록 */\r\n");
      out.write("\tfunction fRegisterButtonClickEvent() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#searchbtn\").click(function(e){\r\n");
      out.write("\t\t\te.preventDefault();\t// submit시에 창이 넘어가는 것을 방지\r\n");
      out.write("\t\t\tnameSearch();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// a 태그의 이름이 btn 인 경우\r\n");
      out.write("\t\t$('a[name=btn]').click(function(e) {\r\n");
      out.write("\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 현재 입력된 객체의 id 를 가져옴\r\n");
      out.write("\t\t\tvar btnId = $(this).attr('id');\r\n");
      out.write("          \r\n");
      out.write("\t\t\t// id 값으로 행동을 분기\r\n");
      out.write("\t\t\tswitch (btnId) {\r\n");
      out.write("\t\t\t\tcase 'btnSaveEqu' :\r\n");
      out.write("\t\t\t\t\tSaveEqu();\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\tcase 'btnDeleteEqu' :\r\n");
      out.write("\t\t\t\t\tDeleteEqu();\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\tcase 'btnClose' :\r\n");
      out.write("\t\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//////////////////////////////////////////////////////////////////////////////////////////////////////////////\r\n");
      out.write("\t\r\n");
      out.write("\t// 등록 모달 팝업 하는 함수\r\n");
      out.write("\tfunction newReg(){\r\n");
      out.write("\t\t// 초기화\r\n");
      out.write("\t\tinit();\r\n");
      out.write("\t\tgfModalPop(\"#layer1\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 값 초기화 함수\r\n");
      out.write("\tfunction init(data){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(data!=null){\r\n");
      out.write("\t\t\t$(\"#lecrm_id\").val(data.lecrm_id);//\r\n");
      out.write("\t\t\t$(\"#lecrm_name\").val(data.lecrm_name);\r\n");
      out.write("\t\t\t$(\"#equ_id\").val(data.equ_id);\r\n");
      out.write("\t\t\t$(\"#equ_name\").val(data.equ_name);\r\n");
      out.write("\t\t\t$(\"#equ_num\").val(data.equ_num);\r\n");
      out.write("\t\t\t$(\"#equ_note\").val(data.equ_note);\r\n");
      out.write("\t\t\t$(\"#action\").val(\"U\");\t// 수정 = U\r\n");
      out.write("\t\t\t$(\"#btnDelete\").show();\t// 삭제버튼 O\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$(\"#lecrm_id, #lecrm_name, #equ_id, #equ_name, #equ_num, #equ_note\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#action\").val(\"I\");\t// 신규 = I\r\n");
      out.write("\t\t\t$(\"#btnDelete\").hide();\t// 삭제버튼 X\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 강의실 or 장비 명 검색 함수\r\n");
      out.write("\tfunction nameSearch(cpage){\r\n");
      out.write("\t\t// 현재 페이지\r\n");
      out.write("\t\tcpage = cpage || 1;\t// undefined 일 때 1값 나오게 설정\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// JSON - key : value\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\tsearchOption : $(\"#searchOption\").val(),\r\n");
      out.write("\t\t\tsearchName : $(\"#searchName\").val(),\r\n");
      out.write("\t\t\tcpage : cpage,\r\n");
      out.write("\t\t\tpagesize : pagesize,\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t//alert(\"searchOption , searchName 선택 값 확인 : \" + param.searchOption + \", \" + param.searchName); \r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar listCallback = function(response){\r\n");
      out.write("\t\t\t//console.log(response);\r\n");
      out.write("\t\t\t$(\"#listEquBody\").empty().append(response);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// common.js 의 페이징 getPaginationHtml() 함수 사용\r\n");
      out.write("\t\t\tvar paginationHtml = getPaginationHtml(cpage, $(\"#listcnt\").val(), pagesize, pageblocksize, 'nameSearch'); \r\n");
      out.write("\t\t\tconsole.log(\"paginationHtml : \" + paginationHtml);\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#equPagination\").empty().append(paginationHtml); \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 보고있는 페이지 유지를 하기 위함\r\n");
      out.write("\t\t\t$(\"#cpage\").val(cpage);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// callAjax(url, method, dataType, async, param, callback)\r\n");
      out.write("\t\t\t// async : false , sync : true -- 비동기(요청하고 다른 동작 가능) / 동기\r\n");
      out.write("\t\tcallAjax(\"/adm/equManagementList.do\", \"post\", \"text\", false, param, listCallback);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t// 모달에서 글 저장 하는 함수\r\n");
      out.write("\tfunction SaveEqu(){\r\n");
      out.write("\t\t// flase 값이 들어오면 -> return\r\n");
      out.write("\t\tif(!fValidate()){\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 들어온 값을 저장하기위해 값을 저장\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\t\tlecrm_id : $(\"#lecrm_id\").val()\r\n");
      out.write("\t\t\t\t, equ_name : $(\"#equ_name\").val()\r\n");
      out.write("\t\t\t\t, equ_num : $(\"#equ_num\").val()\r\n");
      out.write("\t\t\t\t, equ_note : $(\"#equ_note\").val()\r\n");
      out.write("\t\t\t\t, action : $(\"#action\").val() \r\n");
      out.write("\t\t\t\t, equ_id : $(\"#equ_id\").val()\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//console.log(param.lecrm_id);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar savecallback = function(response){\r\n");
      out.write("\t\t\tconsole.log(JSON.stringify(response));\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t// 값이 저장되었는지에 대한 return 을 처리\r\n");
      out.write("\t\t\talert(response.resultmsg);\r\n");
      out.write("\t\t\t// 값 저장 성공시\r\n");
      out.write("\t\t\tif(response.result == \"S\") {\r\n");
      out.write("\t\t\t\tgfCloseModal();\r\n");
      out.write("\t\t\t\tif($(\"#action\").val() == \"I\") {\r\n");
      out.write("\t\t\t\t\tnameSearch();\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tnameSearch($(\"#cpage\").val());\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcallAjax(\"/adm/equSave.do\", \"post\", \"json\", false, param, savecallback);\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t// 장비 수정 - 상세\r\n");
      out.write("\tfunction equDtl(equ_id){\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\t\tequ_id : equ_id\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar delcallback = function(response){\r\n");
      out.write("\t\t\tconsole.log(JSON.stringify(response));\r\n");
      out.write("\r\n");
      out.write("\t\t\tinit(response.selinfo);\t\r\n");
      out.write("\t\t\tgfModalPop(\"#layer1\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcallAjax(\"/adm/equManagementDtl.do\", \"post\", \"json\", false, param, delcallback);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t// 강의실 삭제\r\n");
      out.write("\tfunction DeleteEqu(lecrm_id){\r\n");
      out.write("\t\t$(\"#action\").val(\"D\");\r\n");
      out.write("\t\tSaveEqu();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/** 장비 등록/수정 저장 validation */\r\n");
      out.write("\tfunction fValidate() {\r\n");
      out.write("\t\tvar chk = checkNotEmpty(\r\n");
      out.write("\t\t\t\t[\r\n");
      out.write("\t\t\t\t\t\t[ \"lecrm_name\", \"강의실 명을 입력해 주세요.\" ]\r\n");
      out.write("\t\t\t\t\t,\t[ \"equ_name\", \"장비 명을 입력해 주세요\" ]\r\n");
      out.write("\t\t\t\t\t,\t[ \"equ_num\", \"장비 수를 입력해 주세요\" ]\r\n");
      out.write("\t\t\t\t]\r\n");
      out.write("\t\t);\r\n");
      out.write("\r\n");
      out.write("\t\tif (!chk) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 필터링\r\n");
      out.write("\t/** 숫자 필터링 */\r\n");
      out.write("    function formatNumber(id) {\r\n");
      out.write("        var searchWord_std = document.getElementById(id);\r\n");
      out.write("        // 숫자로만 이루어진 문자열인지 확인\r\n");
      out.write("        var number = searchWord_std.value.replace(/[^0-9]/g, \"\");\r\n");
      out.write("        console.log(number);\r\n");
      out.write("        \r\n");
      out.write("        // 입력된 내용을 변경된 번호로 업데이트\r\n");
      out.write("        searchWord_std.value = number;\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"myForm\" action=\"\"  method=\"\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!--\r\n");
      out.write("\t\tlecrm_id\t-> 강의실 정보 수정/삭제시 PK 값으로 인덱싱하기 위해서 hidden 으로 저장\r\n");
      out.write("\t\taction\t\t-> I : insert , U : update, D : delete \r\n");
      out.write("\t -->\r\n");
      out.write("\t <input type=\"hidden\" id=\"equ_id\" name=\"equ_id\" value=\"\"/>\r\n");
      out.write("\t <input type=\"hidden\" id=\"action\" name=\"action\" value=\"\"/>\r\n");
      out.write("\t <input type=\"hidden\" id=\"cpage\" name=\"cpage\" value=\"\"/>\r\n");
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
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_nav bold\">시설 관리</span> <span class=\"btn_nav bold\"> 장비 관리\r\n");
      out.write("\t\t\t\t\t\t\t\t</span> <a href=\"\" class=\"btn_set refresh\">새로고침</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p class=\"conTitle\">\r\n");
      out.write("\t\t                     <span>장비 관리</span> <span class=\"fr\">\r\n");
      out.write("\r\n");
      out.write("\t\t                     <select id=\"searchOption\" name=\"searchOption\">\r\n");
      out.write("\t\t                     \t<option value=\"room\">강의실 명</option>\t\r\n");
      out.write("\t\t                     \t<option value=\"equ\">장비 명</option>\t\r\n");
      out.write("\t\t                     </select>\r\n");
      out.write("\t\t                     <input type=\"text\" id=\"searchName\" name=\"searchName\" class=\"form-control\" placeholder=\"\" style=\"height: 28px;\" / >\r\n");
      out.write("\t\r\n");
      out.write("\t\t                       <a class=\"btnType blue\" href=\"\" name=\"searchbtn\" id=\"searchbtn\"><span>검색</span></a>\r\n");
      out.write("\t\t                       <a class=\"btnType blue\" href=\"javascript:newReg();\" name=\"newReg\" id=\"newReg\"><span>장비 신규등록</span></a>\r\n");
      out.write("\t\t                     </span>\r\n");
      out.write("                  \t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"divEquList divComGrpCodList\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\t\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"15%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"10%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"40%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col width=\"15%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">강의실 명</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">장비 명</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">장비 수</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">비고</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"col\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody id=\"listEquBody\"></tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"paging_area\"  id=\"equPagination\"> </div>\r\n");
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
      out.write("\t\r\n");
      out.write("\t<!-- 모달팝업 // 장비 수정 -->\r\n");
      out.write("\t<div id=\"layer1\" class=\"layerPop layerType2\" style=\"width: 600px;\">\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt>\r\n");
      out.write("\t\t\t\t<strong>장비 등록</strong>\r\n");
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
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"row\">장비 명<span class=\"font_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=3><input type=\"text\" class=\"inputTxt p100\" name=\"equ_name\" id=\"equ_name\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"row\">장비 수<span class=\"font_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputTxt p100\" name=\"equ_num\" id=\"equ_num\"  \r\n");
      out.write("\t\t\t\t\t\t\t\toninput=\"javascript:formatNumber('equ_num');\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"숫자 입력\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"row\">강의실<span class=\"font_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<select id=\"lecrm_id\" name=\"lecrm_id\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"row\">비고</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=3><input type=\"text\" class=\"inputTxt p100\" name=\"equ_note\" id=\"equ_note\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- e : 여기에 내용입력 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"btn_areaC mt30\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"btnType blue\" id=\"btnSaveEqu\" name=\"btn\"><span>저장</span></a> \r\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"btnType blue\" id=\"btnDeleteEqu\" name=\"btn\"><span>삭제</span></a> \r\n");
      out.write("\t\t\t\t\t<a href=\"\"\tclass=\"btnType gray\"  id=\"btnClose\" name=\"btn\"><span>취소</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<a href=\"\" class=\"closePop\"><span class=\"hidden\">닫기</span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--// 모달팝업 -->\r\n");
      out.write("</form>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/view/adm/equManagement.jsp(346,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roomCnt eq 0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option>강의실 없음</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/view/adm/equManagement.jsp(350,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roomCnt > 0 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /WEB-INF/view/adm/equManagement.jsp(351,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/adm/equManagement.jsp(351,10) '${roomlist}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${roomlist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/view/adm/equManagement.jsp(351,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("list");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.lecrm_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.lecrm_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}