package Administrador;

import javax.swing.table.DefaultTableModel;

public class ModeloTablas { 
    private static DefaultTableModel modeloMascotas; 
    private static DefaultTableModel modeloCasaCuna; 
    private static DefaultTableModel modeloAdoptantes;  
    private static DefaultTableModel modeloUsuarios;  
    private static DefaultTableModel modeloDonaciones;
    
    
    public static DefaultTableModel tablaMascotas(){ 
        String titulos[] = {"ID", "Nombre", "Estado", "Color", "Tipo", "Tamanio", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){
            modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo());
        } 
        
        return modeloMascotas;
    }  
    
      public static DefaultTableModel tablaMascotas(Usuario usuario, String estado){ 
        String titulos[] = {"ID", "Nombre", "Estado", "Color", "Tipo", "Tamanio", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){ 
            if(Administrador.ListaDeMascotas.get(i).getUsuario() == usuario && Administrador.ListaDeMascotas.get(i).getEstado().equals(estado))
                modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo());
        } 
        
        return modeloMascotas;
    } 
      
       public static DefaultTableModel tablaMascotas(String Estado, String Color, String Tipo, String Tamanio, String Chip, String Raza){ 
        String titulos[] = {"ID", "Nombre", "Estado", "Color", "Tipo", "Tamanio", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos);  
        //ArrayList<Mascota> tipodemascota = Administrador.ListaDeMascotas;
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
            if(Administrador.ListaDeMascotas.get(i).getChip().equals(Chip) || Administrador.ListaDeMascotas.get(i).getChip().equals("")){
                contador++; 
            }
            if(Administrador.ListaDeMascotas.get(i).getRaza().equals(Raza) || Administrador.ListaDeMascotas.get(i).getRaza().equals("Cualquiera")){
                contador++; 
            }
            if(contador == 6){
                modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo());
            }
        }  
        
        return modeloMascotas;
        
    }  
       
       public static DefaultTableModel tablaMatch(int id){ 
        String titulos[] = {"ID", "Nombre", "Estado", "Color", "Tipo", "Tamanio", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos); 
        String ColorDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getColor(); 
        String ChipDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getChip(); 
        String TamanioDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getTamanio(); 
        String TipoDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getTipo(); 
        String RazaDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getRaza(); 
        
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){ 
           int contador = 0;  
           Boolean encontrado = false; 
           if(Administrador.ListaDeMascotas.get(i).getEstado().equals("Encontrado")){ 
               encontrado = true;
           }
           if(ColorDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getColor())){
               contador++; 
           } 
           if(ChipDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getChip())){
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
           }
            
        } 
        
        return modeloMascotas;
    } 
    
    public static DefaultTableModel tablaCasaCuna(){  
        String titulos[] = {"ID", "Tipo", "Raza", "Tamanio", "NecesitaAlimentacion", "Telefono", "Requerimientos"}; 
        String informacion[][] = {}; 
        modeloCasaCuna= new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeCasaCuna.size(); i++){
            modeloCasaCuna.addRow(Administrador.ListaDeCasaCuna.get(i).arreglo());
        }
        return modeloCasaCuna;
    } 
    
     public static DefaultTableModel tablaCasaCuna(String Tipo, String Tamanio, String Raza){ 
        String titulos[] = {"ID","Tipo", "Raza", "Tamanio", "NecesitaAlimentacion", "Telefono", "Requerimientos"};  
        String informacion[][] = {}; 
        modeloCasaCuna = new DefaultTableModel(informacion, titulos);  
        for(int i = 0; i < Administrador.ListaDeCasaCuna.size(); i++){  
            int contador = 0; 
            if(Administrador.ListaDeCasaCuna.get(i).getTipo().equals(Tipo)){
                contador++;
            } 
            if(Administrador.ListaDeCasaCuna.get(i).getTamanio().equals(Tamanio)){
                contador++;
            } 
            if(Administrador.ListaDeCasaCuna.get(i).getRaza().equals(Raza)){ 
                contador++; 
            }  
            if(contador == 3){
                modeloCasaCuna.addRow(Administrador.ListaDeCasaCuna.get(i).arreglo());
            }
            
        } 
        return modeloCasaCuna;
    } 
    
    public static DefaultTableModel tablaAdoptantes(){
        String titulos[] = { "ID","Nombre", "Telefono", "Correo", "Lista Negra", "Calificacion"}; 
        String informacion[][] = {}; 
        modeloAdoptantes= new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeAdoptantes.size(); i++){
            modeloAdoptantes.addRow(Administrador.ListaDeAdoptantes.get(i).arreglo());
        }
        return modeloAdoptantes; 
    } 
    
 
     public static DefaultTableModel tablaAdoptantes(String Calificacion){
        String titulos[] = { "ID","Nombre", "Telefono", "Correo", "Lista Negra", "Calificacion"}; 
        String informacion[][] = {}; 
        modeloAdoptantes= new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeAdoptantes.size(); i++){ 
            if(Administrador.ListaDeAdoptantes.get(i).getCalificacion().equals(Calificacion)){
                modeloCasaCuna.addRow(Administrador.ListaDeCasaCuna.get(i).arreglo()); 
            }     
        }
        return modeloAdoptantes; 
    }  
     
     public static DefaultTableModel tablaUsuarios(){ 
         String titulos[] = {"ID","Nombre", "Apellido", "Usuario", "Correo", "Telefono", "Si es Admin"}; 
         String informacion[][] = {}; 
         for(int i = 0; i < Administrador.ListaDeUsuarios.size(); i++){ 
                modeloUsuarios.addRow(Administrador.ListaDeUsuarios.get(i).arreglo());    
        }
        return modeloUsuarios; 
         
     }
     
     public static DefaultTableModel tablaListaNegra(){
        String titulos[] = {"ID", "Nombre", "Telefono", "Correo", "Calificacion"}; 
        String informacion[][] = {}; 
        modeloAdoptantes= new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeAdoptantes.size(); i++){ 
            if(Administrador.ListaDeAdoptantes.get(i).getReportado() == true){
                modeloAdoptantes.addRow(Administrador.ListaDeAdoptantes.get(i).arreglo()); 
            }     
        }
        return modeloAdoptantes; 
    }   
     
     public static DefaultTableModel tablaDeDonaciones(){
         String titulos[]= {"Donante", "Asociacion", "Fecha", "Monto"}; 
         String informacion[][] = {}; 
         modeloDonaciones = new DefaultTableModel(informacion, titulos); 
         return modeloDonaciones;
     }
     
}
    

