/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-07-02 08:42:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class notice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <script src=\"https://code.jquery.com/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title> 공지사항  </title>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/common/common_include.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var pageSize = 5;\r\n");
      out.write("    var pageBlockPage = 10;\r\n");
      out.write("\r\n");
      out.write("    $(function() { \r\n");
      out.write("        noticeSearch();\r\n");
      out.write("        registerBtnEvent();\r\n");
      out.write("        filePreview();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function registerBtnEvent() {\r\n");
      out.write("        $(\"#searchBtn\").click(function(e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            noticeSearch();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\"a[name=btn]\").click(function(e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("\r\n");
      out.write("            var btnId = $(this).attr(\"id\");\r\n");
      out.write("            switch(btnId) {\r\n");
      out.write("                case \"btnSaveNotice\":\r\n");
      out.write("                    saveNotice();\r\n");
      out.write("                    break;\r\n");
      out.write("                case \"btnUpdateNotice\":\r\n");
      out.write("                    updateNotice();\r\n");
      out.write("                    break;\r\n");
      out.write("                case \"btnDeleteNotice\":\r\n");
      out.write("                    deleteNotice(); // 이 부분은 정의된 함수가 없으므로 추가 필요\r\n");
      out.write("                    break;\r\n");
      out.write("                case \"btnClose\":\r\n");
      out.write("                    gfCloseModal();\r\n");
      out.write("                    break;\r\n");
      out.write("                case \"btnSavefile\":\r\n");
      out.write("                    saveFileNotice();\r\n");
      out.write("                    break;\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function noticeSearch(cpage) {\r\n");
      out.write("        cpage = cpage || 1;\r\n");
      out.write("        var param = { \r\n");
      out.write("            searchTitle : $(\"#searchTitle\").val(),\r\n");
      out.write("            searchStDate : $(\"#searchStDate\").val(),\r\n");
      out.write("            searchEdDate: $(\"#searchEdDate\").val(),\r\n");
      out.write("            currentPage: cpage,\r\n");
      out.write("            pageSize: pageSize\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var callBackFunction = function(response) {\r\n");
      out.write("            $(\"#noticeList\").empty().append(response);\r\n");
      out.write("            var pageNavigateHtml = getPaginationHtml(cpage, $(\"#totcnt\").val(), pageSize, pageBlockPage, \"noticeSearch\");\r\n");
      out.write("            $(\"#pagingNavi\").empty().append(pageNavigateHtml);\r\n");
      out.write("            $(\"#currentPage\").val(cpage); // 현재 페이지 업데이트\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        callAjax(\"/system/noticeList.do\", \"post\", \"text\", false, param, callBackFunction);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function insertModal() {\r\n");
      out.write("        $(\"#loginId\").val(\"\");\r\n");
      out.write("        $(\"#noticeTitle\").val(\"\");\r\n");
      out.write("        $(\"#noticeContent\").val(\"\");\r\n");
      out.write("        $(\"#noticeSeq\").val(\"\");\r\n");
      out.write("        $(\"#btnUpdateNotice\").hide();\r\n");
      out.write("        $(\"#btnSaveNotice\").show();\r\n");
      out.write("        $(\"#btnDeleteNotice\").hide();\r\n");
      out.write("        gfModalPop(\"#noticeInsertModal\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function saveNotice() {\r\n");
      out.write("        if (!fValidate()) {\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var param = {\r\n");
      out.write("            title: $(\"#noticeTitle\").val(),\r\n");
      out.write("            content: $(\"#noticeContent\").val(),\r\n");
      out.write("            noticeSeq: $(\"#noticeSeq\").val()\r\n");
      out.write("        };\r\n");
      out.write("        var callBackFunction = function(response) {\r\n");
      out.write("            if(response.result == \"SUCCESS\") {\r\n");
      out.write("                alert(\"저장이 되었습니다\");\r\n");
      out.write("                gfCloseModal();\r\n");
      out.write("                noticeSearch();\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        callAjax(\"/system/noticeSave.do\", \"post\", \"json\", false, param, callBackFunction);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateNotice() {\r\n");
      out.write("        if (!fValidate()) {\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var param = {\r\n");
      out.write("            title: $(\"#noticeTitle\").val(),\r\n");
      out.write("            content: $(\"#noticeContent\").val(),\r\n");
      out.write("            noticeSeq: $(\"#noticeSeq\").val() // noticeSeq 값을 정확히 가져오도록 수정\r\n");
      out.write("        };\r\n");
      out.write("        var callBackFunction = function(response) {\r\n");
      out.write("            if(response.result == \"SUCCESS\") {\r\n");
      out.write("                alert(\"저장이 되었습니다\");\r\n");
      out.write("                gfCloseModal();\r\n");
      out.write("                noticeSearch($(\"#currentPage\").val());\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        callAjax(\"/system/noticeUpdate.do\", \"post\", \"json\", false, param, callBackFunction);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deleteNotice() {\r\n");
      out.write("        var param = {\r\n");
      out.write("            noticeSeq: $(\"#noticeSeq\").val() // noticeSeq 값을 정확히 가져오도록 수정\r\n");
      out.write("        }; \r\n");
      out.write("        var callBackFunction = function(response) {\r\n");
      out.write("            if(response.result == \"SUCCESS\") {\r\n");
      out.write("                alert(\"삭제되었습니다\");\r\n");
      out.write("                gfCloseModal();\r\n");
      out.write("                noticeSearch($(\"#currentPage\").val());\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        callAjax(\"/system/noticeDelete.do\", \"post\", \"json\", false, param, callBackFunction);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function noticeDetailModal(seq) {\r\n");
      out.write("        var param = {\r\n");
      out.write("            noticeSeq: seq\r\n");
      out.write("        };\r\n");
      out.write("        var callBackFunction = function(data) {\r\n");
      out.write("            var detail = data.detailValue;\r\n");
      out.write("\r\n");
      out.write("            if (detail) {\r\n");
      out.write("                $(\"#loginId\").val(detail.loginID);\r\n");
      out.write("                $(\"#noticeTitle\").val(detail.noti_title);\r\n");
      out.write("                $(\"#noticeContent\").val(detail.noti_content);\r\n");
      out.write("                $(\"#noticeSeq\").val(detail.noti_seq);\r\n");
      out.write("                $(\"#btnUpdateNotice\").show();\r\n");
      out.write("                $(\"#btnSaveNotice\").hide();\r\n");
      out.write("                gfModalPop(\"#noticeInsertModal\");\r\n");
      out.write("            } else {\r\n");
      out.write("                alert(\"데이터를 불러오는 데 문제가 발생했습니다.\");\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        callAjax(\"/system/noticeDetail.do\", \"post\", \"json\", false, param, callBackFunction);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function fValidate() {\r\n");
      out.write("        var chk = checkNotEmpty([\r\n");
      out.write("            [\"noticeTitle\", \"제목를 입력해 주세요.\"],\r\n");
      out.write("            [\"noticeContent\", \"내용을 입력해 주세요\"]\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        if (!chk) {\r\n");
      out.write("           return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return true;\r\n");
      out.write("     }\r\n");
      out.write("    \r\n");
      out.write("    function fValidatefile() {\r\n");
      out.write("        var chk = checkNotEmpty([\r\n");
      out.write("            [\"fileTitle\", \"제목를 입력해 주세요.\"],\r\n");
      out.write("            [\"fileContent\", \"내용을 입력해 주세요\"],\r\n");
      out.write("            [\"fileInput\", \"파일을 입력해 주세요\"]\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        if (!chk) {\r\n");
      out.write("           return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return true;\r\n");
      out.write("     }\r\n");
      out.write("\r\n");
      out.write("    //-----------------------------------------파일 관련 소스입니다------------------------//\r\n");
      out.write("    \r\n");
      out.write("    function insertFileModal() {\r\n");
      out.write("        gfModalPop(\"#filePopUp\");\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function filePreview() {\r\n");
      out.write("        $(\"#fileInput\").change(function(e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            console.log($(this));\r\n");
      out.write("            // 파일이 있는 경우\r\n");
      out.write("            if ($(this)[0].files[0]) {\r\n");
      out.write("                var fileInfo = $(\"#fileInput\").val();\r\n");
      out.write("                var fileInfoSplit = fileInfo.split(\".\");\r\n");
      out.write("                var fileLowerCase = fileInfoSplit[fileInfoSplit.length - 1].toLowerCase(); // 확장자 가져오기 수정\r\n");
      out.write("\r\n");
      out.write("                var imgPath = \"\";\r\n");
      out.write("                var previewHtml = \"\";\r\n");
      out.write("\r\n");
      out.write("                if (fileLowerCase == \"jpg\" || fileLowerCase == \"gif\" || fileLowerCase == \"png\") {\r\n");
      out.write("                    imgPath = window.URL.createObjectURL($(this)[0].files[0]);\r\n");
      out.write("                    alert(imgPath);\r\n");
      out.write("\r\n");
      out.write("                    previewHtml = \"<img src='\" + imgPath + \"' id='imgFile' style='width: 100px; height: 100px;' />\";\r\n");
      out.write("                } else {\r\n");
      out.write("                    // 파일이 이미지가 아닌 경우\r\n");
      out.write("                    previewHtml = \"\";\r\n");
      out.write("                }\r\n");
      out.write("                $(\"#preview\").empty().append(previewHtml);\r\n");
      out.write("\r\n");
      out.write("                alert(fileInfo);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write(" // 파일 저장\r\n");
      out.write("    function saveFileNotice(){\r\n");
      out.write("       if(!fValidatefile()){\r\n");
      out.write("          return;\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("       var getForm = document.getElementById(\"noticeForm\");\r\n");
      out.write("       getForm.entype = 'multipart/form-data';\r\n");
      out.write("       var fileData = new FormData(getForm);\r\n");
      out.write("       \r\n");
      out.write("       var callBackFunction = function(data){\r\n");
      out.write("          if(data.result == \"success\"){\r\n");
      out.write("             alert(\"저장이 되었습니다\");\r\n");
      out.write("             gfCloseModal();\r\n");
      out.write("             noticeSearch();\r\n");
      out.write("          }\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("       callAjaxFileUploadSetFormData(\"/system/noticeSaveFile.do\", \"post\", \"json\", false, fileData, callBackFunction);\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- ///////////////////// html 페이지  ///////////////////////////// -->\r\n");
      out.write("\r\n");
      out.write("<form id=\"myNotice\" action=\"\" method=\"\">\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"hidden\" id=\"currentPage\" value=\"1\">  <!-- 현재페이지는 처음에 항상 1로 설정하여 넘김  -->\r\n");
      out.write("\t<input type=\"hidden\" id=\"tmpList\" value=\"\"> <!-- ★ 이거뭐임??? -->\r\n");
      out.write("\t<input type=\"hidden\" id=\"tmpListNum\" value=\"\"> <!-- 스크립트에서 값을 설정해서 넘길거임 / 임시 리스트 넘버 -->\r\n");
      out.write("\t<input type=\"hidden\" name=\"action\" id=\"action\" value=\"\"> \r\n");
      out.write("\t<input type=\"hidden\" id=\"swriter\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <!-- 작성자 session에서 java에서 넘어온값 -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrap_area\">\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t\t\t<span>공지사항</span> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"fr\">\t\t\t\t\t\r\n");
      out.write(" \t                         \t 제목\r\n");
      out.write("                          <input type=\"text\" id=\"searchTitle\" name=\"searchTitle\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("                          \t기간\r\n");
      out.write("                          <input type=\"date\" id=\"searchStDate\" name=\"searchStDate\" style=\"height: 25px; margin-right: 10px;\"/> \r\n");
      out.write("                          ~ \r\n");
      out.write("                          <input type=\"date\" id=\"searchEdDate\" name=\"searchEdDate\" style=\"height: 25px; margin-right: 10px;\"/>\r\n");
      out.write("\t\t\t\t\t\t  <a class=\"btnType red\" href=\"\" name=\"searchbtn\"  id=\"searchBtn\"><span>검색</span></a>\r\n");
      out.write("\t\t\t\t\t\t  <a class=\"btnType blue\" href=\"javascript:insertModal();\" name=\"modal\"><span>신규</span></a>\r\n");
      out.write("\t\t\t\t\t\t  <a class=\"btnType blue\" href=\"javascript:insertFileModal();\" name=\"modal\"><span>신규(파일)</span></a>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</p> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"divNoticeList\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\t\t                            <colgroup>\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"200px\">\r\n");
      out.write("\t\t\t\t\t\t                    <col width=\"60px\">\r\n");
      out.write("\t\t\t\t\t\t                   <col width=\"50px\">\r\n");
      out.write("\t\t\t\t\t                 </colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">공지 번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">공지 제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">공지 날짜</th>\r\n");
      out.write("\t\t\t\t\t\t\t              <th scope=\"col\">작성자</th>\r\n");
      out.write("\t\t\t\t\t\t\t              \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody id=\"noticeList\"></tbody>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- 모달팝업 -->\r\n");
      out.write("\t<div id=\"noticeInsertModal\" class=\"layerPop layerType2\" style=\"width: 600px;\">\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"noticeNo\" name=\"noticeNo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticeNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <!-- 수정시 필요한 num 값을 넘김  -->\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"noticeSeq\" name=\"noticeSeq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticeSeq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <!-- 수정시 필요한 num 값을 넘김  -->\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt>\r\n");
      out.write("\t\t\t\t<strong>공지사항</strong>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd class=\"content\">\r\n");
      out.write("\t\t\t\t<!-- s : 여기에 내용입력 -->\r\n");
      out.write("\t\t\t\t<table class=\"row\">\r\n");
      out.write("\t\t\t\t\t<caption>caption</caption>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"row\">작성자 <span class=\"font_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"inputTxt p100\" name=\"loginId\" id=\"loginId\" readonly/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <th scope=\"row\">작성일<span class=\"font_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"inputTxt p100\" name=\"write_date\" id=\"write_date\" /></td> -->\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"row\">제목 <span class=\"font_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><input type=\"text\" class=\"inputTxt p100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"noticeTitle\" id=\"noticeTitle\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"row\">내용</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea class=\"inputTxt p100\" name=\"noticeContent\" id=\"noticeContent\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- e : 여기에 내용입력 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"btn_areaC mt30\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"btnType blue\" id=\"btnSaveNotice\" name=\"btn\"><span>저장</span></a> \r\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"btnType blue\" id=\"btnUpdateNotice\" name=\"btn\" style=\"display:none\"><span>수정</span></a> \r\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"btnType blue\" id=\"btnDeleteNotice\" name=\"btn\"><span>삭제</span></a> \r\n");
      out.write("\t\t\t\t\t<a href=\"\"\tclass=\"btnType gray\"  id=\"btnClose\" name=\"btn\"><span>취소</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<a href=\"\" class=\"closePop\"><span class=\"hidden\">닫기</span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 모달 파일 팝업  -->\t\r\n");
      out.write("\t\r\n");
      out.write("\t<form id=\"noticeForm\" action=\"\" method=\"\">\r\n");
      out.write("      <input type=\"hidden\" id=\"noticeNo\" name=\"noticeNo\" value=\"\">\r\n");
      out.write("      <!-- 수정시 필요한 num 값을 넘김  -->\r\n");
      out.write("      <div id=\"filePopUp\" class=\"layerPop layerType2\" style=\"width: 600px;\">\r\n");
      out.write("         <dl>\r\n");
      out.write("            <dt>\r\n");
      out.write("               <strong>공지사항 관리(파일)</strong>\r\n");
      out.write("            </dt>\r\n");
      out.write("            <dd class=\"content\">\r\n");
      out.write("               <!-- s : 여기에 내용입력 -->\r\n");
      out.write("               <table class=\"row\">\r\n");
      out.write("                  <caption>caption</caption>\r\n");
      out.write("                  <colgroup>\r\n");
      out.write("                     <col width=\"120px\">\r\n");
      out.write("                     <col width=\"*\">\r\n");
      out.write("                     <col width=\"120px\">\r\n");
      out.write("                     <col width=\"*\">\r\n");
      out.write("                  </colgroup>\r\n");
      out.write("\r\n");
      out.write("                  <tbody>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <th scope=\"row\">제목 <span class=\"font_red\">*</span></th>\r\n");
      out.write("                        <td colspan=3><input type=\"text\" class=\"inputTxt p100\"\r\n");
      out.write("                           name=\"fileTitle\" id=\"fileTitle\" /></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <th scope=\"row\">내용 <span class=\"font_red\">*</span></th>\r\n");
      out.write("                        <td colspan=\"3\"><textarea name=\"fileContent\"\r\n");
      out.write("                              id=\"fileContent\" cols=\"40\" rows=\"5\"> </textarea></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <th scope=\"row\">파일</th>\r\n");
      out.write("                        <td colspan=\"3\"><input type=\"file\" class=\"inputTxt p100\"\r\n");
      out.write("                           name=\"fileInput\" id=\"fileInput\" /></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <th scope=\"row\">미리보기</th>\r\n");
      out.write("                        <td>\r\n");
      out.write("                           <div id=\"preview\"></div>\r\n");
      out.write("                        </td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                  </tbody>\r\n");
      out.write("               </table>\r\n");
      out.write("\r\n");
      out.write("               <!-- e : 여기에 내용입력 -->\r\n");
      out.write("\r\n");
      out.write("               <div class=\"btn_areaC mt30\">\r\n");
      out.write("                  <a href=\"\" class=\"btnType blue\" id=\"btnSavefile\" name=\"btn\"><span>저장</span></a>\r\n");
      out.write("                  <a href=\"\" class=\"btnType blue\" id=\"btnUpdatefile\" name=\"btn\"><span>수정</span></a>\r\n");
      out.write("                  <a href=\"\" class=\"btnType blue\" id=\"btnDeletefile\" name=\"btn\"><span>삭제</span></a>\r\n");
      out.write("                  <a href=\"\" class=\"btnType gray\" id=\"btnClose\" name=\"btn\"><span>취소</span></a>\r\n");
      out.write("               </div>\r\n");
      out.write("            </dd>\r\n");
      out.write("         </dl>\r\n");
      out.write("         <a href=\"\" class=\"closePop\"><span class=\"hidden\">닫기</span></a>\r\n");
      out.write("      </div>\r\n");
      out.write("   </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
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
