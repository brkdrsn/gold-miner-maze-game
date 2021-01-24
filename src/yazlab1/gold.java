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
public class gold implements IGold {
    int tileX, tileY;
    int AltinID,deger,kac;
   boolean gizli=false;
    int sayi;private Image g10;
        public void g10(){
        ImageIcon img = new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\yazlab1\\10.jpg");
        g10=img.getImage();}
    public Image getg10() {
        return g10;
    }
    
boolean use=false;
    public boolean getUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }
    public void setDeger(int deger) {
        this.deger = deger;
    }


    
    public gold(){}
     public gold(int kac){this.kac=kac;}

    public int getKac() {
        return kac;
    }

    public void setKac(int kac) {
        this.kac = kac;
    }
    

    @Override
    public int getAltinID() {
       return AltinID;
    }

    @Override
    public int getDeger() {
       return deger;
    }

    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    public void setTileY(int tileY) {
        this.tileY = tileY;
    }

    @Override
    public int getTileX() {
       return tileX;
    }

    @Override
    public int getTileY() {
        return tileY;
    }
  public boolean isGizli() {
        return gizli;
    }

    public void setGizli(boolean gizli) {
        this.gizli = gizli;
    }
    @Override
    public void move(int dx, int dy) {
        tileX+=dx;
        tileY+=dy;
    }
    public void setKartUse(boolean gizli) {
        this.gizli = gizli;
    }
}
