package Administrador;

import java.util.ArrayList; 
import javax.swing.Icon;

public class Adoptante {  
    // Función que contiene todos los métodos y atributos para Adoptante
    private int calificacionTotal;
    private int cantCalificaciones;
    private int calificacion; 
    private String correo; 
    private String telefono; 
    private String lugarDeResidencia; 
    private String cantidadDeEsapcio; 
    private Boolean reportado; 
    private String notas = ""; 
    private Usuario usuario;  
    private String nombre;
    private Icon Imagen = null;
    private int id;  
    private static int cantidadDeAdoptantes = 0; 

    // Contructor 
    public Adoptante(String nombre, String correo, String telefono, String lugarDeResidencia, String cantidadDeEspacio,
                     Boolean reportado, Usuario usuario,Icon Image){ 
        this.nombre = nombre; 
        this.correo = correo; 
        this.telefono = telefono; 
        this.lugarDeResidencia = lugarDeResidencia; 
        this.cantidadDeEsapcio = cantidadDeEspacio; 
        this.reportado = reportado; 
        this.usuario = usuario; 
        this.Imagen = Image;
        id = ++cantidadDeAdoptantes; 
    }

    // Setters y Getters 
    
    public String getStringCalificacion() { 
        String Calificacion = null;
        if(calificacion == 0){
            Calificacion = "No está calificado";
        } else if(calificacion == 1){
            Calificacion = "Muy malo";
        } else if(calificacion == 2){
            Calificacion = "Regular";
        } else if(calificacion == 3){
            Calificacion = "Normal";
        } else if(calificacion == 4){
            Calificacion = "Bueno";
        } else if(calificacion == 5){
            Calificacion = "Muy bueno";
        } 
        return Calificacion;
    } 
    
     public int getCalificacion() { 
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        cantCalificaciones++;
        calificacionTotal += calificacion;
        int promedio;
        promedio = calificacionTotal/cantCalificaciones;
        this.calificacion = promedio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String coreo) {
        this.correo = coreo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLugarDeResidencia() {
        return lugarDeResidencia;
    }


    public void setLugarDeResidencia(String lugarDeResidencia) {
        this.lugarDeResidencia = lugarDeResidencia;
    }

    public String getCantidadDeEsapcio() {
        return cantidadDeEsapcio;
    }

    public void setCantidadDeEsapcio(String cantidadDeEsapcio) {
        this.cantidadDeEsapcio = cantidadDeEsapcio;
    }

    public Boolean getReportado() {
        return reportado;
    }

    public void setReportado(Boolean reportado) {
        this.reportado = reportado;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas += "- " + notas + "\n";
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
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public String getCantidadDeAdoptantes(){
        String ID = Integer.toString(id); 
        return ID; 
    }  
     
    public Boolean getListaNegra(){
        return reportado;
    } 
     
    public String getStringListaNegra(){ 
        if(reportado == true){ 
            return "Si" ;
        } 
        else{ 
            return "No";
        }
    } 
    
    public Icon getImagen() {
	return Imagen;
    }
    public void setImagen(Icon Image) {
	this.Imagen = Image;
    } 
    
    // Función que crea un arreglo para hacer el modelo de tabla
    public String[] arreglo(){
       String[]msg = {Integer.toString(getId()), getNombre(), getTelefono(), getCorreo(), getStringListaNegra(),
                      getStringCalificacion()}; 
       return msg;
    }
}
