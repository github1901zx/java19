<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
<label>Введите логин:</label>
<input type="text" name="login">

<label>Введите пароль:</label>
<input type="text" name="password">

<label>Выберите роль:</label>
<select name="role">
    <option value="1"> Администратор </option>
    <option value="2"> Учитель </option>
    <option value="3"> Студент </option>
</select>

<input type="submit" value="Войти">
    <c:if test="${massege == 1}">
        <h3>Пользователь не найден</h3>
    </c:if>
</form>
</body>
</html>
