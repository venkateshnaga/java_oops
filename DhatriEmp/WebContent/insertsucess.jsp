<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successfully Registered</title>
</head>
<body style="background-color:Moccasin">
<div align="center">

<%
String empid=(String)session.getAttribute("employeeidreg");

out.print("Sucessfull With Employee Id: " +empid);
%>



<br>
<br>
<a href="home.jsp">Go To HomePage</a>
</div>
</body>
</html>