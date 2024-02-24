/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagen;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author Acuña Eliana
 * @author Cortes Nicolas
 * @author Quevedo Camilo
 * 
 */
public class BrilloContraste {
    
    // variables globales
    BufferedImage imageActual;
    
    
    public void setImagenActual(BufferedImage imageEntrante){
        imageActual = imageEntrante;
    }
    
    public BufferedImage Brillo (BufferedImage imageActual2, int Brillo, int bR, int bG, int bB) {
        Color colorAux;
        //imageActual = imageActual2;
        setImagenActual(imageActual2);
        
        for (int i = 0; i < imageActual.getWidth(); i++) {
            for (int j = 0; j < imageActual.getHeight(); j++) {                
                colorAux = new Color(this.imageActual.getRGB(i, j));
                
                int R = colorAux.getRed() + Brillo + bR;
                if(R<=0)R=0;
                if(R>=255)R=255;
                
                int G = colorAux.getGreen() + Brillo + bG;
                if(G<=0)G=0;
                if(G>=255)G=255;
                
                int B = colorAux.getBlue() + Brillo + bB;
                if(B<=0)B=0;
                if(B>=255)B=255;
                
                imageActual.setRGB(i, j, new Color (R,G,B).getRGB());
            }
        }
        return imageActual;
    }
    
    public BufferedImage Negativo( BufferedImage imageActual2){
        //BufferedImage neg;
        
        setImagenActual(imageActual2);
        
        for (int i = 0; i < imageActual.getWidth(); i++) {
            for (int j = 0; j < imageActual.getHeight(); j++) {                
                Color colorAux = new Color(this.imageActual.getRGB(i, j));
                
                int R = 255 - colorAux.getRed();
                if(R<=0)R=0;
                if(R>=255)R=255;
                
                int G = 255- colorAux.getGreen();
                if(G<=0)G=0;
                if(G>=255)G=255;
                
                int B = 255 - colorAux.getBlue();
                if(B<=0)B=0;
                if(B>=255)B=255;
                
                imageActual.setRGB(i, j, new Color (R,G,B).getRGB());
            }
        }
        
        return imageActual;
    }
    
    public BufferedImage Contraste(BufferedImage imageActual2, float Contraste){ 
        setImagenActual(imageActual2);
        //int mediaPixel, colorSRGB;
        int R,G,B;
        Color colorAux;
        //Color colorF;  
        for( int i = 0; i < imageActual.getWidth(); i++ ){
            for( int j = 0; j < imageActual.getHeight(); j++ ){                
                colorAux=new Color(imageActual.getRGB(i, j));               
                int m = 255/2;
                
                R = Math.round((colorAux.getRed()-m)*Contraste+m);
                if (R < 0) {R = 0;}if (R > 255) {R = 255;}
                G = Math.round((colorAux.getGreen()-m)*Contraste+m);
                if (G < 0) {G = 0;}if (G > 255) {G = 255;}
                B = Math.round((colorAux.getBlue()-m)*Contraste+m);
                if (B < 0) {B = 0;}if (B > 255) {B = 255;}
                
                //colorF=new Color(R,G,B);
                //mediaPixel = ((colorF.getRed() + colorF.getGreen() + colorF.getBlue()) / 3);
                //colorSRGB = (mediaPixel << 8) | (mediaPixel << 16) | mediaPixel;
                //imageActual.setRGB(i, j, colorSRGB);
                imageActual.setRGB(i, j, new Color (R,G,B).getRGB());
            }
        }
        return imageActual;    
    }
    
    
    public int porcentajeRuido=1;
    
    public BufferedImage ContAuto(BufferedImage imageActual2) {
        setImagenActual(imageActual2);
        int histogram[][]=new int[3][256];
        int total=0;
        for (int x=0;x < imageActual.getWidth();x++){
            for (int y=0;y < imageActual.getHeight();y++){
                Color c1=new Color(imageActual.getRGB(x, y));
                int rgb[]={
                    c1.getRed(),
                    c1.getGreen(),
                    c1.getBlue(),              
                };
                for (int canal=0;canal < 3;canal++){
                    histogram[canal][rgb[canal]]++;                    
                }
                total++; 
            }
        }
        
        int min[]={-1,-1,-1};
        int acumMin[]={0, 0, 0};
        int max[]={-1,-1,-1};
        int acumMax[]={0, 0, 0};
        
        for (int canal=0;canal < 3;canal++){
            for (int tono=0;tono < 256;tono++){
                if (min[canal]==-1){
                    acumMin[canal]+=histogram[canal][tono];
                    if (acumMin[canal] > total*porcentajeRuido/100){
                        min[canal]=tono;
                    }
                }
                if (max[canal]==-1){
                    acumMax[canal]+=histogram[canal][255-tono];
                    if (acumMax[canal] > total*porcentajeRuido/100){
                        max[canal]=255-tono;
                    }
                }
            }
        }        
        for (int x=0;x < imageActual.getWidth();x++){
            for (int y=0;y < imageActual.getHeight();y++){
                Color c1=new Color(imageActual.getRGB(x, y));
                int rgb[]={
                        c1.getRed(),
                        c1.getGreen(),
                        c1.getBlue()
                };
                for (int canal=0;canal < 3;canal++){
                    double factor=256.0/(max[canal]-min[canal]);
                    rgb[canal]=(int)((rgb[canal]-min[canal])*factor);
                    rgb[canal]=Math.min(255, Math.max(0, rgb[canal]));
                }
                imageActual.setRGB(x, y, new Color(rgb[0],rgb[1],rgb[2]).getRGB());           
            }
        }      
     return imageActual;
    }
}
