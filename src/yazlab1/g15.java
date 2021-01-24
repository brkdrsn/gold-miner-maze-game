/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yazlab1;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ADMIN
 */
public class g15 extends  gold {
      

   boolean gizli=false;
int sayi,kac;
boolean use=false;
    public boolean getUse() {
        return use;
    }

    public void setg15(Image g15) {
        this.g15 = g15;
    }

    public void setUse(boolean use) {
        this.use = use;
    }
@Override
    public void setKac(int kac) {
        this.kac = kac;
    }@Override
public int getKac() {
        return kac;
    }
@Override
      public boolean isGizli() {
        return gizli;
    }

@Override
    public void setGizli(boolean gizli) {
        this.gizli = gizli;
    }
   private Image g15;
    public g15() {
        gizli=false;
        AltinID=1;
        super.deger=15; 
        ImageIcon img = new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\yazlab1\\15.jpg");
        g15=img.getImage();
        
    }
    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public int getSayi() {
        return sayi;
    }
     public Image getg15(){
        
        return g15;
    }
    @Override
    public int getAltinID() {
       return AltinID;
    }
    @Override
    public int getDeger() {
       return super.getDeger();
    }

    @Override
    public int getTileX() {
       return super.getTileX();
    }
    @Override
    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    public void setTileY(int tileY) {
        this.tileY = tileY;
    }
    @Override
    public int getTileY() {
        return super.getTileY();
    }

    @Override
    public void move(int dx, int dy) {
        tileX+=dx;
        tileY+=dy;
    }
    @Override
    public void setKartUse(boolean gizli) {
       super.setKartUse(gizli);
    }
}
