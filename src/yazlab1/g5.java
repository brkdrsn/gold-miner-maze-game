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
public class g5 extends gold{
    
    
    
private Image g5;
int sayi,kac;
boolean gizli=false;
boolean use=false;
    public boolean getUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }
    public g5() {
        gizli=false;
        AltinID=1;
        super.deger=5; 
        ImageIcon img = new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\yazlab1\\5.jpg");
        g5=img.getImage();
        
    }

    public void setg5(Image g5) {
        this.g5 = g5;
    }
    public g5(int kac){
        this.kac=kac;
    }
@Override
  public boolean isGizli() {
        return gizli;
    }

@Override
    public void setGizli(boolean gizli) {
        this.gizli = gizli;
    }
    public void setKac(int kac) {
        this.kac = kac;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public int getSayi() {
        return sayi;
    }
     public Image getg5(){
        
        return g5;
    }
    @Override
    public int getAltinID() {
       return AltinID;
    }

    @Override
    public int getDeger() {
       return deger;
    }

    @Override
    public int getTileX() {
       return tileX;
    }

    @Override
    public int getTileY() {
        return tileY;
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
    public void move(int dx, int dy) {
        tileX+=dx;
        tileY+=dy;
    }
    @Override
    public void setKartUse(boolean gizli) {
        this.gizli = false;
    }
}
