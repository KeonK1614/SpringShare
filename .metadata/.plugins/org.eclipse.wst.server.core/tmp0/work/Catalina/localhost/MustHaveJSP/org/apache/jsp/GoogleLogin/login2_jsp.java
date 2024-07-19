/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.25
 * Generated at: 2024-07-18 05:34:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.GoogleLogin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>구글 아이디로 로그인하기 2</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    \n");
      out.write("    <script src=\"https://accounts.google.com/gsi/client\" async defer></script>\n");
      out.write("    <script src=\"https://unpkg.com/jwt-decode/build/jwt-decode.js\"></script>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("    <script>\n");
      out.write("    window.onload = function () {\n");
      out.write("        google.accounts.id.initialize({\n");
      out.write("            client_id: \"483732575840-q4af0ir4dg874j38mk9lahejolgf9eo7.apps.googleusercontent.com\",\n");
      out.write("            callback: handleCredentialResponse\n");
      out.write("        });\n");
      out.write("        google.accounts.id.renderButton(\n");
      out.write("            document.getElementById(\"buttonDiv\"),\n");
      out.write("            { theme: \"outline\", text: \"signin\", width: 250 },\n");
      out.write("        );\n");
      out.write("	    //google.accounts.id.prompt();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function handleCredentialResponse(response) {\n");
      out.write("        var profile = jwt_decode(response.credential);\n");
      out.write("        console.log(\"ID: \" + profile.sub);\n");
      out.write("        console.log('Name: ' + profile.name);\n");
      out.write("        console.log(\"Image URL: \" + profile.picture);\n");
      out.write("        console.log(\"Email: \" + profile.email);    \n");
      out.write("		\n");
      out.write("        $('#login').css('display', 'none');\n");
      out.write("        $('#logout').css('display', 'block');\n");
      out.write("        $('#upic').attr('src', profile.picture);\n");
      out.write("        $('#uname').html('[ ' +profile.name + ' ]');\n");
      out.write("    }\n");
      out.write("    function signOut() {\n");
      out.write("        google.accounts.id.disableAutoSelect();\n");
      out.write("	    \n");
      out.write("        $('#login').css('display', 'block');\n");
      out.write("        $('#logout').css('display', 'none');\n");
      out.write("        $('#upic').attr('src', '');\n");
      out.write("        $('#uname').html('');\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"login\">\n");
      out.write("    <div id=\"buttonDiv\"></div> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"logout\" style=\"display: none;\">\n");
      out.write("    <input type=\"button\" onclick=\"signOut();\" value=\"로그아웃\" /><br>\n");
      out.write("\n");
      out.write("    <img id=\"upic\" src=\"\"><br>\n");
      out.write("    <span id=\"uname\"></span>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
