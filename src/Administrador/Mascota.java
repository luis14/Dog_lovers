
package Administrador;

import java.util.Date; 
import java.util.ArrayList;
import javax.swing.Icon;

public class Mascota {  
    // Función que contiene todos los métodos y atributos para Mascota
    private String nombre;  
    private String tipo; 
    private String raza; 
    private String chip;
    private String Color; 
    private String FechaDeEncontradoPerdido; 
    private String montoDeRecompensa; 
    private ArrayList<String>notas;  
    private String estado; 
    private String tamanio; 
    private Usuario usuario;  
    private String Descripcion;
    private Icon imagen;
    private int id;  
    private static int cantidadDeMascotas= 0; 

    //Constructor 
    public Mascota(String nombre, String tipo, String Color, String FechaDeEcontradoPerdido,String Recompensa,
                    String estado, String tamanio, Usuario usuario, String Chip, String raza, String Descripcion,
                    Icon Imagen){
        this.nombre = nombre; 
        this.tipo = tipo; 
        this.Color = Color; 
        this.FechaDeEncontradoPerdido = FechaDeEcontradoPerdido; 
        this.estado = estado; 
        this.tamanio = tamanio; 
        this.usuario = usuario; 
        this.chip = Chip; 
        this.raza = raza;
        this.montoDeRecompensa = Recompensa;
        this.Descripcion = Descripcion;
        this.imagen = Imagen;
        id = ++cantidadDeMascotas; 
    } 
    
    //Setters y Getters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getFechaDeEncontradoPerdido() {
        return FechaDeEncontradoPerdido;
    }

    public void setFechaDeEncontradoPerdido(String FechaDeEncontradoPerdido) {
        this.FechaDeEncontradoPerdido = FechaDeEncontradoPerdido;
    }

    public String getMontoDeRecompensa() {
        return montoDeRecompensa;
    }

    public void setMontoDeRecompensa(String montoDeRecompensa) {
        this.montoDeRecompensa = montoDeRecompensa;
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getId() { 
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCantidadDeMascotas(){
        String ID = Integer.toString(id);
        return ID; 
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public Icon getImagen() {
	return imagen;
    }
    public void setImagen(Icon Image) {
	imagen = Image;
    }
    
     // Función que crea un arreglo para hacer el modelo de tabla
    public String[] arreglo(){
        String[]msg = {Integer.toString(getId()), getFechaDeEncontradoPerdido(), getNombre(), getEstado(), getColor(), getTipo(), getTamanio(), getChip(), getRaza()};
        return msg;
    }
}
