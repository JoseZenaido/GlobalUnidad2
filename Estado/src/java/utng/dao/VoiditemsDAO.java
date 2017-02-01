/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;

import java.util.List;
import utng.model.Voiditems;

/**
 *
 * @author 
 */
public interface VoiditemsDAO {
    void agregarVoiditems(Voiditems voiditems);
    void borrarVoiditems(int id);
    void cambiarVoiditems(Voiditems voiditems);
    List<Voiditems> desplegarVoiditems();
    Voiditems elegirVoiditems(int id);
}
