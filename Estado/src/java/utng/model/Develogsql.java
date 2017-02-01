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
public class Develogsql {
    
     private int id;
    private String createe;
    private String  sql0;
    private String sql1;
    private String  params;
    private String  tracer;
    private String timer;
    
    
    
    public Develogsql(int id,
            String createe, 
            String sql0,String sql1,String params,String tracer,String timer){
        this.id=id;
        this.createe=createe;
        this.sql0=sql0;
        this.sql1=sql1;
        this.params=params;
        this.tracer=tracer;
        this.timer=timer;
                
        
    }
    
    public Develogsql(){
        this(0,"","","","","","");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatee() {
        return createe;
    }

    public void setCreatee(String createe) {
        this.createe = createe;
    }

    public String getSql0() {
        return sql0;
    }

    public void setSql0(String sql0) {
        this.sql0 = sql0;
    }

    public String getSql1() {
        return sql1;
    }

    public void setSql1(String sql1) {
        this.sql1 = sql1;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getTracer() {
        return tracer;
    }

    public void setTracer(String tracer) {
        this.tracer = tracer;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    @Override
    public String toString() {
        return "Develogsql{" + "id=" + id + ", createe=" + createe + ", sql0=" + sql0 + ", sql1=" + sql1 + ", params=" + params + ", tracer=" + tracer + ", timer=" + timer + '}';
    }
    
    
    
}
