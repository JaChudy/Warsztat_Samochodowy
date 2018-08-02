<%--
  Created by IntelliJ IDEA.

  User: leszek
  Date: 01.08.18
  Time: 12:42

  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie pracownika</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <!--TODO try to import bootstrap from maven-->
    <!--<link href="webjars/bootstrap/3.2.0/css/bootstrap.css" rel="stylesheet"/>-->
    <link rel="stylesheet" href="style/formstyle.css">
</head>
<body>
<div class="alert alert-success" role="alert">
    <strong>Dodaj pracownika</strong>
</div>
<form action="/addemployee" method="post">
    <div class="form-group">
        <label for="formGroupInputFirstName">Imię</label>
        <input type="text" class="form-control" id="formGroupInputFirstName" name="name" placeholder="Imię" required>
    </div>
    <div class="form-group">
        <label for="formGroupInputLastName">Nazwisko</label>
        <input type="text" class="form-control" id="formGroupInputLastName" name="lastName" placeholder="Nazwisko" required>
    </div>
    <div class="form-group">
        <label for="formGroupInputNote">Notatka</label>
        <input type="text" class="form-control" id="formGroupInputNote" name="note" placeholder="notatka">
    </div>
    <div class="form-group">
        <label for="formGroupInputWorkingHourCost">Koszt roboczo godziny</label>
        <input type="number" step="0.01" class="form-control" id="formGroupInputWorkingHourCost" name="workingHourCost" placeholder="koszt roboczo godziny" required>
    </div>
    <button type="submit" class="btn btn-primary mb-2">Prześlij</button>
</form>
</body>
</html>
