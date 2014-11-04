package Principal;

import Administrador.Administrador;
import interfaz.JUsuario;

public class Principal {

    public static void main(String[] args) {
        JUsuario  usuario = new JUsuario();
        usuario.setVisible(true); 
        Administrador.RegistrarUsuario("Miuyin", "Yong", "miumiu", "21212121", "123", false, "miuyinyong@yahoo.com");
        Administrador.RegistrarUsuario("Santiago", "Mendez", "Santi", "111222111", "123", false, "SanitMendez@yahoo.com");
        Administrador.RegistrarUsuario("Kevin", "Quesada", "Kev","222111222",  "123", true, "KevinQ@yahoo.com");
        Administrador.RegistrarUsuario("Luis", "Alonso", "LuisA", "1212121212",  "123",false, "LuisAlonso@yahoo.com");
        
        Administrador.RegistrarMascota("Chester", "Perro", "Golden", null, "Perdido", "Grande", Administrador.ListaDeUsuarios.get(0), "12");
        Administrador.RegistrarMascota("Bark", "Perro", "Negro", null, "Encontrado", "Pequenio", Administrador.ListaDeUsuarios.get(1), null);
        Administrador.RegistrarMascota("Mark", "Perro", "White", null, "Perdido", "Pequenio", Administrador.ListaDeUsuarios.get(2), "563");
        
        Administrador.RegistrarCasaCuna("Perros", "Golden", true , "small", "ninguno", Administrador.ListaDeUsuarios.get(0) , "2234251"); 
        
        Administrador.RegistrarAdoptante("Miuyin", "miuyinyong@yahoo.com", "88223422", "Santa Anna", "100 metros", false, Administrador.ListaDeUsuarios.get(0));
        
        Administrador.RegistrarColores("Blanco");
        Administrador.RegistrarColores("Negro");
        Administrador.RegistrarColores("Cafe"); 
        Administrador.RegistrarColores("Golden");  
        
        Administrador.RegistrarTipoMascotas("Perro");
        Administrador.RegistrarTipoMascotas("Gato"); 
        Administrador.RegistrarTipoMascotas("Caballos"); 
        Administrador.RegistrarTipoMascotas("Loras");  
        //System.out.println(Administrador.ListaDeTiposMascotas.get(0).getId());
        //System.out.println(Administrador.ListaDeTiposMascotas.get(0).getNombre());
        
        Administrador.RegistrarTipoRazas(0, "Golden Retriever"); 
        Administrador.RegistrarTipoRazas(0, "Poodle");
        Administrador.RegistrarTipoRazas(0, "Chiwawa"); 
        Administrador.RegistrarTipoRazas(0, "Yorkie"); 
        Administrador.RegistrarTipoRazas(0, "Shitzu");
        
        //System.out.println(Administrador.ListaDeTiposMascotas.get(0).getTipoDeRazas().get(0));
    }
    
}
