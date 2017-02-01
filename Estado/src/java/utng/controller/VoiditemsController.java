/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utng.dao.VoiditemsDAO;
import utng.dao.VoiditemsDAOImp;
import utng.model.Voiditems;



public class VoiditemsController extends HttpServlet{
    
  
    private static final String LISTA_VOIDITEM= "/listarVoiditems.jsp";
    private static final String AGREGAR_O_CAMBIAR = "/voiditems.jsp";
    private VoiditemsDAO dao;
    
    public VoiditemsController() {
        dao = new VoiditemsDAOImp();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_VOIDITEM;
            int id = Integer.parseInt(request.getParameter("id"));
            dao.borrarVoiditems(id);
            request.setAttribute("voiditemss", dao.desplegarVoiditems());
        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_O_CAMBIAR;
            int id = Integer.parseInt(request.getParameter("id"));
            Voiditems voiditems = dao.elegirVoiditems(id);
            request.setAttribute("voiditems", voiditems);
            
        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_O_CAMBIAR;
        } else {
            forward = LISTA_VOIDITEM;
            request.setAttribute("voiditemss", dao.desplegarVoiditems());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Voiditems voiditems = new Voiditems();
        String id = request.getParameter("id");
        voiditems.setIdBillSale(request.getParameter("idBillSale"));
        voiditems.setIdItem(request.getParameter("idItem"));
        voiditems.setPrice(request.getParameter("price"));
        voiditems.setQuanity(request.getParameter("quanity"));
        voiditems.setDiscount(request.getParameter("discount"));
        voiditems.setTotalAmount(request.getParameter("totalAmount"));
        voiditems.setPaymentAmount(request.getParameter("paymentAmount"));
        voiditems.setRemainAmount(request.getParameter("remainAmount"));
     
       
        if (id == null || id.isEmpty()) {
            dao.agregarVoiditems(voiditems);
        } else {
            voiditems.setId(Integer.parseInt(id));
            dao.cambiarVoiditems(voiditems);
        }
        RequestDispatcher view = request.getRequestDispatcher(LISTA_VOIDITEM);
        request.setAttribute("voiditemss", dao.desplegarVoiditems());
        view.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
