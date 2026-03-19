<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<title>Employee List</title>

<style>

body{
font-family: Arial;
background:#f4f6f9;
padding:40px;
}

/* Title */

h2{
text-align:center;
margin-bottom:25px;
}

/* Table */

table{
width:90%;
margin:auto;
border-collapse:collapse;
background:white;
box-shadow:0 5px 20px rgba(0,0,0,0.2);
}

/* Header */

th{
background:#667eea;
color:white;
padding:12px;
text-align:center;
}

/* Data */

td{
padding:10px;
text-align:center;
border-bottom:1px solid #ddd;
}

/* Hover */

tr:hover{
background:#f1f1f1;
}

/* Action buttons container */

.actions{
display:flex;
justify-content:center;
gap:10px;
}

/* Buttons */

.edit{
background:#f39c12;
color:white;
padding:6px 12px;
border-radius:5px;
text-decoration:none;
}

.delete{
background:#e74c3c;
color:white;
padding:6px 12px;
border-radius:5px;
text-decoration:none;
}

.edit:hover{
background:#d68910;
}

.delete:hover{
background:#c0392b;
}

/* Back button */

.back{
text-align:center;
margin-top:20px;
}

</style>

</head>

<body>

<h2>Employee Records</h2>

<table>

<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Phone</th>
<th>DOB</th>
<th>DOJ</th>
<th>Actions</th>
</tr>

<%

try{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/jdbc-m17","root","TIGER");

Statement st = con.createStatement();

ResultSet rs = st.executeQuery("select * from user");

while(rs.next()){

%>

<tr>

<td><%=rs.getInt("id")%></td>
<td><%=rs.getString("name")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getString("phone")%></td>
<td><%=rs.getDate("dob")%></td>
<td><%=rs.getDate("doj")%></td>

<td>

<div class="actions">

<a class="edit" href="edit.jsp?id=<%=rs.getInt("id")%>">Edit</a>

<a class="delete" href="DeleteServlet?id=<%=rs.getInt("id")%>">Delete</a>

</div>

</td>

</tr>

<%

}

}catch(Exception e){
out.println(e);
}

%>

</table>

<div class="back">
<br>
<a href="index.jsp">⬅ Back to Dashboard</a>
</div>

</body>
</html>