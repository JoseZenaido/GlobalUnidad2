/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;

import java.util.List;
import utng.model.Schedule;




public interface ScheduleDAO {
    void agregarSchedule(Schedule schedule);
    void borrarSchedule(int id);
    void cambiarSchedule(Schedule schedule);
    List<Schedule> desplegarSchedule();
    Schedule elegirSchedule(int id);
 }
