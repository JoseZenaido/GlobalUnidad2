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
import utng.dao.UsuarioDAO;
import utng.dao.UsuarioDAOImp;
import utng.model.Usuario;

/**
 *
 * @author Hernández Venegas José Zenaido josehdz3321@gmail.com
 */
public class UsuarioController extends HttpServlet{
    
  
    private static final String LISTA_USUARIOS = "/listarUsuarios.jsp";
    private static final String AGREGAR_O_CAMBIAR = "/usuarios.jsp";
    private UsuarioDAO dao;
    
    public UsuarioController() {
        dao = new  UsuarioDAOImp();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_USUARIOS;
            
            
            int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
            dao.borrarUsuario(idUsuario);
            request.setAttribute("usuarios", dao.desplegarUsuarios());
            
        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_O_CAMBIAR;
            int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
            Usuario usuario = dao.elegirUsuario(idUsuario);
            request.setAttribute("usuario", usuario);
            
        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_O_CAMBIAR;
        } else {
            forward = LISTA_USUARIOS;
            request.setAttribute("usuarios", dao.desplegarUsuarios());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario usuario = new Usuario();
        String idUsuario = request.getParameter("idUsuario");
        usuario.setLogin(request.getParameter("login")); 
        usuario.setPassword(request.getParameter("password"));
        usuario.setNombre(request.getParameter("nombre"));
        usuario.setEdad(request.getParameter("edad"));

        if (idUsuario == null || idUsuario.isEmpty()) {
            dao.agregarUsuario(usuario);
        } else {
            usuario.setIdUsuario(Integer.parseInt(idUsuario));
            dao.cambiarUsuario(usuario);
        }
        RequestDispatcher view = request.getRequestDispatcher(LISTA_USUARIOS);
        request.setAttribute("estados", dao.desplegarUsuarios());
        view.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
