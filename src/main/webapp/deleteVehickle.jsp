<%--
  Created by IntelliJ IDEA.
  User: bartek
  Date: 03.08.18
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="style/formstyle.css">
    <title>Usuwanie pojazdu</title>
</head>
<body>
<div class="alert alert-warning" role="alert">
    <strong>Uwaga!</strong> nie zaleca się usuwać pojazdu.
</div>
<form action="CarServletDelete" method="post">
    <div class="form-group">
        <label for="formGroupIDInput">Podaj ID pojazdu, który chcesz usunąć
            <input type="number" name="id" min="0"  class="form-control" id="formGroupIDInput" placeholder="podaj ID pojazdu">
        </label>
        </br>
        <button type="submit" class="btn btn-danger">Usuń pojazd</button>
    </div>
</form>

</body>
</html>
