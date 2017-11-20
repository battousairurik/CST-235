<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Addition Example</title>
</head>
<body>
<% out.print("<h1>My Addition Application</h1>"); %>
<hr> 
Welcome to the addition Application<br>
Current Time is : <%=new java.util.Date()%>
<hr>
<%
javax.naming.InitialContext ic = new javax.naming.InitialContext();
AdditionRemote abc=(AdditionRemote)ic.lookup("ejb:/MyAdditionProject//Addition!com.logic.AdditionRemote"); 
int a=abc.add(5,7);
out.println("Result is : "+a);
%>
</body>
</html>