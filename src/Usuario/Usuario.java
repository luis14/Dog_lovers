package Usuario;

import java.util.ArrayList;

public class Usuario {

    public static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String Nombre;
    private String Apellido;
    private String Username;
    private String Contrasenia;
    private String Correo;
    private boolean esAdmin;
    private int ID;   
    private static int cantidadDeUsuarios = 0;     
    
    public Usuario(String Nombre, String Apellido, String Username,
                                        String Contrasenia, boolean esAdmin, String correo){ 
        this.Nombre = Nombre; 
        this.Apellido = Apellido; 
        this.Username =Username; 
        this.Contrasenia = Contrasenia; 
        this.esAdmin = esAdmin;  
        this.Correo = correo;
        ID = ++cantidadDeUsuarios;   
    } 
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getContrasenia() {
        return Contrasenia;
    }
    
    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }
    
    public boolean isEsAdmin() {
        return esAdmin;
    }
    
    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public String getID() {
        String id = Integer.toString(ID);
        return id;
    }
    public void setID(int ID) {
        this.ID = ID;
    } 
    public int getCantidadDeClientes(){
        return cantidadDeUsuarios; 
    } 

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
}
