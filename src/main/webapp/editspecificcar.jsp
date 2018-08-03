<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 03.08.18
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edycja danych samochodu</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="style/editformstyle.css">
</head>
<body>
<div class="alert alert-warning" role="alert">
    <strong>Uwaga!</strong> Modyfikacja samochodu jest nieodwracalna.
</div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a href="/index.html" class="navbar-link">Strona główna</a>
</nav>
<form action="/CarSaveChanges" method="post">
    <div class="form-group row">
        <div class="form-inline">
            <input id= "inputRegistrationNumber" type="text" class="form-control" value="${car.registrationNumber}" name="registrationNumber" disabled>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputBrand" type="text" class="form-control" value="${car.brand}" name="brand" disabled>
            <button id="buttonBrand" type="button" class="btn btn-warning">Zmień markę</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputModel" type="text" class="form-control" value="${car.model}" name="model"disabled>
            <button id="buttonModel" type="button" class="btn btn-warning">Zmień model</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputDateOfProduction" type="date" class="form-control" value="${car.dateOfProduction}" name="dateOfProduction" disabled>
            <button id="buttonDateOfProduction" type="button" class="btn btn-warning">Zmień datę produkcji</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputNextTechnicalInspectionDate" type="date" class="form-control" value="${car.nextTechnicalInspectionDate}" name="nextTechnicalInspectionDate" disabled>
            <button id="buttonNextTechnicalInspectionDate" type="button" class="btn btn-warning">Zmień datę następnego przeglądu technicznego</button>
        </div>
    </div>
    <button id="submit" type="submit" class="btn btn-primary mb-2" disabled>Zatwierdź zmiany</button>
</form>

<script src="/webjars/jquery/3.3.1/dist/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        $("#buttonBrand").click(function(){
            $("#inputBrand").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonModel").click(function(){
            $("#inputModel").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonDateOfProduction").click(function(){
            $("#inputDateOfProduction").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonNextTechnicalInspectionDate").click(function(){
            $("#inputNextTechnicalInspectionDate").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });

    $(document).ready(function(){
        $("#submit").click(function(){
            $("#inputRegistrationNumber").prop('disabled', false);
            $("#inputBrand").prop('disabled', false);
            $("#inputModel").prop('disabled', false);
            $("#inputDateOfProduction").prop('disabled', false);
            $("#inputNextTechnicalInspectionDate").prop('disabled', false);
        });
    });
</script>
</body>
</html>
