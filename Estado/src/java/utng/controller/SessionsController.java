/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utng.dao.JobHistoryDAO;
import utng.dao.JobHistoryDAOImp;
import utng.dao.SessionDAO;
import utng.dao.SessionsDAOImp;
import utng.model.JobHistory;
import utng.model.Sessions;

/**
 *
 * @author 
 */
public class SessionsController extends HttpServlet {
    
     
    private static final String LISTA_sessions = "/listarSessions.jsp";
    private static final String AGREGAR_O_CAMBIAR = "/sessions.jsp";
    private SessionDAO dao;
    
    public SessionsController() {
        dao = new  SessionsDAOImp();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_sessions;
            
            
            int sessionId = Integer.parseInt(request.getParameter("sessionId"));
            dao.borrarSession(sessionId);
            request.setAttribute("sessionss", dao.desplegarSessiony());
            
            
            
        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_O_CAMBIAR;
            int sessionId = Integer.parseInt(request.getParameter("sessionId"));
            Sessions sessions = dao.elegirSession(sessionId);
            request.setAttribute("sessions", sessions);
            
        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_O_CAMBIAR;
        } else {
            forward = LISTA_sessions;
            request.setAttribute("sessionss", dao.desplegarSessiony());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Sessions sessions = new Sessions();
        String sessionId = request.getParameter("sessionId");
        sessions.setSessKey(request.getParameter("sessKey")); 
        sessions.setSecret(request.getParameter("secret"));
        sessions.setInativeExpiry(request.getParameter("inativeExpiry"));
        sessions.setExpiry(request.getParameter("expiry"));
        sessions.setDatee(request.getParameter("datee"));
        
        if (sessionId == null || sessionId.isEmpty()) {
            dao.agregarSession(sessions);
        } else {
            sessions.setSessionId(Integer.parseInt(sessionId));
            dao.cambiarSession(sessions);
        }
        RequestDispatcher view = request.getRequestDispatcher(LISTA_sessions);
        request.setAttribute("sessionss", dao.desplegarSessiony());
        view.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

    
}
