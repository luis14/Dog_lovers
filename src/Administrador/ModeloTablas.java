package Administrador;

import java.util.ArrayList; 
import javax.swing.table.DefaultTableModel;
import mascota.Mascota;

public class ModeloTablas { 
    private static DefaultTableModel modeloMascotas; 
    private static DefaultTableModel modeloCasaCuna; 
    private static DefaultTableModel modeloAdoptantes; 
    
    public static DefaultTableModel tablaMascotas(){ 
        String titulos[] = {"Estado", "Color", "Tipo", "Tamanio", "Chip", "Raza"}; 
        String informacion[][] = {}; 
        modeloMascotas = new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){
            modeloMascotas.addRow(Administrador.ListaDeMascotas.get(i).arreglo());
        } 
        
        return modeloMascotas;
    } 
    
    public static DefaultTableModel tablaCasaCuna(){  
        String titulos[] = {"Tipo", "Raza", "Tamanio", "NecesitaAlimentacion", "Telefono", "Requerimientos"}; 
        String informacion[][] = {}; 
        modeloCasaCuna= new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeCasaCuna.size(); i++){
            modeloCasaCuna.addRow(Administrador.ListaDeCasaCuna.get(i).arreglo());
        }
        return modeloCasaCuna;
    } 
    
    public static DefaultTableModel tableAdoptantes(){
        String titulos[] = {"Nombre", "Telefono", "Correo", "Lista Negra", "Calificacion"}; 
        String informacion[][] = {}; 
        modeloAdoptantes= new DefaultTableModel(informacion, titulos);
        for(int i = 0; i < Administrador.ListaDeAdoptantes.size(); i++){
            modeloAdoptantes.addRow(Administrador.ListaDeAdoptantes.get(i).arreglo());
        }
        return modeloAdoptantes; 
    }
    
}
