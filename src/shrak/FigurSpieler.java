/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrak;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

/**
 *
 * @author mauri
 */
public class FigurSpieler extends Figur{
    
    private boolean KeyForward;
    private boolean KeyBackwards;
    private boolean KeyLeft;
    private boolean KeyRight;
    private Design design;
    
    public FigurSpieler(int x,int y){
    
        aktuellePositionX = x;
        aktuellePositionY = y;
        
        design = new Design();
        
        
        
    }
    
    @Override
    public void update() {  
        
       
        
        if(this.KeyForward){
        
            aktuellePositionY -= Speed * Shrak.timeScinceLastUpdate;
            System.out.println("Hoch");
            
        }
        if(this.KeyBackwards){
        
            aktuellePositionY += Speed * Shrak.timeScinceLastUpdate;
            System.out.println("Runter");
            
        }
        if(this.KeyLeft){
        
            aktuellePositionX -= Speed * Shrak.timeScinceLastUpdate;
            System.out.println("Links");
        }
        if(this.KeyRight){
        
            aktuellePositionX += Speed * Shrak.timeScinceLastUpdate;
            System.out.println("Rechts");
        }
        
        setTexture();
        
    }

    @Override
    public BufferedImage getTexture() {
        
        return this.aktuellesBild;
        
    }

    @Override
    public void setTexture() {
        
        this.aktuellesBild = design.getNextTexture();
        
    }

    @Override
    public double getPositionY() {
    
        return this.aktuellePositionY;
    
    }

    @Override
    public double getPositionX() {
    
        return this.aktuellePositionX;
    
    }
    
    public class mKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent ke) {

        if(ke.getKeyCode() == KeyEvent.VK_A){
            
            KeyLeft = true;
            
        }
        if(ke.getKeyCode() == KeyEvent.VK_D){
            
            KeyRight = true;
        
        }
        if(ke.getKeyCode() == KeyEvent.VK_W){
            
           
            KeyForward = true;
        
        }
        if(ke.getKeyCode() == KeyEvent.VK_S){
            
            KeyBackwards= true;
           
        
        }
        
    }

    @Override
        public void keyReleased(KeyEvent ke) {
        
          if(ke.getKeyCode() == KeyEvent.VK_A){
            
            System.out.println("A gedrückt");
            KeyLeft = false;
        
        }
        if(ke.getKeyCode() == KeyEvent.VK_D){
            
            System.out.println("D gedrückt");
            KeyRight = false;
        
        }
        if(ke.getKeyCode() == KeyEvent.VK_W){
            
           System.out.println("W gedrückt");
            KeyForward = false;
        
        }
        if(ke.getKeyCode() == KeyEvent.VK_S){
            
            System.out.println("S gedrückt");
            KeyBackwards= false;
          
        
        }
    
    }
      
    @Override
        public void keyTyped(KeyEvent ke) {
    }
    
}
    
    
        
}

  
    


