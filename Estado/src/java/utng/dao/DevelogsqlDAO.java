/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;

import java.util.List;
import utng.model.Develogsql;
import utng.model.JobHistory;

/**
 *
 * @author ZENAIDO-PC
 */
public interface DevelogsqlDAO {
    void agregarDevelogsql( Develogsql develogsql);
    void borrarDevelogsql(int id);
    void cambiarDevelogsql( Develogsql develogsql);
    List< Develogsql> desplegarDevelogsql();
     Develogsql elegirDevelogsql(int id);
}
