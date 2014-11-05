package Administrador;

import java.util.ArrayList; 

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

    public int getId() {
        return id;
    }

    public ArrayList<String> getTipoDeRazas() {
        return TipoDeRazas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public static int getCantidadTipoDeMascotas() {
        return cantidadTipoDeMascotas;
    }

}
