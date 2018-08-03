<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 02.08.18
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style/tablestyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Wyświetl zamówienia</title>
</head>
<body>
<div class="alert alert-success" role="alert">
    <strong>Wyświetlono listę zamówień</strong>
</div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a href="/index.html" class="navbar-link">Strona główna</a>
</nav>

<table class="table table-striped">
    <thead>
    <tr>
        <th>#</th>
        <th>Data złożenia zamówienia</th>
        <th>Szacowana data rozpoczęcia naprawy</th>
        <th>Data rozpoczęcia naprawy</th>
        <th>Opis problemów</th>
        <th>Szczegóły naprawy</th>
        <th>Status</th>
        <th>Cena dla klienta </th>
        <th>Koszt części</th>
        <th>Suma roboczogodzin</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${orders}" var="order">
        <tr>
            <th scope="row">${order.id}</th>
            <td>${order.acceptanceDate}</td>
            <td>${order.estimateStartDate}</td>
            <td>${order.startWorkDate}</td>
            <td>${order.problemDetails}</td>
            <td>${order.repairDetails}</td>
            <td>${order.status}</td>
            <td>${order.totalCostForCustomer}</td>
            <td>${order.totalCostOfThePartsUsed}</td>
            <td>${order.workHoursCount}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
