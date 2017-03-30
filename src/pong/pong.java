package pong;

import java.awt.Color;
import javax.swing.JFrame;


public class pong extends JFrame
{
    
    JFrame pong = new JFrame();
    
    public static int WIDTH = 800, HEIGHT = 800;
   
  
    public pong ()
    {
      pong.setTitle("Sooper Pung");
      pong.setSize(WIDTH, HEIGHT);
     
      pong.setVisible(true);
      pong.setResizable(false);
      pong.setLocationRelativeTo(null);
      pong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pong.setFocusable(true);
      pong.requestFocus();
      
      
      
      pack();
    }
        
    
    
    
 public static void main(String[] args)
    { 
        new pong();
    }
            
              
}

