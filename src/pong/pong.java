package pong;

import java.awt.Color;
import javax.swing.JFrame;



public class pong extends JFrame
{
    JFrame pong = new JFrame();
    final static int WIDTH = 800, HEIGHT = 800;
    
    public pong() 
    {
       pong.setVisible(true);
       pong.setResizable(false);
       pong.setLocationRelativeTo(null);
       pong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
     
       
       pong.setSize(WIDTH,HEIGHT);
       pong.setBackground(Color.BLACK);     
    }
 
    
    
 public static void main(String[] args)
    { 
    }
            
              
}

