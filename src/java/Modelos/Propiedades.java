package Modelos;
// Generated 14-may-2017 23:58:02 by Hibernate Tools 4.3.1



/**
 * Propiedades generated by hbm2java
 */
public class Propiedades  implements java.io.Serializable {


     private Integer proId;
     private String proKey;
     private String proValue;

    public Propiedades() {
    }

    public Propiedades(String proKey, String proValue) {
       this.proKey = proKey;
       this.proValue = proValue;
    }
   
    public Integer getProId() {
        return this.proId;
    }
    
    public void setProId(Integer proId) {
        this.proId = proId;
    }
    public String getProKey() {
        return this.proKey;
    }
    
    public void setProKey(String proKey) {
        this.proKey = proKey;
    }
    public String getProValue() {
        return this.proValue;
    }
    
    public void setProValue(String proValue) {
        this.proValue = proValue;
    }




}

