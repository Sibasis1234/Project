package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Booking_005fDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Booking_Details</title>\n");
      out.write("         <style>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center><h1><u>BOOKING DETAILS</u></h1></center>\n");
      out.write("    <center>    \n");
      out.write("    <div>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>PNR NO.</td>\n");
      out.write("                    <td><input type=\"number\"  name=\"PNR NO.\" placeholder=\"PNR NO.\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>TRAIN NO.</td>\n");
      out.write("                    <td><input type=\"number\"  name=\"TRAIN NO.\" placeholder=\"TRAIN NO.\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>DEPARTURE DATE</td>\n");
      out.write("                    <td><input type=\"date\"  name=\"Departure Date\" placeholder=\"DEPARTURE DATE\"></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                 <tr>\n");
      out.write("                    <td>NO OF SEATS</td>\n");
      out.write("                    <td><input type=\"number\"  name=\"NO OF SEATS.\" placeholder=\"No of seats\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>FROM</td>\n");
      out.write("                    <td><input type=\"text\"  name=\"FROM\" placeholder=\"Boarding Station\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>TO</td>\n");
      out.write("                    <td><input type=\"Text\"  name=\"TO\" placeholder=\"Destination Station\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>BOOKED BY:</td>\n");
      out.write("                    <td><input type=\"Text\"  name=\"Name\" placeholder=\"Name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Email_ID</td>\n");
      out.write("                    <td><input type=\"Email\"  name=\"EMAIL_ID\" placeholder=\"Email_ID\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>PHONE NO.</td>\n");
      out.write("                    <td><input type=\"number\"  name=\"PHONE NO.\" placeholder=\"PHONE NO.\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" style=\"text-align: center\"><input type=\"submit\"  value=\"Submit\" ></td>\n");
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
