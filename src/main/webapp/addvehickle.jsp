<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 01.08.18
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formularz dodawania pojazdu</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <!--TODO try to import bootstrap from maven-->
    <!--<link href="webjars/bootstrap/3.2.0/css/bootstrap.css" rel="stylesheet"/>-->
    <link rel="stylesheet" href="style/addcustumorestyle.css">
</head>
<body>
<div class="alert alert-success" role="alert">
    <strong>Dodaj pojazd</strong>
</div>
<form>
    <div class="form-group">
        <label for="formGroupInputBrand">Marka</label>
        <input type="text" class="form-control" id="formGroupInputBrand" name="brand" placeholder="marka" required>
    </div>
    <div class="form-group">
        <label for="formGroupInputModel">Model</label>
        <input type="text" class="form-control" id="formGroupInputModel" name="model" placeholder="model" required>
    </div>
    <div class="form-group">
        <label for="formGroupInputDateOfProduction">Data produkcji</label>
        <input type="date" class="form-control" id="formGroupInputDateOfProduction" name="dateOfProduction" placeholder="Data produkcji" required>
    </div>
    <div class="form-group">
        <label for="formGroupInputRegistrationNumber">Numer rejestracyjny</label>
        <input type="number" class="form-control" id="formGroupInputRegistrationNumber" name="registrationNumber" placeholder="Numer rejestracyjny" required>
    </div>
    <div class="form-group">
        <label for="formGroupInputNextTechnicalInspectionDate">Data następnego przeglądu technicznego</label>
        <input type="date" class="form-control" id="formGroupInputNextTechnicalInspectionDate" name="nextTechnicalInspectionDate" placeholder="data następnego przeglądu technicznego" required>
    </div>
    <button type="submit" class="btn btn-primary mb-2">Prześlij</button>
</form>
</body>
</html>
