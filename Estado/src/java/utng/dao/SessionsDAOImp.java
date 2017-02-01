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
import utng.model.Sessions;
import utng.util.utilDB;

public class SessionsDAOImp implements SessionDAO {

    private Connection connection;
    
    public SessionsDAOImp(){
        connection = utilDB.getConnection();
    }

    @Override
    public void agregarSession(Sessions sessions) {
       try {
            String query = "INSERT INTO sessions(\n" +
"            sess_key, secret, inative_expiry, expiry, datee)\n" +
"    VALUES ( ?, ?, ?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, sessions.getSessKey());
            ps.setString(2, sessions.getSecret());
            ps.setString(3, sessions.getInativeExpiry());
            ps.setString(4, sessions.getExpiry());
            ps.setString(5, sessions.getDatee());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarSession(int sessionId) {
       try {
            String query = "DELETE FROM sessions WHERE "
                    + " session_id=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, sessionId);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cambiarSession(Sessions sessions) {
        try {
            String query = "UPDATE sessions\n" +
"   SET  sess_key=?, secret=?, inative_expiry=?, expiry=?, \n" +
"       datee=?\n" +
" WHERE session_id=?;";
                    

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, sessions.getSessKey());
            ps.setString(2, sessions.getSecret());
            ps.setString(3, sessions.getInativeExpiry());
            ps.setString(4, sessions.getExpiry());
            ps.setString(5, sessions.getDatee());
            ps.setInt(6, sessions.getSessionId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Sessions> desplegarSessiony() {
         List<Sessions> sessionses = new ArrayList<Sessions>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM sessions;");
            while (rs.next()) {
                Sessions sessions = new Sessions (rs.getInt("session_id"),
                        rs.getString("sess_key"),
                        rs.getString("secret"),
                        rs.getString("inative_expiry"),
                        rs.getString("expiry"),
                        rs.getString("datee"));

                sessionses.add(sessions);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sessionses;
    }

    @Override
    public Sessions elegirSession(int sessionId) {
       Sessions sessions=null;
        try {
            String query = " SELECT * FROM sessions WHERE session_id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, sessionId);
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()) {
                  sessions = new Sessions(
                        rs.getInt("session_id"),
                        rs.getString("sess_key"),
                        rs.getString("secret"),
                        rs.getString("inative_expiry"),
                        rs.getString("expiry"),
                        rs.getString("datee"));
             
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sessions;
    }
 

  
}
