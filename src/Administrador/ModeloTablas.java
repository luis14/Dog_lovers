package Administrador;

import javax.swing.table.DefaultTableModel;
import Usuario.Usuario;

public class ModeloTablas { 
    private static DefaultTableModel modeloMascotas; 
    private static DefaultTableModel modeloCasaCuna; 
    private static DefaultTableModel modeloAdoptantes; 
    
    public static DefaultTableModel tablaMascotas(){ 
        String titulos[] = {"ID", "Estado", "Color", "Tipo", "Tamanio", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){
            modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo());
        } 
        
        return modeloMascotas;
    }  
    
      public static DefaultTableModel tablaMascotas(Usuario usuario, String estado){ 
        String titulos[] = {"ID", "Estado", "Color", "Tipo", "Tamanio", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){ 
            if(Administrador.ListaDeMascotas.get(i).getUsuario() == usuario && Administrador.ListaDeMascotas.get(i).getEstado().equals(estado))
            modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo());
        } 
        
        return modeloMascotas;
    } 
      
       public static DefaultTableModel tablaMascotas(String TipoDeConsulta, String Consulta){ 
        String titulos[] = {"ID","Estado", "Color", "Tipo", "Tamanio", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos);  
        //ArrayList<Mascota> tipodemascota = Administrador.ListaDeMascotas;
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){ 
            if(TipoDeConsulta.equals("Estado") && Administrador.ListaDeMascotas.get(i).getEstado().equals(Consulta)){
            modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo()); 
            } 
            if(TipoDeConsulta.equals("Color") && Administrador.ListaDeMascotas.get(i).getColor().equals(Consulta)){
            modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo()); 
            }
            if(TipoDeConsulta.equals("Tipo") && Administrador.ListaDeMascotas.get(i).getTipo().equals(Consulta)){
            modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo()); 
            } 
            if(TipoDeConsulta.equals("Tamanio") && Administrador.ListaDeMascotas.get(i).getTamanio().equals(Consulta)){
            modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo()); 
            } 
            if(TipoDeConsulta.equals("Chip") && Administrador.ListaDeMascotas.get(i).getChip().equals(Consulta)){
            modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo()); 
            }
            if(TipoDeConsulta.equals("Raza") && Administrador.ListaDeMascotas.get(i).getRaza().equals(Consulta)){
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
    
     public static DefaultTableModel tablaCasaCuna(String TipoDeConsulta, String Consulta){ 
        String titulos[] = {"ID","Tipo", "Raza", "Tamanio", "NecesitaAlimentacion", "Telefono", "Requerimientos"};  
        String informacion[][] = {}; 
        modeloCasaCuna = new DefaultTableModel(informacion, titulos);  
        for(int i = 0; i < Administrador.ListaDeCasaCuna.size(); i++){ 
            if(TipoDeConsulta.equals("Tipo") && Administrador.ListaDeCasaCuna.get(i).getTipo().equals(Consulta)){
            modeloCasaCuna.addRow(Administrador.ListaDeCasaCuna.get(i).arreglo()); 
            } 
            if(TipoDeConsulta.equals("Tamanio") && Administrador.ListaDeCasaCuna.get(i).getTamanio().equals(Consulta)){
            modeloCasaCuna.addRow(Administrador.ListaDeCasaCuna.get(i).arreglo()); 
            } 
            if(TipoDeConsulta.equals("Raza") && Administrador.ListaDeCasaCuna.get(i).getRaza().equals(Consulta)){
            modeloCasaCuna.addRow(Administrador.ListaDeCasaCuna.get(i).arreglo()); 
            }  
            if(TipoDeConsulta.equals("Raza") && Administrador.ListaDeCasaCuna.get(i).getNecesitaAlimentacion().equals(Consulta)){
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
     
     public static DefaultTableModel tablaListaNegra(){
        String titulos[] = {"ID", "Nombre", "Telefono", "Correo", "Lista Negra", "Calificacion"}; 
        String informacion[][] = {}; 
        modeloAdoptantes= new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeAdoptantes.size(); i++){ 
            if(Administrador.ListaDeAdoptantes.get(i).getReportado() == true){
                modeloCasaCuna.addRow(Administrador.ListaDeCasaCuna.get(i).arreglo()); 
            }     
        }
        return modeloAdoptantes; 
    }  
     
}
    

