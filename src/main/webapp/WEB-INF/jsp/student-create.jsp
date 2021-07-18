<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="stylesheet" href="../../resources/css/style.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@400;700&display=swap" rel="stylesheet">
    <title>Студенты</title>
</head>
<body>
<section class="sheme_students"></section>
<div class="container">
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

    <h3>Для создания студента заполните все поля и нажмите кнопку "Применить"</h3>

    <div class="form_student">
        <div class="row">
            <div class="col-md-6">
                <form action="/students-create" method="post">


                <div class="input-group mb-3">
                    <span class="input-group-text" id="inputGroup-sizing-default">Фамилия</span>
                    <input type="text" name="lastname" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                    <c:if test="${massege == 'error'}">
                        <h5>Поле не должно быть пусты</h5>
                    </c:if>
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="inputGroup-sizing-default">Имя</span>
                    <input type="text" name="name" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                    <c:if test="${massege1 == 'error1'}">
                        <h5>Поле не должно быть пусты</h5>
                    </c:if>
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="inputGroup-sizing-default">Группа</span>
                    <select class="form-select" name="group" aria-label="Default select example">
                        <c:forEach items="${groups}" var="group">
                            <option value="${group.id}">${group.name}</option>
                        </c:forEach>
                    </select>
                    <c:if test="${massege2 == 'error2'}">
                        <h5>Поле не должно быть пусты</h5>
                    </c:if>
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="inputGroup-sizing-default">Дата в формате "2020-09-01"</span>
                    <input type="text" name="date" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                    <c:if test="${massege3 == 'error3'}">
                        <h5>Поле не должно быть пусты</h5>
                    </c:if>
                </div>
                <input class="btn btn-primary apply" type="submit" value="Создать">
                </form>
            </div>
        </div>
    </div>

</div>
</section>

</body>
</html>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Создание студента</title>--%>
<%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"--%>
<%--          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">--%>
<%--    <link rel="stylesheet" href="../../resources/css/style.css">--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Для того чтобы создать студента--%>
<%--    заполниете все поля и нажмите кнопку "Создать"</h1>--%>


<%--<form  action="/studentsCreate" method="post">--%>
<%--        <label>Введите имя студента</label>--%>
<%--        <input type="text" name="newName">--%>
<%--        <c:if test="${massege == 'error'}">--%>
<%--            <h5>Поле не должно быть пусты</h5>--%>
<%--        </c:if>--%>
<%--        <label>Введите фамилию студента</label>--%>
<%--        <input type="text" name="newLastName">--%>
<%--        <c:if test="${massege == 'error'}">--%>
<%--            <h5>Поле не должно быть пусты</h5>--%>
<%--        </c:if>--%>
<%--        <label>Выберите группу</label>--%>
<%--        <select>--%>
<%--            <c:forEach items="${groups}" var="group">--%>
<%--                <option>${group.name}</option>--%>
<%--            </c:forEach>--%>
<%--        </select>--%>
<%--        <c:if test="${massege == 'error'}">--%>
<%--            <h5>Поле не должно быть пусты</h5>--%>
<%--        </c:if>--%>
<%--        <label>Введите дату рождения в формате "2020-09-01"</label>--%>
<%--        <input type="text" name="newDate">--%>
<%--        <c:if test="${massege == 'error'}">--%>
<%--            <h5>Поле не должно быть пусты</h5>--%>
<%--        </c:if>--%>
<%--</form>--%>

<%--</body>--%>
<%--</html>--%>
