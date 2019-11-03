package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Train_0020Info_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Train Info</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"action_page.php\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h2>Train Information</h2>\n");
      out.write("    <p>Please fill in this form to create an account.</p>\n");
      out.write("    <hr>\n");
      out.write("    \n");
      out.write("    <label for=\"train-name\"><b>Train-Name</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Train-Name\" name=\"name\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>\n");
      out.write("    <label for=\"train-type\"><b>Train-Type</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Train-Type\" name=\"type\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>\n");
      out.write("    <label for=\"source\"><b>Source</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Source\" name=\"name\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>    \n");
      out.write("    <label for=\"destination\"><b>Destination</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Destination\" name=\"name\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>     \n");
      out.write("    <label for=\"distance\"><b>Distance</b></label>\n");
      out.write("    <input type=\"number\" placeholder=\"Enter Distance\" name=\"number\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
