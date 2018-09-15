<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:form action="updateTrainee.obj" modelAttribute="trainee">
<table>
<tr><td>Trainee Name</td>
<td><f:input  type="text" path="traineeName"/></td></tr>
<tr><td>Trainee Domain</td>
<td><f:input  type="text" path="traineeDomain"/></td></tr>
<tr><td>Trainee Location</td>
<td><f:input  type="text" path="traineeLocation"/></td></tr>
<f:hidden path="traineeId"/>
</table>

</f:form>
</body>
</html>