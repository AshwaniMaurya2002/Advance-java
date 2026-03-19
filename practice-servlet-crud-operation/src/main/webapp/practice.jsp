<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style >
*{
bground-color: #f1f1f1;
color: #333;
}
</style>
</head>
<body>

<form action="practice.jsp" method="post">

<input type=text name="name" placeholder="Enter Name">]>
<input type=text name="email" placeholder="Enter Email">]>
<button type="submit">Start</button>

<%

String name=request.getParameter("name");
String email=request.getParameter("email");

%>

<%

if(name!=null && email!=null) {
	out.println("Name: "+name);
}

%>


</form>

</body>
</html>