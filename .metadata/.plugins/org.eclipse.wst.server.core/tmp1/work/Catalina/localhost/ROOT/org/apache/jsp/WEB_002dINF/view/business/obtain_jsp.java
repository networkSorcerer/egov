/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-07-17 01:38:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.business;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class obtain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/common_include.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 부트스트랩 CSS 이거 하면 터짐..\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//배송지시서작성 버튼을 누르면 팝업창 나옴\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    $(\"#openDeliverybtn\").click(function(){\r\n");
      out.write("        $(\"#deliveryDirectionPop\").modal('show');\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(\"#openOrderbtn\").click(function(){\r\n");
      out.write("        $(\"#orderDirectionPop\").modal('show');\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
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
      out.write("\t\t\t\t\t\t<p class=\"Location\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"btn_set home\">메인으로</a> \r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"btn_nav bold\">시스템 관리</a> \r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"btn_nav bold\">공지 사항</span> \r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"btn_set refresh\">새로고침</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p class=\"conTitle\">\r\n");
      out.write("\t\t\t\t\t\t<span>수주현황</span> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"fr\">\t\t\t\t\t\r\n");
      out.write("                          <input type=\"text\" id=\"searchTitle\" name=\"searchTitle\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t  <a class=\"btnType red\" href=\"\" name=\"searchbtn\"  id=\"searchBtn\"><span>검색</span></a>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</p> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"divNoticeList\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\t\t                            <colgroup>\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                    <col width=\"60px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"150px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"150px\">\r\n");
      out.write("\t\t\t\t\t                 </colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">1.주문번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">2.주문일자</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">3.고객기업명</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">4. 주문제품명</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">5.총 재고개수</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">6. 단가</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">7. 주문개수</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">8.금액 합계</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">9. 반품요청 여부</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">10. 반품처리일자</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">11.입금여부</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">12.배송지시서작성</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">13.반품지시서작성</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody id=\"noticeList\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 2</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 2024-07-04</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 LG</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 서버(HP)</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 50</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 1000000</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 20</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 20*1000000</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 Y</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 N</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 20024-07-06</td>\r\n");
      out.write("\t\t\t\t\t                    \t<td><button id=\"openDeliverybtn\" class=\"btn btn-primary btn-sm\">배송지시서 작성</button></td>\r\n");
      out.write("\t\t\t\t\t                  \t\t<td><button id=\"openOrderbtn\" class=\"btn btn-secondary btn-sm\">발주지시서 작성</button></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 2024-07-05(최신)</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 삼성</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 라우터</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 20</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 1000</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 20</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 230*1000</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 Y</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 Y</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>더미 2024-07-04</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><button class=\"btn btn-primary btn-sm\">배송지시서 작성</button></td>\r\n");
      out.write("\t\t\t\t\t                  \t\t<td><button class=\"btn btn-secondary btn-sm\">발주지시서 작성</button></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 페이징 처리  -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"paging_area\" id=\"pagingNavi\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
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
      out.write("\t\r\n");
      out.write("\t<!-- 배송지시서 작성 모달팝업 -->\r\n");
      out.write("\t<div id=\"deliveryDirectionPop\" class=\"layerPop layerType2\" style=\"width: 600px;\">\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt>\r\n");
      out.write("\t\t\t\t<strong>배송지시서</strong>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd class=\"content\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<table class=\"row\">\r\n");
      out.write("\t\t\t\t    <caption>배송지시서</caption>\r\n");
      out.write("\t\t\t\t    <tbody>\r\n");
      out.write("\t\t\t\t        <tr>\r\n");
      out.write("\t\t\t\t            <th scope=\"row\">주문번호</th>\r\n");
      out.write("\t\t\t\t            <td colspan=\"3\">\r\n");
      out.write("\t\t\t\t                <span id=\"productName\">00001</span>\r\n");
      out.write("\t\t\t\t            </td>\r\n");
      out.write("\t\t\t\t        </tr>\r\n");
      out.write("\t\t\t\t        <tr>\r\n");
      out.write("\t\t\t\t            <th scope=\"row\">주문일자</th>\r\n");
      out.write("\t\t\t\t            <td colspan=\"3\">\r\n");
      out.write("\t\t\t\t                <span id=\"returnQuantity\">2020-07-07</span> \r\n");
      out.write("\t\t\t\t            </td>\r\n");
      out.write("\t\t\t\t        </tr>\r\n");
      out.write("\t\t\t\t        <tr>\r\n");
      out.write("\t\t\t\t            <th scope=\"row\">고객 기업명</th>\r\n");
      out.write("\t\t\t\t            <td colspan=\"3\">\r\n");
      out.write("\t\t\t\t                <span id=\"returnAmount\">넥슨</span> \r\n");
      out.write("\t\t\t\t            </td>\r\n");
      out.write("\t\t\t\t        </tr>\r\n");
      out.write("\t\t\t\t        <tr>\r\n");
      out.write("\t\t\t\t            <th scope=\"row\">제품명</th>\r\n");
      out.write("\t\t\t\t            <td colspan=\"3\">\r\n");
      out.write("\t\t\t\t                <span id=\"returnAmount\">라우터</span> \r\n");
      out.write("\t\t\t\t            </td>\r\n");
      out.write("\t\t\t\t        </tr>\r\n");
      out.write("\t\t\t\t        <tr>\r\n");
      out.write("\t\t\t\t            <th scope=\"row\">주문 수량</th>\r\n");
      out.write("\t\t\t\t            <td colspan=\"3\">\r\n");
      out.write("\t\t\t\t                <span id=\"returnAmount\">50</span>\r\n");
      out.write("\t\t\t\t            </td>\r\n");
      out.write("\t\t\t\t        </tr>\t\t\t\t        \r\n");
      out.write("\t\t\t\t        <tr>\r\n");
      out.write("\t\t\t\t            <th scope=\"row\">배송담당자</th>\r\n");
      out.write("\t\t\t\t            <td colspan=\"3\">\r\n");
      out.write("\t\t\t\t                <span id=\"returnAmount\">김아무개</span> \r\n");
      out.write("\t\t\t\t            </td>\r\n");
      out.write("\t\t\t\t        </tr>\t\t\t\t        \r\n");
      out.write("\t\t\t\t        <tr>\r\n");
      out.write("\t\t\t\t            <th scope=\"row\">입금여부</th>\r\n");
      out.write("\t\t\t\t            <td colspan=\"3\">\r\n");
      out.write("\t\t\t\t                <span id=\"returnAmount\">Y</span> \r\n");
      out.write("\t\t\t\t            </td>\r\n");
      out.write("\t\t\t\t        </tr>\t\t\t\t        \r\n");
      out.write("\t\t\t\t    </tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<a href=\"\" class=\"closePop\"><span class=\"hidden\">닫기</span></a>\r\n");
      out.write("\t\t<button id=\"saveDeliveryPop\" type=\"button\">저장</button>\r\n");
      out.write("\t\t<button id=\"updateDeliveryPop\" type=\"button\">수정</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--  -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<button id=\"closeOrderPop\" type=\"button\">닫기</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--\r\n");
      out.write("\t\t<a href=\"\" class=\"SaveDeliveryPop\"><span >저장</span></a>\r\n");
      out.write("\t\t<a href=\"\" class=\"updateDeliveryPop\"><span >수정</span></a>\r\n");
      out.write("\t\t<a href=\"\" class=\"updateDeliveryPop\"><span >닫기</span></a>\r\n");
      out.write("\t\t  -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t<!-- 발주지시서 작성 모달팝업 -->\r\n");
      out.write("\t<div id=\"orderDirectionPop\" class=\"layerPop layerType2\" style=\"width: 600px;\">\r\n");
      out.write("\t    <dl>\r\n");
      out.write("\t        <dt>\r\n");
      out.write("\t            <strong>발주지시서</strong>\r\n");
      out.write("\t        </dt>\r\n");
      out.write("\t        <dd class=\"content\">\r\n");
      out.write("\t            <!-- s : 여기에 내용입력 -->\r\n");
      out.write("\t            <table class=\"row\">\r\n");
      out.write("\t                <caption>제품 정보</caption>\r\n");
      out.write("\t                <tbody>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th scope=\"row\">제품번호</th>\r\n");
      out.write("\t                        <td colspan=\"3\">\r\n");
      out.write("\t                            <span id=\"productName\">0004</span> <!-- 여기에 서버에서 가져온 제품명 출력 -->\r\n");
      out.write("\t                        </td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th scope=\"row\">제품명</th>\r\n");
      out.write("\t                        <td colspan=\"3\">\r\n");
      out.write("\t                            <span id=\"returnQuantity\">UPS(삼품전원테크)</span> <!-- 여기에 서버에서 가져온 수량 출력 -->\r\n");
      out.write("\t                        </td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th scope=\"row\">발주 개수</th>\r\n");
      out.write("\t                        <td colspan=\"3\">\r\n");
      out.write("\t                            <span id=\"returnAmount\">460,000</span> <!-- 여기에 서버에서 가져온 반품 금액 출력 -->\r\n");
      out.write("\t                        </td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                </tbody>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t        </dd>\r\n");
      out.write("\t    </dl>\r\n");
      out.write("\t    <a href=\"\" class=\"closePop\"><span class=\"hidden\">닫기</span></a>\r\n");
      out.write("\t    <button id=\"saveOrderPop\" type=\"button\">저장</button>\r\n");
      out.write("\t    <button id=\"updateOrderPop\" type=\"button\">수정</button>\r\n");
      out.write("\t    <button id=\"closeOrderPop\" type=\"button\">닫기</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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