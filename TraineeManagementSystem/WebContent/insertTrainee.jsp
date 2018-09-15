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
<f:form action="insertTrainee.obj" modelAttribute="trainee">
<table>

<tr><td>Trainee Id</td><td><f:input path="traineeId"/>
<f:errors cssStyle="color:red" path="traineeId"/></br>
</td></tr>
<tr><td>Trainee Name</td><td><f:input path="traineeName"/>
<f:errors cssStyle="color:red" path="traineeName"/></br>
</td></tr>
<tr><td>Trainee Location</td>
   <td><f:radiobutton  value="Chennai" label="Chennai" path="traineeLocation"/></td>
   <td><f:radiobutton  value="Bangalore" label="Bangalore" path="traineeLocation"/></td>
   <td><f:radiobutton  value="Pune" label="Pune" path="traineeLocation"/></td>
   <td><f:radiobutton  value="Mumbai" label="Mumbai" path="traineeLocation"/></td>
   </tr>
   <tr><td>TraineeDomain</td>
   <td colspan="4" align="left">
   <f:select path="traineeDomain" label="select">
   <option value="java">Java</option>
   <option value="bi">BI</option>
   <option value="testing">Testing</option>
   </f:select>
   </td>
   </tr>
   <tr><td><input type="submit" value="Add Trainee"/></td></tr>
</table>
</f:form>
</body>
</html>