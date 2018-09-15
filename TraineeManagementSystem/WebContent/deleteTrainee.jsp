<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:form action="deleteTrainee.obj" modelAttribute="trainee">
<table border="2">

<tr>
<td>Enter trainee id</td>
<td><input name="traineeId" path="traineeId"/></td>
<td><input type="submit" value="delete"/></td>
</tr>
</table>
</f:form>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<c:if test="${viewMode==1}">
<f:form action="finaldelete.obj" modelAttribute="trainee">
<table border=2>
<tr><td>Trainee Id</td>
<td>Trainee Name</td>
<td>Trainee Location</td>
<td>Trainee Domain</td></tr>
<tr><td>"${trainee.traineeId}"</td>
<td>"${trainee.traineeName}"</td>
<td>"${trainee.traineeLocation}"</td>
<td>"${trainee.traineeDomain}"</td></tr>

<f:hidden path="traineeId" value="${trainee.traineeId}"/>
<tr><td colspan="4" align="right"><input type="submit" value="delete"></td></tr>

</table>
</f:form>
</c:if>
</body>
</html>