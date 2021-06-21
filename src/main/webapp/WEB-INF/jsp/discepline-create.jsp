
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Создание дисциплины</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="stylesheet" href="../../resources/css/style.css">
</head>
<body>
<h1>Для того чтобы создать новую дисциплину
    заполниете все поля и нажмите кнопку "Создать"</h1>

<label>Название</label>

<form action="/discipline-create" method="post">
    <input type="text" name="newDisc">
    <input class="btn btn-primary buttonD" type="submit" value="Создать">
</form>

</body>
</html>
