<%-- 
    Document   : 
    Created on : 23-sep-2016, 18:45:15
    Author     : @author José Zenaido Hernández Venegas josehdz3321@gmail.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar jobHistory</title>
    </head>
    <body>
        <form action="JobHistoryController" method="post" border="1">
            <fieldset border="1">
                <div>
                <label> historyId:</label>
                <input type="text" name="historyId" value="${jobHistory.historyId}"
                       placeholder="historyId"
                       readonly="readonly"/>
                </div>
                       <div>
                <label>jobId: </label>
                <input type="text" name="jobId" value="${jobHistory.jobId}"
                       placeholder="jobId"/>
                       </div>
                       <div>       
                <label>startTime: </label>
                <input type="text" name="startTime" value="${jobHistory.startTime}"
                       placeholder="startTime"/>
                       </div>
                       <div>
                <label>endTime: </label>
                <input type="text" name="endTime" value="${jobHistory.endTime}"
                       placeholder="endTime"/>
                       </div>
                       <div>
               <label>status: </label>
                <input type="text" name="status" value="${jobHistory.status}"
                       placeholder="status"/>
                       </div>
                       <div>
               <label>returnText: </label>
                <input type="text" name="returnText" value="${jobHistory.returnText}"
                       placeholder="returnText"/>
                       </div>
                       
                       <div>
                           <input type="submit" value="Guardar"/>
                       </div>
            </fieldset>
        </form>
    </body>
</html>
