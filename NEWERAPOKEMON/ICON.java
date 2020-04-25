package NEWERAPOKEMON;

import java.awt.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
  
public class ICON extends Canvas{  
      
    public void paint(Graphics g) {  
  
       
        Icon imagePokemon = new ImageIcon(getClass().getResource("/GOLD.png"));
     
          
    }  
        public static void main(String[] args) {  
        ICON m = new ICON();  
        JFrame f = new JFrame();  
        f.add(m);  
        f.setSize(800,600);  
        f.setVisible(true);  
    }  
  
}  