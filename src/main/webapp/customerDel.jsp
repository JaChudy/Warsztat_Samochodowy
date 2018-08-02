<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 01.08.18
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuwanie klienta</title>
</head>
<body>
    <form action="delCustomer" method="post">
        <label>
            Podaj Id klienta którego chcesz usunąć <input type="number" name="id" min="0">
        </label>
        <input type="submit" value="Wyślij">
    </form>
</body>
</html>
