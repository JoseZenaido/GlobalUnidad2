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
import utng.dao.EstadoDAOImp;
import utng.model.Estado;
import utng.dao.EstadoDAO;

/**
 *
 * @author José Zenaido Hernández Venegas josehdz3321@gmail.com
 */
public class EstadoController extends HttpServlet{
    
  
    private static final String LISTA_ESTADOS = "/listarEstados.jsp";
    private static final String AGREGAR_O_CAMBIAR = "/estados.jsp";
    private EstadoDAO dao;
    
    public EstadoController() {
        dao = new EstadoDAOImp();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_ESTADOS;
            int idEstado = Integer.parseInt(request.getParameter("idEstado"));
            dao.borrarEstado(idEstado);
            request.setAttribute("estados", dao.desplegarEstados());
        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_O_CAMBIAR;
            int idEstado = Integer.parseInt(request.getParameter("idEstado"));
            Estado estado = dao.elegirEstado(idEstado);
            request.setAttribute("estado", estado);
            
        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_O_CAMBIAR;
        } else {
            forward = LISTA_ESTADOS;
            request.setAttribute("estados", dao.desplegarEstados());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Estado estado = new Estado();
        String idEstado = request.getParameter("idEstado");
        estado.setDescripcion(request.getParameter("descripcion")); 
        estado.setNumeroHabitantes(Integer.parseInt(request.getParameter("numeroHabitantes")));
        estado.setPlatilloTipico(request.getParameter("platilloTipico"));
        estado.setTrajeTipico(request.getParameter("trajeTipico"));
        estado.setDensidadPoblacion(Float.parseFloat(request.getParameter("densidadPoblacion")));

       
        if (idEstado == null || idEstado.isEmpty()) {
            dao.agregarEstado(estado);
        } else {
            estado.setIdEstado(Integer.parseInt(idEstado));
            dao.cambiarEstado(estado);
        }
        RequestDispatcher view = request.getRequestDispatcher(LISTA_ESTADOS);
        request.setAttribute("estados", dao.desplegarEstados());
        view.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
