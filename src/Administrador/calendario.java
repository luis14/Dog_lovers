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
public class calendario {
    
     public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      
      int anio = cal.get(Calendar.YEAR);
      int mes = cal.get(Calendar.MONTH);      // 0 a 11
      int dia = cal.get(Calendar.DAY_OF_MONTH);
      int hora = cal.get(Calendar.HOUR_OF_DAY);
      int minuto = cal.get(Calendar.MINUTE);
      int segundo = cal.get(Calendar.SECOND);
   
      System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n",  
          anio, mes+1, dia, hora, minuto, segundo);
   }
} 

