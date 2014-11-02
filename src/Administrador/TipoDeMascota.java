/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;
import java.util.ArrayList; 

/**
 *
 * @author miuyin
 */
public class TipoDeMascota { 
    private static int cantidadTipoDeMascotas = 0; 
    private final int id; 
    private ArrayList<String> TipoDeRazas = new ArrayList<>();  
    private String Nombre;
    
    public TipoDeMascota(String Nombre){
        this.Nombre = Nombre; 
        id = cantidadTipoDeMascotas++;
    } 
    
    public void agregarTipoDeRaza(String Raza){
        TipoDeRazas.add(Raza);  
    }  

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the tipoDeRazas
     */
    public ArrayList<String> getTipoDeRazas() {
        return TipoDeRazas;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
     /**
     * @return the cantidadTipoDeMascotas
     */
    public static int getCantidadTipoDeMascotas() {
        return cantidadTipoDeMascotas;
    }

}
