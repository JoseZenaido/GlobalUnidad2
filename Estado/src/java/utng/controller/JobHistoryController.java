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
import utng.model.JobHistory;

/**
 *
 * @author ZENAIDO-PC
 */
public class JobHistoryController extends HttpServlet {
    
     
    private static final String LISTA_JobHistory = "/listarJobHistory.jsp";
    private static final String AGREGAR_O_CAMBIAR = "/jobHistorys.jsp";
    private JobHistoryDAO dao;
    
    public JobHistoryController() {
        dao = new  JobHistoryDAOImp();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String forward = "";
        String action = request.getParameter("action");
        
        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_JobHistory;
            
            
            int historyId = Integer.parseInt(request.getParameter("historyId"));
            dao.borrarJobHistory(historyId);
            request.setAttribute("jobHistorys", dao.desplegarJobHistory());
            
        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_O_CAMBIAR;
            int historyId = Integer.parseInt(request.getParameter("historyId"));
            JobHistory jobHistory = dao.elegirJobHistory(historyId);
            request.setAttribute("jobHistory", jobHistory);
            
        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_O_CAMBIAR;
        } else {
            forward = LISTA_JobHistory;
            request.setAttribute("jobHistorys", dao.desplegarJobHistory());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        JobHistory jobHistory = new JobHistory();
        String historyId = request.getParameter("historyId");
        jobHistory.setJobId(request.getParameter("jobId")); 
        jobHistory.setStartTime(request.getParameter("startTime"));
        jobHistory.setEndTime(request.getParameter("endTime"));
        jobHistory.setStatus(request.getParameter("status"));
        jobHistory.setReturnText(request.getParameter("returnText"));
        
        if (historyId == null || historyId.isEmpty()) {
            dao.agregarJobHistory(jobHistory);
        } else {
            jobHistory.setHistoryId(Integer.parseInt(historyId));
            dao.cambiarJobHistory(jobHistory);
        }
        RequestDispatcher view = request.getRequestDispatcher(LISTA_JobHistory);
        request.setAttribute("jobHistorys", dao.desplegarJobHistory());
        view.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

    
}
