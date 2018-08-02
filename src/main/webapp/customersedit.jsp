<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 02.08.18
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style/tablestyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
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
        <th>#</th>
        <th>Imię</th>
        <th>Nazwisko</th>
        <th>Data urodzenia</th>
        <th>Edycja</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <th style="vertical-align: middle;"scope="row">${customer.id}</th>
            <td style="vertical-align: middle;">${customer.name}</td>
            <td style="vertical-align: middle;">${customer.lastName}</td>
            <td style="vertical-align: middle;">${customer.dateOfBirth}</td>
            <td style="vertical-align: middle;"><a class="btn btn-primary btn-sm" href="" role="button">Edytuj</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</body>
</html>
