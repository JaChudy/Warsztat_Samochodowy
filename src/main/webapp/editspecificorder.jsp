<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 03.08.18
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="style/editformstyle.css">
</head>
<body>
<div class="alert alert-warning" role="alert">
    <strong>Uwaga!</strong> Modyfikacja zamówienia jest nieodwracalna.
</div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a href="/index.html" class="navbar-link">Strona główna</a>
</nav>
<form action="/OrdersSaveChanges" method="post">
    <div class="form-group row">
        <div class="form-inline">
            <input id= "inputID" type="text" class="form-control" value="${order.id}" name="id" disabled>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputAcceptanceDate" type="date" class="form-control" value="${order.acceptanceDate}" name="acceptanceDate" disabled>
            <button id="buttonAcceptanceDate" type="button" class="btn btn-warning">Zmień datę rozpoczęcia zamówienia</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputEstimateStartDate" type="date" class="form-control" value="${order.estimateStartDate}" name="estimateStartDate" disabled>
            <button id="buttonEstimateStartDate" type="button" class="btn btn-warning">Zmień szacowaną datę naprawy</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputStartWorkDate" type="date" class="form-control" value="${order.startWorkDate}" name="startWorkDate" disabled>
            <button id="buttonStartWorkDate" type="button" class="btn btn-warning">Zmień datę rozpoczęcia narpawy</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputProblemDetails" type="text" class="form-control" value="${order.problemDetails}" name="problemDetails" disabled>
            <button id="buttonProblemDetails" type="button" class="btn btn-warning">Zmień opis problemu</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputRepairDetails" type="text" class="form-control" value="${order.repairDetails}" name="repairDetails" disabled>
            <button id="buttonRepairDetails" type="button" class="btn btn-warning">Zmień szczegóły naprawy</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <%--<input id="inputStatus" type="text" class="form-control" value="${order.status}" name="status" disabled>--%>
            <select class="form-control" id="inputStatus" name="status" disabled>
                <option value="Przyjęty">Przyjęty</option>
                <option value="Zatwierdzone koszty naprawy">Zatwierdzone koszty naprawy</option>
                <option value="W naprawie">W naprawie</option>
                <option value="Gotowy do odbioru">Gotowy do odbioru</option>
                <option value="Rezygnacja">Rezygnacja</option>
            </select>
            <button id="buttonStatus" type="button" class="btn btn-warning">Zmień status naprawy</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputTotalCostForCustomer" type="number" step="0.01" min="0" class="form-control" value="${order.totalCostForCustomer}" name="totalCostForCustomer" disabled>
            <button id="buttonTotalCostForCustomer" type="button" class="btn btn-warning">Zmień całkowity koszt naprawy</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputTotalCostOfThePartsUsed" type="number" step="0.01" min="0" class="form-control" value="${order.totalCostOfThePartsUsed}" name="totalCostOfThePartsUsed" disabled>
            <button id="buttonTotalCostOfThePartsUsed" type="button" class="btn btn-warning">Zmień całkowity koszt części</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputWorkHoursCount" type="number" step="1" min="0" class="form-control" value="${order.workHoursCount}" name="workHoursCount" disabled>
            <button id="buttonWorkHoursCount" type="button" class="btn btn-warning">Zmień ilość roboczo godzin</button>
        </div>
    </div>
    <button id="submit" type="submit" class="btn btn-primary mb-2" disabled>Prześlij</button>
</form>

<script src="/webjars/jquery/3.3.1/dist/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        $("#buttonAcceptanceDate").click(function(){
            $("#inputAcceptanceDate").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonEstimateStartDate").click(function(){
            $("#inputEstimateStartDate").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonStartWorkDate").click(function(){
            $("#inputStartWorkDate").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonProblemDetails").click(function(){
            $("#inputProblemDetails").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonRepairDetails").click(function(){
            $("#inputRepairDetails").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonStatus").click(function(){
            $("#inputStatus").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonTotalCostForCustomer").click(function(){
            $("#inputTotalCostForCustomer").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonTotalCostOfThePartsUsed").click(function(){
            $("#inputTotalCostOfThePartsUsed").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonWorkHoursCount").click(function(){
            $("#inputWorkHoursCount").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });

    $(document).ready(function(){
        $("#submit").click(function(){
            $("#inputID").prop('disabled', false);
            $("#inputAcceptanceDate").prop('disabled', false);
            $("#inputEstimateStartDate").prop('disabled', false);
            $("#inputStartWorkDate").prop('disabled', false);
            $("#inputProblemDetails").prop('disabled', false);
            $("#inputRepairDetails").prop('disabled', false);
            $("#inputStatus").prop('disabled', false);
            $("#inputTotalCostForCustomer").prop('disabled', false);
            $("#inputTotalCostOfThePartsUsed").prop('disabled', false);
            $("#inputWorkHoursCount").prop('disabled', false);
        });
    });
</script>
</body>
</html>
