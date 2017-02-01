<%-- 
    Document   : 
    Created on : 23-sep-2016, 18:45:15
    Author     : @author 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar schedule</title>
    </head>
    <body>
        <form action="DevelogsqlController" method="post" border="1">
            <fieldset border="1">
                <div>
                <label>id : </label>
                <input type="text" name="id" value="${develogsql.id}"
                       placeholder="id"
                       readonly="readonly"/>
                </div>
                       <div>
                <label>createe </label>
                <input type="text" name="createe" value="${develogsql.createe}"
                       placeholder="createe"/>
                       </div>
                       <div>       
                <label>sql0 </label>
                <input type="text" name="sql0" value="${develogsql.sql0}"
                       placeholder="sql0"/>
                       </div>
                       <div>
                <label>sql1 </label>
                <input type="text" name="sql1" value="${develogsql.sql1}"
                       placeholder="sql1"/>
                       </div>
                       <div>
               <label>params </label>
                <input type="text" name="params" value="${develogsql.params}"
                       placeholder="params"/>
                       </div>
                       <div>
               <label>tracer </label>
                <input type="text" name="tracer" value="${develogsql.tracer}"
                       placeholder="tracer"/>
                       </div>
                       <div>
               <label>timer </label>
                <input type="text" name="timer" value="${develogsql.timer}"
                       placeholder="timer"/>
                       </div>
                       
             
                       
                       
                       
                       
                       
                       
                       <div>
                           <input type="submit" value="Guardar"/>
                       </div>
            </fieldset>
        </form>
    </body>
</html>
