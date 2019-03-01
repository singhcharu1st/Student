package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   <!--<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("   <script src=\"script/jquery.min.js\"></script>\r\n");
      out.write("   <script src=\"js/bootstrap.min.js\"></script>-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-12 \" style=\"font-family:impact;color:green;font-size:35px;text-align:center\">\r\n");
      out.write("\t\r\n");
      out.write("\tStudent Information System\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-12 \">\r\n");
      out.write("<hr>\r\n");
      out.write("<form role=\"form\" method=\"get\" action=\"\">\r\n");
      out.write("  <div class=\"form-group\" >\r\n");
      out.write("    <label for=\"t1\">User Name</label>\r\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"t1\" name=\"t1\" placeholder=\"Enter User Name\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"t2\">Password</label>\r\n");
      out.write("    <input type=\"password\" class=\"form-control\" id=\"t2\" name=\"t2\" placeholder=\"Password\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <input type=\"submit\" class=\"btn btn-primary\" value=\"Login\" />\r\n");
      out.write("<!---jdbc start\r\n");

if(request.getParameter("t1")!=null || request.getParameter("t2")!=null)
{
	String un=request.getParameter("t1");
	String pw=request.getParameter("t2");
	boolean flag=false;
	try{
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sis","root","12345");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from usr where uname='"+un+"' and passwd='"+pw+"'");
		if(rs.next())
		{
			flag=true;
			String ut=rs.getString(3);
			if(ut.equals("student"))
			{
				response.sendRedirect("shome.jsp");
			}
			else if(ut.equals("admin"))
			{
				response.sendRedirect("ahome.jsp");
			}
			
			
		}
		if(flag==false)
		{
			out.println("<br><div class='text-danger'>Invalid User Name or Password</div>");
		}
	}catch(Exception e)
	{
		out.println(e.toString());
	}
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("jdbc end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-12 \" >\r\n");
      out.write("<marquee bahavior=\"alternate\">Developed By ............</marquee>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
