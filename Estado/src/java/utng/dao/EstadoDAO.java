/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;

import java.util.List;
import utng.model.Estado;

/**
 *
 * @author José Zenaido Hernández Venegas josehdz3321@gmail.com
 */
public interface EstadoDAO {
    void agregarEstado(Estado estado);
    void borrarEstado(int idEstado);
    void cambiarEstado(Estado estado);
    List<Estado> desplegarEstados();
    Estado elegirEstado(int idEstado);
 }
