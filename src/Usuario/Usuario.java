package Usuario;

import java.util.ArrayList;

public class Usuario {

    public static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String Nombre;
    private String Apellido;
    private String Username;
    private String Contra;
    private boolean esAdmin;
    private int ID;
    
    public Usuario(String nombre, String apellido, String username,
                   String contra, boolean esadmin, int id){
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Username = username;
        this.Contra = contra;
        this.esAdmin = esadmin;
        this.ID = id;
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

    public String getContra() {
        return Contra;
    }
    
    public void setContra(String Contra) {
        this.Contra = Contra;
    }
    
    public boolean isEsAdmin() {
        return esAdmin;
    }
    
    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}
