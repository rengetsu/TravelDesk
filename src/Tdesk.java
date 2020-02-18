
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raimo
 */
public class Tdesk {
    
   
    public boolean chLogin(String email, String password){
       
        if(email.equals("rai@gmail.com") && password.equals("123"))
            return true;
      return false;
    }
    
    public Icon Resizeimg(final Image img, final int y, final int x) {
        return new ImageIcon(img.getScaledInstance(x, y, 1));
    }
    
    public boolean isImage(File file){
        try {
            return ImageIO.read(file) != null;
        } catch (Exception e) {
            return false;
        }
    }
}
