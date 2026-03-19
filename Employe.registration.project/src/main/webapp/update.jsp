<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<title>Update User</title>

<style>

*{
margin:0;
padding:0;
box-sizing:border-box;
font-family:Arial;
}

body{
height:100vh;
display:flex;
justify-content:center;
align-items:center;
background:linear-gradient(135deg,#667eea,#764ba2);
}

.container{
width:420px;
background:white;
padding:35px;
border-radius:12px;
box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

h2{
text-align:center;
margin-bottom:20px;
color:#333;
}

.form-group{
margin-bottom:15px;
}

label{
font-weight:bold;
font-size:14px;
}

input{
width:100%;
padding:10px;
margin-top:5px;
border-radius:6px;
border:1px solid #ccc;
transition:0.3s;
}

input:focus{
border-color:#667eea;
outline:none;
box-shadow:0 0 5px rgba(102,126,234,0.5);
}

button{
width:100%;
padding:12px;
margin-top:10px;
background:#667eea;
color:white;
border:none;
border-radius:6px;
font-size:16px;
cursor:pointer;
transition:0.3s;
}

button:hover{
background:#5563c1;
}

.back{
text-align:center;
margin-top:15px;
}

.back a{
text-decoration:none;
color:#667eea;
font-weight:bold;
}

</style>

</head>
<body>

<div class="container">

<h2>Update User</h2>

<%
String id=request.getParameter("id");

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/employee_db","root","password");

PreparedStatement ps=con.prepareStatement(
"select * from employee where id=?");

ps.setInt(1,Integer.parseInt(id));

ResultSet rs=ps.executeQuery();

if(rs.next()){
%>

<form action="UpdateServlet" method="post">

<input type="hidden" name="id" value="<%=rs.getInt("id")%>">

<div class="form-group">
<label>Name</label>
<input type="text" name="name" value="<%=rs.getString("name")%>">
</div>

<div class="form-group">
<label>Email</label>
<input type="email" name="email" value="<%=rs.getString("email")%>">
</div>

<div class="form-group">
<label>Phone</label>
<input type="text" name="phone" value="<%=rs.getString("phone")%>">
</div>

<div class="form-group">
<label>Password</label>
<input type="password" name="password" value="<%=rs.getString("password")%>">
</div>

<div class="form-group">
<label>DOB</label>
<input type="date" name="dob" value="<%=rs.getString("dob")%>">
</div>

<div class="form-group">
<label>DOJ</label>
<input type="date" name="doj" value="<%=rs.getString("doj")%>">
</div>

<button type="submit">Update User</button>

</form>

<%
}
%>

<div class="back">
<a href="display.jsp">← Back to Users</a>
</div>

</div>

</body>
</html>