package Administrador;

import java.util.ArrayList; 
import Usuario.Usuario;
import adoptante.Adoptante; 
import casaCuna.CasaCuna; 
import mascota.Mascota;  
import mascota.Estados; 
import java.util.Date;  


public class Administrador {
  
    public static ArrayList<TipoDeMascota> ListaDeTiposMascotas;
    public static ArrayList<Adoptante> ListaDeAdoptantes;
    public static ArrayList<CasaCuna> ListaDeCasaCuna;
    public static ArrayList<Mascota> ListaDeMascotas;
    public static ArrayList<Usuario> ListaDeUsuarios;
    
    
    public static void RegistrarUsuario(String Nombre, String Apellido, String Username,
                                        String Contrasenia, boolean esAdmin, String Correo){
        Usuario usuario = new Usuario(Nombre, Apellido, Username, Contrasenia, esAdmin, Correo);
        ListaDeUsuarios.add(usuario);
    }
    
    public static void RegistrarMascota(String nombre, String tipo, String Color, Date FechaDeEcontradoPerdido, 
                                        Estados estado, String tamanio, Usuario usuario){ 
        Mascota mascota = new Mascota(nombre, tipo, Color, FechaDeEcontradoPerdido, estado, tamanio, usuario); 
        ListaDeMascotas.add(mascota);
        
    }
   
    public static void RegistrarCasaCuna(String tipo, String raza, Boolean necesitaAlimentacion, 
            String Tamanio, String requerimientos, Usuario Usuario, String Telefono){ 
        CasaCuna casaCuna = new CasaCuna(tipo, raza, necesitaAlimentacion, Tamanio, requerimientos, Usuario, Telefono); 
        ListaDeCasaCuna.add(casaCuna); 
        
    } 
    
    public static void RegistrarTipoMascotas(String nombreDeMascota){  
       TipoDeMascota tipoDeMascota = new TipoDeMascota(nombreDeMascota); 
       ListaDeTiposMascotas.add(tipoDeMascota);
    } 
    
    public static void RegistrarTipoRazas(int posicionDeMascotaEnLista, String TipoRaza){ 
        ListaDeTiposMascotas.get(posicionDeMascotaEnLista).agregarTipoDeRaza(TipoRaza);
     
    }
}
