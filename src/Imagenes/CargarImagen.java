/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Santiago
 */
public class CargarImagen {
    public CargarImagen() {
		// TODO Auto-generated constructor stub
		
		
	}
	public BufferedImage Cargar(){
		try{
			
			javax.swing.JFileChooser j = new javax.swing.JFileChooser(); 
			j.showOpenDialog(j);
			String path = j.getSelectedFile().getAbsolutePath();
			BufferedImage img = ImageIO.read(new File(path));
			return img;
			
		}catch(IOException e){
			
		}
		return null;
	}
}
