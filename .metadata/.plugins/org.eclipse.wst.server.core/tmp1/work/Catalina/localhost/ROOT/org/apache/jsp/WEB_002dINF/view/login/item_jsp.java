/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-07-29 06:20:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class item_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/common_include.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#layer20\").hide();\r\n");
      out.write("\t$(\"#layer30\").hide();\r\n");
      out.write("\t$(\"#itemDetail\").hide();\r\n");
      out.write("\tvar param ={};\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"/item/itemList1.do\",\r\n");
      out.write("\t\ttype : \"post\",\r\n");
      out.write("\t\tdataType :\"json\",\r\n");
      out.write("\t\tdata: param,\r\n");
      out.write("\t\tsuccess : function(response) {\r\n");
      out.write("\t\t\tvar itemList = response.itemList;\r\n");
      out.write("\t\t\tvar html =\"\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\titemList.forEach(function(item){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\thtml+=\"<option  onClick='itemDetail(\"+item.item_code+\")' value='\"+item.item_code+\"'>\"+item.item_name+\"(\"+item.provide_value+\"원)\"+\"</option>\"\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#item_code\").val(item.item_code);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t$(\"#itemList\").html(html);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t$(\"#itemList\").change(function(){// change를 활용할줄 알게 되는게 주용할듯 \r\n");
      out.write("\t\t$(\"#itemDetail\").show();\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar itemCode = $(this).val();\r\n");
      out.write("\t\titemDetail(itemCode);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("function itemDetail(itemCode) {\r\n");
      out.write("\t$(\"#layer20\").hide();\r\n");
      out.write("\tvar param = {\r\n");
      out.write("\t\t\titem_code : itemCode\r\n");
      out.write("\t};\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"/item/itemDetail.do\",\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\tdata: param,\r\n");
      out.write("\t\tsuccess : function(response) {\r\n");
      out.write("\t\t\tvar itemDetail = response.itemDetail;\r\n");
      out.write("\t\t\tvar html =\"\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#detail1\").empty(); // 이렇게 empty를 적용해줘야 자동으로 새로고침이 된다 안하면 select 할때마다 리스트가 계속 늘어남 \r\n");
      out.write("\t\t\t$(\"#modify\").empty();\r\n");
      out.write("\t\t\titemDetail.forEach(function(item){\r\n");
      out.write("\t\t\t\thtml+=\"<td >\"+item.item_code+\"</td>\";\r\n");
      out.write("\t\t\t\thtml += \"<td><a href='javascript:void(0);' onclick='modify()'>\" + item.item_name + \"</a></td>\";\r\n");
      out.write("\t\t\t\thtml+=\"<td>\"+item.manufac+\"</td>\";\r\n");
      out.write("\t\t\t\thtml+=\"<td>\"+item.provide_value+\"</td>\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#item_code\").val(item.item_code);\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t$(\"#detail1\").append(html);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function modify(){\r\n");
      out.write("\t$(\"#layer20\").show();\r\n");
      out.write("\t$(\"#itemDetail\").hide();\r\n");
      out.write("\tvar param ={\r\n");
      out.write("\t\t\titem_code : $(\"#item_code\").val()\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"/item/itemDetail.do\",\r\n");
      out.write("\t\tdata :param,\r\n");
      out.write("\t\tdataType : \"json\",\r\n");
      out.write("\t\ttype : \"post\",\r\n");
      out.write("\t\tsuccess : function(response){\r\n");
      out.write("\t\t\tvar itemDetail = response.itemDetail;\r\n");
      out.write("\t\t\tvar html =\"\";\r\n");
      out.write("\t\t\t$(\"#detail1\").empty(); \r\n");
      out.write("\t\t\t$(\"#modify\").empty();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\titemDetail.forEach(function(item){\r\n");
      out.write("\t\t\t\thtml+=\"<td><input style = 'width : 50px' type='text' id='mode_item_code' readonly value='\"+item.item_code+\"'></td>\";\r\n");
      out.write("\t\t\t\thtml+=\"<td><input style = 'width : 50px' type='text' id='mode_item_name' value='\"+item.item_name+\"'></td>\";\r\n");
      out.write("\t\t\t\thtml+=\"<td><input style = 'width : 50px' type='text' id='mode_manufac' value='\"+item.manufac+\"'></td>\";\r\n");
      out.write("\t\t\t\thtml+=\"<td><input style = 'width : 50px' type='text' id='mode_provide_value' value='\"+item.provide_value+\"'></td>\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t$(\"#modify\").append(html);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var pageSize = 5; // Define pageSize here\r\n");
      out.write("var pageBlockPage = 5; // Define pageBlockPage here\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    $(\"#modeItem\").click(function() {\r\n");
      out.write("        var param = {\r\n");
      out.write("            item_code: $(\"#item_code\").val(),\r\n");
      out.write("            item_name: $(\"#mode_item_name\").val(),\r\n");
      out.write("            manufac: $(\"#mode_manufac\").val(),\r\n");
      out.write("            provide_value: $(\"#mode_provide_value\").val()\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"/item/itemModify.do\",\r\n");
      out.write("            type: \"post\",\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            data: param,\r\n");
      out.write("            success: function(response) {\r\n");
      out.write("                alert(response.resultMsg);\r\n");
      out.write("                itemDetail();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#itemList1\").click(function() {\r\n");
      out.write("        loadItemList(1);\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#search\").click(function(){\r\n");
      out.write("    \tloadItemList();\r\n");
      out.write("    \tconsole.log(\"검색\");\r\n");
      out.write("    });\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("// 전역 범위에 함수 정의\r\n");
      out.write("function loadItemList(cpage) {\r\n");
      out.write("    $(\"#main_item\").hide();\r\n");
      out.write("    $(\"#layer30\").show();\r\n");
      out.write("    $(\"#layer20\").hide();\r\n");
      out.write("    \r\n");
      out.write("    cpage = cpage || 1;\r\n");
      out.write("\r\n");
      out.write("    var param = {\r\n");
      out.write("        currentPage: cpage,\r\n");
      out.write("        pageSize: pageSize,\r\n");
      out.write("        searchTitle : $(\"#searchTitle\").val()\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: \"/item/itemList.do\",\r\n");
      out.write("        type: \"post\",\r\n");
      out.write("        dataType: \"json\",\r\n");
      out.write("        data: param,\r\n");
      out.write("        success: function(response) {\r\n");
      out.write("            var itemList = response.itemList;\r\n");
      out.write("            var html = \"\";\r\n");
      out.write("            var nRow = pageSize * (cpage - 1);\r\n");
      out.write("\r\n");
      out.write("            itemList.forEach(function(item) {\r\n");
      out.write("                nRow++;\r\n");
      out.write("                html += \"<tr>\";\r\n");
      out.write("                html += \"<td>\" + item.item_code + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.item_name + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.manufac + \"</td>\";\r\n");
      out.write("                html += \"<td>\" + item.provide_value + \"</td>\";\r\n");
      out.write("                html += \"</tr>\";\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $(\"#itemList2\").html(html);\r\n");
      out.write("            $(\"#totcnt\").val(response.itemCnt);\r\n");
      out.write("            $(\"#nRow\").val(nRow);\r\n");
      out.write("\r\n");
      out.write("            var pagieNavigateHtml = getPaginationHtml(cpage, $(\"#totcnt\").val(), pageSize, pageBlockPage, \"loadItemList\");\r\n");
      out.write("            $(\"#pagingNavi\").empty().append(pagieNavigateHtml);\r\n");
      out.write("            $(\"#currentPage\").val(cpage);\r\n");
      out.write("\r\n");
      out.write("            console.log(\"Total Count: \", response.itemCnt);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function itemOption(){\r\n");
      out.write("\t$(\"#main_item\").show();\r\n");
      out.write("\t$(\"#layer30\").hide();\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main_item\">\r\n");
      out.write("<div class=\"container mt-4\">\r\n");
      out.write("    <div class=\"row mb-3\">\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("            <h1 class=\"mb-3\">상품 리스트</h1>\r\n");
      out.write("            <button class=\"btn btn-primary\" id=\"itemList1\">리스트로 보기</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("            <table class=\"table table-striped\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>상품명(가격)</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <select id=\"itemList\" class=\"form-control\">\r\n");
      out.write("                            \t<option>상품명을 선택하세요</option>\r\n");
      out.write("                                <!-- 옵션 항목이 동적으로 추가됨 -->\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("    <div id=\"itemDetail\" class=\"mt-4\">\r\n");
      out.write("        <table class=\"table table-bordered\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>상품 코드</th>\r\n");
      out.write("                    <th>상품명</th>\r\n");
      out.write("                    <th>제조사</th>\r\n");
      out.write("                    <th>가격</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr id=\"detail1\">\r\n");
      out.write("                    <!-- 상품 세부사항이 동적으로 추가됨 -->\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("    \t<input type=\"hidden\" id=\"item_code\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"layer20\" >\r\n");
      out.write("    <div >\r\n");
      out.write("        <div >\r\n");
      out.write("            <div >\r\n");
      out.write("                <h5 class=\"modal-title\">상품 상세 정보</h5>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <table class=\"col\" >\r\n");
      out.write("              \t \t\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th >상품 코드</th>\r\n");
      out.write("                            <th>상품명</th>\r\n");
      out.write("                            <th>제조사</th>\r\n");
      out.write("                            <th>가격</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr id=\"modify\" >\r\n");
      out.write("                            <!-- 상품 세부사항이 동적으로 추가됨 -->\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("            \t<button id=\"modeItem\" class=\"btn btn-success\">수정</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"layer30\" >\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"currentPage\" value=\"\">\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"totcnt\" name=\"totcnt\">\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"nRow\" name=\"nRow\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h1>상품 리스트</h1> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>상품명</p>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"searchTitle\" name=\"searchTitle\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t<button id=\"search\" class=\"btn btn-success\">검색</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>상품 코드</td>\r\n");
      out.write("\t\t\t\t\t\t<td>상품 명</td>\r\n");
      out.write("\t\t\t\t\t\t<td>제조사</td>\r\n");
      out.write("\t\t\t\t\t\t<td>가격</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tbody id=\"itemList2\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"paging_area\" id=\"pagingNavi\"></div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:itemOption();\" class=\"btn btn-success\">옵션으로 보기</a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
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
