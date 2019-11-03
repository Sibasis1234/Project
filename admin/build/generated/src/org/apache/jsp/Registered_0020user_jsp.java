package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registered_0020user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registered User</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <form action=\"action_page.php\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h2>Individual Registeration</h2>\n");
      out.write("    <p>Please fill in this form to create an account.</p>\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    <label for=\"username\"><b>Username</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>\n");
      out.write("    <label for=\"email\"><b>Email</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>\n");
      out.write("    <label for=\"psw\"><b>Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>\n");
      out.write("    <label for=\"psw-repeat\"><b>Confirm Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Confirm Password\" name=\"psw-confirm\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>\n");
      out.write("    <label for=\"security-question\"><b>Security Question</b></label>\n");
      out.write("    <input type=\"question\" placeholder=\"Security Question\" name=\"security-question\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>\n");
      out.write("    <label for=\"security-answer\"><b>Security Answer</b></label>\n");
      out.write("    <input type=\"answer\" placeholder=\"Security Answer\" name=\"security-answer\" required>\n");
      out.write("    <br>\n");
      out.write("        <br>\n");
      out.write("    <label for=\"Preferred-Language\"><b>Preferred Language</b></label>\n");
      out.write("    <input type=\"language\" placeholder=\"Preferred Language\" name=\"preferred-language\" required>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <hr>\n");
      out.write("    </div>\n");
      out.write("             \n");
      out.write("    <div class=\"container Personal Details\">\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <h2>Personal Details</h2>\n");
      out.write("    <label for=\"first-name\"><b>First_Name</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter First Name\" name=\"name\" required>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("    <label for=\"last-name\"><b>Last_Name</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Last Name\" name=\"name\" required>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("    \n");
      out.write("    <label for=\"date-of-birth\"><b>Date of Birth</b></label>\n");
      out.write("    <input type=\"date\" placeholder=\"Enter Date of Birth\" name=\"Date\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"occupation\"><b>Occupation</b></label>\n");
      out.write("    <input type=\"occupation\" placeholder=\"Enter Occupation\" name=\"Occupation\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"country\"><b>Country</b></label>\n");
      out.write("    <input type=\"country\" placeholder=\"Enter Country\" name=\"Country\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"email\"><b>Email</b></label>\n");
      out.write("    <input type=\"email\" placeholder=\"Enter Email\" name=\"Email\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"nationality\"><b>Nationality</b></label>\n");
      out.write("    <input type=\"nationality\" placeholder=\"Enter Nationality\" name=\"Nationality\" required>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("             \n");
      out.write("    <div class=\"container Residential Address\">\n");
      out.write("        <h2> Residential Address</h2>\n");
      out.write("    <label for=\"flat/door/blockno\"><b>Flat/Door/Block-No</b></label>\n");
      out.write("    <input type=\"address\" placeholder=\"Enter Flat/Door/Block-No\" name=\"Flat/Door/Block-No\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"street/lane\"><b>Street/Lane</b></label>\n");
      out.write("    <input type=\"street/lane\" placeholder=\"Enter Street/Lane\" name=\"Street/Lane\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"area/locality\"><b>Area/Locality</b></label>\n");
      out.write("    <input type=\"area/locality\" placeholder=\"Enter Area/Locality\" name=\"Area/Locality\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"pincode\"><b>Pincode</b></label>\n");
      out.write("    <input type=\"pincode\" placeholder=\"Enter Pincode\" name=\"Pincode\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"state\"><b>State</b></label>\n");
      out.write("    <input type=\"state\" placeholder=\"Enter State\" name=\"State\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"city/town\"><b>city/town</b></label>\n");
      out.write("    <input type=\"city/town\" placeholder=\"Enter city/town\" name=\"city/town\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"post-office\"><b>Post-Office</b></label>\n");
      out.write("    <input type=\"post-office\" placeholder=\"Enter Post-Office\" name=\"Post-Office\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"phone-number\"><b>Phone-Number</b></label>\n");
      out.write("    <input type=\"number\" placeholder=\"Enter Phone Number\" name=\"Phone\" required>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\n");
      out.write("    <button type=\"submit\" class=\"registerbtn\">Register</button>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <div class=\"container signin\">\n");
      out.write("    <p>Already have an account? <a href=\"#\">Sign in</a>.</p>\n");
      out.write("  </div>\n");
      out.write("</form> \n");
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
