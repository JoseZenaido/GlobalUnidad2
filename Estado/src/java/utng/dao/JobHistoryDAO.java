/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;

import java.util.List;
import utng.model.JobHistory;

/**
 *
 * @author ZENAIDO-PC
 */
public interface JobHistoryDAO {
    void agregarJobHistory(JobHistory jobHistory);
    void borrarJobHistory(int historyId);
    void cambiarJobHistory(JobHistory jobHistory);
    List<JobHistory> desplegarJobHistory();
    JobHistory elegirJobHistory(int historyId);
}
