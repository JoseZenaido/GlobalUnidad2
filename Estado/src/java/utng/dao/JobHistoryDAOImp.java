/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utng.model.JobHistory;
import utng.util.utilDB;

public class JobHistoryDAOImp implements JobHistoryDAO {

    private Connection connection;
    
    public JobHistoryDAOImp(){
        connection = utilDB.getConnection();
    }

    @Override
    public void agregarJobHistory(JobHistory jobHistory) {
       try {
            String query = "INSERT INTO jobHistory(jobid, startime, endtime, status, returntext)" +
"	VALUES ( ?, ?, ?, ?,?);";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, jobHistory.getJobId());
            ps.setString(2, jobHistory.getStartTime());
            ps.setString(3, jobHistory.getEndTime());
            ps.setString(4, jobHistory.getStatus());
            ps.setString(5, jobHistory.getReturnText());

          
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarJobHistory(int historyId) {
               try {
            String query = "DELETE FROM jobHistory WHERE "
                    + " history_id=?;";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, historyId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cambiarJobHistory(JobHistory jobHistory) {
                try {
            String query = " UPDATE jobhistory\n" +
"   SET jobid=?, startime=?, endtime=?, returntext=?,status=?\n" +
" WHERE history_id=?;";

            PreparedStatement ps = connection.prepareStatement(query);
     
            ps.setString(1, jobHistory.getJobId());
            ps.setString(2, jobHistory.getStartTime());
            ps.setString(3, jobHistory.getEndTime());
            ps.setString(4, jobHistory.getStatus());
            ps.setString(5, jobHistory.getReturnText());
            ps.setInt(6, jobHistory.getHistoryId());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<JobHistory> desplegarJobHistory() {
        List<JobHistory> jobHistorys = new ArrayList<JobHistory>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM jobhistory");
            while (rs.next()) {
                JobHistory jobHistory = new JobHistory (rs.getInt("history_id"),
                        rs.getString("jobid"),
                        rs.getString("startime"),
                        rs.getString("endtime"),
                        rs.getString("status"),
                       rs.getString("returntext"));
        
                
                jobHistorys.add(jobHistory);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jobHistorys;
    }

    @Override
    public JobHistory elegirJobHistory(int historyId) {
       JobHistory jobHistory=null;
        try {
            String query = " SELECT * FROM jobhistory WHERE history_id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, historyId);
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()) {
                  jobHistory = new JobHistory(
                        rs.getInt("history_id"),
                        rs.getString("jobid"),
                        rs.getString("startime"),
                        rs.getString("endtime"),
                          rs.getString("status"),
                        rs.getString("returntext"));
           
             
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jobHistory;
       
    }
    
}
