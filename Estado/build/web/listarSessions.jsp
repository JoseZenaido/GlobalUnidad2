<%-- 
    Document   : listarEstados
    Created on : 23-sep-2016, 18:46:01
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar sessions</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>sessionId</th>
                    <th>sessKey</th>
                    <th>secret</th>
                    <th>inativeExpiry</th>
                    <th>expiry</th>
                    <th>data</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="sessions" items="${sessionss}">
                    <tr>
                        <td>${sessions.sessionId}</td>
                        <td>${sessions.sessKey}</td>
                        <td>${sessions.secret}</td>
                        <td>${sessions.inativeExpiry}</td>
                        <td>${sessions.expiry}</td>
                        <td>${sessions.datee}</td>
                        <td><a href="SessionsController?action=cambiar&sessionId=${sessions.sessionId}">Cambiar</a></td>
                        <td><a href="SessionsController?action=borrar&sessionId=${sessions.sessionId}">Borrar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="SessionsController?action=agregar">Nuevo session</a>
        </p>
    </body>
</html>

