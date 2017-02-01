

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar voiditems</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>idbillsale</th>
                    <th>iditem</th>
                    <th>price</th>
                    <th>quanity</th>
                    <th>discount</th>
                    <th>totalamount</th>
                    <th>paymentamount</th>
                    <th>remainamount</th>
            
                </tr>
            </thead>
            <tbody>
                <c:forEach var="voiditems" items="${voiditemss}">
                    <tr>
                        <td>${voiditems.id}</td>
                        <td>${voiditems.idBillSale}</td>
                        <td>${voiditems.idItem}</td>
                        <td>${voiditems.price}</td>
                        <td>${voiditems.quanity}</td>
                        <td>${voiditems.discount}</td>
                        <td>${voiditems.totalAmount}</td>
                        <td>${voiditems.paymentAmount}</td>
                        <td>${voiditems.remainAmount}</td>
                        <td><a href="VoiditemsController?action=cambiar&id=${voiditems.id}">Cambiar</a></td>
                        <td><a href="VoiditemsController?action=borrar&id=${voiditems.id}">Borrar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="VoiditemsController?action=agregar">Nuevo Voiditems</a>
        </p>
    </body>
</html>

