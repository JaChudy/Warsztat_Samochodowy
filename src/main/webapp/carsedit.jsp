<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 03.08.18
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <link rel="stylesheet" href="style/tablestyle.css">
        <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.css">
        <title>Edytuj klientów</title>
    </head>
<body>
<div class="alert alert-success" role="alert">
    <strong>Edycja klientów</strong>
</div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a href="/index.html" class="navbar-link">Strona główna</a>
</nav>
<table class="table table-striped">
    <thead>
    <tr>
        <th>Numer rejestracyjny</th>
        <th>Model</th>
        <th>Marka</th>
        <th>Rok produkcji</th>
        <th>Data nastepnej wizyty</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${cars}" var="vehicle">
        <tr>
            <th style="vertical-align: middle;" scope="row">${vehicle.registrationNumber}</th>
            <td style="vertical-align: middle;">${vehicle.model}</td>
            <td style="vertical-align: middle;">${vehicle.brand}</td>
            <td style="vertical-align: middle;">${vehicle.dateOfProduction}</td>
            <td style="vertical-align: middle;">${vehicle.nextTechnicalInspectionDate}</td>
            <td>
                <form action = "/EditSpecificCar" style="margin-bottom: 5px" method = "post">
                    <input type="hidden" name="registrationNumber" value="${vehicle.registrationNumber}">
                    <input type="hidden" name="model" value="${vehicle.model}">
                    <input type="hidden" name="brand"value="${vehicle.brand}">
                    <input type="hidden" name="dateOfProduction" value="${vehicle.dateOfProduction}">
                    <input type="hidden" name="nextTechnicalInspectionDate" value="${vehicle.nextTechnicalInspectionDate}">
                    <input type="submit" class="btn btn-primary btn-sm" value="Edytuj" />
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</head>
</body>
</html>
