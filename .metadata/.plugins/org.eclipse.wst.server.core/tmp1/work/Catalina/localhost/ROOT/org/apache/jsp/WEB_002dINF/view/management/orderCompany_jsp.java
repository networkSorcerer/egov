/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-07-22 00:36:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.management;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderCompany_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/user/git/egov/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/scm/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1717304976992L));
    _jspx_dependants.put("jar:file:/C:/Users/user/git/egov/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/scm/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/common_include.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\torderCompanyList()\r\n");
      out.write("\t\tregisterBtnEvent()\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("\tfunction registerBtnEvent() {\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#newCompany\").click(function(e) {\r\n");
      out.write("\t\t\te.preventDefault();\r\n");
      out.write("\t\t\tgfModalPop(\"#newCompanyModal\")\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#btnNewCompany\").click(function(e) {\r\n");
      out.write("\t\t\tnewCompanySave();\r\n");
      out.write("\t\t\torderCompanyList();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#btnNewItem\").click(function(e) {\r\n");
      out.write("\t\t\tnewItemSave();\r\n");
      out.write("\t\t\torderCompanyList();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction orderCompanyList() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tvar callBackFunction = function(res) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#orderCompanyList\").empty().append(res);\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tcallAjax(\"/management/orderCompanyList.do\", \"post\", \"text\", false,\r\n");
      out.write("\t\t\t\tparam, callBackFunction);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction newCompanySave() {\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\tcompany_name : $(\"#newCompanyInput\").val()\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tvar callBackFunction = function(res) {\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tcallAjax(\"/management/newCompanySave.do\", \"post\", \"text\", false, param,\r\n");
      out.write("\t\t\t\tcallBackFunction);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction orderComponyDetail(seq) {\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#hiddenInput\").val(seq)\r\n");
      out.write("\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\tcompany_seq : seq\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tvar callBackFunction = function(res) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#orderComponyDetail\").empty().append(res);\r\n");
      out.write("\t\t\torderComSelectItem()\r\n");
      out.write("\t\t\tgfModalPop(\"#orderComponyModal\")\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tcallAjax(\"/management/orderComponyDetail.do\", \"post\", \"text\", false,\r\n");
      out.write("\t\t\t\tparam, callBackFunction);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction orderComSelectItem(seq) {\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\tcompany_seq : seq\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tvar callBackFunction = function(res) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#selectOption\").empty().append(res);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tcallAjax(\"/management/orderComSelectItem.do\", \"post\", \"text\", false,\r\n");
      out.write("\t\t\t\tparam, callBackFunction);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction orderComAddItem() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\tcompany_seq : seq\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tvar callBackFunction = function(res) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t$(\"#selectOption\").empty().append(res);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tcallAjax(\"/management/orderComSelectItem.do\", \"post\", \"text\", false,\r\n");
      out.write("\t\t\t\tparam, callBackFunction);\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction newItemSave() {\r\n");
      out.write("\r\n");
      out.write("\t\tconsole.log($(\"#selectOption\").val())\r\n");
      out.write("\t\tvar param = {\r\n");
      out.write("\t\t\tcompany_seq : $(\"#hiddenInput\").val(),\r\n");
      out.write("\t\t\titem_code : $(\"#selectOption\").val()\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tvar callBackFunction = function(res) {\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tcallAjax(\"/management/newItemSave.do\", \"post\", \"text\", false, param,\r\n");
      out.write("\t\t\t\tcallBackFunction);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" id=\"currentPage\" value=\"\">\r\n");
      out.write("\t<!-- 현재페이지는 처음에 항상 1로 설정하여 넘김  -->\r\n");
      out.write("\t<input type=\"hidden\" name=\"action\" id=\"action\" value=\"\">\r\n");
      out.write("\t<div id=\"wrap_area\">\r\n");
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
      out.write(" <!--// lnb 영역 -->\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"contents\">\r\n");
      out.write("\t\t\t\t\t<!-- contents -->\r\n");
      out.write("\t\t\t\t\t<h3 class=\"hidden\">contents 영역</h3> <!-- content -->\r\n");
      out.write("\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Location\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"btn_set home\">메인으로</a> <a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_nav bold\">관리</a> <span class=\"btn_nav bold\">발주업체관리</span>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"btn_set refresh\">새로고침</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"conTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>발주업체관리</span> <span class=\"fr\"> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btnType red\" href=\"\" name=\"newCompany\" id=\"newCompany\"><span>업체\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t등록</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"divStorageList\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<caption>발주업체관리</caption>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<col width=\"20px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<col width=\"100px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">업체번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">업체이름</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody id=\"orderCompanyList\"></tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"paging_area\" id=\"pagingNavi\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"hidden\">풋터 영역</h3>\r\n");
      out.write("\t\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"newCompanyModal\" class=\"layerPop layerType2\"\r\n");
      out.write("\t\tstyle=\"width: 300px;\">\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt>\r\n");
      out.write("\t\t\t\t<strong>발주 업체 등록</strong>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd class=\"content\">\r\n");
      out.write("\t\t\t\t<!-- s : 여기에 내용입력 -->\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<label>업체이름</label> <input type=\"text\" id=\"newCompanyInput\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"btn_areaC mt30\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"btnType blue\" id=\"btnNewCompany\" name=\"btn\"><span>저장</span></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"btnType gray\" id=\"btnClose\" name=\"btn\"><span>취소</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<a href=\"\" class=\"closePop\"><span class=\"hidden\">닫기</span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"orderComponyModal\" class=\"layerPop layerType2\"\r\n");
      out.write("\t\tstyle=\"width: 300px;\">\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt>\r\n");
      out.write("\t\t\t\t<strong>상세보기</strong>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd class=\"content\">\r\n");
      out.write("\t\t\t\t<!-- s : 여기에 내용입력 -->\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t<caption>발주업체관리</caption>\r\n");
      out.write("\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t<col>\r\n");
      out.write("\t\t\t\t\t\t\t<col>\r\n");
      out.write("\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\">업체이름</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\">물품이름</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody id=\"orderComponyDetail\"></tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<div style=\"margin-top: 15px;\">\r\n");
      out.write("\t\t\t\t\t\t<label>물품추가</label> <select id=\"selectOption\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"btn_areaC mt30\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"btnType blue\" id=\"btnNewItem\" name=\"btn\"><span>추가</span></a>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" value=\"\" id=\"hiddenInput\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<a href=\"\" class=\"closePop\"><span class=\"hidden\">닫기</span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
