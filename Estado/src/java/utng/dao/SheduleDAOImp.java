/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;


import utng.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utng.model.Schedule;
import utng.util.utilDB;

public class SheduleDAOImp implements ScheduleDAO{
    
    private Connection connection;
    
    public SheduleDAOImp(){
        connection = utilDB.getConnection();
    }

    @Override
    public void agregarSchedule(Schedule schedule) {
        try {
            String query = "INSERT INTO schedule(shedulename, ispublic, sheduletype, startt, endd, hourr, min, everyhour)" +
"	VALUES ( ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, schedule.getSheduleName());
            ps.setString(2, schedule.getIsPublic());
            ps.setString(3, schedule.getSheduleType());
            ps.setString(4, schedule.getStart());
            ps.setString(5, schedule.getEndd());
            ps.setString(6, schedule.getHour());
            ps.setString(7, schedule.getMin());
            ps.setString(8, schedule.getEveryHour());


          
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarSchedule(int id) {
          try {
            String query = "DELETE FROM schedule WHERE "
                    + " id=?;";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cambiarSchedule(Schedule schedule) {
                       try {
            String query = " UPDATE schedule\n" +
"   SET shedulename=?, ispublic=?, sheduletype=?, startt=?, hourr=?, everyhour=?,min=?, endd=?\n" +
" WHERE id=?;";

            PreparedStatement ps = connection.prepareStatement(query);
     
            ps.setString(1, schedule.getSheduleName());
            ps.setString(2, schedule.getIsPublic());
            ps.setString(3, schedule.getSheduleType());
            ps.setString(4, schedule.getStart());
            ps.setString(5, schedule.getHour());
            ps.setString(6, schedule.getEveryHour());
            ps.setString(7, schedule.getMin());

            ps.setString(8, schedule.getEndd());
            ps.setInt(9, schedule.getId());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Schedule> desplegarSchedule() {
       List<Schedule> schedules = new ArrayList<Schedule>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM schedule;");
            while (rs.next()) {
                Schedule schedule = new Schedule (rs.getInt("id"),
                        rs.getString("shedulename"),
                        rs.getString("ispublic"),
                        rs.getString("sheduletype"),
                        rs.getString("startt"),
                        rs.getString("endd"),
                        rs.getString("hourr"),
                        rs.getString("min"),
                        rs.getString("everyhour"));
                       
        
                
                schedules.add(schedule);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return schedules;
    }

    @Override
    public Schedule elegirSchedule(int id) {
        Schedule schedule=null;
        try {
            String query = " SELECT * FROM schedule WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()) {
                  schedule = new Schedule(
                        rs.getInt("id"),
                        rs.getString("shedulename"),
                        rs.getString("ispublic"),
                        rs.getString("sheduletype"),
                        rs.getString("startt"),
                        rs.getString("endd"),
                        rs.getString("hourr"),
                        rs.getString("min"),
                        rs.getString("everyhour"));
                    

             
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return schedule;
    }

    
}//END CLASS
