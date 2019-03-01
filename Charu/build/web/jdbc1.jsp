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
<div class="col-md-12 ">
<br>
<h1>Student Records</h1>
<br>
<table class="table table-bordered">
<tr>
	<td colspan="4" class="bg-success text-info">Students Record</td>
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
		System.out.println("ID\tName\t\tCourse\tBranch\tSem\t");
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
<a href="shome.jsp">back</a>
</div>
</div>
</div>
</body>
</html>
