
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Создание дисциплины</title>
    <link rel="stylesheet" href="../../resources/css/stidents.css">
</head>
<body>
<h1>Для того чтобы создать новую дисциплину
    заполниете все поля и нажмите кнопку "Создать"</h1>

<label>Название</label>

<form action="/discipline-create" method="post">
    <input type="text" name="newDisc">
    <input type="submit" value="Создать">
</form>

</body>
</html>
