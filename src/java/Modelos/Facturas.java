package Modelos;
// Generated 12-ene-2017 20:00:17 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Facturas generated by hbm2java
 */
public class Facturas  implements java.io.Serializable {


     private Integer facId;
     private int facUsuId;
     private String facCodigo;
     private String facRazonsocial;
     private String facDireccion;
     private String facPoblacion;
     private String facProvincia;
     private String facCp;
     private String facPais;
     private String facDni;
     private int facDescuento;
     private Date facFecha;
     private int facIva;
     private String facObservaciones;
     private Set<FacturaDetalle> facturaDetalles = new HashSet<FacturaDetalle>(0);

    public Facturas() {
    }

	
    public Facturas(int facUsuId, String facCodigo, String facRazonsocial, String facDireccion, String facPoblacion, String facProvincia, String facCp, String facPais, String facDni, int facDescuento, Date facFecha, int facIva, String facObservaciones) {
        this.facUsuId = facUsuId;
        this.facCodigo = facCodigo;
        this.facRazonsocial = facRazonsocial;
        this.facDireccion = facDireccion;
        this.facPoblacion = facPoblacion;
        this.facProvincia = facProvincia;
        this.facCp = facCp;
        this.facPais = facPais;
        this.facDni = facDni;
        this.facDescuento = facDescuento;
        this.facFecha = facFecha;
        this.facIva = facIva;
        this.facObservaciones = facObservaciones;
    }
    public Facturas(int facUsuId, String facCodigo, String facRazonsocial, String facDireccion, String facPoblacion, String facProvincia, String facCp, String facPais, String facDni, int facDescuento, Date facFecha, int facIva, String facObservaciones, Set<FacturaDetalle> facturaDetalles) {
       this.facUsuId = facUsuId;
       this.facCodigo = facCodigo;
       this.facRazonsocial = facRazonsocial;
       this.facDireccion = facDireccion;
       this.facPoblacion = facPoblacion;
       this.facProvincia = facProvincia;
       this.facCp = facCp;
       this.facPais = facPais;
       this.facDni = facDni;
       this.facDescuento = facDescuento;
       this.facFecha = facFecha;
       this.facIva = facIva;
       this.facObservaciones = facObservaciones;
       this.facturaDetalles = facturaDetalles;
    }
   
    public Integer getFacId() {
        return this.facId;
    }
    
    public void setFacId(Integer facId) {
        this.facId = facId;
    }
    public int getFacUsuId() {
        return this.facUsuId;
    }
    
    public void setFacUsuId(int facUsuId) {
        this.facUsuId = facUsuId;
    }
    public String getFacCodigo() {
        return this.facCodigo;
    }
    
    public void setFacCodigo(String facCodigo) {
        this.facCodigo = facCodigo;
    }
    public String getFacRazonsocial() {
        return this.facRazonsocial;
    }
    
    public void setFacRazonsocial(String facRazonsocial) {
        this.facRazonsocial = facRazonsocial;
    }
    public String getFacDireccion() {
        return this.facDireccion;
    }
    
    public void setFacDireccion(String facDireccion) {
        this.facDireccion = facDireccion;
    }
    public String getFacPoblacion() {
        return this.facPoblacion;
    }
    
    public void setFacPoblacion(String facPoblacion) {
        this.facPoblacion = facPoblacion;
    }
    public String getFacProvincia() {
        return this.facProvincia;
    }
    
    public void setFacProvincia(String facProvincia) {
        this.facProvincia = facProvincia;
    }
    public String getFacCp() {
        return this.facCp;
    }
    
    public void setFacCp(String facCp) {
        this.facCp = facCp;
    }
    public String getFacPais() {
        return this.facPais;
    }
    
    public void setFacPais(String facPais) {
        this.facPais = facPais;
    }
    public String getFacDni() {
        return this.facDni;
    }
    
    public void setFacDni(String facDni) {
        this.facDni = facDni;
    }
    public int getFacDescuento() {
        return this.facDescuento;
    }
    
    public void setFacDescuento(int facDescuento) {
        this.facDescuento = facDescuento;
    }
    public Date getFacFecha() {
        return this.facFecha;
    }
    
    public void setFacFecha(Date facFecha) {
        this.facFecha = facFecha;
    }
    public int getFacIva() {
        return this.facIva;
    }
    
    public void setFacIva(int facIva) {
        this.facIva = facIva;
    }
    public String getFacObservaciones() {
        return this.facObservaciones;
    }
    
    public void setFacObservaciones(String facObservaciones) {
        this.facObservaciones = facObservaciones;
    }
    public Set<FacturaDetalle> getFacturaDetalles() {
        return this.facturaDetalles;
    }
    
    public void setFacturaDetalles(Set<FacturaDetalle> facturaDetalles) {
        this.facturaDetalles = facturaDetalles;
    }




}


