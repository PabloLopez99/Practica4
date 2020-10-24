/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class GraphDisplay extends JPanel{
    
    private Graphics g;
    
   
    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        
        this.setBackground(Color.BLUE);
        this.setForeground(Color.BLACK);
        
    }
    
   public void drawCircle(int x, int y){
       g.drawOval(x,y,50,30);
   }
   public Graphics getGraphics(){
       return g;
   }
    
}
