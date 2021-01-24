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
public class g10 extends gold{
    
    boolean gizli=false;

    int sayi,kac;
    boolean use=false;
    public boolean getUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }
    @Override
    public void setKac(int kac) {
        this.kac = kac;
    }
    @Override
  public boolean isGizli() {
        return gizli;
    }

    @Override
    public void setGizli(boolean gizli) {
        this.gizli = gizli;
    }
    @Override
    public int getKac() {
        return kac;
    }
private Image g10;
    public g10() {
        gizli=false;
        AltinID=2;
        super.deger=10;
        ImageIcon img = new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\yazlab1\\10.jpg");
        g10=img.getImage();
    }private Image g5;

    public void setg10(Image g10) {
        this.g10 = g10;
    }
   
     public Image getg10(){
        
        return g10;
    }
     public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public int getSayi() {
        return sayi;
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
    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    @Override
    public void setTileY(int tileY) {
        this.tileY = tileY;
    }
    @Override
    public int getTileX() {
       return super.getTileX();
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
