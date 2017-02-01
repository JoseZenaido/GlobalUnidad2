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
import utng.model.Estado;

import utng.util.utilDB;

/**
 *
 * @author José Zenaido Hernández Venegas josehdz3321@gmail.com
*/
public class EstadoDAOImp implements EstadoDAO {
    
   
    private Connection connection;
    
    public EstadoDAOImp() {
        connection = utilDB.getConnection();
    }
    
    @Override
    public void agregarEstado(Estado estado) {
        try {
            String query = "INSERT INTO estado(\n" +
"	 descripcion, \"numeroHabitantes\", \"platilloTipico\", \"trajeTipico\", \"densidadPoblacion\")\n" +
"	VALUES ( ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, estado.getDescripcion());
            ps.setInt(2, estado.getNumeroHabitantes());
            ps.setString(3, estado.getPlatilloTipico());
            ps.setString(4, estado.getTrajeTipico());
            ps.setFloat(5, estado.getDensidadPoblacion());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void borrarEstado(int idEstado) {
        try {
            String query = "DELETE FROM estado WHERE "
                    + " id_estado=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, idEstado);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    @Override
    public void cambiarEstado(Estado estado) {
        try {
            String query = "UPDATE estado SET descripcion=?, \"numeroHabitantes\"=?, \"platilloTipico\"=?, \"trajeTipico\"=?, \"densidadPoblacion\"=?\n" +
"	WHERE id_estado=?";
  
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, estado.getDescripcion());
            ps.setInt(2, estado.getNumeroHabitantes());
            ps.setString(3, estado.getPlatilloTipico());
            ps.setString(4, estado.getTrajeTipico());
            ps.setFloat(5, estado.getDensidadPoblacion());
            ps.setInt(6, estado.getIdEstado());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Estado> desplegarEstados() {
        List<Estado> estados = new ArrayList<Estado>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM estado");
            while (rs.next()) {
                Estado estado = new Estado (rs.getInt("id_estado"),
                        rs.getString("descripcion"),
                        rs.getInt("numeroHabitantes"),
                        rs.getString("platilloTipico"),
                        rs.getString("trajeTipico"),
                        rs.getFloat("densidadPoblacion"));
                estados.add(estado);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estados;
    }
    
    @Override
    public Estado elegirEstado(int idEstado) {
        Estado estado=null;
        try {
            String query = " SELECT * FROM estado WHERE id_estado=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idEstado);
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()) {
                  estado = new Estado(
                        rs.getInt("id_estado"),
                        rs.getString("descripcion"),
                        rs.getInt("numeroHabitantes"),
                        rs.getString("platilloTipico"),
                        rs.getString("trajeTipico"),
                        rs.getFloat("densidadPoblacion"));
             
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estado;
    }
 
}
