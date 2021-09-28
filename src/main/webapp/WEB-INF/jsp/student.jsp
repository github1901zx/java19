
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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

    <title>Students list</title>

</head>

<body>
<section>
    <div class="container">
        <nav class="navi">
            <a class="btn btn-primary" data-bs-toggle="offcanvas" href="../../index.jsp" role="button" aria-controls="offcanvasExample">
                На главную
            </a>
            <a class="btn btn-primary" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button" aria-controls="offcanvasExample">
                Выход
            </a>
        </nav>
        <div class="up">
            <h1 class="disp">Система управлени студентами и их успеваемостью</h1>
        </div>
        <c:if test="${role == 1}">
        <div class="btn">
            <div class="row">
                <div class="col-md-6">
                    <div class="right">

                            <input class="btn btn-primary buttonDstud" type="submit" onclick="progressStud()" value="Посмотреть успеваемоcть выбранных студентов">
                        <form id="formProgStud" action="/studentProgress"  onclick="progressStud()" method="get">
                            <input type="hidden" id="hiddenProg" name="hiddenProg">
                        </form>

                            <input class="btn btn-primary buttonDstud" type="submit" onclick="modifyStud()"value="Модифицировать выбранного студента">
                        <form id="formModifyStud" action="/students-modify"  onclick="modifyStud()" method="get">
                            <input type="hidden" id="hiddenModify" name="hiddenModify">
                        </form>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="left">
                        <form action="/students-create" method="get">
                            <input class="btn btn-primary buttonDstud" type="submit" value="Создать студента">
                        </form>
                            <input class="btn btn-primary buttonDstud" type="submit" onclick="delStudents()"  value="Удалить студента">
                        <form id="formDeleteStud" action="/students-delete"  onclick="delStudents()" method="post">
                            <input type="hidden" id="hiddenDelete" name="hiddenDelete">
                        </form>
                    </div>

                </div>
            </div>
        </div>
        </c:if>
        <div class="table">
            <table class="table table-bordered">
                <tr>
                    <th>*</th>
                    <th>Имя</th>
                    <th>Фамилия</th>
                    <th>Группа</th>
                    <th>Дата</th>
                </tr>
                    <c:forEach items="${students}" var="stud">
                        <tr>
                            <td><input class="form-check-input mt-0" type="checkbox" value="${stud.id}"
                                       aria-label="Checkbox for following text input">
                            </td >
                            <td>${stud.name}</td>
                            <td>${stud.lastname}</td>
                            <td>${stud.group.name}</td>
                            <td><fmt:formatDate value="${stud.date}" pattern="yyyy/MM/dd"></fmt:formatDate></td>
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
