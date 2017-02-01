<%-- 
    Document   : 
    Created on : 23-sep-2016, 18:45:15
    Author     : @author Eduardo Rico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar schedule</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>shedulename</th>
                    <th>ispublic</th>
                    <th>sheduletype</th>
                    <th>start</th>
                    <th>end</th>
                    <th>hour</th>
                    <th>min</th>
                    <th>everyhour</th>
                    <th>everyminute</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="schedule" items="${schedules}">
                    <tr>
                        <td>${schedule.id}</td>
                        <td>${schedule.sheduleName}</td>
                        <td>${schedule.isPublic}</td>
                        <td>${schedule.sheduleType}</td>
                        <td>${schedule.start}</td>
                        <td>${schedule.endd}</td>
                        <td>${schedule.hour}</td>
                        <td>${schedule.min}</td>
                        <td>${schedule.everyHour}</td>
                       
                        <td><a href="ScheduleController?action=cambiar&id=${schedule.id}">Cambiar</a></td>
                        <td><a href="ScheduleController?action=borrar&id=${schedule.id}">Borrar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="ScheduleController?action=agregar">Nuevo schedule</a>
        </p>
    </body>
</html>

