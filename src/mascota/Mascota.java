
package mascota;

import Usuario.Usuario;
import java.util.Date; 
import java.util.ArrayList;

/**
 *
 * @author miuyin
 */
public class Mascota { 
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
    private int id;  
    private static int cantidadDeMascotas= 0; 

    public Mascota(String nombre, String tipo, String Color, String FechaDeEcontradoPerdido, 
                    String estado, String tamanio, Usuario usuario){
        this.nombre = nombre; 
        this.tipo = tipo; 
        this.Color = Color; 
        this.FechaDeEncontradoPerdido = FechaDeEcontradoPerdido; 
        this.estado = estado; 
        this.tamanio = tamanio; 
        this.usuario = usuario; 
        id = ++cantidadDeMascotas; 
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
     * @return the chip
     */
    public String getChip() {
        return chip;
    }

    /**
     * @param chip the chip to set
     */
    public void setChip(String chip) {
        this.chip = chip;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the FechaDeEncontradoPerdido
     */
    public String getFechaDeEncontradoPerdido() {
        return FechaDeEncontradoPerdido;
    }

    /**
     * @param FechaDeEncontradoPerdido the FechaDeEncontradoPerdido to set
     */
    public void setFechaDeEncontradoPerdido(String FechaDeEncontradoPerdido) {
        this.FechaDeEncontradoPerdido = FechaDeEncontradoPerdido;
    }

    /**
     * @return the montoDeRecompensa
     */
    public String getMontoDeRecompensa() {
        return montoDeRecompensa;
    }

    /**
     * @param montoDeRecompensa the montoDeRecompensa to set
     */
    public void setMontoDeRecompensa(String montoDeRecompensa) {
        this.montoDeRecompensa = montoDeRecompensa;
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
     * @return the tamanio
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
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
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCantidadDeMascotas(){
        String ID = Integer.toString(id);
        return ID; 
    }
    
    public String[] arreglo(){
        String[]msg = {getEstado(), getColor(), getTipo(), getTamanio(), getChip(), getRaza()};
        return msg;
    }
    
}
