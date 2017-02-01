/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;

import java.util.List;
import utng.model.WsKeys;

/**
 *
 * @author 
 */
public interface WsKeysDAO {
     void agregarWsKeys(WsKeys wsKeys);
    void borrarWsKeys(int id);
    void cambiarWsKeys(WsKeys wsKeys);
    List<WsKeys> desplegarWsKeys();
    WsKeys elegirWsKeys(int id);
}
