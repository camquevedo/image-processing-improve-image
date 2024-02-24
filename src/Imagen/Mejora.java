package Imagen;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Acuña Eliana
 * @author Cortes Nicolas
 * @author Quevedo Camilo
 */

public class Mejora {
    
    //int histograma[]=new int[256];
    /**
     * @param imageActual es una variable BufferedImage encargada de mantener 
     * el formato de lo que se va a trabajar asi como de transportar la 
     * informacion.
     */
    
    /**
     * 
     */
    public BufferedImage imageActual;
    
    public  BufferedImage AbrirImagen() {
        /**
         * @param bmp elemento BufferedImage que se inicializara
         */
        BufferedImage bmp = null;
        /**
         * @param selector de tipo JFileChooser, asiste en la seleccion de
         * archivo desde el disco duro
         */
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Seleccione una imagen");
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG & GIF & BMP & PNG", "jpg", "gif", "bmp", "PNG", "png");
        selector.setFileFilter(filtroImagen);
        int flag = selector.showOpenDialog(null);
        if (flag == JFileChooser.APPROVE_OPTION) {
            try {
                File imagenSeleccionada = selector.getSelectedFile();
                bmp = ImageIO.read(imagenSeleccionada);
            } catch (IOException e) {
            }

        }
        imageActual = bmp;
        /**
         * @return la funcion devolvera bmp el cual es una BufferedImage con la
         * transofrmacion de tipo File a tipo BufferedImage
         */
        return bmp;
    }
}
         

   
     




