
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Изменение дисциплины</title>
    <link rel="stylesheet" href="../../resources/css/style.css">
</head>
<body>
<h1>Для того чтобы изменить дисциплину
    заполниете все поля и нажмите кнопку "Изменить"</h1>

<label>Название</label>

<form action="/" method="post">
    <input type="hidden" value="${disp.id}">
    <input type="text" name="newDisc" value="${disp.discipline}">
    <input type="submit" value="Изменить">
</form>

</body>
</html>
