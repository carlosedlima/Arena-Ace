
package utils;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;


public class DecoratedDesktopPane extends JDesktopPane{
    private Image img;
    
   
    
    public DecoratedDesktopPane(){
       
    }
    public DecoratedDesktopPane(String caminhoImagem){
        img = new ImageIcon(this.getClass().getResource(caminhoImagem)).getImage();
    }
    
    
    public void setImage(String image){
        if (image != null){
          img = new ImageIcon(getClass().getResource(image)).getImage();
        }else{
          img = null;
        }
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
       super.paintComponent(g);
        if (img != null) {
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        } else {
           setOpaque(true);
        }
    }
    
}
