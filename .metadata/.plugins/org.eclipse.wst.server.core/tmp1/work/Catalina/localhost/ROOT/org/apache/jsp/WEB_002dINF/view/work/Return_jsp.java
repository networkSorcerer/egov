/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-07-22 02:54:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.work;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Return_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/common_include.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .layerPosition {\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            left: 50%;\r\n");
      out.write("            transform: translate(-50%, -50%);\r\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            z-index: 1000;\r\n");
      out.write("        }\r\n");
      out.write("        .layerPop {\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("        .layerType2 {\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 300px;\r\n");
      out.write("        }\r\n");
      out.write("        .col {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("        }\r\n");
      out.write("        .col td {\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            padding: 8px;\r\n");
      out.write("        }\r\n");
      out.write("        .btn {\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-success {\r\n");
      out.write("            background-color: #28a745;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border: none;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var pageSize=5;\r\n");
      out.write("var pageBlockPage=10;\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("    registerBtnEvent();\r\n");
      out.write("    radioChange();\r\n");
      out.write("    returnList();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("var type;\r\n");
      out.write("\r\n");
      out.write("function radioChange() {\r\n");
      out.write("    $('input[type=radio][name=\"deliveryRadio\"]').change(function() {\r\n");
      out.write("    \tvar type = $(this).val();\r\n");
      out.write("    \treturnList(null, type);\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function returnList(cpage, type) {\r\n");
      out.write("    $(\"#insert\").hide();\r\n");
      out.write("    $(\"#layer1\").hide();\r\n");
      out.write("    \r\n");
      out.write("    cpage = cpage || 1;\r\n");
      out.write("    var param = {\r\n");
      out.write("        searchTitle: $(\"#searchTitle\").val(),\r\n");
      out.write("        searchStDate: $(\"#searchStDate\").val(),\r\n");
      out.write("        searchEdDate: $(\"#searchEdDate\").val(),\r\n");
      out.write("        searchSelect: $(\"#searchSelect\").val(), // 이 부분을 확인하여 실제 ID를 사용합니다.\r\n");
      out.write("        currentPage : cpage,\r\n");
      out.write("\t\tpageSize : pageSize,\r\n");
      out.write("\t\ttype: type || null // type 매개변수를 optional로 만들어 기본값을 null로 설정합니다.\r\n");
      out.write("    };\r\n");
      out.write("\tconsole.log(param);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: \"/work/returnList.do\",\r\n");
      out.write("        type: \"post\",\r\n");
      out.write("        dataType: \"json\",\r\n");
      out.write("        data: param,\r\n");
      out.write("        success: function(response) {\r\n");
      out.write("            var returnList = response.returnList;\r\n");
      out.write("            var html = \"\";\r\n");
      out.write("            var nRow = pageSize*(cpage -1);\r\n");
      out.write("            returnList.forEach(function(item, index) {\r\n");
      out.write("            \tnRow++;\r\n");
      out.write("                html += \"<tr>\";\r\n");
      out.write("                html += \"<td>\" + item.seq + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.item_code + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.return_count + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.return_order_date + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.signYN + \"</td>\";\r\n");
      out.write("                html += \"<td><a href='javascript:void(0);' onClick='returnDetail(\" + item.seq + \",\\\"\" + item.item_code + \"\\\");' class='btn btn-secondary'>상세보기</a></td>\";\r\n");
      out.write("                html += \"</tr>\";\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $(\"#returnList\").html(html);\r\n");
      out.write("            \r\n");
      out.write("            $(\"#totcnt\").val(response.returnCnt);\r\n");
      out.write("\t\t\t$(\"#nRow\").val(nRow);\r\n");
      out.write("\t\t\t$(\"#currentPage\").val(cpage);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar pagieNavigateHtml = getPaginationHtml(cpage, $(\"#totcnt\").val(), pageSize, pageBlockPage, \"returnList\")\r\n");
      out.write("\t\t\t$(\"#pagingNavi\").empty().append(pagieNavigateHtml);\r\n");
      out.write("\t\t\t$(\"#currentPage\").val(cpage);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tconsole.log(\"Total Count: \", response.returnCnt);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function returnDetail(seq, item_code) {\r\n");
      out.write("    var seqParam = { seq: seq };\r\n");
      out.write("    var itemCodeParam = { item_code: item_code };\r\n");
      out.write("\r\n");
      out.write("    $(\"#modify\").hide();\r\n");
      out.write("    $(\"#layer1\").show();\r\n");
      out.write("\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: \"/work/returnDetail.do\",\r\n");
      out.write("        type: \"post\",\r\n");
      out.write("        dataType: \"json\",\r\n");
      out.write("        data: seqParam,\r\n");
      out.write("        success: function(response) {\r\n");
      out.write("            var returnDetail = response.returnDetail;\r\n");
      out.write("            var html = \"\";\r\n");
      out.write("\r\n");
      out.write("            $(\"#returnDetail\").empty();\r\n");
      out.write("\r\n");
      out.write("            returnDetail.forEach(function(item) {\r\n");
      out.write("               \thtml+=\"<tr>\";\r\n");
      out.write("                html += \"<td>\" + item.seq + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.item_code + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.return_order_date + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.return_count + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.refund_bank + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.refund_bank_num + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.refund_bank_name + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.signYN + \"</td>\";\r\n");
      out.write("                if (item.signYN === 'N') {\r\n");
      out.write("                    html += \"<td><button onClick='confirmReturn();' id='confirm'>반품 완료</button></td>\";\r\n");
      out.write("                } else {\r\n");
      out.write("                    html += \"<td></td>\";\r\n");
      out.write("                }\r\n");
      out.write("                html+=\"</tr>\";\r\n");
      out.write("\r\n");
      out.write("                $(\"#seq\").val(item.seq);\r\n");
      out.write("                $(\"#item_code\").val(item.item_code);\r\n");
      out.write("                $(\"#return_count\").val(item.return_count);\r\n");
      out.write("                \r\n");
      out.write("               /*  var pagieNavigateHtml = getPaginationHtml(cpage, $(\"#totcnt\").val(), pageSize, pageBlockPage, \"productList\")\r\n");
      out.write("    \t\t\t$(\"#pagingNavi\").empty().append(pagieNavigateHtml);\r\n");
      out.write("    \t\t\t$(\"#currentPage\").val(cpage); */\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $(\"#returnDetail\").append(html);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function confirmReturn() {\r\n");
      out.write("    var param = {\r\n");
      out.write("        seq: $(\"#seq\").val(),\r\n");
      out.write("        item_code: $(\"#item_code\").val(),\r\n");
      out.write("        return_count: $(\"#return_count\").val()\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: \"/work/confirm.do\",\r\n");
      out.write("        type: \"post\",\r\n");
      out.write("        dataType: \"json\",\r\n");
      out.write("        data: param,\r\n");
      out.write("        success: function(response) {\r\n");
      out.write("            alert(response.resultMsg);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: \"/work/modItemCount.do\",\r\n");
      out.write("        type: \"post\",\r\n");
      out.write("        dataType: \"json\",\r\n");
      out.write("        data: param,\r\n");
      out.write("        success: function(response) {\r\n");
      out.write("            alert(response.resultMsg);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function registerBtnEvent() {\r\n");
      out.write("    $(\"#title\").click(function() {\r\n");
      out.write("        $(\"#insert\").toggle();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(\"#close\").click(function() {\r\n");
      out.write("        $(\"#layer1\").hide();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(\"#searchBtn\").click(function(e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        returnList();\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#modalTitle\").click(function(){\r\n");
      out.write("    \t$(\"#modify\").toggle();\r\n");
      out.write("    })\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("\t\t\t\t\t\t\t\tclass=\"btn_nav bold\">담당업무</a> <span class=\"btn_nav bold\">발주서현황</span>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"btn_set refresh\">새로고침</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div><!-- 여기부터 내용 추가 -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"deliveryList\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"conTitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"title\">반품처리</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fr\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t상품명\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"searchTitle\" name=\"searchTitle\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t기간\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"date\" id=\"searchStDate\" name=\"searchStDate\" style=\"height: 25px; margin-right: 10px;\"/> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t~ \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"date\" id=\"searchEdDate\" name=\"searchEdDate\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"btnType red\" href=\"\" name=\"searchbtn\"  id=\"searchBtn\"><span>검색</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"radio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" value=\"\"  name=\"deliveryRadio\" checked>전체\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" value=\"ing\" name=\"deliveryRadio\">반품처리중\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" value=\"done\" name=\"deliveryRadio\">반품완\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button id=\"insert\">신규</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"\" name=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"totcnt\" name=\"totcnt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"nRow\" name=\"nRow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<caption>발주승인</caption>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<col width=\"60px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<col width=\"100px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<col width=\"60px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<col width=\"120px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<col width=\"40px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<col width=\"40px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">반품번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">상품명</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">상품수량</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">반품날짜</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">반품결과</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">상세보기</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody id=\"returnList\"></tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"paging_area\" id=\"pagingNavi\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("<!-- ----------------------------------------경계선----------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"layer1\" class=\"layerPosition layerPop layerType2\" style=\"width: 500px; height: 300px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1 id=\"modalTitle\" onClick=\"practice();\">반품 상세 조회</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>반품코드</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>상품코드</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>반품신청일</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>반품수량</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>환불 은행</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>환불 계좌</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>환불 계좌명</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>반품결과</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody id=\"returnDetail\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button onClick=\"modify\" id=\"modify\">수정</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"close\" class=\"btn btn-success\">닫기</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"seq\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"item_code\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"return_count\">\r\n");
      out.write(" \t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("<!-- ----------------------------------------------------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"layer2\" class=\"layerPosition layerPop layerType2\" style=\"width: 500px; height: 500px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<h3 class=\"hidden\">풋터 영역</h3>\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
