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
        Administrador.RegistrarUsuario("Luis", "Alonso", "Luis", "1212121212",  "123",true, "LuisAlonso@yahoo.com");
        Administrador.RegistrarUsuario("Marie", "Chang", "May", "90274194",  "123",true, "Marie@yahoo.com"); 
        Administrador.ListaDeUsuarios.get(0).setCasaCuna(true);
        Administrador.ListaDeUsuarios.get(1).setCasaCuna(true);
        
        Administrador.ListaDeUsuarios.get(0).setAdoptante(true);
        Administrador.ListaDeUsuarios.get(1).setAdoptante(true);
        Administrador.ListaDeUsuarios.get(2).setAdoptante(true);
        Administrador.ListaDeUsuarios.get(3).setAdoptante(true);
        
        Administrador.ListaDeUsuarios.get(0).setAsociacion(true);
        Administrador.ListaDeUsuarios.get(1).setAsociacion(true);
        Administrador.ListaDeUsuarios.get(2).setAsociacion(true);
        Administrador.ListaDeUsuarios.get(3).setAsociacion(true);
        
        Administrador.RegistrarMascota("Chester", "Perro", "Golden", "04/04/2014", "Perdido", "Grande", Administrador.ListaDeUsuarios.get(0), "12", "Golden Retriever", "1000", "Es muy peludo",null); 
        Administrador.RegistrarMascota("Mark", "Perro", "Blanco", "29/10/2014", "Perdido", "Pequeño", Administrador.ListaDeUsuarios.get(2), "563", "Poodle", "2000", "Es muy tranuilo",null);
        
        Administrador.RegistrarMascota("Pepito", "Perro", "Negro", "02/10/2014", "Encontrado", "Pequeño", Administrador.ListaDeUsuarios.get(1), " ", "Rottwieler", "3000", "Ladra mucho por la noche",null);
        Administrador.RegistrarMascota("Bark", "Perro", "Gris", "04/11/2014", "Encontrado", "Grande", Administrador.ListaDeUsuarios.get(1), " ", "Husky", "4000", "Le gusta pasear",null);
        
        Administrador.RegistrarCasaCuna("Perro", "Golden Retriever", true , "Pequeño", "ninguno", Administrador.ListaDeUsuarios.get(0) , "2234251");  
        Administrador.RegistrarCasaCuna("Gato", "Any", false, "Pequeño", "ninguno", Administrador.ListaDeUsuarios.get(1), "8833241");
        
        Administrador.RegistrarAdoptante("Miuyin", "miuyinyong@yahoo.com", "88223422", "Santa Anna", "100 metros", true, Administrador.ListaDeUsuarios.get(0));
        Administrador.RegistrarAdoptante("Santiago", "SantiMendez@yahoo.com", "9284921", "Coronado", "500 metros", false, Administrador.ListaDeUsuarios.get(1));
        Administrador.RegistrarAdoptante("Kevin", "Kevin@yahoo.com", "703244921", "Coronado", "200 metros", true, Administrador.ListaDeUsuarios.get(2)); 
        Administrador.RegistrarAdoptante("Luis", "LuisAlonsez@yahoo.com", "2031424", "Palmares", "300 metros", false, Administrador.ListaDeUsuarios.get(3));  
        
        Administrador.RegistrarAsociacion("Paws and Claws", "Reescatar animales", "1234B", "23982028", "pawsnclaws@gmail.com", "Facebook/PawsnClaws", Administrador.ListaDeUsuarios.get(0)); 
        Administrador.RegistrarAsociacion("Rescue Shelter", "Reescatar animales", "239A05", "3940285", "rescueshelter@gmail.com", "Facebook/RescueShelter", Administrador.ListaDeUsuarios.get(1));
        Administrador.RegistrarAsociacion("ASPCA", "Animal Welfare", "90285C", "9083253", "aspca@gmail.com", "Facebook/aspca", Administrador.ListaDeUsuarios.get(2)); 
        Administrador.RegistrarAsociacion("Animal People", "Para el maltrato de animales", "18G0", "10003428", "animalpeople@gmail.com", "Facebook/animalpeople", Administrador.ListaDeUsuarios.get(3)); 
        Administrador.RegistrarAsociacion("BirdLife International", "Rescatar aves", "902B", "70239583", "birdLife@gmail.com", "Facebook/BirdLife", Administrador.ListaDeUsuarios.get(4));
        
        Administrador.RegistrarDonacion(Administrador.ListaDeUsuarios.get(0), Administrador.ListaDeAsociaciones.get(0), 10000, "09/11/2014");
        
        Administrador.RegistrarColores("Blanco");
        Administrador.RegistrarColores("Negro");
        Administrador.RegistrarColores("Cafe");  
        Administrador.RegistrarColores("Golden");  
        Administrador.RegistrarColores("Gris"); 
        Administrador.RegistrarColores("Otro"); 
        Administrador.RegistrarColores("Cualquiera"); 
        
        Administrador.RegistrarEstados("Perdido"); 
        Administrador.RegistrarEstados("Encontrado"); 
        Administrador.RegistrarEstados("Identificado");  
        Administrador.RegistrarEstados("En Adopción"); 
        Administrador.RegistrarEstados("Adoptado");  
        Administrador.RegistrarEstados("Recuperado");  
        
        Administrador.RegistrarTamanio("Pequeño");
        Administrador.RegistrarTamanio("Mediano"); 
        Administrador.RegistrarTamanio("Grande");  
        Administrador.RegistrarTamanio("Cualquiera");
        
        Administrador.RegistrarTipoMascotas("Perro");
        Administrador.RegistrarTipoMascotas("Gato");  
        Administrador.RegistrarTipoMascotas("Hamster"); 
        Administrador.RegistrarTipoMascotas("Conejo"); 
        Administrador.RegistrarTipoMascotas("Caballo");   
        Administrador.RegistrarTipoMascotas("Otro");
        Administrador.RegistrarTipoMascotas("Cualquiera"); 
        
        Administrador.RegistrarTipoRazas(0, "Golden Retriever"); 
        Administrador.RegistrarTipoRazas(0, "Poodle");
        Administrador.RegistrarTipoRazas(0, "Chiwawa"); 
        Administrador.RegistrarTipoRazas(0, "Yorkie Terrier"); 
        Administrador.RegistrarTipoRazas(0, "Shitzu");  
        Administrador.RegistrarTipoRazas(0, "Bulldog"); 
        Administrador.RegistrarTipoRazas(0, "Labrador Retriever");  
        Administrador.RegistrarTipoRazas(0, "Bull Terrier"); 
        Administrador.RegistrarTipoRazas(0, "Pug");  
        Administrador.RegistrarTipoRazas(0, "Husky"); 
        Administrador.RegistrarTipoRazas(0, "Rottwieler");
        Administrador.RegistrarTipoRazas(0, "Cocker Spaniel"); 
        Administrador.RegistrarTipoRazas(0, "Collie");  
        Administrador.RegistrarTipoRazas(0, "Shetland Sheepdog"); 
        Administrador.RegistrarTipoRazas(0, "Akita");  
        Administrador.RegistrarTipoRazas(0, "Fox Terrier"); 
        Administrador.RegistrarTipoRazas(0, "Otro"); 
        Administrador.RegistrarTipoRazas(0, "Cualquiera"); 
        
        Administrador.RegistrarTipoRazas(1, "SnowShoe");   
        Administrador.RegistrarTipoRazas(1, "Tonkinese");  
        Administrador.RegistrarTipoRazas(1, "Somali"); 
        Administrador.RegistrarTipoRazas(1, "Oriental"); 
        Administrador.RegistrarTipoRazas(1, "Persian"); 
        Administrador.RegistrarTipoRazas(1, "Munchkin");  
        Administrador.RegistrarTipoRazas(1, "Bombay");  
        Administrador.RegistrarTipoRazas(1, "Garfield"); 
        Administrador.RegistrarTipoRazas(1, "Otro"); 
        Administrador.RegistrarTipoRazas(1, "Cualquiera");
        
        Administrador.RegistrarTipoRazas(2, "Syrian"); 
        Administrador.RegistrarTipoRazas(2, "Russian"); 
        Administrador.RegistrarTipoRazas(2, "Roborovski Dwarf");
        Administrador.RegistrarTipoRazas(2, "Chinese");   
        Administrador.RegistrarTipoRazas(2, "Otro"); 
        Administrador.RegistrarTipoRazas(2, "Cualquiera"); 
        
        Administrador.RegistrarTipoRazas(3, "Holland Lop");  
        Administrador.RegistrarTipoRazas(3, "Mini Lop"); 
        Administrador.RegistrarTipoRazas(3, "Lionhead rabbit");
        Administrador.RegistrarTipoRazas(3, "Rex rabbit"); 
        Administrador.RegistrarTipoRazas(3, "Dutch rabbit"); 
        Administrador.RegistrarTipoRazas(3, "Miniature Lop"); 
        Administrador.RegistrarTipoRazas(3, "Otro");  
         Administrador.RegistrarTipoRazas(3, "Cualquiera"); 
        
        Administrador.RegistrarTipoRazas(4, "Arabian"); 
        Administrador.RegistrarTipoRazas(4, "Thoroughbred"); 
        Administrador.RegistrarTipoRazas(4, "Andalusian");
        Administrador.RegistrarTipoRazas(4, "Mustang"); 
        Administrador.RegistrarTipoRazas(4, "Miniature lop");
        Administrador.RegistrarTipoRazas(4, "Percheron");
        Administrador.RegistrarTipoRazas(4, "Fjord"); 
        Administrador.RegistrarTipoRazas(4, "Falabella");
        Administrador.RegistrarTipoRazas(4, "Mongolian"); 
        Administrador.RegistrarTipoRazas(4, "Otro"); 
        Administrador.RegistrarTipoRazas(4, "Cualquiera"); 
        
    }
    
}
