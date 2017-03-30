/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Color;


public class pongBall extends JPanel{
   private float radius;
   private float xPos;
   private float yPos;
   private float xVelocity;
   private float yVelocity;
   private Color color;
   
   int leftEdge;
   int topEdge;
   int rightEdge;
   int bottomEdge;

   
   public void paintComponent(){
       this.getGraphics().setColor(color);
       this.getGraphics().fillOval((int)(radius), (int)(radius), (int)(2 * radius), (int)(2 * radius));
   }
   
 
   
   public void move(){
       xPos += xVelocity;
       yPos += yVelocity;
       
       if(xPos <= leftEdge || xPos >= rightEdge){
           xVelocity *= -1;
       }
       
       if(yPos <= topEdge || yPos >= bottomEdge){
           yVelocity *= -1;
       }
   }
   
  
   public pongBall(int _rightEdge, int _bottomEdge){
        radius = 200;
        xPos = 600;
        yPos = 600;
        xVelocity = 0;
        yVelocity = 0;
        color = Color.blue;

        leftEdge = 0;
        topEdge = 0;
        rightEdge = _rightEdge;
        bottomEdge = _bottomEdge;
   }
}
