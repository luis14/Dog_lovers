package Administrador;

import java.util.ArrayList; 
import Usuario.Usuario;
import adoptante.Adoptante; 
import casaCuna.CasaCuna; 
import mascota.Mascota;

public class Administrador {
  
    public static ArrayList<String> TiposMascotas;
    public static ArrayList<ArrayList> TiposRazas;
    public ArrayList<Adoptante> Adoptantes;
    public ArrayList<CasaCuna> CasaCuna;
    public ArrayList<Mascota> Mascotas;
    public static ArrayList<Usuario> Usuarios;
    
    
    public static void RegistrarUsuario(String Nombre, String Apellido, String Username,
                                        String Contrasenia, boolean esAdmin, int ID){
        Usuario usuario = new Usuario(Nombre, Apellido, Username, Contrasenia, esAdmin, ID);
        Usuarios.add(usuario);
    }
    
    public static void RegistrarMascota(){
        
    }
}
