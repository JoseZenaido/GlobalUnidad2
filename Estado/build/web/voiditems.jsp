
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar voiditems</title>
    </head>
    <body>
        <form action="VoiditemsController" method="post" border="1">
            <fieldset border="1">
                <div>
                <label> Id:</label>
                <input type="text" name="id" value="${voiditems.id}"
                       placeholder="id"
                       readonly="readonly"/>
                </div>
                       <div>
                <label>idBillSale: </label>
                <input type="text" name="idBillSale" value="${voiditems.idBillSale}"
                       placeholder="idBillSale"/>
                       </div>
                       <div>       
                <label>idItem: </label>
                <input type="text" name="idItem" value="${voiditems.idItem}"
                       placeholder="idItem"/>
                       </div>
                       <div>
                <label>price: </label>
                <input type="text" name="price" value="${voiditems.price}"
                       placeholder="price"/>
                       </div>
                       <div>
               <label>quanity: </label>
                <input type="text" name="quanity" value="${voiditems.quanity}"
                       placeholder="quanity"/>
                       </div>
                       <div>
               <label>discount: </label>
                <input type="text" name="discount" value="${voiditems.discount}"
                       placeholder="discount"/>
                       </div>
                       <div>
               <label>totalAmount: </label>
                <input type="text" name="totalAmount" value="${voiditems.totalAmount}"
                       placeholder="totalAmount"/>
                       </div>
                       <div>
               <label>paymentAmount: </label>
                <input type="text" name="paymentAmount" value="${voiditems.paymentAmount}"
                       placeholder="paymentAmount"/>
                       </div>
                       <div>
               <label>remainAmount: </label>
                <input type="text" name="remainAmount" value="${voiditems.remainAmount}"
                       placeholder="remainAmount"/>
                       </div>
                       
                       <div>
                           <input type="submit" value="Guardar"/>
                       </div>
            </fieldset>
        </form>
    </body>
</html>
