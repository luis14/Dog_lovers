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
    Date ahora = new Date();
    DateFormat fecha_completa = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("es"));
    String fecha = fecha_completa.format(ahora);
    
    public String getfecha(){
        return fecha;
}
}
