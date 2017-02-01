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
public class WsKeys {
    private int id;
    private String puuId;
    private String domains;
    private String apiKey;
    private String passwordd;
    private String secret;
    
    public  WsKeys(int id, String puuId,String domains,String apiKey,
            String passwordd,String secret){
        this.id=id;
        this.puuId=puuId;
        this.domains=domains;
        this.apiKey=apiKey;
        this.passwordd=passwordd;
        this.secret=secret;
        
    }
    public WsKeys(){
        this(0,"","","","","");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuuId() {
        return puuId;
    }

    public void setPuuId(String puuId) {
        this.puuId = puuId;
    }

    public String getDomains() {
        return domains;
    }

    public void setDomains(String domains) {
        this.domains = domains;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getPasswordd() {
        return passwordd;
    }

    public void setPasswordd(String passwordd) {
        this.passwordd = passwordd;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "WsKeys{" + "id=" + id + ", puuId=" + puuId + ", domains=" + domains + ", apiKey=" + apiKey + ", passwordd=" + passwordd + ", secret=" + secret + '}';
    }
    
}
