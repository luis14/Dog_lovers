/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Administrador;
import java.util.Calendar;

/**
 *
 * @author LuisAlonso
 */
public class Calendario {
    
    public static void main(String[] args) {
      Calendar calendario = Calendar.getInstance();
      
      int anio = calendario.get(Calendar.YEAR);
      int mes = calendario.get(Calendar.MONTH);      // 0 a 11
      int dia = calendario.get(Calendar.DAY_OF_MONTH);
      int hora = calendario.get(Calendar.HOUR_OF_DAY);
      int minuto = calendario.get(Calendar.MINUTE);
      int segundo = calendario.get(Calendar.SECOND);
   
      System.out.printf("Ahora es %4d/%02d/%02d %02d:%02d:%02d\n",  
          anio, mes+1, dia, hora, minuto, segundo);
   }
}
