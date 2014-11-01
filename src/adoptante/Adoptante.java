/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoptante;
import Usuario.Usuario;
/**
 *
 * @author miuyin
 */
public class Adoptante { 
    private int calificacion; 
    private String coreo; 
    private String telefono; 
    private String lugarDeResidencia; 
    private String cantidadDeEsapcio; 
    private Boolean reportado; 
    private String notas; 
    private Usuario usuario; 
    private int id; 

    /**
     * @return the calificacion
     */
    public int getCalificacion() {
        return calificacion;
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
    public String getCoreo() {
        return coreo;
    }

    /**
     * @param coreo the coreo to set
     */
    public void setCoreo(String coreo) {
        this.coreo = coreo;
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
    public String getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(String notas) {
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
}
