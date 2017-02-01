/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.model;

/**
 *
 * @author José Zenaido Hernández Venegas josehdz3321@gmail.com
 */
public class Estado {
    
    private int idEstado;
    private String descripcion;
    private int numeroHabitantes;
    private String platilloTipico;
    private String trajeTipico;
    private float densidadPoblacion;

    public Estado(int idEstado, String descripcion, int numeroHabitantes, String platilloTipico, String trajeTipico, float densidadPoblacion) {
        this.idEstado = idEstado;
        this.descripcion = descripcion;
        this.numeroHabitantes = numeroHabitantes;
        this.platilloTipico = platilloTipico;
        this.trajeTipico = trajeTipico;
        this.densidadPoblacion = densidadPoblacion;
    }

   
    
    
    public Estado(){
        this(0,"",0,"","",0);
    }

   

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getPlatilloTipico() {
        return platilloTipico;
    }

    public void setPlatilloTipico(String platilloTipico) {
        this.platilloTipico = platilloTipico;
    }

    public String getTrajeTipico() {
        return trajeTipico;
    }

    public void setTrajeTipico(String trajeTipico) {
        this.trajeTipico = trajeTipico;
    }

    public float getDensidadPoblacion() {
        return densidadPoblacion;
    }

    public void setDensidadPoblacion(float densidadPoblacion) {
        this.densidadPoblacion = densidadPoblacion;
    }

    @Override
    public String toString() {
        return "Estado{" + "idEstado=" + idEstado + ", descripcion=" + descripcion + ", numeroHabitantes=" + numeroHabitantes + ", platilloTipico=" + platilloTipico + ", trajeTipico=" + trajeTipico + ", densidadPoblacion=" + densidadPoblacion + '}';
    }

    
    
    
}
