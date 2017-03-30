/*
This is where the big functions are located and the "core" of the game essentially
 */


package pong;
import java.awt.Graphics2D;

public class game {
    
    boolean running = true;
    
    pongFrame mainFrame;
    pongBall mainBall;
    
    public game(){
        mainFrame = new pongFrame();
        mainBall = new pongBall(mainFrame.getSize().width, mainFrame.getSize().height);
        
        while(running){
            getInput();
            process();
            draw();
        }
    }
    
    public void getInput(){
        
    }
    
    public void process(){
        //mainBall.move();
    }
    
    public void draw(){
        mainBall.paintComponent();
    }
    
    /////////////////////////////////////////////////////////////////////////
    
     public static void main(String[] args)
    { 
        game mainGame = new game();
    }
}
