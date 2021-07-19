<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="stylesheet" href="../../resources/css/style.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <script type="text/javascript" src="../../resoures/js/function.js?v=3" charset="UTF-8"></script>

    <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@400;700&display=swap" rel="stylesheet">
    <title>Terms-list</title>
</head>

<body>
<h3>Для модификации семестра отредактируйте данные и нажмите кнопку "Применить"</h3>
<label> Длительность: </label>
<input type="text" value="${term.duration}">
<label>Дисциплины в семестре</label>
<select multiple>
    <c:forEach items="${allDisceplines}" var="disc">
            <c:if test="${disc.selected}">
                <option selected>${disc.discipline}</option>
            </c:if>
            <c:if test="${not disc.selected}">
                <option>${disc.discipline}</option>
            </c:if>
    </c:forEach>
</select>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
</body>

</html>
