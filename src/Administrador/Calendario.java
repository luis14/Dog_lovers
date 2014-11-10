/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Administrador;
import java.util.*;
import java.text.*;

/**
 *
 * @author LuisAlonso
 */
public class Calendario {
  
    GregorianCalendar calendario = (GregorianCalendar) GregorianCalendar.getInstance();
    /*Date ahora = new Date();
    DateFormat fecha_completa = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("es"));
    String fecha = fecha_completa.format(ahora);*/
    
    public String getFecha(){
        return "" + calendario.getTime();    
    }
    
    public void setFecha(int anio, int mes, int dia){
        calendario.set(anio, mes-1, dia);
}
}
