/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-07-15 00:47:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.management;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<title>기업고객/직원정보 관리(등록,수정)</title>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/common_include.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<input type=\"hidden\" id=\"currentPage\" value=\"\">  <!-- 현재페이지는 처음에 항상 1로 설정하여 넘김  -->\r\n");
      out.write("\t<input type=\"hidden\" name=\"action\" id=\"action\" value=\"\"> \r\n");
      out.write("\t<div id=\"wrap_area\">\r\n");
      out.write("\t\t<h2 class=\"hidden\">header 영역</h2> \r\n");
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
      out.write(" <!--// lnb 영역 -->\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"contents\">\r\n");
      out.write("\t\t\t\t\t<!-- contents -->\r\n");
      out.write("\t\t\t\t\t<h3 class=\"hidden\">contents 영역</h3> <!-- content -->\r\n");
      out.write("\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p class=\"conTitle\">\r\n");
      out.write("\t\t\t\t\t\t<span>test1</span>\r\n");
      out.write("\t\t\t\t\t\t<select>\r\n");
      out.write("\t\t\t\t\t\t\t<option>회사명</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>직원명</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>담당자명</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>담당업무</option>\r\n");
      out.write("\t\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<span class=\"fr\">\t\t\t\t\t\r\n");
      out.write("                          <input type=\"text\" id=\"searchTitle\" name=\"searchTitle\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("                          <input type=\"checkbox\" name=\"xxx\" value=\"yyy\" unchecked>\r\n");
      out.write("\t\t\t\t\t\t\t삭제된 정보 표시\r\n");
      out.write("                          <a class=\"btnType red\" href=\"\" name=\"searchbtn\"  id=\"searchBtn\"><span>검색</span></a>\r\n");
      out.write("                          \r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</p> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"divNoticeList\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\t\t                            <colgroup>\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"150px\">\r\n");
      out.write("\t\t\t\t\t\t                    <col width=\"60px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"150px\">\r\n");
      out.write("\t\t\t\t\t                 </colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">구분1</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">회사명/성명</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">담당업무</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">담당자명</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">연락처</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody id=\"userList\"></tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 페이징 처리  -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"paging_area\" id=\"pagingNavi\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btnType red\" name=\"newRegister\"  id=\"newRegister\"><span>신규 등록</span></a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btnType red\"  href=\"\" name=\"deleteBtn\"  id=\"deleteBtn\"><span>삭제</span></a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div id=new style=\"border:2px solid\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"type\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"B\">기업고객</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"C\">내부직원</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t<span>아이디</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"userId\" name=\"userId\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t비밀번호\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"passwd\" name=\"passwd\" style=\"height: 25px; margin-right: 10px;\"/> \t\r\n");
      out.write("\t\t\t\t\t\t\t<br><span>      </span>\r\n");
      out.write("\t\t\t\t\t\t\t회사명\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"copName\" name=\"copName\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t담당자명\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"manager\" name=\"manager\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t연락처\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"phone\" name=\"phon\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t이메일\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"email\" name=\"email\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t직원명\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"clerk\" name=\"clerk\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t담당업무\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select id=\"jobCode\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"AofuserInfo\">SCM</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"BofuserInfo\">배송</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"CofuserInfo\">구매</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"DofuserInfo\">임원</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</span>  \r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t우편번호\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"zipCode\" name=\"zipCode\" style=\"height: 25px; margin-right: 10px;\"/><br>\r\n");
      out.write("\t\t\t\t\t\t\t주소\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"address\" name=\"address\" style=\"height: 25px; margin-right: 10px;\"/><br>\r\n");
      out.write("\t\t\t\t\t\t\t상세주소\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"addressDetail\" name=\"addressDetail\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btnType red\" href=\"\" name=\"regist\"  id=\"registBtn\"><span>등록</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btnType red\"  name=\"cancle\"  id=\"cancleBtn\"><span>취소</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=detail></div>\r\n");
      out.write("\t\t\r\n");
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
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var pageSize = 6;\r\n");
      out.write("var pageBlockPage = 10;\r\n");
      out.write("var de = $(\"#new\");\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\t\r\n");
      out.write("    $(\"#newRegister\").click(function() { //신규등록 버튼 클릭 시 실행\r\n");
      out.write("        $(\"#userdetail\").empty();\r\n");
      out.write("        $(\"#new\").show();\r\n");
      out.write("        $(\"#deleteBtn\").hide();    \r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(\"#registBtn\").click(function() {\r\n");
      out.write("    \tuserRegist();\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(\"#deleteBtn\").click(function() {\r\n");
      out.write("    \tuserDelete();\r\n");
      out.write("    });\r\n");
      out.write("       \r\n");
      out.write("    $(\"#cancleBtn\").click(function() {\r\n");
      out.write("    \tregistCancle();\r\n");
      out.write("    })\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\tuserSearch();\r\n");
      out.write("\t$(\"#new\").hide();\r\n");
      out.write("\t$(\"#deleteBtn\").hide();\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("function userSearch(cpage){\r\n");
      out.write("\tcpage = cpage || 1;\r\n");
      out.write("\t\r\n");
      out.write("\t// 공지사항 데이터 보여주는 로직\r\n");
      out.write("\tvar param = {\r\n");
      out.write("\t\t\tsearchTitle : $(\"#searchTitle\").val(),\r\n");
      out.write("\t\t\tsearchStDate : $(\"#searchStDate\").val(),\r\n");
      out.write("\t\t\tsearchEdDate : $(\"#searchEdDate\").val(),\r\n");
      out.write("\t\t\tcurrentPage : cpage,\r\n");
      out.write("\t\t\tpageSize : pageSize\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tvar callBackFunction = function(response){\r\n");
      out.write("\t\t$(\"#userList\").empty().append(response);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar pagieNavigateHtml = getPaginationHtml(cpage, $(\"#totcnt\").val(), pageSize, pageBlockPage, \"userSearch\")\r\n");
      out.write("\t\t$(\"#pagingNavi\").empty().append(pagieNavigateHtml);\r\n");
      out.write("\t\t$(\"#currentPage\").val(cpage);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tcallAjax(\"/management/userList.do\", \"post\", \"text\", false, param,callBackFunction);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function userRegist(){ //신규 등록 기능\r\n");
      out.write("\tvar loginId = $('#userId').val();\r\n");
      out.write("\tvar name = $('#clerk').val();\r\n");
      out.write("\tvar user_type = $('#type').val();\r\n");
      out.write("\tvar password = $('#passwd').val();\r\n");
      out.write("\tvar hp = $('#phone').val();\r\n");
      out.write("\tvar email = $('#email').val();\r\n");
      out.write("\tvar zip_code = $('#zipCode').val();\r\n");
      out.write("\tvar addr = $('#address').val();\r\n");
      out.write("\tvar addr_detail = $('#addressDetail').val();\r\n");
      out.write("\tvar job_code = $('#jobCode').val();\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tvar param = {\r\n");
      out.write("\t\t\tloginID : loginId,\r\n");
      out.write("\t\t\tuser_Type : user_type,\r\n");
      out.write("\t\t\tname : name,\r\n");
      out.write("\t\t\tpassword : password,\r\n");
      out.write("\t\t\thp : hp,\r\n");
      out.write("\t\t\temail : email,\r\n");
      out.write("\t\t\tzip_code : zip_code,\r\n");
      out.write("\t\t\taddr : addr,\r\n");
      out.write("\t\t\taddr_detail : addr_detail,\r\n");
      out.write("\t\t\tjob_code : job_code \r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tvar callBackFunction = function(response){\r\n");
      out.write("\t\talert(\"저장 됐습니다\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tcallAjax(\"/management/regist.do\", \"post\", \"text\", false, param,callBackFunction);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function userDelete(){ /////삭제 기능\r\n");
      out.write("\tloginId = $('#userId2').val()\r\n");
      out.write("\t\r\n");
      out.write("\tvar param = {\r\n");
      out.write("\t\t\tloginID : loginId\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tvar callBackFunction = function(response){\r\n");
      out.write("\t\talert(\"삭제 됐습니다\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tcallAjax(\"/management/userDelete.do\", \"post\", \"text\", false, param,callBackFunction);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function registCancle(){ /////등록 취소\r\n");
      out.write("\t$(\"#new\").hide();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
