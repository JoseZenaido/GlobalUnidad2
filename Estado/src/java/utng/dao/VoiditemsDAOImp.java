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
import utng.model.Voiditems;
import utng.util.utilDB;

/**
 *
 * @author ZENAIDO-PC
 */
public class VoiditemsDAOImp implements VoiditemsDAO  {
    
    private Connection connection;
    
    public VoiditemsDAOImp() {
        connection = utilDB.getConnection();
    }
    
    
    @Override
    public void agregarVoiditems(Voiditems voiditems) {
       try {
            String query = "INSERT INTO voiditems( idbillsale, iditem, price, quanity, discount, totalamount, \n" +
"            paymentamount, remainamount)\n" +
"    VALUES ( ?, ?, ?, ?, ?, ?, \n" +
"            ?, ?);";
                    
                    
               
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, voiditems.getIdBillSale());
            ps.setString(2, voiditems.getIdItem());
            ps.setString(3, voiditems.getPrice());
            ps.setString(4, voiditems.getQuanity());
            ps.setString(5, voiditems.getDiscount());
            ps.setString(6, voiditems.getTotalAmount());
            ps.setString(7, voiditems.getPaymentAmount());
            ps.setString(8, voiditems.getRemainAmount());
    
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarVoiditems(int id) {
                     try {
            String query = "DELETE FROM voiditems WHERE "
                    + " id=?;";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cambiarVoiditems(Voiditems voiditems) {
         try {
            String query =   "UPDATE voiditems\n" +
"   SET idbillsale=?, iditem=?, price=?, quanity=?, discount=?, \n" +
"       totalamount=?, paymentamount=?, remainamount=?\n" +
" WHERE id=?;";
            
            PreparedStatement ps = connection.prepareStatement(query);
     
            ps.setString(1, voiditems.getIdBillSale());
            ps.setString(2, voiditems.getIdItem());
            ps.setString(3, voiditems.getPrice());
            ps.setString(4, voiditems.getQuanity());
            ps.setString(5, voiditems.getDiscount());
            ps.setString(6, voiditems.getTotalAmount());
            ps.setString(7, voiditems.getPaymentAmount());
            ps.setString(8, voiditems.getRemainAmount());
            ps.setInt(9, voiditems.getId());
         
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Voiditems> desplegarVoiditems() {
       List<Voiditems> voiditemses = new ArrayList<Voiditems>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM voiditems");
            while (rs.next()) {
                Voiditems voiditems = new Voiditems (rs.getInt("id"),

                        rs.getString("idbillsale"),
                        rs.getString("iditem"),
                        rs.getString("price"),
                        rs.getString("quanity"),
                        rs.getString("discount"),
                        rs.getString("totalamount"),
                        rs.getString("remainamount"),
                       rs.getString("paymentamount"));
        
                voiditemses.add(voiditems);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return voiditemses;
    }

    @Override
    public Voiditems elegirVoiditems(int id) {
        Voiditems voiditems=null;
        try {
            String query = " SELECT * FROM voiditems WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()) {
                  voiditems = new Voiditems(
                        rs.getInt("id"),
                        rs.getString("idbillsale"),
                        rs.getString("iditem"),
                        rs.getString("price"),
                        rs.getString("quanity"),
                        rs.getString("discount"),
                        rs.getString("totalamount"),
                        rs.getString("paymentamount"),
                        rs.getString("remainamount"));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return voiditems;
    }
 

    
}
