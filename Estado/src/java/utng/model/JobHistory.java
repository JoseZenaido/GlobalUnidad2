/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.model;

/**
 *
 * @author ZENAIDO-PC
 */
public class JobHistory {
    private int historyId;
    private String jobId;
    private String startTime;
    private String endTime;
    private String status;
    private String returnText;
    
    
    public JobHistory(int historyId,String jobId,String startTime,String endTime,String status,String returnText ){
        this.historyId=historyId;
        this.jobId=jobId;
        this.startTime=startTime;
        this.endTime=endTime;
        this.status=status;
        this.returnText=returnText;
    }
    public JobHistory(){
        this(0,"","","","","");
    }

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReturnText() {
        return returnText;
    }

    public void setReturnText(String returnText) {
        this.returnText = returnText;
    }

    @Override
    public String toString() {
        return "JobHistory{" + "historyId=" + historyId + ", jobId=" + jobId + ", startTime=" + startTime + ", endTime=" + endTime + ", status=" + status + ", returnText=" + returnText + '}';
    }
    
    
    
}
