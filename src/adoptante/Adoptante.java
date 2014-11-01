/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoptante;
import Usuario.Usuario; 
import java.util.ArrayList; 
/**
 *
 * @author miuyin
 */
public class Adoptante { 
    private int calificacion; 
    private String correo; 
    private String telefono; 
    private String lugarDeResidencia; 
    private String cantidadDeEsapcio; 
    private Boolean reportado; 
    private ArrayList<String>notas; 
    private Usuario usuario;  
    private String nombre;
    private int id;  
    private static int cantidadDeAdoptantes = 0; 

    public Adoptante(String nombre, String correo, String telefono, String lugarDeResidencia, String cantidadDeEspacio, Boolean reportado, Usuario usuario){ 
        this.nombre = nombre; 
        this.correo = correo; 
        this.telefono = telefono; 
        this.lugarDeResidencia = lugarDeResidencia; 
        this.cantidadDeEsapcio = cantidadDeEspacio; 
        this.reportado = reportado; 
        this.usuario = usuario; 
        id = cantidadDeAdoptantes++; 
    }
    
    /**
     * @return the calificacion
     */ 
    
    public String getCalificacion() { 
        String Calificacion = Integer.toString(calificacion);
        return Calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the coreo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param coreo the coreo to set
     */
    public void setCorreo(String coreo) {
        this.correo = coreo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the lugarDeResidencia
     */
    public String getLugarDeResidencia() {
        return lugarDeResidencia;
    }

    /**
     * @param lugarDeResidencia the lugarDeResidencia to set
     */
    public void setLugarDeResidencia(String lugarDeResidencia) {
        this.lugarDeResidencia = lugarDeResidencia;
    }

    /**
     * @return the cantidadDeEsapcio
     */
    public String getCantidadDeEsapcio() {
        return cantidadDeEsapcio;
    }

    /**
     * @param cantidadDeEsapcio the cantidadDeEsapcio to set
     */
    public void setCantidadDeEsapcio(String cantidadDeEsapcio) {
        this.cantidadDeEsapcio = cantidadDeEsapcio;
    }

    /**
     * @return the reportado
     */
    public Boolean getReportado() {
        return reportado;
    }

    /**
     * @param reportado the reportado to set
     */
    public void setReportado(Boolean reportado) {
        this.reportado = reportado;
    }

    /**
     * @return the notas
     */
    public ArrayList<String> getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public String getCantidadDeAdoptantes(){
        String ID = Integer.toString(id); 
        return ID; 
    }  
     
     public String getListaNegra(){
         if(reportado == true){
             return "Reportado";
         } 
         else{ 
             return "No esta reportado";
         }
     }
    
     public String[] arreglo(){
        String[]msg = {getNombre(), getTelefono(), getCorreo(), getListaNegra(), getCalificacion()}; 
        return msg;
    } 
     
}
