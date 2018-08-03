<%--
  Created by IntelliJ IDEA.
  User: bartek
  Date: 03.08.18
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="style/formstyle.css">
    <title>Przypisywanie pojazdu</title>
</head>
<body>
<form action="index.html" method="post">
    <div class="form-group">
        <label for="formGroupIDInput">Podaj numer rejestracyjny pojazdu
            <input type="number" name="id" min="0"  class="form-control" id="formGroupIDInput" placeholder="numer rejestracyjny pojazdu">
        </label>
        </br>
        <button type="submit" class="btn btn-primary">Przypisz pojazd</button>
    </div>
</form>

</body>
</html>