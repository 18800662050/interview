/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-11 02:52:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\"\r\n");
      out.write("          content=\"width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes\"/>\r\n");
      out.write("    <title>**</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin-top: 2%;\" class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-default\" role=\"navigation\" >\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <ul class=\"nav navbar-nav \" style=\"font-size: 25px\">\r\n");
      out.write("                    <li class=\"active\" id=\"navFirst\"> <a href=\"#first\" data-toggle=\"tab\">首页</a></li>\r\n");
      out.write("                    <li id=\"navNews\"><a href=\"#news\" data-toggle=\"tab\" onclick=\"appearNew()\">新闻</a></li>\r\n");
      out.write("                    <li ><a href=\"#member\" data-toggle=\"tab\">团队成员</a></li>\r\n");
      out.write("                    <li><a href=\"#ios\" data-toggle=\"tab\">论文著作</a></li>\r\n");
      out.write("                    <li><a href=\"#jmeter \" data-toggle=\"tab\">科研转化</a></li>\r\n");
      out.write("                    <li><a href=\"#ejb\" data-toggle=\"tab\">招生信息</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"myTabContent\" class=\"tab-content\" style=\"margin-top: 2%\">\r\n");
      out.write("        <div class=\"tab-pane fade in active\" id=\"first\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/first", out, false);
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tab-pane fade\" id=\"news\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/news", out, false);
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tab-pane fade\" id=\"member\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/member", out, false);
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tab-pane fade\" id=\"ios\">\r\n");
      out.write("            <p>iOS 是一个由苹果公司开发和发布的手机操作系统。最初是于 2007 年首次发布 iPhone、iPod Touch 和 Apple\r\n");
      out.write("                TV。iOS 派生自 OS X，它们共享 Darwin 基础。OS X 操作系统是用在苹果电脑上，iOS 是苹果的移动版本。</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tab-pane fade\" id=\"jmeter\">\r\n");
      out.write("            <p>jMeter 是一款开源的测试软件。它是 100% 纯 Java 应用程序，用于负载和性能测试。</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tab-pane fade\" id=\"ejb\">\r\n");
      out.write("            <p>Enterprise Java Beans（EJB）是一个创建高度可扩展性和强大企业级应用程序的开发架构，部署在兼容应用程序服务器（比如 JBOSS、Web Logic 等）的 J2EE 上。\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function appearNew() {\r\n");
      out.write("\r\n");
      out.write("        $(\"#allNews\").css(\"display\",\"\");\r\n");
      out.write("        $(\"#tipNews\").css(\"display\",\"none\");\r\n");
      out.write("    }\r\n");
      out.write("    $(\"#tipNews\").css(\"display\",\"none\");\r\n");
      out.write("</script>\r\n");
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
