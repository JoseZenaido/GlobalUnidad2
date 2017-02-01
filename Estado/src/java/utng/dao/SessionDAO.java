/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;

import java.util.List;
import utng.model.JobHistory;
import utng.model.Sessions;

/**
 *
 * @author
 */
public interface SessionDAO {
    void agregarSession(Sessions sessions);
    void borrarSession(int sessionId);
    void cambiarSession(Sessions sessions);
    List<Sessions> desplegarSessiony();
    Sessions elegirSession(int sessionId);
}
