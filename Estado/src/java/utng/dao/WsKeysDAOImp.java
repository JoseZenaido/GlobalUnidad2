/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// */
//package utng.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import utng.model.WsKeys;
//import utng.util.utilDB;
//
///**
// *
// * @author
// */
//public class WsKeysDAOImp implements WsKeysDAO {
//    private Connection connection;
//    
//    public WsKeysDAOImp() {
//        connection = utilDB.getConnection();
//    }
//    
//    @Override
//    public void agregarWsKeys(WsKeys wsKeys) {
//        try {
//            String query = "INSERT INTO wskeys( puuid, domains, apikey, passwordd, secret)\n" +
//"    VALUES ( ?, ?, ?, ?, ?);";
//            PreparedStatement ps = connection.prepareStatement(query);
//            ps.setString(1, wsKeys.getPuuId());
//            ps.setString(2, wsKeys.getDomains());
//            ps.setString(3, wsKeys.getApiKey());
//            ps.setString(4, wsKeys.getPasswordd());
//            ps.setString(5, wsKeys.getSecret());
//
//            ps.executeUpdate();
//            ps.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void borrarWsKeys(int id) {
//     
//        try {
//            String query = "DELETE FROM wskeys WHERE "
//                    + " id=?";
//            PreparedStatement ps = connection.prepareStatement(query);
//            ps.setInt(1, id);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        
//    }
//
//    @Override
//    public void cambiarWsKeys(WsKeys wsKeys) {
//       try {
//            String query = "UPDATE wskeys\n" +
//"   SET puuid=?, domains=?, apikey=?, passwordd=?, secret=?\n" +
//" WHERE id=?;";
//  
//            PreparedStatement ps = connection.prepareStatement(query);
//            ps.setString(1, wsKeys.getPuuId());
//            ps.setString(2, wsKeys.getDomains());
//            ps.setString(3, wsKeys.getApiKey());
//            ps.setString(4, wsKeys.getPasswordd());
//            ps.setString(5, wsKeys.getSecret());
//            ps.setInt(6, wsKeys.getId());
//
//            ps.executeUpdate();
//            ps.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public List<WsKeys> desplegarWsKeys() {
//         List<WsKeys> keyses = new ArrayList<WsKeys>();
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM wskeys;");
//            while (rs.next()) {
//                WsKeys keys = new WsKeys (rs.getInt("id"),
//                        rs.getString("puuId"),
//                        rs.getString("domains"),
//                        rs.getString("apiKey"),
//                        rs.getString("passwordd"),
//                        rs.getString("secret"));
//                  
//                keyses.add(keys);
//            }
//            rs.close();
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return keyses;
//    }
//
//    @Override
//    public WsKeys elegirWsKeys(int id) {
//        WsKeys estado=null;
//        try {
//            String query = " SELECT * FROM estado WHERE id_estado=?";
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setInt(1, id);
//            ResultSet rs = statement.executeQuery();
//            
//            if (rs.next()) {
//                  estado = new WsKeys(
//                        rs.getInt("id_estado"),
//                        rs.getString("descripcion"),
//                        rs.getInt("numeroHabitantes"),
//                        rs.getString("platilloTipico"),
//                        rs.getString("trajeTipico"),
//                        rs.getFloat("densidadPoblacion"));
//             
//            }
//            rs.close();
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return estado;
//    }
// 
//    }
//    
//}
