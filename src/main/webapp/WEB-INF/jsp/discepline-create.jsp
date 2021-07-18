
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Создание дисциплины</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="stylesheet" href="../../resources/css/style.css">
</head>
<body>
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
    <h4>Для того чтобы создать новую дисциплину
        заполниете все поля и нажмите кнопку "Создать"</h4>

    <label>Название</label>

    <form action="/discipline-create" method="post">
        <input type="text" name="newDisc">
        <input class="btn btn-primary buttonD" type="submit" value="Создать">
        <c:if test="${massege == 'error'}">
            <h5>Поле не должно быть пусты</h5>
        </c:if>
    </form>
</div>
</body>
</html>
