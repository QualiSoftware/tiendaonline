package Modelos;
// Generated 02-oct-2016 2:34:12 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ropa generated by hbm2java
 */
public class Ropa  implements java.io.Serializable {


     private Integer roId;
     private Clientela clientela;
     private Coleccion coleccion;
     private Color color;
     private Look look;
     private Marcas marcas;
     private Tallas tallas;
     private String roDescripcion;
     private double roPrecio;
     private double roDescuento;
     private String roCaracteristicas;
     private byte roVisible;
     private int roUnidades;
     private Date roFecha;
     private Set<RopaCategoria> ropaCategorias = new HashSet<RopaCategoria>(0);
     private Set<RopaMaterial> ropaMaterials = new HashSet<RopaMaterial>(0);
     private Set<Fotos> fotoses = new HashSet<Fotos>(0);

    public Ropa() {
    }

	
    public Ropa(Clientela clientela, Coleccion coleccion, Color color, Look look, Marcas marcas, Tallas tallas, String roDescripcion, double roPrecio, double roDescuento, String roCaracteristicas, byte roVisible, int roUnidades, Date roFecha) {
        this.clientela = clientela;
        this.coleccion = coleccion;
        this.color = color;
        this.look = look;
        this.marcas = marcas;
        this.tallas = tallas;
        this.roDescripcion = roDescripcion;
        this.roPrecio = roPrecio;
        this.roDescuento = roDescuento;
        this.roCaracteristicas = roCaracteristicas;
        this.roVisible = roVisible;
        this.roUnidades = roUnidades;
        this.roFecha = roFecha;
    }
    public Ropa(Clientela clientela, Coleccion coleccion, Color color, Look look, Marcas marcas, Tallas tallas, String roDescripcion, double roPrecio, double roDescuento, String roCaracteristicas, byte roVisible, int roUnidades, Date roFecha, Set<RopaCategoria> ropaCategorias, Set<RopaMaterial> ropaMaterials, Set<Fotos> fotoses) {
       this.clientela = clientela;
       this.coleccion = coleccion;
       this.color = color;
       this.look = look;
       this.marcas = marcas;
       this.tallas = tallas;
       this.roDescripcion = roDescripcion;
       this.roPrecio = roPrecio;
       this.roDescuento = roDescuento;
       this.roCaracteristicas = roCaracteristicas;
       this.roVisible = roVisible;
       this.roUnidades = roUnidades;
       this.roFecha = roFecha;
       this.ropaCategorias = ropaCategorias;
       this.ropaMaterials = ropaMaterials;
       this.fotoses = fotoses;
    }
   
    public Integer getRoId() {
        return this.roId;
    }
    
    public void setRoId(Integer roId) {
        this.roId = roId;
    }
    public Clientela getClientela() {
        return this.clientela;
    }
    
    public void setClientela(Clientela clientela) {
        this.clientela = clientela;
    }
    public Coleccion getColeccion() {
        return this.coleccion;
    }
    
    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }
    public Color getColor() {
        return this.color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    public Look getLook() {
        return this.look;
    }
    
    public void setLook(Look look) {
        this.look = look;
    }
    public Marcas getMarcas() {
        return this.marcas;
    }
    
    public void setMarcas(Marcas marcas) {
        this.marcas = marcas;
    }
    public Tallas getTallas() {
        return this.tallas;
    }
    
    public void setTallas(Tallas tallas) {
        this.tallas = tallas;
    }
    public String getRoDescripcion() {
        return this.roDescripcion;
    }
    
    public void setRoDescripcion(String roDescripcion) {
        this.roDescripcion = roDescripcion;
    }
    public double getRoPrecio() {
        return this.roPrecio;
    }
    
    public void setRoPrecio(double roPrecio) {
        this.roPrecio = roPrecio;
    }
    public double getRoDescuento() {
        return this.roDescuento;
    }
    
    public void setRoDescuento(double roDescuento) {
        this.roDescuento = roDescuento;
    }
    public String getRoCaracteristicas() {
        return this.roCaracteristicas;
    }
    
    public void setRoCaracteristicas(String roCaracteristicas) {
        this.roCaracteristicas = roCaracteristicas;
    }
    public byte getRoVisible() {
        return this.roVisible;
    }
    
    public void setRoVisible(byte roVisible) {
        this.roVisible = roVisible;
    }
    public int getRoUnidades() {
        return this.roUnidades;
    }
    
    public void setRoUnidades(int roUnidades) {
        this.roUnidades = roUnidades;
    }
    public Date getRoFecha() {
        return this.roFecha;
    }
    
    public void setRoFecha(Date roFecha) {
        this.roFecha = roFecha;
    }
    public Set<RopaCategoria> getRopaCategorias() {
        return this.ropaCategorias;
    }
    
    public void setRopaCategorias(Set<RopaCategoria> ropaCategorias) {
        this.ropaCategorias = ropaCategorias;
    }
    public Set<RopaMaterial> getRopaMaterials() {
        return this.ropaMaterials;
    }
    
    public void setRopaMaterials(Set<RopaMaterial> ropaMaterials) {
        this.ropaMaterials = ropaMaterials;
    }
    public Set<Fotos> getFotoses() {
        return this.fotoses;
    }
    
    public void setFotoses(Set<Fotos> fotoses) {
        this.fotoses = fotoses;
    }




}


