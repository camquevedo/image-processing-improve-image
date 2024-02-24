/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagen;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * @author Acunha Eliana
 * @author Cortes Nicolas
 * @author Quevedo Camilo
 */

public class N_esima {
    
    BufferedImage imageActual;
    
    public void setImagenActual(BufferedImage imageEntrante){
        imageActual = imageEntrante;
    }
    
    public BufferedImage potencia(float n){
        //
        Color colorAux;
        
        for (int i = 0; i < imageActual.getWidth(); i++) {
            for (int j = 0; j < imageActual.getHeight(); j++) {                
                colorAux = new Color(this.imageActual.getRGB(i, j));
                float [] pixel = new float[4];
                colorAux.getRGBComponents(pixel);
                for(int k = 0; k < 4; k++)
                    pixel[k] = (float) Math.pow(pixel[k], n);
                Color nPix = new Color (pixel[0],pixel[1],pixel[2], pixel[3]);
                imageActual.setRGB(i, j, nPix.getRGB());
            }
        }
        return imageActual;
    }
    
    public BufferedImage raiz(float n){
        //
        Color colorAux;
        
        for (int i = 0; i < imageActual.getWidth(); i++) {
            for (int j = 0; j < imageActual.getHeight(); j++) {                
                colorAux = new Color(this.imageActual.getRGB(i, j));
                float [] pixel = new float[4];
                colorAux.getRGBComponents(pixel);
                for(int k = 0; k < 4; k++)
                    pixel[k] = (float) Math.pow(pixel[k], n);
                Color nPix = new Color (pixel[0],pixel[1],pixel[2], pixel[3]);
                imageActual.setRGB(i, j, nPix.getRGB());
            }
        }
        return imageActual;
    }
    
    public BufferedImage Logaritmo(float n){
        //
        Color colorAux;
        
        for (int i = 0; i < imageActual.getWidth(); i++) {
            for (int j = 0; j < imageActual.getHeight(); j++) {                
                colorAux = new Color(this.imageActual.getRGB(i, j));
                float [] pixel = new float[4];
                colorAux.getRGBComponents(pixel);
                for(int k = 0; k < 4; k++){
                    pixel[k] = n *(float)Math.log(1+pixel[k]);
                    if(pixel[k]<=0)pixel[k]=0;
                    if(pixel[k]>=1)pixel[k]=1;
                }
                Color nPix = new Color (pixel[0],pixel[1],pixel[2], pixel[3]);
                imageActual.setRGB(i, j, nPix.getRGB());
            }
        }
        return imageActual;
    }
    
    public BufferedImage Gamma(float n){
        //
        Color colorAux;
        
        for (int i = 0; i < imageActual.getWidth(); i++) {
            for (int j = 0; j < imageActual.getHeight(); j++) {                
                colorAux = new Color(this.imageActual.getRGB(i, j));
                
                int R = colorAux.getRed();
                R = (int)Math.pow((double) R, (double)n);
                if(R<=0)R=0;
                if(R>=255)R=255;
                
                int G = colorAux.getGreen();
                G = (int)Math.pow((double) G, (double)n);
                if(G<=0)G=0;
                if(G>=255)G=255;
                
                int B = colorAux.getBlue();
                B = (int)Math.pow((double) B, (double)n);
                if(B<=0)B=0;
                if(B>=255)B=255;
                
                imageActual.setRGB(i, j, new Color (R,G,B).getRGB());
            }
        }
        return imageActual;
    }
}
