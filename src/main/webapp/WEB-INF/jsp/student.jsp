
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="stylesheet" href="../../resources/css/style.css">

    <title>Students list</title>

</head>

<body>
<section>
    <div class="container">
        <nav class="navi">
            <a class="btn btn-primary" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button" aria-controls="offcanvasExample">
                На главную
            </a>
            <a class="btn btn-primary" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button" aria-controls="offcanvasExample">
                Выход
            </a>
        </nav>
        <div class="up">
            <h1 class="disp">Система управлени студентами и их успеваемостью</h1>
        </div>

        <div class="btn">
            <div class="row">
                <div class="col-md-6">
                    <div class="right">
                            <input class="btn btn-primary buttonD" type="submit" value="Посмотреть успеваемоcть выбранных студенлтов">
                            <input class="btn btn-primary buttonD" type="submit" value="Модифицыровать выбранного студента">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="left">
                            <input class="btn btn-primary buttonD" type="submit" value="Создать студента">
                            <input class="btn btn-primary buttonD" type="submit" value="Удалить студента">
                    </div>

                </div>
            </div>
        </div>
        <div class="table">
            <table class="table table-bordered">
                <tr>
                    <th>Имя</th>
                    <th>Фамилия</th>
                    <th>Инд</th>
                </tr>
                    <c:forEach items="${students}" var="stud">
                        <tr>
                            <td>${stud.name}</td>
                            <td>${stud.lastname}</td>
                            <td>${stud.id}</td>
                        </tr>
                    </c:forEach>
            </table>
        </div>
    </div>
</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
</body>

</html>

<%--<html>--%>
<%--<head>--%>
<%--    <title> Студенты </title>--%>
<%--    <link rel="stylesheet" href="../../resources/css/style.css">--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1> Список студентов </h1>--%>
<%--<table>--%>
<%--    <tr>--%>
<%--        <td>Имя</td>--%>
<%--        <td>Фамили</td>--%>
<%--        <td>ID</td>--%>
<%--    </tr>--%>
<%--    <c:forEach items="${students}" var="stud">--%>
<%--        <tr>--%>
<%--            <td>${stud.name}</td>--%>
<%--            <td>${stud.lastname}</td>--%>
<%--            <td>${stud.id}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>

<%--</table>--%>
<%--</body>--%>
<%--</html>--%>
