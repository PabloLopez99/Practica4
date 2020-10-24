/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class GraphDisplay extends JPanel{
    
    private Graphics g;
    private List<Point> points;
   
    
    public GraphDisplay(){
        points = new ArrayList<Point>(25);
    }
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
    
        this.setBackground(Color.BLUE);
        this.setForeground(Color.BLACK);
        
        for (Point p : points) {
          g.fillOval(p.x, p.y, 10, 10);
            
        }
        
        
    }
    
   public void addPoints(int x, int y){
       Point point= new Point(x,y);
       points.add(point);
       
       
      
   }
   public Graphics getGraphics(){
       return g;
   }
    
}
