/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.model;

/**
 *
 *  @author José Zenaido Hernández Venegas josehdz3321@gmail.com
 */
public class Usuario {
    private int idUsuario;
    private String login;
    private String password;
    private String nombre;
    private String edad;

    
    
    public Usuario(int idUsuario,String login, String password, String nombre,String edad){
        this.idUsuario=idUsuario;
        this.login=login;
        this.password=password;
        this.nombre=nombre;
        this.edad=edad;
        
    }
    public Usuario (){
        this(0,"","","","");
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", login=" + login + ", password=" + password + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

   
    
}//END CLASS
