package pong;

import java.awt.Color;
import javax.swing.JFrame;



public class pong
{
    
    
 public static void main(String[] args)
    { 
        //This is where the application actually starts running
        
        //and here we create our pong object, which is a jframe. we give it the
        //width and height arguments.
        
        int WIDTH = 800;
        int HEIGHT = 800;
        JFrame pongFrame = new JFrame();
        
       pongFrame.setVisible(true);
       pongFrame.setResizable(false);
       pongFrame.setLocationRelativeTo(null);
       pongFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       pongFrame.setSize(WIDTH, HEIGHT);
       pongFrame.setBackground(Color.BLACK);
    }
            
              
}

