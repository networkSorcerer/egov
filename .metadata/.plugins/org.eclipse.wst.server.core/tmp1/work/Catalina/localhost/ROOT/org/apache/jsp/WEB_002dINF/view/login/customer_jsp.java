/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-07-30 08:12:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/common_include.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- response append를 사용해서 ajax 데이터 출력  & select를 통해서 내용을 선택하면 화면에 상세 내용이 나오도록 하기  +CRUD 만들기 \r\n");
      out.write("이건 이스트 에그처럼 '아이디'를 누르면 숨어있던 메뉴 베너가 나오고 클릭했을 때 내가 연습하는 모달창을 열수 있게 하자 \r\n");
      out.write("-->\r\n");
      out.write("<!-- 해피잡 이미지를 클릭하면 레드닷 게임을 할수 있도록 해보자  -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#show\").hide();\r\n");
      out.write("\t\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: \"/cust/custList1.do\",\r\n");
      out.write("        type: \"POST\", // POST 방식으로 요청\r\n");
      out.write("        dataType: \"json\", // 받아올 데이터 타입을 JSON으로 설정\r\n");
      out.write("        success: function(response) {\r\n");
      out.write("            var custList = response.custList; // 받아온 JSON 데이터에서 custList 배열 추출\r\n");
      out.write("            var html = \"\"; // 옵션 태그를 담을 문자열 초기화\r\n");
      out.write("            // custList 배열을 순회하며 옵션 태그 생성\r\n");
      out.write("            custList.forEach(function(item) {\r\n");
      out.write("                html += \"<option value='\" +item.cust_id+ \"'>\" + item.cust_name + \" (\" + item.cust_id + \")</option>\";\r\n");
      out.write("                \r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            // #list 요소에 생성된 옵션 태그 추가\r\n");
      out.write("            \r\n");
      out.write("            $(\"#list\").html(html);\r\n");
      out.write("        },\r\n");
      out.write("        error: function(xhr, status, error) {\r\n");
      out.write("            console.error(\"AJAX 오류 발생:\", error);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function custDetail(custId) {//중요하다 베리 아주 많이 data로 넣었더니 변수값에 혼동이 왔데 그래서 custId로 넣어줌\r\n");
      out.write("\tcurrentCustId = custId;\r\n");
      out.write("    $(\"#layer7\").show();\r\n");
      out.write("    console.log(\"cust_id\", custId);\r\n");
      out.write("\t\r\n");
      out.write("    var param = {\r\n");
      out.write("        cust_id: custId\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: \"/cust/custDetail.do\",\r\n");
      out.write("        type: \"post\",\r\n");
      out.write("        dataType: \"json\",\r\n");
      out.write("        data: param,\r\n");
      out.write("        success: function(response) {\r\n");
      out.write("            var custDetail = response.custDetail;\r\n");
      out.write("            var html = \"\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("            custDetail.forEach(function(item) {\r\n");
      out.write("                html += \"<tr>\";\r\n");
      out.write("                html += \"<td><input class='cust_name' value='\" + item.cust_name + \"'></td>\";\r\n");
      out.write("                html += \"<td><input class='cust_person' value='\" + item.cust_person + \"'></td>\";\r\n");
      out.write("                html += \"<td><input class='cust_person_ph' value='\" + item.cust_person_ph + \"'></td>\";\r\n");
      out.write("                html += \"<td><input class='cust_ph' value='\" + item.cust_ph + \"'></td>\";\r\n");
      out.write("                html += \"</tr>\";\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $(\"#detail\").html(html); // #detail 요소에 생성된 HTML 추가\r\n");
      out.write("        },\r\n");
      out.write("        error: function(xhr, status, error) {\r\n");
      out.write("            console.error(\"AJAX 오류 발생:\", error);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#list\").change(function(){\r\n");
      out.write("\t\tvar cust_id = $(this).val();\r\n");
      out.write("\t\t$(\"#show\").show();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"/cust/custDetail.do\",\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\tdata: { cust_id: cust_id },// 이부분 엄청 중요했음 ㄷㄷ  근데 여러가지 내용을 수정하려면 어떻게 해야할까? \r\n");
      out.write("\t\t\t\t\t//var param = {cust_id : cust_id , cust_name : cust_name} 이런식으로 도전 \r\n");
      out.write("\t\t\t success: function (response) {\r\n");
      out.write("\t             var custDetail = response.custDetail;\r\n");
      out.write("\t\t\t\tvar html= \"\";\r\n");
      out.write("\t             // 기존에 있던 데이터 삭제\r\n");
      out.write("\t             $(\"#customerDetail\").empty();//이거 활용하면 모달창 껏다가 켜도 내용 초기화 되어있을 듯 \r\n");
      out.write("\r\n");
      out.write("\t             // 고객 상세 정보 테이블에 행 추가\r\n");
      out.write("\t             custDetail.forEach(function(item){\r\n");
      out.write("\t            \t html += \"<td><a href='javascript:void(0);' onclick='custDetail(\" + item.cust_id + \");' id='cust_name'>\" + item.cust_id + \"</td>\";\r\n");
      out.write("\t            \t html += \"<td>\" + item.cust_name + \"</a></td>\";\r\n");
      out.write("\t                 html += \"<td>\" + item.cust_person + \"</td>\";\r\n");
      out.write("\t                 html += \"<td>\" + item.cust_person_ph + \"</td>\";\r\n");
      out.write("\t             })               \r\n");
      out.write("\t             $(\"#customerDetail\").append(html);\r\n");
      out.write("\t         },\r\n");
      out.write("\t         error: function(xhr, status, error) {\r\n");
      out.write("\t             console.error(\"AJAX 오류 발생:\", error);\r\n");
      out.write("\t         }\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function modifyCustomer() {\r\n");
      out.write("    var param = {\r\n");
      out.write("        cust_name: $(\".cust_name\").val(),\r\n");
      out.write("        cust_person: $(\".cust_person\").val(),\r\n");
      out.write("        cust_person_ph: $(\".cust_person_ph\").val(),\r\n");
      out.write("        cust_ph: $(\".cust_ph\").val(),\r\n");
      out.write("        cust_id: currentCustId \r\n");
      out.write("    };\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: \"/cust/custModify.do\",\r\n");
      out.write("        type: \"post\",\r\n");
      out.write("        dataType: \"json\",\r\n");
      out.write("        data: param,\r\n");
      out.write("        success: function(response) {\r\n");
      out.write("           alert(response.resultMsg);\r\n");
      out.write("        },\r\n");
      out.write("        error: function(xhr, status, error) {\r\n");
      out.write("            console.error(\"AJAX 오류 발생:\", error);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function close() {\r\n");
      out.write("\t$(\"#layer7\").hide();\r\n");
      out.write("\t$(\"#layer8\").hide();\r\n");
      out.write(" \t$(\"#list\").val(\"\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function deleteCust(){\r\n");
      out.write("\tvar param ={\r\n");
      out.write("\t\t\tcust_id : currentCustId\r\n");
      out.write("\t}\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"/cust/custDelete.do\",\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tdataType: \"json\",\r\n");
      out.write("\t\tdata:param,\r\n");
      out.write("\t\tsuccess: function(response){\r\n");
      out.write("\t\t\talert(response.resultMsg);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function newCustomer(){\r\n");
      out.write("\t$(\"#layer8\").show();\r\n");
      out.write("\t$(\"#cust_name1\").val(\"\");\r\n");
      out.write("\t$(\"#cust_ph1\").val(\"\");\r\n");
      out.write("\t$(\"#cust_person1\").val(\"\");\r\n");
      out.write("\t$(\"#cust_person_ph1\").val(\"\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function newCustomerInsert(){\r\n");
      out.write("\tvar param ={\r\n");
      out.write("\t\t\tcust_name :$(\"#cust_name1\").val(),\r\n");
      out.write("\t\t\tcust_ph:$(\"#cust_ph1\").val(),\r\n");
      out.write("\t\t\tcust_person:$(\"#cust_person1\").val(),\r\n");
      out.write("\t\t\tcust_person_ph:$(\"#cust_person_ph1\").val()\r\n");
      out.write("\t}\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"/cust/custInsert.do\",\r\n");
      out.write("\t\ttype: \"post\",\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\tdata: param,\r\n");
      out.write("\t\tsuccess: function(response){\r\n");
      out.write("\t\t\talert(response.resultMsg);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" onclick='newCustomer();' class=\"btn btn-success\">신규 등록</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div > \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<select id=\"list\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<table class=\"col\" id=\"show\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>고객 ID</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>고객사</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>고객사 담당자</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>고객사 담당 자 번호</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr id=\"customerDetail\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr >\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"cust_id1\" name=\"\" >\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- 신규로 작성할수 있는 모달 창과 수정 할수 있는 모달 창을 추가 하도록 하자  \r\n");
      out.write("회사명을 클릭하면 수정화면으로 가게 되고 거기서 삭제도 가능 신규 버튼을 클릭 하면 신규로 cust_info 에 회사 정보를 입력할수 있도록 해보자 \r\n");
      out.write("-->\t\r\n");
      out.write("\t<div id=\"layer7\" class=\"layerPosition layerPop layerType2\" style=\"width: 600px; height : 450px\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h1>고객 정보 수정</h1> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr id=\"detail\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:modifyCustomer();\" class=\"btn btn-success\">수정</a>\r\n");
      out.write("\t\t\t\t<a href=\"#\" onclick='deleteCust();' class=\"btn btn-danger\">삭제</a>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:close();\" class=\"btn btn-secondary\">닫기</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"layer8\" class=\"layerPosition layerPop layerType2\" style=\"width: 600px; height : 450px\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h1>신규 고객 등록</h1> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr id=\"detail\">\r\n");
      out.write("\t\t\t\t\t\t<td>고객사</td>\r\n");
      out.write("\t\t\t\t\t\t<td>고객사 연락처</td>\r\n");
      out.write("\t\t\t\t\t\t<td>고객사 담당자</td>\r\n");
      out.write("\t\t\t\t\t\t<td>고객사 담당자 연락처</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"cust_name1\" name=\"cust_name\"></td><!-- name도 넣어줘야 좋다 -->\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"cust_ph1\" name=\"cust_ph\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"cust_person1\" name=\"cust_person\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"cust_person_ph1\" name=\"cust_person_ph\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<a href=\"#\" onClick=\"newCustomerInsert();\" class=\"btn btn-success\">등록</a>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:close();\" class=\"btn btn-secondary\">닫기</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
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
