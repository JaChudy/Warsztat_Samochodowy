<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style/tablestyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Tabela z samochodami</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a href="/index.html" class="navbar-link">Strona gĹĂłwna</a>
</nav>
<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>Model</th>
        <th>Marka</th>
        <th>Rok produkcji</th>
        <th>Numer rejestracyjny</th>
        <th>Data nastepnej wizyty</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${cars}" var="vehicle">
        <tr>
            <th scope="row">${vehicle.id}</th>
            <td>${vehicle.model}</td>
            <td>${vehicle.brand}</td>
            <td>${vehicle.dateOfProduction}</td>
            <td>${vehicle.registrationNumber}</td>
            <td>${vehicle.nextTechnicalInspectionDate}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>