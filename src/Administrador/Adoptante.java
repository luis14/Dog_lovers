package Administrador;

import java.util.ArrayList; 
import javax.swing.Icon;

public class Adoptante { 
    private int calificacion; 
    private String correo; 
    private String telefono; 
    private String lugarDeResidencia; 
    private String cantidadDeEsapcio; 
    private Boolean reportado; 
    private String notas; 
    private Usuario usuario;  
    private String nombre;
    private Icon Imagen = null;
    private int id;  
    private static int cantidadDeAdoptantes = 0; 

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

    public String getStringCalificacion() { 
        String Calificacion = Integer.toString(calificacion);
        return Calificacion;
    } 
    
     public int getCalificacion() { 
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
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
        this.notas += notas + "\n";
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
    
    public String[] arreglo(){
       String[]msg = {Integer.toString(getId()), getNombre(), getTelefono(), getCorreo(), getStringListaNegra(), getStringCalificacion()}; 
       return msg;
    } 
    
    public Icon getImagen() {
	return Imagen;
    }
    public void setImagen(Icon Image) {
	this.Imagen = Image;
    }
}
