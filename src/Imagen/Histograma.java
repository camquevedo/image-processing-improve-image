/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Acuña Eliana
 * @author Cortes Nicolas
 * @author Quevedo Camilo
 * 
 */

public class Histograma {
    //
    /** @param histograma variable tipo arreglo int que almacenara el histograma
     * en escala de grises.
     */
    int histograma[]=new int[256];
    
    int histoR[]=new int[256]; /** @param histoR variable tipo arreglo int que almacenara el histograma del canal Rojo*/
    int histoG[]=new int[256]; /** @param histoG variable tipo arreglo int que almacenara el histograma del canal Verde*/
    int histoB[]=new int[256]; /** @param histoB variable tipo arreglo int que almacenara el histograma del canal Azul*/
    /**
     * 
     */
    public BufferedImage imageActual; /** @param imageActual variable tipo BufferedImage que transportara la informacion de colores y pixeles*/
    
    /** @param imageActual2 es una imagen enviada para que se realize su lectura y extraccion de histograma*/
    public void llenarHistograma(BufferedImage imageActual2){
        
        imageActual = imageActual2;
        int mediaPixel;
       
        for (int i=0;i < imageActual.getWidth();i++){
            for (int j=0;j< imageActual.getHeight();j++){

                Color c1=new Color(this.imageActual.getRGB(i, j));
                
                histoR[c1.getRed()] ++;
                histoG[c1.getGreen()]++;
                histoB[c1.getBlue()]++;
                
                mediaPixel = ((c1.getRed() + c1.getGreen() + c1.getBlue()) / 3);
                histograma[mediaPixel]++; 
 
            }
        }
    }
    public int[] getHistoR(){
        return histoR; /** @return histoR devuelve el valor del histograma en canal rojo*/
    }
    public int[] getHistoG(){
        return histoG; /** @return histoG devuelve el valor del histograma en canal verde*/
    }
    
    public int[] getHistoB(){
        return histoB; /** @return histoB devuelve el valor del histograma en canal Azul*/
    }
    public int[] getHistoGris(){
        return histograma;/** @return histogramadevuelve el valor del histograma en escala de gris*/
    }
    
    public void HistoGraph(Graphics g){ /** @param g elemento de la interfaz donde se graficará*/
        
        int max=histograma[0];
        for(int h=0;h<256;h++){
         if(histograma[h]>max)
            max=histograma[h];         
        }
        for(int h=0;h<256;h++){
            float f=(float)histograma[h]/(float)max;
            int i=(int)(f*180);                
            g.setColor(Color.black);
            g.drawLine(20+h, 200, 20+h, 200-i);
        }
        g.drawString(String.valueOf(max), 0, 20);
        //return max;
    }
    
    public void HistoGraphR(Graphics g){    /** @param g elemento de la interfaz donde se graficará*/
        
        int max=histoR[0];
        for(int h=0;h<256;h++){
         if(histoR[h]>max)
            max=histoR[h];         
        }
        for(int h=0;h<256;h++){
            float f=(float)histoR[h]/(float)max;
            int i=(int)(f*180);                
            g.setColor(Color.red);
            g.drawLine(20+h, 200, 20+h, 200-i);
        }
        g.drawString(String.valueOf(max), 0, 20);
        //return max;
    }
    
    public void HistoGraphG(Graphics g){    /** @param g elemento de la interfaz donde se graficará*/
        
        int max=histoG[0];
        for(int h=0;h<256;h++){
         if(histoG[h]>max)
            max=histoG[h];         
        }
        for(int h=0;h<256;h++){
            float f=(float)histoG[h]/(float)max;
            int i=(int)(f*180);                
            g.setColor(Color.green);
            g.drawLine(20+h, 200, 20+h, 200-i);
        }
        g.drawString(String.valueOf(max), 0, 20);
        //return max;
    }
    
    public void HistoGraphB(Graphics g){    /** @param g elemento de la interfaz donde se graficará*/
        
        int max=histoB[0];
        for(int h=0;h<256;h++){
         if(histoB[h]>max)
            max=histoB[h];         
        }
        for(int h=0;h<256;h++){
            float f=(float)histoB[h]/(float)max;
            int i=(int)(f*180);                
            g.setColor(Color.blue);
            g.drawLine(20+h, 200, 20+h, 200-i);
        }
        g.drawString(String.valueOf(max), 0, 20);
        //return max;
    }
    //
}
