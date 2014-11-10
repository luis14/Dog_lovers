/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import java.util.Date;

/**
 *
 * @author miuyin
 */
public class Donaciones { 
    private Usuario usuario; 
    private Asociacion asociacion; 
    private int monto; 
    private String fecha; 
    
    public Donaciones(Usuario usuario, Asociacion asociacion, int monto){
        this.usuario = usuario; 
        this.asociacion = asociacion; 
        this.monto = monto; 
        
}

    /**
     * @return the usuario
     */
    public String getUsuarioName() {
        return usuario.getNombre();
    } 
   

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the asociacion
     */
    public String getAsociacionName() {
        return asociacion.getNombre();
    }

    /**
     * @param asociacion the asociacion to set
     */
    public void setAsociacion(Asociacion asociacion) {
        this.asociacion = asociacion;
    }

    /**
     * @return the monto
     */
    public int getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }

    
    public String[] arreglo(){ 
        String[] msg = {getUsuarioName(), getAsociacionName(), Integer.toString(monto)}; 
        return msg;
    }
}
