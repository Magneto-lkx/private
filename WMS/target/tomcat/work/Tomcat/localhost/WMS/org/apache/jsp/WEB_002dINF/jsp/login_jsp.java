/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-30 02:46:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<title>登陆</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/model/login/login.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 定义容器 -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 col-sm-3\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 这一列为登陆表单 -->\r\n");
      out.write("\t\t\t<div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 登陆面板的标题 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-title\" style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t\t\t<h2>登录</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 登陆面板的主体 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 表单 -->\r\n");
      out.write("\t\t\t\t\t\t<form id=\"login_form\" class=\"form-horizontal\" style=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label col-md-4 col-sm-4\">用户ID：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-7 col-sm-7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"userID\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"用户ID\" name=\"userID\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label col-md-4 col-sm-4\"> <!-- <span class=\"glyphicon glyphicon-lock\"></span> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t密码：\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-7 col-sm-7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" id=\"password\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"密码\" name=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label col-md-4 col-sm-4\"> <!-- <span class=\"glyphicon glyphicon-lock\"></span> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t验证码：\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-5 col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"checkCode\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"验证码\" name=\"checkCode\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img id=\"checkCodeImg\" alt=\"checkCodeImg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"account/checkCode/1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-sm-4\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button id=\"submit\" type=\"submit\" class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;登陆&nbsp;&nbsp;&nbsp;&nbsp;</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-sm-4\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-4 col-sm-3\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrapValidator.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.md5.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\tvalidatorInit();\r\n");
      out.write("\t\t\trefreshCheckCode();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t// 刷新图形验证码\r\n");
      out.write("\t\tfunction refreshCheckCode() {\r\n");
      out.write("\t\t\t$('#checkCodeImg').click(function() {\r\n");
      out.write("\t\t\t\tvar timestamp = new Date().getTime();\r\n");
      out.write("\t\t\t\t//被AccountHandler类拦截\r\n");
      out.write("\t\t\t\t$(this).attr(\"src\", \"account/checkCode/\" + timestamp)\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t// 登陆信息加密模块\r\n");
      out.write("\t\tfunction infoEncrypt(userID, password, checkCode) {\r\n");
      out.write("\t\t\tvar str1 = $.md5(password);\r\n");
      out.write("\t\t\tvar str2 = $.md5(str1 + userID);\r\n");
      out.write("\t\t\tvar str3 = $.md5(str2 + checkCode.toUpperCase());\r\n");
      out.write("\t\t\treturn str3;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//bootstrapValidator插件对表单进行封装，表单不用加action\r\n");
      out.write("\t\tfunction validatorInit() {\r\n");
      out.write("\t\t\t$('#login_form').bootstrapValidator({\r\n");
      out.write("\t\t\t\tmessage : 'This value is not valid',\r\n");
      out.write("\t\t\t\tfeedbackIcons : {\r\n");
      out.write("\t\t\t\t\tvalid : 'glyphicon glyphicon-ok',\r\n");
      out.write("\t\t\t\t\tinvalid : 'glyphicon glyphicon-remove',\r\n");
      out.write("\t\t\t\t\tvalidating : 'glyphicon glyphicon-refresh'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tfields : {\r\n");
      out.write("\t\t\t\t\tuserID : {\r\n");
      out.write("\t\t\t\t\t\tvalidators : {\r\n");
      out.write("\t\t\t\t\t\t\tnotEmpty : {\r\n");
      out.write("\t\t\t\t\t\t\t\tmessage : '用户名不能为空'\r\n");
      out.write("\t\t\t\t\t\t\t},regexp: {\r\n");
      out.write("\t\t                        regexp: '[0-9]+',\r\n");
      out.write("\t\t                        message: '只允许输入数字'\r\n");
      out.write("\t\t                    },\r\n");
      out.write("\t\t\t\t\t\t\tcallback : {}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tpassword : {\r\n");
      out.write("\t\t\t\t\t\tvalidators : {\r\n");
      out.write("\t\t\t\t\t\t\tnotEmpty : {\r\n");
      out.write("\t\t\t\t\t\t\t\tmessage : '密码不能为空'\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tcallback : {}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tcheckCode : {\r\n");
      out.write("\t\t\t\t\t\tvalidators : {\r\n");
      out.write("\t\t\t\t\t\t\tnotEmpty : {\r\n");
      out.write("\t\t\t\t\t\t\t\tmessage : '验证码不能为空'\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t.on('success.form.bv', function(e) {\r\n");
      out.write("\t\t\t\t// 禁用默认表单提交\r\n");
      out.write("\t\t\t\te.preventDefault();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 获取 form 实例\r\n");
      out.write("\t\t\t\tvar $form = $(e.target);\r\n");
      out.write("\t\t\t\t// 获取 bootstrapValidator 实例\r\n");
      out.write("\t\t\t\tvar bv = $form.data('bootstrapValidator');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 发送数据到后端 进行验证\r\n");
      out.write("\t\t\t\tvar userID = $('#userID').val();\r\n");
      out.write("\t\t\t\tvar password = $('#password').val();\r\n");
      out.write("\t\t\t\tvar checkCode = $('#checkCode').val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 加密\r\n");
      out.write("\t\t\t\tpassword = infoEncrypt(userID, password, checkCode)\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar data = {\r\n");
      out.write("\t\t\t\t\t\"id\" : userID,\r\n");
      out.write("\t\t\t\t\t\"password\" : password,\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t//JSON.stringify(data)序列化\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\t\t\turl:\"account/login\",\r\n");
      out.write("\t\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\t\tcontentType:\"application/json\",\r\n");
      out.write("\t\t\t\t\tdata:JSON.stringify(data),\r\n");
      out.write("\t\t\t\t\tsuccess:function(response){\r\n");
      out.write("\t\t\t\t\t\t// 接收到后端响应\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t// 分析返回的 JSON 数据\r\n");
      out.write("\t\t\t\t\t\tif(response.result == 'error'){\r\n");
      out.write("\t\t\t\t\t\t\tvar errorMessage;\r\n");
      out.write("\t\t\t\t\t\t\tvar field;\r\n");
      out.write("\t\t\t\t\t\t\tif(response.msg == \"unknownAccount\"){\r\n");
      out.write("\t\t\t\t\t\t\t\terrorMessage = \"用户名错误\";\r\n");
      out.write("\t\t\t\t\t\t\t\tfield = \"userID\";\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\telse if(response.msg == \"incorrectCredentials\"){\r\n");
      out.write("\t\t\t\t\t\t\t\terrorMessage = \"密码或验证码错误\";\r\n");
      out.write("\t\t\t\t\t\t\t\tfield = \"password\";\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#password').val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t    errorMessage = \"服务器错误\";\r\n");
      out.write("                                field = \"password\";\r\n");
      out.write("                                $('#password').val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t// 更新 callback 错误信息，以及为错误对应的字段添加 错误信息\r\n");
      out.write("\t\t\t\t\t\t\tbv.updateMessage(field,'callback',errorMessage);\r\n");
      out.write("\t\t\t\t\t\t\tbv.updateStatus(field,'INVALID','callback');\r\n");
      out.write("\t\t\t\t\t\t\tbv.updateStatus(\"checkCode\",'INVALID','callback');\r\n");
      out.write("\t\t\t\t\t\t\t//更新验证码\r\n");
      out.write("\t\t\t\t\t\t\t$('#checkCodeImg').attr(\"src\",\"account/checkCode/\" + new Date().getTime());\r\n");
      out.write("\t\t\t\t\t\t\t$('#checkCode').val(\"\");\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t// 页面跳转\r\n");
      out.write("\t\t\t\t\t\t\twindow.location.href = \"/mainPage\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror:function(data){\r\n");
      out.write("\t\t\t\t\t\t// 处理错误\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
