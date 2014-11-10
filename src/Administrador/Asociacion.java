package Administrador;

public class Asociacion { 
    // Función que contiene todos los métodos y atributos para Asociación
    private String nombre; 
    private String mission; 
    private String cedulaJuridica; 
    private String telefono; 
    private String correo;  
    private String paginaWeb; 
    private Usuario usuario;
    private int id;   
    private static int cantidadDeUsuarios = 0; 

    // Constructor
    public Asociacion(String nombre, String mission, String cedulaJuridica, String telefono, String correo, String paginaWeb, Usuario usuario){ 
        this.nombre = nombre; 
        this.mission = mission; 
        this.cedulaJuridica = cedulaJuridica; 
        this.telefono = telefono; 
        this.correo = correo; 
        this.paginaWeb = paginaWeb;  
        this.usuario = usuario;
        id = ++cantidadDeUsuarios; 
        
    } 
    
    //Setters y Getters 
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getMission() {
        return mission;
    }
    
    public void setMission(String mission) {
        this.mission = mission;
    }
    
    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
    
    public int getCantidadDeClientes(){
        return cantidadDeUsuarios; 
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    } 
    
    // Función que crea un arreglo para hacer el modelo de tabla
    public String[] arreglo(){
        String msg[]= {Integer.toString(getId()), getNombre(), getMission(), getCedulaJuridica(),getTelefono(), getCorreo(), getPaginaWeb()}; 
        return msg;
    }
}
