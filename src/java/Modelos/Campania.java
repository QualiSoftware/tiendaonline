package Modelos;
// Generated 08-nov-2016 23:03:23 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Campania generated by hbm2java
 */
public class Campania  implements java.io.Serializable {


     private Integer camId;
     private String camMarca;
     private String camNombre;
     private Date camInicio;
     private Date camFin;
     private String camFoto;
     private Set<CampaniaRopa> campaniaRopas = new HashSet<CampaniaRopa>(0);

    public Campania() {
    }

	
    public Campania(String camMarca, String camNombre, Date camInicio, Date camFin, String camFoto) {
        this.camMarca = camMarca;
        this.camNombre = camNombre;
        this.camInicio = camInicio;
        this.camFin = camFin;
        this.camFoto = camFoto;
    }
    public Campania(String camMarca, String camNombre, Date camInicio, Date camFin, String camFoto, Set<CampaniaRopa> campaniaRopas) {
       this.camMarca = camMarca;
       this.camNombre = camNombre;
       this.camInicio = camInicio;
       this.camFin = camFin;
       this.camFoto = camFoto;
       this.campaniaRopas = campaniaRopas;
    }
   
    public Integer getCamId() {
        return this.camId;
    }
    
    public void setCamId(Integer camId) {
        this.camId = camId;
    }
    public String getCamMarca() {
        return this.camMarca;
    }
    
    public void setCamMarca(String camMarca) {
        this.camMarca = camMarca;
    }
    public String getCamNombre() {
        return this.camNombre;
    }
    
    public void setCamNombre(String camNombre) {
        this.camNombre = camNombre;
    }
    public Date getCamInicio() {
        return this.camInicio;
    }
    
    public void setCamInicio(Date camInicio) {
        this.camInicio = camInicio;
    }
    public Date getCamFin() {
        return this.camFin;
    }
    
    public void setCamFin(Date camFin) {
        this.camFin = camFin;
    }
    public String getCamFoto() {
        return this.camFoto;
    }
    
    public void setCamFoto(String camFoto) {
        this.camFoto = camFoto;
    }
    public Set<CampaniaRopa> getCampaniaRopas() {
        return this.campaniaRopas;
    }
    
    public void setCampaniaRopas(Set<CampaniaRopa> campaniaRopas) {
        this.campaniaRopas = campaniaRopas;
    }




}


