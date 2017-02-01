<%-- 
    Document   : 
    Created on : 23-sep-2016, 18:45:15
    Author     : @author Eduardo Rico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar usuarios</title>
    </head>
    <body>
        <form action="UsuarioController" method="post" border="1">
            <fieldset border="1">
                <div>
                <label>id de usuario: </label>
                <input type="text" name="idUsuario" value="${usuario.idUsuario}"
                       placeholder="id Usuario"
                       readonly="readonly"/>
                </div>
                       <div>
                <label>login: </label>
                <input type="text" name="login" value="${usuario.login}"
                       placeholder="login"/>
                       </div>
                       <div>       
                <label>password: </label>
                <input type="text" name="password" value="${usuario.password}"
                       placeholder="password"/>
                       </div>
                       <div>
                <label>nombre: </label>
                <input type="text" name="nombre" value="${usuario.nombre}"
                       placeholder="nombre"/>
                       </div>
                       <div>
               <label>edad: </label>
                <input type="text" name="edad" value="${usuario.edad}"
                       placeholder="edad"/>
                       </div>
                       <div>
                           <input type="submit" value="Guardar"/>
                       </div>
            </fieldset>
        </form>
    </body>
</html>
