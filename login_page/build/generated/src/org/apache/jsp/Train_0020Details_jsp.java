package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Train_0020Details_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   <style>\n");
      out.write("        td{\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("        div{\n");
      out.write("            width: 50%;\n");
      out.write("            border: 1px solid black;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            background-color: skyblue;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("    <center><h1><u>TRAIN DETAILS</u></h1></center>\n");
      out.write("    <center>    \n");
      out.write("    <div>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>TRAIN NO.</td>\n");
      out.write("                    <td><input type=\"number\"  name=\"Train No.\" placeholder=\"Train no.\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>TRAIN NAME</td>\n");
      out.write("                    <td><input type=\"text\"  name=\"Train Name\" placeholder=\"Train Name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>SOURCE</td>\n");
      out.write("                    <td><input type=\"text\"  name=\"Source\" placeholder=\"From\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>DESTINATION</td>\n");
      out.write("                    <td><input type=\"text\"  name=\"Destination\" placeholder=\"To\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>T</td>\n");
      out.write("                    <td><input type=\"checkbox\" value=\"SSC\">SSC></td>\n");
      out.write("                      <td><input type=\"checkbox\" value=\"SSC\">SSC></td>\n");
      out.write("                        <td><input type=\"checkbox\" value=\"SSC\">SSC></td>\n");
      out.write("                          <td><input type=\"checkbox\" value=\"SSC\">SSC></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Distance from Source</td>\n");
      out.write("                    <td><input type=\"number\"  name=\"Distance froom Source\" placeholder=\"Distance\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td> Station Name</td>\n");
      out.write("                    <td><input type=\"text\"  name=\"Station Name\" placeholder=\"Station\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" style=\"text-align: center\"><input type=\"submit\"  value=\"Add New Route\" ></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" style=\"text-align: center\"><input type=\"submit\"  value=\"Save Current Route\" ></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
