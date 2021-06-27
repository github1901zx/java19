<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="stylesheet" href="../../resources/css/style.css">
    <script type="text/javascript" src="../../resources/js/function.js"  charset="UTF-8"></script>
    <title>Disciplines list</title>
</head>

<body>
<section>
    <div class="container">
        <nav class="navi">
            <a class="btn btn-primary" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button"
               aria-controls="offcanvasExample">
                На главную
            </a>
            <a class="btn btn-primary" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button"
               aria-controls="offcanvasExample">
                Выход
            </a>
        </nav>

        <div class="up">
            <h1 class="disp">Система управлени студентами и их успеваемостью</h1>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="table">
                    <h3 class="table-name">Список дисциплин</h3>
                    <table class="table table-bordered">
                        <tr>
                            <th>*</th>
                            <th>Дисциплина</th>
                        </tr>

                            <c:forEach items="${disceplines}" var="disc">
                                <tr >
                                <td><input class="form-check-input mt-0" type="checkbox" value="${disc.id}"
                                           aria-label="Checkbox for following text input">
                                </td >
                                <td>${disc.discipline}</td>
                                </tr>
                            </c:forEach>

                    </table>
                </div>
            </div>

            <div class="col-md-6">
                <div class="col-md-6">
                    <div class="button-disp">

                        <form action="/discipline-create" method="get">
                            <input class="btn btn-primary buttonD" type="submit" value="Создать дисциплину ...">
                        </form>

                        <input class="btn btn-primary buttonD" type="submit" onclick="modifyDiscipline()" value="Изменить дисциплину">
                        <form id="formModify" action="/discipline-modify" method="get">
                            <input type="hidden" id="hiddenModify" name="hiddenModify">
                        </form>

                        <input class="btn btn-primary buttonD" type="submit" onclick="delDiscipline()"  value="Удалить дисциплину">
                        <form id="formDelete" action="/discipline-delete"  onclick="delDiscipline" method="post">
                            <input type="hidden" id="hiddenDelete" name="hiddenDelete">
                        </form>



                    </div>
                </div>
            </div>
        </div>

    </div>
    </div>
</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
</body>

</html>
</html>

<%--<html>--%>
<%--<head>--%>
<%--    <title> Дисциплины </title>--%>
<%--    <link rel="stylesheet" href="../../resources/css/style.css">--%>
<%--    <script type="text/javascript" src="../../resources/js/function.js"  charset="UTF-8"></script>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1> Страница с дисциплинами </h1>--%>
<%--<table>--%>
<%--    <tr>--%>
<%--        <td></td>--%>
<%--        <td>Название дисциплины</td>--%>
<%--    </tr>--%>
<%--    <c:forEach items="${disceplines}" var="disc">--%>
<%--        <tr>--%>
<%--            <td><input type="checkbox" value=${disc.id}></td>--%>
<%--            <td>${disc.discipline}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>

<%--</table>--%>
<%--<form action="/discipline-create" method="get">--%>
<%--    <input type="submit" value="Создать дисциплину ...">--%>
<%--</form>--%>

<%--<input type="submit" onclick="modifyDiscipline()" value="Модифицировать выбранную дисциплину ...">--%>
<%--<input type="submit" value="Удалить выбранную дичциплину ...">--%>

<%--<form id="formModify" action="/discipline-modify" method="get">--%>
<%--    <input type="hidden" id="hiddenModify" name="hiddenModify">--%>
<%--</form>--%>

<%--</body>--%>
<%--</html>--%>
