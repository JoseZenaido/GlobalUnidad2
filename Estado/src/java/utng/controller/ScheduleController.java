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
import utng.dao.*;
import utng.dao.ScheduleDAO;
import utng.model.JobHistory;
import utng.model.Schedule;


public class ScheduleController extends HttpServlet {
    
     
    private static final String LISTA_schedule = "/listarSchedule.jsp";
    private static final String AGREGAR_O_CAMBIAR = "/schedules.jsp";
    private ScheduleDAO dao;
    
    public ScheduleController() {
        dao = new  SheduleDAOImp();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_schedule;
            
            
            int id = Integer.parseInt(request.getParameter("id"));
            dao.borrarSchedule(id);
            request.setAttribute("schedules", dao.desplegarSchedule());
            
        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_O_CAMBIAR;
            int id = Integer.parseInt(request.getParameter("id"));
            Schedule schedule = dao.elegirSchedule(id);
            request.setAttribute("schedule", schedule);
            
        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_O_CAMBIAR;
        } else {
            forward = LISTA_schedule;
            request.setAttribute("schedules", dao.desplegarSchedule());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Schedule schedule = new Schedule();
        String id = request.getParameter("id");
        schedule.setSheduleName(request.getParameter("sheduleName")); 
        schedule.setIsPublic(request.getParameter("isPublic"));
        schedule.setSheduleType(request.getParameter("sheduleType"));
        schedule.setStart(request.getParameter("start"));
        schedule.setEnd(request.getParameter("endd"));
        schedule.setHour(request.getParameter("hour"));
        schedule.setMin(request.getParameter("min"));
        schedule.setEveryHour(request.getParameter("everyHour"));
        
        
        if (id == null || id.isEmpty()) {
            dao.agregarSchedule(schedule);
        } else {
            schedule.setId(Integer.parseInt(id));
            dao.cambiarSchedule(schedule);
        }
        RequestDispatcher view = request.getRequestDispatcher(LISTA_schedule);
        request.setAttribute("schedules", dao.desplegarSchedule());
        view.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

    
}
