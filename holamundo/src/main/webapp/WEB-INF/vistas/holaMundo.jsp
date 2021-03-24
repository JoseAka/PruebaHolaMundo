<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Spring 5 MVC - Ejemplo Hola Mundo</title>
</head>
   <body>
      <h2>${holaMundo.message}</h2>
      <h4>Server date time is : ${holaMundo.dateTime}</h4>
   </body>
</html>
