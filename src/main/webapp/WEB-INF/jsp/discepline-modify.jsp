
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Изменение дисциплины</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="stylesheet" href="../../resources/css/style.css">
</head>
<body>
<div  class="container">
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
    <div class="row">
        <div class="col">
            <h3 class="display-6">Для того чтобы изменить дисциплину
                заполниете все поля и нажмите кнопку "Изменить"</h3>
        </div>
        <div class="col-md-auto">
        </div>
        <div class="col col-lg-2">
        </div>

    <div class="row">
        <div class="col">
            <form action="/discipline-modify" method="post" >
                <input name="idModify" type="hidden" value="${disp.id}">
                <input type="text" name="discModify" value="${disp.discipline}">
                <input class="btn btn-primary buttonD" type="submit" value="Изменить">
                <c:if test="${massege == 'error'}">
                    <h5>Поле не должно быть пусты</h5>
                </c:if>
            </form>
        </div>
        <div class="col-md-auto">
        </div>
        <div class="col col-lg-2">
        </div>
    </div>

</div>

</body>
</html>
