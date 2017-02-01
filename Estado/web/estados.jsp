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
        <title>Agregar estados</title>
    </head>
    <body>
        <form action="EstadoController" method="post">
            <fieldset>
                <div>
                <label>id de estado: </label>
                <input type="text" name="idEstado" value="${estado.idEstado}"
                       placeholder="id Estado"
                       readonly="readonly"/>
                </div>
                       <div>
                <label>Descripcion: </label>
                <input type="text" name="descripcion" value="${estado.descripcion}"
                       placeholder="Descripcion"/>
                       </div>
                       <div>       
                <label>NumeroHabitantes: </label>
                <input type="text" name="numeroHabitantes" value="${estado.numeroHabitantes}"
                       placeholder="numeroHabitantes"/>
                       </div>
                       <div>
                <label>PlatilloTipico: </label>
                <input type="text" name="platilloTipico" value="${estado.platilloTipico}"
                       placeholder="platilloTipico"/>
                       </div>
                       <div>
                <label>TrajeTipico: </label>
                <input type="text" name="trajeTipico" value="${estado.trajeTipico}"
                       placeholder="traje Tipico"/>
                       </div>
                        <div>
                <label>Densidad Poblacion: </label>
                <input type="text" name="densidadPoblacion" value="${estado.densidadPoblacion}"
                       placeholder="densidadPoblacion"/>
                       </div>
                       <div>
                           <input type="submit" value="Guardar"/>
                       </div>
            </fieldset>
        </form>
    </body>
</html>
