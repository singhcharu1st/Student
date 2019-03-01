<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
   <link href="css/bootstrap.min.css" rel="stylesheet">
   <script src="script/jquery.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="row">

<div class="col-md-12 " style="font-family:impact;color:green;font-size:35px;text-align:center">
	
	Student Information System
</div>

<div class="col-md-12 ">
	<jsp:include page="adminmenu.jsp" />
</div>


<div class="col-md-12 ">
<table class="table table-stripped" >
<tr>
	<td colspan="5" class="bg-success text-info" style="text-align:center">Students Record</td>
<tr>
<tr class="bg-danger">
	<th>ID</th><th>Name</th><th>Course</th><th>Branch</th><th>Sem</th>
</tr>

<%
try{
	Class.forName("com.mysql.jdbc.Driver");	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sis","root","12345");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		while(rs.next())
		{
			%>
			<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getString(4) %></td>
			<td><%=rs.getString(5) %></td>
			</tr>
			<%
		}
		}catch(Exception e)
		{
			out.println(e.toString());
		}
%>
</table>

</div>



</div>
</div>
</body>
</html>
