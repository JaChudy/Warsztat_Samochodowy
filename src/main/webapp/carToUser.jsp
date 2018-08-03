<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bartek
  Date: 03.08.18
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style/tablestyle.css">
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.css">
    <title>Przypisanie pojazdu</title>
</head>
<body>
<div class="alert alert-success" role="alert">
    <strong>Przypisanie pojazdu do klienta</strong>
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
        <th>Data urodzenia</th>
        <th></th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="customer">
        <tr id="row${customer.id}">
            <th style="vertical-align: middle;"scope="row">${customer.id}</th>
            <td style="vertical-align: middle;">${customer.name}</td>
            <td style="vertical-align: middle;">${customer.lastName}</td>
            <td style="vertical-align: middle;">${customer.dateOfBirth}</td>
            <td>
                <form action = "/carToCustomer" style="margin-bottom: 5px" method = "post">
                    <input type="hidden" name="id" value="${customer.id}">
                    <input type="hidden" name="name" value="${customer.name}">
                    <input type="hidden" name="lastName"value="${customer.lastName}">
                    <input type="hidden" name="dateOfBirth" value="${customer.dateOfBirth}">
                    <input type="submit" class="btn btn-primary btn-sm" value="Przypisz pojazd" />
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
