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
        <title>Listar Usuarios</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Id Usuario</th>
                    <th>login</th>
                    <th>password</th>
                    <th>nombre</th>
                    <th>edad</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="usuario" items="${usuarios}">
                    <tr>
                        <td>${usuario.idUsuario}</td>
                        <td>${usuario.login}</td>
                        <td>${usuario.password}</td>
                        <td>${usuario.nombre}</td>
                        <td>${usuario.edad}</td>
                        <td><a href="UsuarioController?action=cambiar&idUsuario=${usuario.idUsuario}">Cambiar</a></td>
                        <td><a href="UsuarioController?action=borrar&idUsuario=${usuario.idUsuario}">Borrar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="UsuarioController?action=agregar">Nuevo Usuario</a>
        </p>
    </body>
</html>

