package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Train_005fDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Train_Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("           <center><h1><u>TRAIN DETAILS</u></h1></center>\n");
      out.write("    <center>    \n");
      out.write("    <div>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>TRAIN NO. :</td>\n");
      out.write("                    <td><input type=\"number\"  name=\"Train No.\" placeholder=\"Train no.\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>TRAIN NAME :</td>\n");
      out.write("                    <td><input type=\"text\"  name=\"Train Name\" placeholder=\"Train Name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>SOURCE :</td>\n");
      out.write("                    <td><input type=\"text\"  name=\"Source\" placeholder=\"From\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>DESTINATION :</td>\n");
      out.write("                    <td><input type=\"text\"  name=\"Destination\" placeholder=\"To\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>AVAILABLE ON :</td>\n");
      out.write("                 <tr>\n");
      out.write("                 <td><input type=\"checkbox\" value=\"Mon\">MON</td>\n");
      out.write("                      <td><input type=\"checkbox\" value=\"Tues\">TUES</td>\n");
      out.write("                        <td><input type=\"checkbox\" value=\"Wed\">WED</td>\n");
      out.write("                 </tr>  \n");
      out.write("                 <tr>\n");
      out.write("                      <td><input type=\"checkbox\" value=\"Thurs\">THURS</td>\n");
      out.write("                           <td><input type=\"checkbox\" value=\"Fri\">FRI</td>\n");
      out.write("                      <td><input type=\"checkbox\" value=\"Sat\">SAT</td>\n");
      out.write("                        \n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td><input type=\"checkbox\" value=\"Sun\">SUN</td>\n");
      out.write("                 </tr>\n");
      out.write("                         \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td>COACH TYPE :</td>\n");
      out.write("                    <tr>\n");
      out.write("                \n");
      out.write("                      <td><input type=\"checkbox\" value=\"First Tier\">First Tier Ac</td>\n");
      out.write("                        <td><input type=\"checkbox\" value=\"Two Tier\">Two Tier AC</td>\n");
      out.write("                        <td><input type=\"checkbox\" value=\"Three Tier\">Three Tier Ac</td>\n");
      out.write("                    </tr>  \n");
      out.write("                 <tr>\n");
      out.write("                      \n");
      out.write("                       <td><input type=\"checkbox\" value=\"Sleeper\">Sleeper</td>\n");
      out.write("                        <td><input type=\"checkbox\" value=\"Chair Car\">Chair Car</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" style=\"text-align: center\"><input type=\"submit\"  value=\"Show Details\" ></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" style=\"text-align: center\"><input type=\"submit\"  value=\"Reset\" ></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
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
