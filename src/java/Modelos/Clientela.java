package Modelos;
// Generated 06-ene-2017 14:44:47 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clientela generated by hbm2java
 */
public class Clientela  implements java.io.Serializable {


     private Integer clientelaId;
     private String clientelaDescripcion;
     private Set<Ropa> ropas = new HashSet<Ropa>(0);

    public Clientela() {
    }

	
    public Clientela(String clientelaDescripcion) {
        this.clientelaDescripcion = clientelaDescripcion;
    }
    public Clientela(String clientelaDescripcion, Set<Ropa> ropas) {
       this.clientelaDescripcion = clientelaDescripcion;
       this.ropas = ropas;
    }
   
    public Integer getClientelaId() {
        return this.clientelaId;
    }
    
    public void setClientelaId(Integer clientelaId) {
        this.clientelaId = clientelaId;
    }
    public String getClientelaDescripcion() {
        return this.clientelaDescripcion;
    }
    
    public void setClientelaDescripcion(String clientelaDescripcion) {
        this.clientelaDescripcion = clientelaDescripcion;
    }
    public Set<Ropa> getRopas() {
        return this.ropas;
    }
    
    public void setRopas(Set<Ropa> ropas) {
        this.ropas = ropas;
    }




}


