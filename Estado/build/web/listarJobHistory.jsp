<%-- 
    Document   : listarEstados
    Created on : 23-sep-2016, 18:46:01
    Author     : @author José Zenaido Hernández Venegas josehdz3321@gmail.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar jobHistory</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>historyId</th>
                    <th>jobId</th>
                    <th>startTime</th>
                    <th>endTime</th>
                    <th>status</th>
                    <th>returnText</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="jobHistory" items="${jobHistorys}">
                    <tr>
                        <td>${jobHistory.historyId}</td>
                        <td>${jobHistory.jobId}</td>
                        <td>${jobHistory.startTime}</td>
                        <td>${jobHistory.endTime}</td>
                        <td>${jobHistory.status}</td>
                        <td>${jobHistory.returnText}</td>
                        <td><a href="JobHistoryController?action=cambiar&historyId=${jobHistory.historyId}">Cambiar</a></td>
                        <td><a href="JobHistoryController?action=borrar&historyId=${jobHistory.historyId}">Borrar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="JobHistoryController?action=agregar">Nuevo jobHistory</a>
        </p>
    </body>
</html>

