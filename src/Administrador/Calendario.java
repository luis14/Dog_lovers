package Administrador;
import java.util.*;

public class Calendario {
  
    private static GregorianCalendar calendario = (GregorianCalendar) GregorianCalendar.getInstance(); // crea el calendario
    
    public String getFecha(){ // metodo para convertir la fecha a un string
        return "" + calendario.getTime();    
    }
    
    public static void setFecha(int anio, int mes, int dia){ // metodo para cambiar la fecha
        calendario.set(anio, mes-1, dia);
    }
}
