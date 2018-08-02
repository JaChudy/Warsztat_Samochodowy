<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 01.08.18
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj zlecenie</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <!--TODO try to import bootstrap from maven-->
    <!--<link href="webjars/bootstrap/3.2.0/css/bootstrap.css" rel="stylesheet"/>-->
    <link rel="stylesheet" href="style/formstyle.css">
</head>
<body>
<div class="alert alert-success" role="alert">
    <strong>Dodaj zamówienie</strong>
</div>
<form>
    <div class="form-group">
        <label for="formGroupInputAcceptanceDate">Data przyjęcia do naprawy</label>
        <input type="date" class="form-control" id="formGroupInputAcceptanceDate" name="acceptanceDate" placeholder="data przyjęcia zamówienia" required>
    </div>
    <div class="form-group">
        <label for="formGroupInputEstimateStartDate">Planowana data rozpoczęcia naprawy</label>
        <input type="date" class="form-control" id="formGroupInputEstimateStartDate" name="estimateStartDate" placeholder="planowana data rozpoczęcia naprawy">
    </div>
    <div class="form-group">
        <label for="formGroupInputEmployeeID">ID pracownika</label>
        <input type="number" class="form-control" id="formGroupInputEmployeeID" name="employeeID" placeholder="ID pracownika">
    </div>
    <div class="form-group">
        <label for="formGroupInputProblemDetails">Opis problemu</label>
        <input type="text" class="form-control" id="formGroupInputProblemDetails" name="problemDetails" placeholder="opis problemu" required>
    </div>
    <div class="form-group">
        <label for="formGroupInputVehickleID">ID pojazdu</label>
        <input type="number" class="form-control" id="formGroupInputVehickleID" name="vehickleID" placeholder="ID pojazdu" required>
    </div>
    <button type="submit" class="btn btn-primary mb-2">Prześlij</button>
</form>
</body>
</html>
