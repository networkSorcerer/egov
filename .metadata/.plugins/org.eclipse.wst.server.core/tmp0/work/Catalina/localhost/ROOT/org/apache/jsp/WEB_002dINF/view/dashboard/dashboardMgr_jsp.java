/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-06-15 08:07:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboardMgr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1717304976992L));
    _jspx_dependants.put("jar:file:/C:/Users/user/git/egov/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/marlmsone1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/user/git/egov/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/marlmsone1/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
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
      out.write("<title>Job Korea</title>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/common_include.jsp", out, false);
      out.write("\r\n");
      out.write("<script src=\"https://unpkg.com/axios@0.12.0/dist/axios.min.js\"></script>\r\n");
      out.write("<script src=\"https://unpkg.com/lodash@4.13.1/lodash.min.js\"></script>\r\n");
      out.write("<!-- D3 -->\r\n");
      out.write("<style>\r\n");
      out.write("//\r\n");
      out.write("click-able rows\r\n");
      out.write("\t.clickable-rows {tbody tr td { cursor:pointer;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".el-table__expanded-cell {\r\n");
      out.write("\tcursor: default;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("        \r\n");
      out.write("\t\t/* onload 이벤트  */\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"myForm\" action=\"\"  method=\"\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" id=\"currentPage\" value=\"1\">\r\n");
      out.write("<input type=\"hidden\" id=\"selectedInfNo\" value=\"\">\r\n");
      out.write("\t<!-- 모달 배경 -->\r\n");
      out.write("\t<div id=\"mask\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrap_area\">\r\n");
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
      out.write("\t               \r\n");
      out.write("\t\t\t\t\t<div class=\"content\" style=\"margin-bottom:20px;\">\r\n");
      out.write("                       \r\n");
      out.write("\t\t\t\t\t\t<p class=\"Location\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"../dashboard/dashboard.do\" class=\"btn_set home\">메인으로</a> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_nav bold\">메인</span> <a href=\"../dashboard/dashboard.do\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_set refresh\">새로고침</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("                         <div >\r\n");
      out.write("\t\t\t\t\t\t        <p class=\"conTitle\" style=\"margin-bottom: 1%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>React.JS 개요</span> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fr\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t 관련 자료 \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("                                        <table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td><b><h6>시작</h6></b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://ko.legacy.reactjs.org/docs/getting-started.html\" target=\"_blank\">OverView</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://ko.legacy.reactjs.org/docs/introducing-jsx.html\" target=\"_blank\">JSX</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td><b><h6>공식 사이트</h6></b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://reactjs-kr.firebaseapp.com/\" target=\"_blank\">공식 한국 reAct</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://ykss.netlify.app/translation/react_libraries_for_2024/\" target=\"_blank\">블로그</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://aglowiditsolutions.com/blog/best-react-ui-framework/\" target=\"_blank\">reAct UI Framework</a> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td><b><h6>reAct 설치</h6></b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://reactjs-kr.firebaseapp.com/docs/installation.html\" target=\"_blank\">설치</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td><b><h6>Life Cycle</h6></b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.zerocho.com/category/React/post/579b5ec26958781500ed9955\" target=\"_blank\">Life Cycle</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td><b><h6>자바스크립트</h6></b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://joshua1988.github.io/web-development/translation/essential-es6-features-for-vuejs/\" target=\"_blank\">ES6</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td style=\"vertical-align: top;\"><b><h6>테스트 사이트</h6></b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://jsfiddle.net/boilerplate/react-jsx\" target=\"_blank\">jsfiddle</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\t\t\r\n");
      out.write("                                                  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td style=\"vertical-align: top;\"><b><h6>참고자료</h6></b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://velog.io/@lky5697/react-starter\" target=\"_blank\">   2024년에 리액트 프로젝트를 시작하는 방법</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=mNj5_8k1zVk\" target=\"_blank\">   Zod로 데이터 유효성 검증 + 타입 추론</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://velog.io/@rgfdds98/Route-pathmovieId-%EB%8A%94-%EB%AC%B4%EC%8A%A8-%EC%9D%98%EB%AF%B8\" target=\"_blank\">Route 1</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://blog.sooli.com/?p=1326&referrer-analytics=1\" target=\"_blank\">Route 2</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://tcpschool.com/react/react_router_nested\" target=\"_blank\">Route(전체 강의 강추) 3</a> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=mC5N3NZcxFU\" target=\"_blank\">Re Randering 1</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=1YAWshEGU6g\" target=\"_blank\">Re Randering 2</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=HYgKBvLr49c\" target=\"_blank\">Component</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://youtu.be/aAs36UeLnTg?si=7yh8oA_meOy_lNxO\" target=\"_blank\">Component</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=kyodvzc5GHU\" target=\"_blank\">Hook 1</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=y0vhpilNSKo\" target=\"_blank\">Hook 2</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=n-ddI9Lt7Xs\" target=\"_blank\">Tanstack Query</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=zNHZJ_iEMPA\" target=\"_blank\">Zustand  (시리즈 강추)</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=nkXIpGjVxWU\" target=\"_blank\">React Query & Zustand </a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=7mkQi0TlJQo\" target=\"_blank\">React 18 버전</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                       &nbsp&nbsp&nbsp&nbsp&nbsp<a  href=\"https://www.youtube.com/watch?v=SQPLPPb_LuE\" target=\"_blank\">ChatGPT를 VSCode안으로 데리고 오자</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t               </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          <tr>\t\t\t\t\t\t\t\t\t\t\t          \t    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>  \t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                                <p class=\"conTitle\" style=\"margin-bottom: 1%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>1. nodeJs  설치     </span> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fr\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  NodeJS\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </p>\r\n");
      out.write("\t\t\t                    <table width=\"100%\" class=\"col\" border=0>\r\n");
      out.write("\t                                    <colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <col width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <td style=\"text-align:left\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                  <a  href=\"https://ojava.tistory.com/185\" target=\"_blank\">참조</a> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                   node-v14.16.0-x64.exe   실행\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     </tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t     </table> \t\t\r\n");
      out.write("\t\t\t\t\t\t\t     <br>\r\n");
      out.write("                                 <p class=\"conTitle\" style=\"margin-bottom: 1%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>2. nodeJs  설치  (Command)   </span> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fr\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  NodeJS\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </p>\r\n");
      out.write("\t\t\t                    <table width=\"100%\" class=\"col\" border=0>\r\n");
      out.write("\t                                    <colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <col width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <td style=\"text-align:left\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                  CMD 창에서  C:\\nodejs>npm install   실행\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     </tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t     </table> \t\r\n");
      out.write("\t\t\t\t\t\t\t     <br>\r\n");
      out.write("                                 \r\n");
      out.write("                                 <p class=\"conTitle\" style=\"margin-bottom: 1%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>3. reAct 설치  (Command)   </span> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fr\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  reActJS\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </p>\r\n");
      out.write("\t\t\t                    <table width=\"100%\" class=\"col\" border=0>\r\n");
      out.write("\t                                    <colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <col width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <td style=\"text-align:left\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                  npm install --save react react-dom 실행\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     </tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t     </table> \t\t\r\n");
      out.write("\t\t\t\t\t\t\t     <br>\r\n");
      out.write("                                 <p class=\"conTitle\" style=\"margin-bottom: 1%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>4. 프로젝트 생성  (Command)   </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t    </p>\r\n");
      out.write("\t\t\t                    <table width=\"100%\" class=\"col\" border=0>\r\n");
      out.write("\t                                    <colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <col width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <td style=\"text-align:left\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                  14.1 workspace 폴더 생성<br>\r\n");
      out.write("                                                          14.2 worksapce 폴더 cmd 에서 프로젝트 생성 <br>\r\n");
      out.write("                                                                  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp14.2.1 npx create-react-app (프로젝트 이름) <br>       \r\n");
      out.write("                                                              \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     </tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t     </table> \t\t\r\n");
      out.write("\t\t\t\t\t\t\t     <br>\r\n");
      out.write("\t\t\t\t\t\t\t      <p class=\"conTitle\" style=\"margin-bottom: 1%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>5. Server Run  (Command)   </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fr\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\tServer 실행\r\n");
      out.write("\t\t\t\t\t\t\t\t    </span> \r\n");
      out.write("\t\t\t\t\t\t\t    </p>\r\n");
      out.write("\t\t\t                    <table width=\"100%\" class=\"col\" border=0>\r\n");
      out.write("\t                                    <colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <col width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <td style=\"text-align:left\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                 생성 프로젝트 폴더로 이동 후 실행  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp npm start<br>\r\n");
      out.write("                                                              <a  href=\"http://localhost:3000/\"  target=\"_blank\">확인</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     </tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t     </table> \t\r\n");
      out.write("\t\t\t\t\t\t\t     <br>\r\n");
      out.write("\t\t\t\t\t\t\t      <p class=\"conTitle\" style=\"margin-bottom: 1%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>6. Vsc   설치</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fr\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\tVisual Studio Code\r\n");
      out.write("\t\t\t\t\t\t\t\t    </span> \r\n");
      out.write("\t\t\t\t\t\t\t    </p>\r\n");
      out.write("\t\t\t                    <table width=\"100%\" class=\"col\" border=0>\r\n");
      out.write("\t                                    <colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <col width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <td style=\"text-align:left\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                 VSCodeUserSetup-x64-1.61.0.exe 실행\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     </tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t     </table> \r\n");
      out.write("\t\t\t\t\t\t\t      <br>\r\n");
      out.write("\t\t\t\t\t\t\t      <p class=\"conTitle\" style=\"margin-bottom: 1%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>7. vsc 환경 설정</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fr\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\tVisual Studio Code\r\n");
      out.write("\t\t\t\t\t\t\t\t    </span> \r\n");
      out.write("\t\t\t\t\t\t\t    </p>\r\n");
      out.write("\t\t\t                    <table width=\"100%\" class=\"col\" border=0>\r\n");
      out.write("\t                                    <colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <col width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <td style=\"text-align:left\" >\r\n");
      out.write("                                                              <a  href=\"https://hashdork.com/ko/best-react-extensions-for-visual-studio-code/\"  target=\"_blank\">참조</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     </tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t     </table> \r\n");
      out.write("\t\t\t\t\t\t\t     <br>\r\n");
      out.write("\t\t\t\t\t\t\t      <p class=\"conTitle\" style=\"margin-bottom: 1%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>8. 프로젝트 열기</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fr\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\tVisual Studio Code\r\n");
      out.write("\t\t\t\t\t\t\t\t    </span> \r\n");
      out.write("\t\t\t\t\t\t\t    </p>\r\n");
      out.write("\t\t\t                    <table width=\"100%\" class=\"col\" border=0>\r\n");
      out.write("\t                                    <colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <col width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <td style=\"text-align:left\" >\r\n");
      out.write("                                                     VSC 메뉴 : 파일-폴더열기   선택후     해당 프로젝트 폴더 열기\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     </tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t     </table> \r\n");
      out.write("\t\t\t\t\t\t\t     <br>\r\n");
      out.write("\t\t\t\t\t\t\t      <p class=\"conTitle\" style=\"margin-bottom: 1%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>9. 샘플소스 만들기</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fr\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\tVisual Studio Code\r\n");
      out.write("\t\t\t\t\t\t\t\t    </span> \r\n");
      out.write("\t\t\t\t\t\t\t    </p>\r\n");
      out.write("\t\t\t                    <table width=\"100%\" class=\"col\" border=0>\r\n");
      out.write("\t                                    <colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <col width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <td style=\"text-align:left\" >\r\n");
      out.write("                                                     샘플소스 만들기\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t     </tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t     </table> \r\n");
      out.write("\t\t\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t        </div>  \r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\r\n");
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
}
