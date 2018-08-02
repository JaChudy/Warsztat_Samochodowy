<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 01.08.18
  Time: 07:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tabela z klientami</title>
</head>
<body>
    <table>
        <tbody>
            <c:forEach items="${customers}" var="customer">
                <tr>
                    <td>${customer.name}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.dateOfBirth}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
