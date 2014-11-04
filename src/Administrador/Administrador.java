package Administrador;

import java.util.ArrayList; 
import Usuario.Usuario;
import adoptante.Adoptante; 
import casaCuna.CasaCuna; 
import mascota.Mascota;   
import java.util.Date;  


public class Administrador {
  
    public static ArrayList<TipoDeMascota> ListaDeTiposMascotas = new ArrayList<>();
    public static ArrayList<Adoptante> ListaDeAdoptantes = new ArrayList<>();
    public static ArrayList<CasaCuna> ListaDeCasaCuna = new ArrayList<>();
    public static ArrayList<Mascota> ListaDeMascotas = new ArrayList<>();
    public static ArrayList<Usuario> ListaDeUsuarios = new ArrayList<>(); 
    public static ArrayList<String> ListaDeColores = new ArrayList<>();
    public static int UsuarioActual;
    
    // REGISTRO 
    
    public static void RegistrarUsuario(String Nombre, String Apellido, String Username,String Telefono,
                                        String Contrasenia, boolean esAdmin, String Correo){
        Usuario usuario = new Usuario(Nombre, Apellido, Username, Telefono, Contrasenia, esAdmin, Correo); 
        ListaDeUsuarios.add(usuario);
    }
    
    public static void RegistrarMascota(String nombre, String tipo, String Color, String FechaDeEcontradoPerdido, 
                                        String estado, String tamanio, Usuario usuario){ 
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
    
    public static void RegistrarAdoptante(String nombre, String correo, String telefono, String lugarDeResidencia,
                                          String cantidadDeEspacio, Boolean reportado, Usuario usuario){
        Adoptante adoptante = new Adoptante(nombre, correo, telefono, lugarDeResidencia, cantidadDeEspacio, reportado, usuario); 
        ListaDeAdoptantes.add(adoptante);
    }
    
    public static void RegistrarTipoRazas(int posicionDeMascotaEnLista, String TipoRaza){ 
        ListaDeTiposMascotas.get(posicionDeMascotaEnLista).agregarTipoDeRaza(TipoRaza);
    } 
    
    public static void RegistrarColores(String color){
        ListaDeColores.add(color);
    }
    
    public static int getUsuarioActual() {
        return UsuarioActual;
    }

    public static void setUsuarioActual(int aUsuarioActual) {
        UsuarioActual = aUsuarioActual;
    }

    public static void RegistrarMascota(String text, Object selectedItem, Object selectedItem0, Object selectedItem1, String text0, String estado, String text1, Usuario get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
