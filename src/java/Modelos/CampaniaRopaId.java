package Modelos;
// Generated 18-jun-2017 18:48:23 by Hibernate Tools 4.3.1



/**
 * CampaniaRopaId generated by hbm2java
 */
public class CampaniaRopaId  implements java.io.Serializable {


     private int camroCamId;
     private int camroRoId;

    public CampaniaRopaId() {
    }

    public CampaniaRopaId(int camroCamId, int camroRoId) {
       this.camroCamId = camroCamId;
       this.camroRoId = camroRoId;
    }
   
    public int getCamroCamId() {
        return this.camroCamId;
    }
    
    public void setCamroCamId(int camroCamId) {
        this.camroCamId = camroCamId;
    }
    public int getCamroRoId() {
        return this.camroRoId;
    }
    
    public void setCamroRoId(int camroRoId) {
        this.camroRoId = camroRoId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CampaniaRopaId) ) return false;
		 CampaniaRopaId castOther = ( CampaniaRopaId ) other; 
         
		 return (this.getCamroCamId()==castOther.getCamroCamId())
 && (this.getCamroRoId()==castOther.getCamroRoId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCamroCamId();
         result = 37 * result + this.getCamroRoId();
         return result;
   }   


}


