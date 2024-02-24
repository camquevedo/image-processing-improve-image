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
public class Ecualizacion {
    
    //BufferedImage imageActual;
    Histograma histo = new Histograma();
    int[] hR, hG, hB, hGris;
    float[] pR, pG, pB, p, PR, PG, PB, P, eR, eG, eB, e;
    int[] ER, EG, EB, E;
    
    /*public void setImage(BufferedImage imageActual2){
        imageActual = imageActual2;
    }*/
    
    public void llenarH(BufferedImage imageActual){
        histo.llenarHistograma(imageActual);
        
        hR = histo.getHistoR();
        hG = histo.getHistoG();
        hB = histo.getHistoB();
        hGris = histo.getHistoGris();
    }
    
    public BufferedImage ecualizacion(BufferedImage imageActual){
        
        p = new float[256];
        pR = new float[256];
        pG = new float[256];
        pB = new float[256];
        
        P = new float[256];
        PR = new float[256];
        PG = new float[256];
        PB = new float[256];
        
        e = new float[256];
        eR = new float[256];
        eG = new float[256];
        eB = new float[256];
        
        E = new int[256];
        ER = new int[256];
        EG = new int[256];
        EB = new int[256];
        
        // Llenado de histograma
        llenarH(imageActual);
        
        //for(int i=0; i<hR.length; i++)
            //System.out.println("hR[" + i + "] = " + hR[i]);
        
        for (int i=0; i<256; i++){
            // Calculo de probabilidad individual
            pR[i] = hR[i] / (float)(imageActual.getHeight() * imageActual.getWidth());
            pG[i] = hG[i] / (float)(imageActual.getHeight() * imageActual.getWidth());
            pB[i] = hB[i] / (float)(imageActual.getHeight() * imageActual.getWidth());
            p[i] = hGris[i] / (float)(imageActual.getHeight() * imageActual.getWidth());
            
            //System.out.println("pR[" + i + "] = " + pR[i]);
            
            // Calculo de probabilidad acumulada
            
            PR[i] += pR[i];
            PG[i] += pG[i];
            PB[i] += pB[i];
            P[i] += p[i];
            
            if(i != 0){
                PR[i] += PR[i-1];
                PG[i] += PG[i-1];
                PB[i] += PB[i-1];
                P[i] += P[i-1];
            }
            
            /*if ( i==0){
                PR[i] = pR[i];
                PG[i] = pG[i];
                PB[i] = pB[i];
                P[i]  =  p[i];
            }else{
                PR[i] = pR[i] + PR[i-1];
                PG[i] = pG[i] + PG[i-1];
                PB[i] = pB[i] + PB[i-1];
                P[i]  =  p[i] + P[i-1];
            }*/
            
            
            //System.out.println("PB[" + i + "] = " + PB[i]); 
            
            //Ecualizacion
            eR[i] = PR[i]*255;
            eG[i] = PG[i]*255;
            eB[i] = PB[i]*255;
            e[i] = P[i] * 255;
            //System.out.println("eB[" + i + "] = " + eB[i]);
            
            // Redondeo de ecualizacion
            ER[i] = Math.round(eR[i]);
            EG[i] = Math.round(eG[i]);
            EB[i] = Math.round(eB[i]);
            E[i] = Math.round(e[i]);
            //System.out.println();
        }
        
        for (int i=0;i < imageActual.getWidth();i++){
            for (int j=0;j< imageActual.getHeight();j++){
                
                Color colorAux = new Color(imageActual.getRGB(i, j));
                int R = ER[colorAux.getRed()];
                int G = EG[colorAux.getGreen()];
                int B = EB[colorAux.getBlue()];
                int gris = (R + G + B) /3;
                
                imageActual.setRGB(i, j, new Color (R,G,B).getRGB());
            }
        }
        return imageActual;
    }
}
