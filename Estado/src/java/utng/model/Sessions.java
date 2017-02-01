/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.model;

/**
 *
 * @author 
 */
public class Sessions {
    private int sessionId;
    private String sessKey;
    private String secret;
    private String inativeExpiry;
    private String expiry;
    private String datee;
    
    
    public Sessions(int sessionId, String sessKey,String  secret,String inativeExpiry,String expiry,String datee  ){
        this.sessionId=sessionId;
        this.sessKey=sessKey;
        this.secret=secret;
        this.inativeExpiry=inativeExpiry;
        this.expiry=expiry;
        this.datee=datee;
    }
    public Sessions(){
        this(0,"","","","","");
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessKey() {
        return sessKey;
    }

    public void setSessKey(String sessKey) {
        this.sessKey = sessKey;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getInativeExpiry() {
        return inativeExpiry;
    }

    public void setInativeExpiry(String inativeExpiry) {
        this.inativeExpiry = inativeExpiry;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getDatee() {
        return datee;
    }

    public void setDatee(String datee) {
        this.datee = datee;
    }

    @Override
    public String toString() {
        return "Sessions{" + "sessiond=" + sessionId + ", sessKey=" + sessKey + ", secret=" + secret + ", inativeExpiry=" + inativeExpiry + ", expiry=" + expiry + ", datee=" + datee + '}';
    }
    
    
}
