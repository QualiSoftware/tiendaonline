package Modelos;
// Generated 06-dic-2016 14:39:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private Integer catId;
     private String catDescripcion;
     private Set<Ropa> ropas = new HashSet<Ropa>(0);
     private Set<Subcategoria> subcategorias = new HashSet<Subcategoria>(0);

    public Categoria() {
    }

	
    public Categoria(String catDescripcion) {
        this.catDescripcion = catDescripcion;
    }
    public Categoria(String catDescripcion, Set<Ropa> ropas, Set<Subcategoria> subcategorias) {
       this.catDescripcion = catDescripcion;
       this.ropas = ropas;
       this.subcategorias = subcategorias;
    }
   
    public Integer getCatId() {
        return this.catId;
    }
    
    public void setCatId(Integer catId) {
        this.catId = catId;
    }
    public String getCatDescripcion() {
        return this.catDescripcion;
    }
    
    public void setCatDescripcion(String catDescripcion) {
        this.catDescripcion = catDescripcion;
    }
    public Set<Ropa> getRopas() {
        return this.ropas;
    }
    
    public void setRopas(Set<Ropa> ropas) {
        this.ropas = ropas;
    }
    public Set<Subcategoria> getSubcategorias() {
        return this.subcategorias;
    }
    
    public void setSubcategorias(Set<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }




}


