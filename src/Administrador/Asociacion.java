/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;
/**
 *
 * @author miuyin
 */
public class Asociacion {
    private String nombre; 
    private String mission; 
    private String cedulaJuridica; 
    private String telefono; 
    private String correo;  
    private String paginaWeb; 
    private int id;   
    private static int cantidadDeUsuarios = 0; 

    public Asociacion(String nombre, String mission, String cedulaJuridica, String telefono, String correo, String paginaWeb){ 
        this.nombre = nombre; 
        this.mission = mission; 
        this.cedulaJuridica = cedulaJuridica; 
        this.telefono = telefono; 
        this.correo = correo; 
        this.paginaWeb = paginaWeb; 
        id = ++cantidadDeUsuarios; 
        
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

    /**
     * @return the mission
     */
    public String getMission() {
        return mission;
    }

    /**
     * @param mission the mission to set
     */
    public void setMission(String mission) {
        this.mission = mission;
    }

    /**
     * @return the cedulaJuridica
     */
    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    /**
     * @param cedulaJuridica the cedulaJuridica to set
     */
    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the paginaWeb
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * @param paginaWeb the paginaWeb to set
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
    
    public int getCantidadDeClientes(){
        return cantidadDeUsuarios; 
    }  
     
    public String[] arreglo(){
        String msg[]= {Integer.toString(getId()), getNombre(), getMission(), getCedulaJuridica(),getTelefono(), getCorreo(), getPaginaWeb()}; 
        return msg;
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
    
}
