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
    <script type="text/javascript" src="../../resources/js/function.js" charset="UTF-8"></script>

    <title>Students progress</title>

</head>

<body>

<section>
    <div class="container">
        <ul class="nav nav-pills navbar">
            <nav class="navi">
                <a class="btn btn-primary" data-bs-toggle="offcanvas" href="../../index.jsp" role="button"
                   aria-controls="offcanvasExample">
                    На главную
                </a>
                <a class="btn btn-primary" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button"
                   aria-controls="offcanvasExample">
                    Выход
                </a>
            </nav>
        </ul>
        <div class="up">
                <h1 class="disp">Система управлени студентами и их успеваемостью</h1>
            </div>

            <h3>Отображена успеваемость для следующего студента:</h3>
            <div class="table">
                <table class="table table-bordered">
                    <tr>
                        <th>*</th>
                        <th>Имя</th>
                        <th>Фамилия</th>
                        <th>Группа</th>
                        <th>Дата</th>
                    </tr>
                    <%--                    <c:forEach items="${student}" var="studProg">--%>
                    <tr>
                        <td><input class="form-check-input mt-0" type="checkbox" value="${studProg.id}"
                                   aria-label="Checkbox for following text input">
                        </td>
                        <td>${studProg.name}</td>
                        <td>${studProg.lastname}</td>
                        <td>${studProg.group.name}</td>
                        <td><fmt:formatDate value="${studProg.date}" pattern="yyyy/MM/dd"></fmt:formatDate></td>
                    </tr>
                    <%--                    </c:forEach>--%>
                </table>
            </div>
            <div class="table_progres">
                <div class="row">
                    <div class="col-md-6">
                        <table class="table table-success table-striped">
                            <tr>
                                <th width="30%">Дисциплина</th>
                                <th width="15%" >Оценка</th>
                            </tr>
                            <c:forEach items="${marks}" var="marks">
                            <tr>
                                <td>${marks.discepline.discipline}</td>
                                <td>${marks.mark}</td>
                            </tr>
                            </c:forEach>
                        </table>
                    </div>

                    <form action="/studentProgress" method="get">
                        <input type="hidden"  value="${studProg.id}" name="hiddenProg">
                    <div class="col-md-3">
                        <div class="submin_le">

                            <select name="selected" class="form-select semestr list_emestr"
                                    aria-label="Default select example" width="40%">
                                <c:forEach items="${terms}" var="t">
                                    <c:choose>
                                        <c:when test="${t.id == selectedTerm.id}">
                                            <option selected value=${t.id}>${t.name}</option>
                                        </c:when>
                                        <c:otherwise>
                                            <option value=${t.id}>${t.name}</option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select>

                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="submin_le">
                            <div class="choose_input">
                                <input type="submit" class="btn btn-primary buttonD" value="Выбрать">
                            </div>
                        </div>
                    </div>
                    </form>

                </div>
            </div>
    </div>





</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
</body>

</html>