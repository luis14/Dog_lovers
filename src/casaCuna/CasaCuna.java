
package casaCuna; 
import Usuario.Usuario;


public class CasaCuna { 
    private String tipo;  
    private String raza; 
    private Boolean necesitaAlimentacion; 
    private String Tamanio; 
    private String requerimientos;  
    private Usuario Usuario;   
    private String telefono;  
    private int id;  
    private static int cantidadDeCasaCunas = 0; 

    public CasaCuna(String tipo, String raza, Boolean necesitaAlimentacion, 
            String Tamanio, String requerimientos, Usuario Usuario, String Telefono){
        this.tipo = tipo; 
        this.raza = raza; 
        this.necesitaAlimentacion = necesitaAlimentacion; 
        this.Tamanio = Tamanio; 
        this.requerimientos = requerimientos; 
        this.Usuario = Usuario;
        this.telefono = Telefono; 
        id = ++cantidadDeCasaCunas; 
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
     * @return the necesitaAlimentacion
     */
    public String getNecesitaAlimentacion() {
        if(necesitaAlimentacion == true){
            return "Si";
        } 
        else{
             return "No"; 
        }
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
    
    public String getCantidadDeCasaCunas(){
        String ID = Integer.toString(id); 
        return ID; 
    } 
    
    public String[] arreglo(){
        String[]msg = {getTipo(), getRaza(), getTamanio(), getNecesitaAlimentacion(), getTelefono(),getRequerimientos()};
        return msg;
    }
    
}
