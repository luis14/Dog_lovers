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
    private String Telefono;
    private boolean esAdmin;
    private int id;   
    private static int cantidadDeUsuarios = 0;     
    
    public Usuario(String Nombre, String Apellido, String Username, String Telefono,
                   String Contrasenia, boolean esAdmin, String correo){ 
        this.Nombre = Nombre; 
        this.Apellido = Apellido; 
        this.Username =Username; 
        this.Contrasenia = Contrasenia; 
        this.esAdmin = esAdmin;  
        this.Correo = correo;
        this.Telefono = Telefono;
        id = ++cantidadDeUsuarios;   
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

    public String getId() {
        String ID = Integer.toString(id);
        return ID;
    }
    public void setID(int ID) {
        this.id = ID;
    } 
    public int getCantidadDeClientes(){
        return cantidadDeUsuarios; 
    } 

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    } 
    
    public String[] arreglo(){
        String msg[] = {getId(),getNombre(), getApellido(), getUsername(), getCorreo(), getTelefono()}; 
        return msg;
}
    
}
