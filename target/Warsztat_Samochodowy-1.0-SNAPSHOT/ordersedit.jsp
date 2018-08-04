<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 03.08.18
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style/tablestyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Edytuj zamówienia</title>
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
            <th style="vertical-align: middle;"scope="row">${order.id}</th>
            <td style="vertical-align: middle;" >${order.acceptanceDate}</td>
            <td style="vertical-align: middle;" >${order.estimateStartDate}</td>
            <td style="vertical-align: middle;" >${order.startWorkDate}</td>
            <td style="vertical-align: middle;" >${order.problemDetails}</td>
            <td style="vertical-align: middle;" >${order.repairDetails}</td>
            <td style="vertical-align: middle;" >${order.status}</td>
            <td style="vertical-align: middle;" >${order.totalCostForCustomer}</td>
            <td style="vertical-align: middle;" >${order.totalCostOfThePartsUsed}</td>
            <td style="vertical-align: middle;" >${order.workHoursCount}</td>
            <td>
                <form action = "/EditSpecificOrder" style="margin-bottom: 5px" method = "post">
                    <input type="hidden" name="id" value="${order.id}">
                    <input type="hidden" name="acceptanceDate" value="${order.acceptanceDate}">
                    <input type="hidden" name="estimateStartDate" value="${order.estimateStartDate}">
                    <input type="hidden" name="startWorkDate" value="${order.startWorkDate}">
                    <input type="hidden" name="problemDetails" value="${order.problemDetails}">
                    <input type="hidden" name="repairDetails" value="${order.repairDetails}">
                    <input type="hidden" name="status" value="${order.status}">
                    <input type="hidden" name="totalCostForCustomer" value="${order.totalCostForCustomer}">
                    <input type="hidden" name="totalCostOfThePartsUsed" value="${order.totalCostOfThePartsUsed}">
                    <input type="hidden" name="workHoursCount" value="${order.workHoursCount}">
                    <input type="submit" class="btn btn-primary btn-sm" value="Edytuj" />
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

