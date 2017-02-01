/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.model;


public class Schedule {
    
    private int id;
    private String sheduleName;
    private String isPublic;
    private String sheduleType;
    private String start;
    private String endd;
    private String hour;
    private String min;
    private String everyHour;
   
    
    public Schedule(int id,String sheduleName, String isPublic,String sheduleType,
           String start,String endd,String hour,String min,String everyHour  ){
        
        this.id=id;
        this.sheduleName=sheduleName;
        this.isPublic=isPublic;
        this.sheduleType=sheduleType;
        this.start=start;
        this.endd=endd;
        this.hour=hour;
        this.min=min;
        this.everyHour=everyHour;
        
        
    }
    
    public Schedule(){
        this(0,"","","","","","","","");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSheduleName() {
        return sheduleName;
    }

    public void setSheduleName(String sheduleName) {
        this.sheduleName = sheduleName;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    public String getSheduleType() {
        return sheduleType;
    }

    public void setSheduleType(String sheduleType) {
        this.sheduleType = sheduleType;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEndd() {
        return endd;
    }

    public void setEnd(String endd) {
        this.endd = endd;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getEveryHour() {
        return everyHour;
    }

    public void setEveryHour(String everyHour) {
        this.everyHour = everyHour;
    }

    @Override
    public String toString() {
        return "Schedule{" + "id=" + id + ", sheduleName=" + sheduleName + ", isPublic=" + isPublic + ", sheduleType=" + sheduleType + ", start=" + start + ", endd=" + endd + ", hour=" + hour + ", min=" + min + ", everyHour=" + everyHour + '}';
    }

  

  
}
