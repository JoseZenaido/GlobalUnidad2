
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar sessions</title>
    </head>
    <body>
        <form action="SessionsController" method="post" border="1">
            <fieldset border="1">
                <div>
                <label> sessionId:</label>
                <input type="text" name="sessionId" value="${sessions.sessionId}"
                       placeholder="sessionId"
                       readonly="readonly"/>
                </div>
                       <div>
                <label>sessKey: </label>
                <input type="text" name="sessKey" value="${sessions.sessKey}"
                       placeholder="sessKey"/>
                       </div>
                       <div>       
                <label>secret: </label>
                <input type="text" name="secret" value="${sessions.secret}"
                       placeholder="secret"/>
                       </div>
                       <div>
                <label>inativeExpiry: </label>
                <input type="text" name="inativeExpiry" value="${sessions.inativeExpiry}"
                       placeholder="inativeExpiry"/>
                       </div>
                       <div>
               <label>expiry: </label>
                <input type="text" name="expiry" value="${sessions.expiry}"
                       placeholder="expiry"/>
                       </div>
                       <div>
               <label>data: </label>
                <input type="text" name="datee" value="${sessions.datee}"
                       placeholder="date"/>
                       </div>
                       
                       <div>
                           <input type="submit" value="Guardar"/>
                       </div>
            </fieldset>
        </form>
    </body>
</html>
