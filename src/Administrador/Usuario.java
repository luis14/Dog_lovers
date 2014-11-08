package Administrador;

import java.util.ArrayList;

public class Usuario {
    
    private String Nombre;
    private String Apellido;
    private String Username;
    private String Contrasenia;
    private String Correo;
    private String Telefono;
    private boolean esAdmin;
    private int id;   
    private static int cantidadDeUsuarios = 0;   
    private boolean adoptante;
    private boolean casaCuna;
    private boolean asociacion;
    private static int CasaCunaActual;
    private static int AdoptanteActual;
    private static int TipoActual;
    private static int RazaActual;
    
    public Usuario(String Nombre, String Apellido, String Username, String Telefono,
                   String Contrasenia, boolean esAdmin, String correo){ 
        this.Nombre = Nombre; 
        this.Apellido = Apellido; 
        this.Username =Username; 
        this.Contrasenia = Contrasenia; 
        this.esAdmin = esAdmin;  
        this.Correo = correo;
        this.Telefono = Telefono;
        this.adoptante = false;
        this.asociacion = false;
        this.casaCuna = false;
        id = ++cantidadDeUsuarios;   
    } 

    public static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCasaCunaActual() {
        return CasaCunaActual;
    }

    public void setCasaCunaActual(int aCasaCunaActual) {
        CasaCunaActual = aCasaCunaActual;
    }

    public int getAdoptanteActual() {
        return AdoptanteActual;
    }

    public void setAdoptanteActual(int aAdoptanteActual) {
        AdoptanteActual = aAdoptanteActual;
    }

    public int getTipoActual() {
        return TipoActual;
    }

    public void setTipoActual(int aTipoActual) {
        TipoActual = aTipoActual;
    }

    public int getRazaActual() {
        return RazaActual;
    }

    public void setRazaActual(int aRazaActual) {
        RazaActual = aRazaActual;
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
    
    public boolean getEsAdmin() {
        return esAdmin;
    } 
    
    public String printEsAdmin(){
        if(esAdmin == true){
            return "Es Admin";
        } 
        else{ 
        return "No es Admin";
        }
    }
    
    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public int getId() {
        return id;
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
        String msg[] = {Integer.toString(getId()),getNombre(), getApellido(), getUsername(), getCorreo(), getTelefono(), printEsAdmin()}; 
        return msg;
    }

    public boolean isAdoptante() {
        return adoptante;
    }

    public void setAdoptante(boolean adoptante) {
        this.adoptante = adoptante;
    }

    public boolean isCasaCuna() {
        return casaCuna;
    }

    public void setCasaCuna(boolean casaCuna) {
        this.casaCuna = casaCuna;
    }

    public boolean isAsociacion() {
        return asociacion;
    }

    public void setAsociacion(boolean asociacion) {
        this.asociacion = asociacion;
    }

    public void getCasaCunaActual(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
