<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Add Employees</h2>
<form:form action="saveEmp" modelAttribute="employee">

    <form:hidden path="id"/>

    Name<form:input path="name"/>
    <br><br>
    SurName<form:input path="surName"/>
    <br><br>
    Department<form:input path="department"/>
    <br><br>
    Salary<form:input path="salary"/>
    <br><br>
    <input type="submit" value="add"/>
</form:form>
</body>


</html>