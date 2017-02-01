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
        <title>Agregar schedule</title>
    </head>
    <body>
        <form action="ScheduleController" method="post" border="1">
            <fieldset border="1">
                <div>
                <label>id : </label>
                <input type="text" name="id" value="${schedule.id}"
                       placeholder="id"
                       readonly="readonly"/>
                </div>
                       <div>
                <label>shedulename: </label>
                <input type="text" name="sheduleName" value="${schedule.sheduleName}"
                       placeholder="sheduleName"/>
                       </div>
                       <div>       
                <label>ispublic: </label>
                <input type="text" name="isPublic" value="${schedule.isPublic}"
                       placeholder="isPublic"/>
                       </div>
                       <div>
                <label>sheduletype </label>
                <input type="text" name="sheduleType" value="${schedule.sheduleType}"
                       placeholder="sheduleType"/>
                       </div>
                       <div>
               <label>start: </label>
                <input type="text" name="start" value="${schedule.start}"
                       placeholder="start"/>
                       </div>
                       <div>
               <label>end: </label>
                <input type="text" name="endd" value="${schedule.endd}"
                       placeholder="endd"/>
                       </div>
                       <div>
               <label>hour: </label>
                <input type="text" name="hour" value="${schedule.hour}"
                       placeholder="hour"/>
                       </div>
                       <div>
               <label>min: </label>
                <input type="text" name="min" value="${schedule.min}"
                       placeholder="min"/>
                       </div>
                       <div>
               <label>everyhour: </label>
                <input type="text" name="everyHour" value="${schedule.everyHour}"
                       placeholder="everyHour"/>
                       </div>
            
                       
                       
                       
                       
                       
                       
                       <div>
                           <input type="submit" value="Guardar"/>
                       </div>
            </fieldset>
        </form>
    </body>
</html>
