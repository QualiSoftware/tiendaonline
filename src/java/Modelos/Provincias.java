package Modelos;
// Generated 26-oct-2016 12:35:57 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Provincias generated by hbm2java
 */
public class Provincias  implements java.io.Serializable {


     private Integer proId;
     private Paises paises;
     private String proNombre;
     private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);

    public Provincias() {
    }

	
    public Provincias(Paises paises, String proNombre) {
        this.paises = paises;
        this.proNombre = proNombre;
    }
    public Provincias(Paises paises, String proNombre, Set<Usuarios> usuarioses) {
       this.paises = paises;
       this.proNombre = proNombre;
       this.usuarioses = usuarioses;
    }
   
    public Integer getProId() {
        return this.proId;
    }
    
    public void setProId(Integer proId) {
        this.proId = proId;
    }
    public Paises getPaises() {
        return this.paises;
    }
    
    public void setPaises(Paises paises) {
        this.paises = paises;
    }
    public String getProNombre() {
        return this.proNombre;
    }
    
    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }
    public Set<Usuarios> getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set<Usuarios> usuarioses) {
        this.usuarioses = usuarioses;
    }




}


