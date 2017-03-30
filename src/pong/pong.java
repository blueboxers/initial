package pong;

import java.awt.Color;
import javax.swing.JFrame;



public class pong extends JFrame
{
    
    public pong (int _width, int _height) 
    {
        //the class pong is already a jframe, so we don't need to create a 
        //jframe inside of it. I set it up so that it takes in two arguments
        //when you create it: width and height
       setVisible(true);
       setResizable(false);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
     
       
       setSize(_width ,_height);
       setBackground(Color.BLACK);     
    }
 
    
    
 public static void main(String[] args)
    { 
        //This is where the application actually starts running
        
        //and here we create our pong object, which is a jframe. we give it the
        //width and height arguments.
        
        int WIDTH = 800;
        int HEIGHT = 800;
        pong pongFrame = new pong(WIDTH,HEIGHT);
    }
            
              
}

