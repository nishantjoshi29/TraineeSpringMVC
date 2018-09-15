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
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<f:form action="retrieveTrainee.obj" modelAttribute="trainee">

<table>
   <tr>
   <td>Enter trainee Id</td>
   <td><input name="traineeId" path="traineeId"></td>
   <td><input type="submit" value="modify"></td>
   </tr>
   
</table>
</f:form>
<c:if test="${viewMode==1}">
<h1>TraineeInfo</h1>
<f:form action="updateTrainee.obj" modelAttribute="trainee">
<table border=2>
<tr><td>Trainee Id</td>
<td><f:input type="text" path="traineeId" readonly="true"/></td></tr>
<tr><td>Trainee Name</td>
<td><f:input type="text" path="traineeName" /></td></tr>
<tr><td>Trainee Location</td>
<td><f:input type="text" path="traineeLocation" /></td></tr>
<tr><td>Trainee Domain</td>
<td><f:input type="text" path="traineeDomain" /></td></tr>
<tr><td colspan=2 align="right"><input type="submit" value="update">
</table>
</f:form>

</c:if>
</body>
</html>