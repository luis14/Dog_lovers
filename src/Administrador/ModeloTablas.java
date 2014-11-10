package Administrador;

import javax.swing.table.DefaultTableModel;
import Administrador.Adoptante;
import java.util.ArrayList;

public class ModeloTablas { 
    private static DefaultTableModel modeloMascotas; 
    private static DefaultTableModel modeloCasaCuna; 
    private static DefaultTableModel modeloAdoptantes;  
    private static DefaultTableModel modeloUsuarios;  
    private static DefaultTableModel modeloDonaciones; 
    private static DefaultTableModel modeloAsociaciones; 
    private static int contadorUniversal; 
    
    
    public static DefaultTableModel tablaMascotas(){ 
        String titulos[] = {"ID", "Fecha","Nombre", "Estado", "Color", "Tipo", "Tamaño", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos); 
        int contadorParaInterfaz = 0;
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){
            modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo()); 
            contadorParaInterfaz++;
        } 
        contadorUniversal = contadorParaInterfaz;
        return modeloMascotas;
    }  
    
      public static DefaultTableModel tablaMascotas(Usuario usuario, String estado){ 
        String titulos[] = {"ID", "Fecha","Nombre", "Estado", "Color", "Tipo", "Tamaño", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos);
        int contadorParaInterfaz = 0;
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){ 
            if(Administrador.ListaDeMascotas.get(i).getUsuario() == usuario && Administrador.ListaDeMascotas.get(i).getEstado().equals(estado)){
                modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo());
                    contadorParaInterfaz++; 
            }
        } 
        contadorUniversal = contadorParaInterfaz;
        return modeloMascotas;
    } 
      
       public static DefaultTableModel tablaMascotas(String Estado, String Color, String Tipo, String Tamanio, String Raza){ 
        String titulos[] = {"ID", "Fecha","Nombre", "Estado", "Color", "Tipo", "Tamaño", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos);  
        int contadorParaInterfaz = 0;
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){   
            int contador = 0;
            if(Administrador.ListaDeMascotas.get(i).getEstado().equals(Estado)){
                contador++; 
            } 
            if(Administrador.ListaDeMascotas.get(i).getColor().equals(Color) || Administrador.ListaDeMascotas.get(i).getColor().equals("Cualquiera") ){
                contador++;
            }
            if(Administrador.ListaDeMascotas.get(i).getTipo().equals(Tipo) || Administrador.ListaDeMascotas.get(i).getTipo().equals("Cualquiera") ){
                contador++;
            } 
            if(Administrador.ListaDeMascotas.get(i).getTamanio().equals(Tamanio) || Administrador.ListaDeMascotas.get(i).getTamanio().equals("Cualquiera") ){
                contador++; 
            } 
            if(Administrador.ListaDeMascotas.get(i).getRaza().equals(Raza) || Administrador.ListaDeMascotas.get(i).getRaza().equals("Cualquiera")){
                contador++; 
            } 
            if(contador == 5){
                modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo());
                contadorParaInterfaz++;
            }
        }  
        
        contadorUniversal = contadorParaInterfaz;
        return modeloMascotas;
        
    } 
       
      public static DefaultTableModel tablaMascotasChip(String chip){ 
        String titulos[] = {"ID", "Fecha","Nombre", "Estado", "Color", "Tipo", "Tamaño", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos);
        int contadorParaInterfaz = 0;
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){ 
            if(Administrador.ListaDeMascotas.get(i).getChip().equals(chip)){
                modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo());
                    contadorParaInterfaz++; 
            }
        } 
        contadorUniversal = contadorParaInterfaz;
        return modeloMascotas;
    }
       
       public static DefaultTableModel tablaMatch(int id, String estadoOpuesto){ 
        String titulos[] = {"ID", "Fecha","Nombre", "Estado", "Color", "Tipo", "Tamaño", "Chip", "Raza"}; 
        String informacion[][] = {};  
        int contadorParaInterfaz = 0;
        modeloMascotas = new DefaultTableModel(informacion, titulos); 
        String ColorDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getColor(); 
        String ChipDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getChip(); 
        String TamanioDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getTamanio(); 
        String TipoDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getTipo(); 
        String RazaDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getRaza(); 
        
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){ 
           int contador = 0;  
           Boolean encontrado = false; 
           if(Administrador.ListaDeMascotas.get(i).getEstado().equals(estadoOpuesto)){ 
               encontrado = true;
           }
           if(ColorDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getColor())){
               contador++; 
           } 
           if(ChipDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getChip()) || ChipDeMascotaMatch.equals(" ")){
               contador++; 
           } 
           if(TipoDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getTipo())){
               contador++; 
           } 
           if(TamanioDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getTamanio())){
               contador++; 
           } 
           if(RazaDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getRaza())){
               contador++; 
           } 
           if(contador >=3 && encontrado == true){ 
              modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo()); 
              contadorParaInterfaz++;
           }
            
        } 
        contadorUniversal = contadorParaInterfaz;
        return modeloMascotas;
    } 
    
    public static DefaultTableModel tablaCasaCuna(){  
        String titulos[] = {"ID", "Tipo", "Raza", "Tamaño", "NecesitaAlimentacion", "Telefono", "Requerimientos"}; 
        String informacion[][] = {}; 
        int contadorParaInterfaz = 0;
        modeloCasaCuna= new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeCasaCuna.size(); i++){
            modeloCasaCuna.addRow(Administrador.ListaDeCasaCuna.get(i).arreglo());
            contadorParaInterfaz++;
        }
        contadorUniversal = contadorParaInterfaz;
        return modeloCasaCuna;
    } 
    
     public static DefaultTableModel tablaCasaCuna(String Tipo, String Tamanio, String Raza, String Alimentacion){ 
        String titulos[] = {"ID","Tipo", "Raza", "Tamaño", "NecesitaAlimentacion", "Telefono", "Requerimientos"};  
        String informacion[][] = {}; 
        modeloCasaCuna = new DefaultTableModel(informacion, titulos);  
        int contadorParaInterfaz = 0;
        for(int i = 0; i < Administrador.ListaDeCasaCuna.size(); i++){  
            int contador = 0; 
            if(Administrador.ListaDeCasaCuna.get(i).getTipo().equals(Tipo) || Administrador.ListaDeCasaCuna.get(i).getTipo().equals("Cualquiera") ){
                contador++;
            } 
            if(Administrador.ListaDeCasaCuna.get(i).getTamanio().equals(Tamanio) || Administrador.ListaDeCasaCuna.get(i).getTamanio().equals("Cualquiera")){
                contador++;
            } 
            if(Administrador.ListaDeCasaCuna.get(i).getRaza().equals(Raza) || Administrador.ListaDeCasaCuna.get(i).getRaza().equals("Culaquiera")){ 
                contador++; 
            }   
            if(Administrador.ListaDeCasaCuna.get(i).getNecesitaAlimentacion().equals(Alimentacion) || Administrador.ListaDeCasaCuna.get(i).getNecesitaAlimentacion().equals("Cualquiera")){
                contador++;
            }
            if(contador == 4){
                modeloCasaCuna.addRow(Administrador.ListaDeCasaCuna.get(i).arreglo());
                contadorParaInterfaz++;
            }
            
        }  
        contadorUniversal = contadorParaInterfaz;
        return modeloCasaCuna;
    } 
    
    public static DefaultTableModel tablaAdoptantes(){
        String titulos[] = { "ID","Nombre", "Telefono", "Correo", "Lista Negra", "Calificacion"}; 
        String informacion[][] = {};  
        modeloAdoptantes= new DefaultTableModel(informacion, titulos);
        int contadorParaInterfaz = 0; 
        for(int i = 0; i < Administrador.ListaDeAdoptantes.size(); i++){
            modeloAdoptantes.addRow(Administrador.ListaDeAdoptantes.get(i).arreglo());
            contadorParaInterfaz++; 
        } 
        contadorUniversal = contadorParaInterfaz;
        return modeloAdoptantes; 
    } 
    
 
     public static DefaultTableModel tablaAdoptantes(String Calificacion){
        String titulos[] = { "ID","Nombre", "Telefono", "Correo", "Lista Negra", "Calificacion"}; 
        String informacion[][] = {}; 
        modeloAdoptantes= new DefaultTableModel(informacion, titulos);
        int contadorParaInterfaz = 0; 
        for(int i = 0; i < Administrador.ListaDeAdoptantes.size(); i++){ 
            if(Administrador.ListaDeAdoptantes.get(i).getStringCalificacion().equals(Calificacion)){
                modeloAdoptantes.addRow(Administrador.ListaDeAdoptantes.get(i).arreglo()); 
                contadorParaInterfaz++;
            }     
        }
        contadorUniversal = contadorParaInterfaz;
        return modeloAdoptantes; 
    }  
     
     public static DefaultTableModel tablaUsuarios(){ 
         String titulos[] = {"ID","Nombre", "Apellido", "Usuario", "Correo", "Telefono", "Si es Admin"}; 
         String informacion[][] = {};  
         modeloUsuarios= new DefaultTableModel(informacion, titulos);
         int contadorParaInterfaz = 0; 
         for(int i = 0; i < Administrador.ListaDeUsuarios.size(); i++){  
                modeloUsuarios.addRow(Administrador.ListaDeUsuarios.get(i).arreglo()); 
                contadorParaInterfaz++;
        }
        contadorUniversal = contadorParaInterfaz;
        return modeloUsuarios;    
     } 
     
      public static DefaultTableModel tablaUsuariosAdmins(){ 
         String titulos[] = {"ID","Nombre", "Apellido", "Usuario", "Correo", "Telefono", "Si es Admin"}; 
         String informacion[][] = {};  
         modeloUsuarios= new DefaultTableModel(informacion, titulos);
         int contadorParaInterfaz = 0; 
         for(int i = 0; i < Administrador.ListaDeUsuarios.size(); i++){  
             if(Administrador.ListaDeUsuarios.get(i).getEsAdmin() == false){
                modeloUsuarios.addRow(Administrador.ListaDeUsuarios.get(i).arreglo()); 
                contadorParaInterfaz++;
             }
        }
        contadorUniversal = contadorParaInterfaz;
        return modeloUsuarios;    
     } 
      
       public static DefaultTableModel tablaUsuariosAdmins(String Nombre){ 
         String titulos[] = {"ID","Nombre", "Apellido", "Usuario", "Correo", "Telefono", "Si es Admin"}; 
         String informacion[][] = {};  
         modeloUsuarios= new DefaultTableModel(informacion, titulos);
         int contadorParaInterfaz = 0; 
         for(int i = 0; i < Administrador.ListaDeUsuarios.size(); i++){  
             if(Administrador.ListaDeUsuarios.get(i).getEsAdmin() == false && Nombre.toLowerCase().equals(Administrador.ListaDeUsuarios.get(i).getNombre().toLowerCase())){
                modeloUsuarios.addRow(Administrador.ListaDeUsuarios.get(i).arreglo()); 
                contadorParaInterfaz++;
             }
        }
        contadorUniversal = contadorParaInterfaz;
        return modeloUsuarios;    
     } 
      
     
     public static DefaultTableModel tablaListaNegra(){
        String titulos[] = {"ID", "Nombre", "Telefono", "Correo", "Calificacion"}; 
        String informacion[][] = {}; 
        modeloAdoptantes= new DefaultTableModel(informacion, titulos); 
        int contadorParaInterfaz = 0; 
        for(int i = 0; i < Administrador.ListaDeAdoptantes.size(); i++){ 
            if(Administrador.ListaDeAdoptantes.get(i).getReportado() == true){
                modeloAdoptantes.addRow(Administrador.ListaDeAdoptantes.get(i).arreglo());
                contadorParaInterfaz++;
            }     
        }
        contadorUniversal = contadorParaInterfaz;
        return modeloAdoptantes; 
    }   
        
    
     public static DefaultTableModel TablafiltroListaNegra(String stringBuscando){ 
	String titulos[] = {"ID", "Nombre", "Telefono", "Correo", "Calificacion"};  
	String informacion[][] = {}; 
        modeloAdoptantes = new DefaultTableModel(informacion, titulos); 
        int contadorParaInterfaz = 0; 
	for(int i = 0; i < Administrador.ListaDeAdoptantes.size(); i++){
            if(Administrador.ListaDeAdoptantes.get(i).getNombre().toLowerCase().equals(stringBuscando.toLowerCase())){
                modeloAdoptantes.addRow(Administrador.ListaDeAdoptantes.get(i).arreglo()); 
                contadorParaInterfaz++;
            }	
        } 
        contadorUniversal = contadorParaInterfaz;
        return modeloAdoptantes; 
     }
    
     
     public static DefaultTableModel tablaDeDonaciones(){
         String titulos[]= {"Donante", "Asociacion", "Monto"}; 
         String informacion[][] = {}; 
         modeloDonaciones = new DefaultTableModel(informacion, titulos); 
         int contadorParaInterfaz = 0; 
         for(int i = 0; i < Administrador.ListaDeDonaciones.size() ; i++){
             modeloDonaciones.addRow(Administrador.ListaDeDonaciones.get(i).arreglo());
             contadorParaInterfaz++;
         } 
         contadorUniversal = contadorParaInterfaz; 
         return modeloDonaciones;
     }  
     
     public static DefaultTableModel tablaDeDonaciones(String Nombre){
         String titulos[]= {"Donante", "Asociacion", "Fecha", "Monto"}; 
         String informacion[][] = {}; 
         modeloDonaciones = new DefaultTableModel(informacion, titulos); 
         int contadorParaInterfaz = 0; 
         for(int i = 0; i < Administrador.ListaDeDonaciones.size() ; i++){ 
             if(Nombre.toLowerCase().equals(Administrador.ListaDeDonaciones.get(i).getUsuarioName().toLowerCase()) 
                     || Nombre.toLowerCase().equals(Administrador.ListaDeDonaciones.get(i).getAsociacionName().toLowerCase())){
                 modeloDonaciones.addRow(Administrador.ListaDeDonaciones.get(i).arreglo());
                 contadorParaInterfaz++;
                 
             }
         } 
         contadorUniversal = contadorParaInterfaz; 
         return modeloDonaciones;
     } 
     
     
      public static DefaultTableModel tablaDeDonacionesTotales(){
         String titulos[]= {"Donante", "Asociacion", "Fecha", "Monto"}; 
         String informacion[][] = {}; 
         modeloDonaciones = new DefaultTableModel(informacion, titulos);  
         int contadorParaInterfaz = 0; 
         for(int i = 0; i < Administrador.ListaDeDonaciones.size() ; i++){
             modeloDonaciones.addRow(Administrador.ListaDeDonaciones.get(i).arreglo()); 
             contadorParaInterfaz++; 
         } 
         contadorUniversal = contadorParaInterfaz; 
         return modeloDonaciones;
     }
      
      public static DefaultTableModel tablaAsociaiones(){
          String titulos[]= {"ID", "Nombre", "Missión", "Cedula Jurídica","Telefono", "Correo", "Pagina Web"};
          String informacion[][] = {}; 
          modeloAsociaciones = new DefaultTableModel(informacion, titulos); 
          int contadorParaInterfaz = 0; 
          for(int i = 0; i < Administrador.ListaDeAsociaciones.size(); i++){
              modeloAsociaciones.addRow(Administrador.ListaDeAsociaciones.get(i).arreglo()); 
              contadorParaInterfaz++; 
          }
          contadorUniversal = contadorParaInterfaz; 
          return modeloAsociaciones;
      }
      
       public static DefaultTableModel tablaAsociaiones(String Nombre){
          String titulos[]= {"ID", "Nombre", "Missión", "Cedula Jurídica","Telefono", "Correo", "Pagina Web"};
          String informacion[][] = {}; 
          int contadorParaInterfaz = 0; 
          modeloAsociaciones = new DefaultTableModel(informacion, titulos); 
          for(int i = 0; i < Administrador.ListaDeAsociaciones.size(); i++){ 
              if(Nombre.toLowerCase().equals(Administrador.ListaDeAsociaciones.get(i).getNombre().toLowerCase())){
                  modeloAsociaciones.addRow(Administrador.ListaDeAsociaciones.get(i).arreglo()); 
                  contadorParaInterfaz++; 
              }
          } 
          contadorUniversal = contadorParaInterfaz; 
          return modeloAsociaciones;
      }
     
     public static String getContadorUniversal() {
	String contadorUni = Integer.toString(contadorUniversal);
	return contadorUni;
    }
     
}
    

