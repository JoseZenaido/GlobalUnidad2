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
import utng.util.utilDB;

/**
 *
 * @author Hernández Venegas José Zenaido josehdz3321@gmail.com
 */
public class UsuarioDAOImp implements UsuarioDAO{
    
    private Connection connection;
    
    public UsuarioDAOImp(){
        connection = utilDB.getConnection();
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
       try {
            String query = "INSERT INTO usuario(login, password, nombre, edad)" +
"	VALUES ( ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getEdad());
          
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarUsuario(int idUsuario) {
        try {
            String query = "DELETE FROM usuario WHERE "
                    + " id_usuario=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, idUsuario);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }

    @Override
    public void cambiarUsuario(Usuario usuario) {
        try {
            String query = " UPDATE usuario\n" +
"   SET login=?, password=?, nombre=?, edad=?\n" +
" WHERE id_usuario=?;";

            PreparedStatement ps = connection.prepareStatement(query);
     
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getEdad());
            ps.setInt(5, usuario.getIdUsuario());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public List<Usuario> desplegarUsuarios() {
         List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM usuario");
            while (rs.next()) {
                Usuario usuario = new Usuario (rs.getInt("id_usuario"),
                        rs.getString("login"),
                        rs.getString("password"),
                        rs.getString("nombre"),
                       rs.getString("edad"));
        
                usuarios.add(usuario);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
       
    }

    @Override
    public Usuario elegirUsuario(int idUsuario) {
       Usuario usuario=null;
        try {
            String query = " SELECT * FROM usuario WHERE id_usuario=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idUsuario);
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()) {
                  usuario = new Usuario(
                        rs.getInt("id_usuario"),
                        rs.getString("login"),
                        rs.getString("password"),
                        rs.getString("nombre"),
                        rs.getString("edad"));
           
             
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
       
    }
    
}//END CLASS
