<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Add Employee</title>

<style>

body{
font-family:Arial;
background:linear-gradient(135deg,#667eea,#764ba2);
height:100vh;
display:flex;
justify-content:center;
align-items:center;
}

.card{
background:white;
padding:35px;
width:420px;
border-radius:12px;
box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

h2{
text-align:center;
margin-bottom:20px;
}

input{
width:100%;
padding:10px;
margin:8px 0;
border-radius:6px;
border:1px solid #ccc;
}

button{
width:100%;
padding:12px;
background:#2ecc71;
color:white;
border:none;
border-radius:6px;
font-size:16px;
cursor:pointer;
}

button:hover{
background:#27ae60;
}

</style>

</head>

<body>

<div class="card">

<h2>Add Employee</h2>

<form action="InsertServlet" method="post">

<input type="text" name="id" placeholder="Employee ID" required>

<input type="text" name="name" placeholder="Name" required>

<input type="email" name="email" placeholder="Email">

<input type="text" name="phone" placeholder="Phone">

<input type="password" name="password" placeholder="Password" required>

<label>DOB</label>
<input type="date" name="dob">

<label>DOJ</label>
<input type="date" name="doj">

<button type="submit">Insert Employee</button>
<a href="index.jsp">⬅ Back to Dashboard</a>

</form>

</div>

</body>
</html>