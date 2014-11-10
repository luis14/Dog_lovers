package Administrador;


import java.util.ArrayList; 
import java.util.Date;  
import javax.swing.Icon;


public class Administrador {
  
    public static ArrayList<TipoDeMascota> ListaDeTiposMascotas = new ArrayList<>();
    public static ArrayList<Adoptante> ListaDeAdoptantes = new ArrayList<>();
    public static ArrayList<CasaCuna> ListaDeCasaCuna = new ArrayList<>();
    public static ArrayList<Mascota> ListaDeMascotas = new ArrayList<>();
    public static ArrayList<Usuario> ListaDeUsuarios = new ArrayList<>(); 
    public static ArrayList<String> ListaDeColores = new ArrayList<>(); 
    public static ArrayList<Asociacion> ListaDeAsociaciones = new ArrayList<>(); 
    public static ArrayList<Donaciones> ListaDeDonaciones = new ArrayList<>();  
    public static ArrayList<String> ListaDeTamanios = new ArrayList<>(); 
    public static ArrayList<String> ListaDeEstados = new ArrayList<>();  
    
    public static int UsuarioActual;
    
    //*********************************************
    //                  REGISTROS                 *
    //*********************************************
    
    public static void RegistrarUsuario(String Nombre, String Apellido, String Username,String Telefono,
                                        String Contrasenia, boolean esAdmin, String Correo,Icon Imagen){
        Usuario usuario = new Usuario(Nombre, Apellido, Username, Telefono, Contrasenia, esAdmin, Correo,Imagen); 
        ListaDeUsuarios.add(usuario);
    }
    
    public static void RegistrarMascota(String nombre, String tipo, String Color, String FechaDeEcontradoPerdido,String estado, 
                                        String tamanio, Usuario usuario, String chip, String raza,String Recompensa, String Descripcion,
                                        Icon Imagen){ 
        Mascota mascota = new Mascota(nombre, tipo, Color, FechaDeEcontradoPerdido, Recompensa,estado, tamanio, usuario, chip, raza, Descripcion, Imagen); 
        ListaDeMascotas.add(mascota);
    }
   
    public static void RegistrarCasaCuna(String tipo, String raza, Boolean necesitaAlimentacion, 
            String Tamanio, String requerimientos, Usuario Usuario, String Telefono){ 
        CasaCuna casaCuna = new CasaCuna(tipo, raza, necesitaAlimentacion, Tamanio, requerimientos, Usuario, Telefono); 
        ListaDeCasaCuna.add(casaCuna); 
    }  
    
    public static void RegistrarAsociacion(String nombre, String mission,
            String cedulaJuridica, String telefono, String correo, String paginaWeb, Usuario usuario){  
        Asociacion asociacion = new Asociacion(nombre, mission, cedulaJuridica, telefono, correo, paginaWeb, usuario);  
        ListaDeAsociaciones.add(asociacion);
        
    } 
    
    public static void RegistrarDonacion(Usuario usuario, Asociacion asociacion, int monto){ 
        Donaciones donaciones = new Donaciones(usuario, asociacion, monto);
        ListaDeDonaciones.add(donaciones);
    }
    
    public static void RegistrarTipoMascotas(String nombreDeMascota){  
       TipoDeMascota tipoDeMascota = new TipoDeMascota(nombreDeMascota); 
       ListaDeTiposMascotas.add(tipoDeMascota);
    } 
    
    public static void RegistrarAdoptante(String nombre, String correo, String telefono, String lugarDeResidencia,
                                          String cantidadDeEspacio, Boolean reportado, Usuario usuario, Icon Imagen){
        Adoptante adoptante = new Adoptante(nombre, correo, telefono, lugarDeResidencia, cantidadDeEspacio,
                                            reportado, usuario, Imagen); 
        ListaDeAdoptantes.add(adoptante);
    }
    
    public static void RegistrarTipoRazas(int posicionDeMascotaEnLista, String TipoRaza){ 
        ListaDeTiposMascotas.get(posicionDeMascotaEnLista).agregarTipoDeRaza(TipoRaza);
    } 
    
    public static void RegistrarColores(String color){
        ListaDeColores.add(color);
    }
    
    public static void RegistrarEstados(String estado){
        ListaDeEstados.add(estado);
    }
    
    public static void RegistrarTamanio(String tamanio){
        ListaDeTamanios.add(tamanio);
    }

    public static void RegistrarMascota(String text, Object selectedItem, Object selectedItem0, Object selectedItem1, String text0, String estado, String text1, Usuario get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
    
    //***************************************
    //          Arrays para ComboBox        * 
    //*************************************** 
    
    public static Object[] HacerArrayDeTipos(){  
        ArrayList<String> nombresDeTipo = new ArrayList<>(); 
        for(int i = 0; i < ListaDeTiposMascotas.size(); i++){
            nombresDeTipo.add(ListaDeTiposMascotas.get(i).getNombre());
        }
        return nombresDeTipo.toArray(); 
    } 
    
    public static Object[] HacerArrayDeRazas(int Index){
        ArrayList<String> nombresDeRazas = new ArrayList<>();
        for(int i = 0; i < ListaDeTiposMascotas.get(Index).getSize(); i++){
            nombresDeRazas.add(ListaDeTiposMascotas.get(Index).getTipoDeRazas().get(i));
        }
        return nombresDeRazas.toArray();
    }
            
    public static Object[] ColoresToArray(){ 
        return ListaDeColores.toArray();
    }
    
    public static Object[] TamanioToArray(){
        return ListaDeTamanios.toArray();
    } 
    
    public static Object[] EstadosToArray(){
        return ListaDeEstados.toArray(); 
    } 
    
        
    public static int getUsuarioActual() {
        return UsuarioActual;
    }

    public static void setUsuarioActual(int aUsuarioActual) {
        UsuarioActual = aUsuarioActual;
    }
}
