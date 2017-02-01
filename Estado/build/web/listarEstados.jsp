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
        <title>Listar Estados</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Id Estado</th>
                    <th>Descripcion</th>
                    <th>NumeroHabitantes</th>
                    <th>PlatilloTipico</th>
                    <th>TrajeTipico</th>
                    <th>DensidadPoblacion</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="estado" items="${estados}">
                    <tr>
                        <td>${estado.idEstado}</td>
                        <td>${estado.descripcion}</td>
                        <td>${estado.numeroHabitantes}</td>
                        <td>${estado.platilloTipico}</td>
                        <td>${estado.trajeTipico}</td>
                        <td>${estado.densidadPoblacion}</td>
                        <td><a href="EstadoController?action=cambiar&idEstado=${estado.idEstado}">Cambiar</a></td>
                        <td><a href="EstadoController?action=borrar&idEstado=${estado.idEstado}">Borrar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="EstadoController?action=agregar">Nuevo Estado</a>
        </p>
    </body>
</html>

