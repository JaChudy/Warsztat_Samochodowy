<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 03.08.18
  Time: 00:17
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
    <strong>Uwaga!</strong> Modyfikacja użytkownika jest nieodwracalna.
</div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a href="/index.html" class="navbar-link">Strona główna</a>
</nav>
<form action="/CustomerSaveChanges" method="post">
    <div class="form-group row">
        <div class="form-inline">
          <input id= "inputID" type="text" class="form-control" value="${customer.id}" name="id" disabled>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputName" type="text" class="form-control" value="${customer.name}" name="name" disabled>
            <button id="buttonName" type="button" class="btn btn-warning">Zmień imię</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputLastName" type="text" class="form-control" value="${customer.lastName}" name="lastName"disabled>
            <button id="buttonLastName" type="button" class="btn btn-warning">Zmień nazwisko</button>
        </div>
    </div>
    <div class="form-group row">
        <div class="form-inline">
            <input id="inputDateOfBirth" type="date" class="form-control" value="${customer.dateOfBirth}" name="dateOfBirth" disabled>
          <button id="buttonDateOfBirth" type="button" class="btn btn-warning">Zmień datę urodzenia</button>
        </div>
    </div>
    <button id="submit" type="submit" class="btn btn-primary mb-2" disabled>Submit</button>
</form>

<script src="/webjars/jquery/3.3.1/dist/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        $("#buttonName").click(function(){
            $("#inputName").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonLastName").click(function(){
            $("#inputLastName").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#buttonDateOfBirth").click(function(){
            $("#inputDateOfBirth").prop('disabled', false);
            $("#submit").prop('disabled', false);
        });
    });
    $(document).ready(function(){
        $("#submit").click(function(){
            $("#inputID").prop('disabled', false);
            $("#inputName").prop('disabled', false);
            $("#inputLastName").prop('disabled', false);
            $("#inputDateOfBirth").prop('disabled', false);
        });
    });
</script>
</body>
</html>
