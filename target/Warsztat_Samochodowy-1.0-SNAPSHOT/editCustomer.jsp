<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 02.08.18
  Time: 07:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edycja klienta</title>
</head>
<body>
    <form action="editCustomer" method="post">
        <label>
            Podaj nazwisko klienta którego chcesz edytować:<br>
            <input type="text" name="lastName"><br>
        </label>
        <label>
            Podaj imie klienta którego chcesz edytować:<br>
            <input type="text" name="name"><br>
        </label>
        <input type="submit" value="Zatwierdz">
    </form>

    Wybrałeś użytkownika
    <table>
        <thead>

        </thead>
        <tbody>
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.lastName}</td>
                <td>${customer.dateOfBirth}</td>
            </tr>
        </tbody>
    </table>


</body>
</html>
