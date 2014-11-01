/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casaCuna; 
import Usuario.Usuario;

/**
 *
 * @author miuyin
 */
public class CasaCuna { 
    private String tipo;  
    private String raza; 
    private Boolean necesitaAlimentacion; 
    private String Tamanio; 
    private String requerimientos;  
    private Usuario Usuario;   
    private String telefono;  
    private int id; 

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the necesitaAlimentacion
     */
    public Boolean getNecesitaAlimentacion() {
        return necesitaAlimentacion;
    }

    /**
     * @param necesitaAlimentacion the necesitaAlimentacion to set
     */
    public void setNecesitaAlimentacion(Boolean necesitaAlimentacion) {
        this.necesitaAlimentacion = necesitaAlimentacion;
    }

    /**
     * @return the Tamanio
     */
    public String getTamanio() {
        return Tamanio;
    }

    /**
     * @param Tamanio the Tamanio to set
     */
    public void setTamanio(String Tamanio) {
        this.Tamanio = Tamanio;
    }

    /**
     * @return the requerimientos
     */
    public String getRequerimientos() {
        return requerimientos;
    }

    /**
     * @param requerimientos the requerimientos to set
     */
    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }

    /**
     * @return the Usuario
     */
    public Usuario getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
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
