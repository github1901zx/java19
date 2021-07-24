<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <link rel="stylesheet" href="../../resources/css/style.css">

        <title>Title Page</title>

    </head>

<body>
<section>
    <div class="container">
        <nav class="navi">
            <c:choose>
                <c:when test="${role ne  null}">
                    <a href="/logout">Logout</a>
                </c:when>
                <c:otherwise>
                    <a href="/login">Login</a>
                </c:otherwise>
            </c:choose>

            <a class="btn btn-primary" data-bs-toggle="offcanvas" href="../../index.jsp" role="button" aria-controls="offcanvasExample">
                На главную
            </a>
        </nav>
        <div class="up">
            <h1 class="disp">Система управлени студентами и их успеваемостью</h1>
        </div>

        <div class="nav">
                <a href="/students"> Студенты </a>
                <a href="/disceplines"> Дисциплины </a>
                <a href="/terms"> Семестры </a>
        </div>
    </div>
</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
</body>

</html>
<%--    <meta charset="UTF-8">--%>
<%--    <meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
<%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"--%>
<%--          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">--%>
<%--    <link rel="stylesheet" href="../../resources/css/style.css">--%>
<%--    <script type="text/javascript" src="../../resources/js/function.js"  charset="UTF-8"></script>--%>
<%--</head>--%>
<%--<h1>Система управления студентами и их успеваемостью</h1>--%>
<%--<a href="">Logout</a>--%>
<%--<a href="/students">Студенты</a>--%>
<%--<a href="/terms">Семестры</a>--%>
<%--<a href="/disceplines">Дисциплины</a>--%>
<%--<a href="">Оценки</a>--%>
</html>