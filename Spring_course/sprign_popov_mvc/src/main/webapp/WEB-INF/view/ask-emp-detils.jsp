<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Please, write ditais Emp</h2>
<br>
<br>
<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="empName" placeholder="White your name"/>--%>
<%--    <input type="submit"/>--%>
<%--</form>--%>
<form:form action="showDetails" modelAttribute="employye">
    Name <form:input path="name"/>
    <br>
    <br>
    SurName <form:input path="surName"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:options items="${employye.departments}"/>
    </form:select>
    <br>
    <input type="submit"/>
</form:form>
</body>

</html>