/*
 Created a new class for this and renamed it to something that makes more sense
 */
package pong;

import javax.swing.JFrame;
public class pongFrame extends JFrame
{
    
    JFrame pong = new JFrame();
    
    public static int WIDTH = 800, HEIGHT = 800;
   
  
    public pongFrame ()
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
              
}
