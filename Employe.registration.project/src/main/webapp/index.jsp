<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>User Management Dashboard</title>

<style>

*{
margin:0;
padding:0;
box-sizing:border-box;
font-family:Arial, Helvetica, sans-serif;
}

body{
height:100vh;
display:flex;
justify-content:center;
align-items:center;
background:linear-gradient(135deg,#667eea,#764ba2);
}

.container{
background:white;
padding:40px;
border-radius:12px;
width:520px;
box-shadow:0 10px 30px rgba(0,0,0,0.2);
text-align:center;
}

h1{
margin-bottom:30px;
color:#333;
}

/* Button grid */

.buttons{
display:grid;
grid-template-columns:1fr 1fr;
gap:20px;
}

/* Buttons */

.buttons a{
text-decoration:none;
}

button{
width:100%;
padding:15px;
font-size:16px;
border:none;
border-radius:8px;
cursor:pointer;
color:white;
transition:0.3s;
}

/* Colors */

.login{background:#3498db;}
.insert{background:#2ecc71;}
.update{background:#f39c12;}
.delete{background:#e74c3c;}
.display{background:#9b59b6;}

/* Hover effect */

button:hover{
transform:translateY(-3px);
box-shadow:0 6px 15px rgba(0,0,0,0.25);
}

/* Last button full width */

.full{
grid-column:1 / span 2;
}

</style>

</head>

<body>

<div class="container">

<h1>User Management</h1>

<div class="buttons">

<a href="login.jsp">
<button class="login">Login</button>
</a>

<a href="insert.jsp">
<button class="insert">Insert User</button>
</a>

<a href="login.jsp">
<button class="update">Update User</button>
</a>

<a href="login.jsp">
<button class="delete">Delete User</button>
</a>

<a href="login.jsp" class="full">
<button class="display">Display Users</button>
</a>

</div>

</div>

</body>
</html>