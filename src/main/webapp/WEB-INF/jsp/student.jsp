
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title> Студенты </title>
    <link rel="stylesheet" href="../../resources/css/style.css">
</head>
<body>
<h1> Список студентов </h1>
<table>
    <tr>
        <td>Имя</td>
        <td>Фамили</td>
        <td>ID</td>
    </tr>
    <c:forEach items="${students}" var="stud">
        <tr>
            <td>${stud.name}</td>
            <td>${stud.lastname}</td>
            <td>${stud.id}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
