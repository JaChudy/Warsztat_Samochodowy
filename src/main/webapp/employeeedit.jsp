<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 03.08.18
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style/tablestyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Edycja pracowników</title>
</head>
<body>
<div class="alert alert-success" role="alert">
    <strong>Wyświetlono listę pracowników</strong>
</div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a href="/index.html" class="navbar-link">Strona główna</a>
</nav>

<table class="table table-striped">
    <thead>
    <tr>
        <th>#</th>
        <th>Imię</th>
        <th>Nazwisko</th>
        <th>Notatka</th>
        <th>Koszt roboczogodziny</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <th style="vertical-align: middle;" scope="row">${employee.id}</th>
            <td style="vertical-align: middle;">${employee.name}</td>
            <td style="vertical-align: middle;">${employee.lastName}</td>
            <td style="vertical-align: middle;">${employee.note}</td>
            <td style="vertical-align: middle;">${employee.workingHourCost}</td>
            <td>
            <form action = "/EditSpecificEmployee" style="margin-bottom: 5px" method = "post">
                <input type="hidden" name="id" value="${employee.id}">
                <input type="hidden" name="name" value="${employee.name}">
                <input type="hidden" name="lastName"value="${employee.lastName}">
                <input type="hidden" name="note" value="${employee.note}">
                <input type="hidden" name="workingHourCost" value="${employee.workingHourCost}">
                <input type="submit" class="btn btn-primary btn-sm" value="Edytuj" />
            </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>