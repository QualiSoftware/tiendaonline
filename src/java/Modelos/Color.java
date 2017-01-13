package Modelos;
// Generated 12-ene-2017 20:00:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Color generated by hbm2java
 */
public class Color  implements java.io.Serializable {


     private Integer colorId;
     private String colorDescripcion;
     private String colorFoto;
     private Set<RopaStock> ropaStocks = new HashSet<RopaStock>(0);

    public Color() {
    }

	
    public Color(String colorDescripcion, String colorFoto) {
        this.colorDescripcion = colorDescripcion;
        this.colorFoto = colorFoto;
    }
    public Color(String colorDescripcion, String colorFoto, Set<RopaStock> ropaStocks) {
       this.colorDescripcion = colorDescripcion;
       this.colorFoto = colorFoto;
       this.ropaStocks = ropaStocks;
    }
   
    public Integer getColorId() {
        return this.colorId;
    }
    
    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }
    public String getColorDescripcion() {
        return this.colorDescripcion;
    }
    
    public void setColorDescripcion(String colorDescripcion) {
        this.colorDescripcion = colorDescripcion;
    }
    public String getColorFoto() {
        return this.colorFoto;
    }
    
    public void setColorFoto(String colorFoto) {
        this.colorFoto = colorFoto;
    }
    public Set<RopaStock> getRopaStocks() {
        return this.ropaStocks;
    }
    
    public void setRopaStocks(Set<RopaStock> ropaStocks) {
        this.ropaStocks = ropaStocks;
    }




}


