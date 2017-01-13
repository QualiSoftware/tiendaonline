package Modelos;
// Generated 12-ene-2017 20:00:17 by Hibernate Tools 4.3.1



/**
 * Cesta generated by hbm2java
 */
public class Cesta  implements java.io.Serializable {


     private Integer cestaId;
     private RopaStock ropaStock;
     private Usuarios usuarios;
     private int cestaUnidades;

    public Cesta() {
    }

    public Cesta(RopaStock ropaStock, Usuarios usuarios, int cestaUnidades) {
       this.ropaStock = ropaStock;
       this.usuarios = usuarios;
       this.cestaUnidades = cestaUnidades;
    }
   
    public Integer getCestaId() {
        return this.cestaId;
    }
    
    public void setCestaId(Integer cestaId) {
        this.cestaId = cestaId;
    }
    public RopaStock getRopaStock() {
        return this.ropaStock;
    }
    
    public void setRopaStock(RopaStock ropaStock) {
        this.ropaStock = ropaStock;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public int getCestaUnidades() {
        return this.cestaUnidades;
    }
    
    public void setCestaUnidades(int cestaUnidades) {
        this.cestaUnidades = cestaUnidades;
    }




}


