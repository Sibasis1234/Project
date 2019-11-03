package demo;
import javax.servlet.*; 
import java.io.*; 
public class demoservlet implements Servlet { 
	  
	    ServletConfig config = null; 
	  
	     
	    public void init(ServletConfig sc) 
	    { 
	        config = sc; 
	        System.out.println("in init"); 
	    } 
	  
	     
	    public void service(ServletRequest req, ServletResponse res) 
	        throws ServletException, IOException 
	    { 
	        res.setContenttype("NewFile.html"); 
	        PrintWriter pw = res.getWriter(); 
	        pw.println("<h2>hello from demo servlet</h2>"); 
	        System.out.println("in service"); 
	    } 
	  
	    
	    public void destroy() 
	    { 
	        System.out.println("in destroy"); 
	    } 
	    public String getServletInfo() 
	    { 
	        return "demoServlet"; 
	    } 
	    public ServletConfig getServletConfig() 
	    { 
	        return config;
	    } 
	} 