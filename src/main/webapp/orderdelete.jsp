<%--
  Created by IntelliJ IDEA.
  User: leszek
  Date: 04.08.18
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="style/formstyle.css">
    <title>Usuwanie klienta</title>
</head>
<body>
<div class="alert alert-warning" role="alert">
    <strong>Uwaga!</strong> nie zaleca się usuwać zamowienia.
</div>
<form action="/OrderServletDel" method="post">
    <div class="form-group">
        <label for="formGroupIDInput">Podaj ID zamówienia, którego chcesz usunąć
            <input type="number" name="id" min="1"  class="form-control" id="formGroupIDInput" placeholder="podaj ID klienta">
        </label>
        </br>
        <button type="submit" class="btn btn-danger">Usuń zamówienie</button>
    </div>
</form>
</body>
</html>

