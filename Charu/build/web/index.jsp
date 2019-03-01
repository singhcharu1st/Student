<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
   <!--<link href="css/bootstrap.min.css" rel="stylesheet">
   <script src="script/jquery.min.js"></script>
   <script src="js/bootstrap.min.js"></script>-->
</head>
<body>
<div class="container">
<div class="row">

<div class="col-md-12 " style="font-family:impact;color:green;font-size:35px;text-align:center">
	
	Student Information System
</div>

<div class="col-md-12 ">
<hr>
<form role="form" method="get" action="">
  <div class="form-group" >
    <label for="t1">User Name</label>
    <input type="text" class="form-control" id="t1" name="t1" placeholder="Enter User Name">
  </div>
  <div class="form-group">
    <label for="t2">Password</label>
    <input type="password" class="form-control" id="t2" name="t2" placeholder="Password">
  </div>
  <input type="submit" class="btn btn-primary" value="Login" />
<!---jdbc start
<%
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
%>

jdbc end -->


<hr>
</div>

<div class="col-md-12 " >
<marquee bahavior="alternate">Developed By ............</marquee>

</div>


</div>
</div>
</body>
</html>
