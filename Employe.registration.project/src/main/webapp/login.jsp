<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Login</title>

<style>

body{
font-family:Arial;
height:100vh;
display:flex;
justify-content:center;
align-items:center;
background:linear-gradient(135deg,#667eea,#764ba2);
}

.card{
background:white;
padding:35px;
width:350px;
border-radius:12px;
box-shadow:0 10px 25px rgba(0,0,0,0.2);
text-align:center;
}

h2{
margin-bottom:20px;
}

input{
width:100%;
padding:12px;
margin:10px 0;
border-radius:6px;
border:1px solid #ccc;
}

button{
width:100%;
padding:12px;
background:#3498db;
border:none;
color:white;
border-radius:6px;
font-size:16px;
cursor:pointer;
}

button:hover{
background:#2980b9;
}

.back{
margin-top:15px;
display:block;
}

</style>

</head>

<body>

<div class="card">

<h2>Login</h2>

<form action="LoginServlet" method="post">

<input type="text" name="username" placeholder="Username" required>

<input type="password" name="password" placeholder="Password" required>

<button type="submit">Login</button>

</form>

<a class="back" href="index.jsp">⬅ Back</a>

</div>

</body>
</html>