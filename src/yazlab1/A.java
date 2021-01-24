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
public class A {
    int hamle=5;
    int hedef=5;
    int kasa=200; int adim=0;
    private int tileX,tileY;
    
    private int[][] harita = new int[50][50];
    public int[][] yol = new int[100][2];
    int mesafe = 0;
    private Image A;
    public A() {
        ImageIcon img = new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\yazlab1\\a.jpg");
        A=img.getImage();
              
    }
    public Image getA(){
        return A;
    }

    public int getHamle() {
        return hamle;
    }

    public void setHamle(int hamle) {
        this.hamle = hamle;
    }

    public int getHedef() {
        return hedef;
    }

    public void setHedef(int hedef) {
        this.hedef = hedef;
    }

    public int getKasa() {
        return kasa;
    }

    public void setKasa(int kasa) {
        this.kasa = kasa;
    }

  
    public int getTileX() {
        
        return tileX;
    }

    public int getTileY() {
      
        return tileY;
    }
    
    public void move(int dx,int dy){
        
        tileX+=dx;
        tileY+=dy;
        
    }
   public void HedefTakip(int AdimSayisi,int HedefX,int HedefY,int col,int row) {
       
       for (int adim = 0; adim < AdimSayisi; adim++) {

            for (int x = 0; x < row; x++) {
                for (int y = 0; y < col; y++) {
                    harita[x][y] = 900;
                }
            }
            harita[getTileX()][getTileY()] = 0;
            YolBul(getTileX() - 1, getTileY(), 1,col,row);
            YolBul(getTileX() + 1, getTileY(), 1, col,row);
            YolBul(getTileX(), getTileY() - 1, 1,col,row);
            YolBul(getTileX(), getTileY() + 1, 1, col,row);
            

          

            mesafe = harita[HedefX][HedefY];
            yol[mesafe][0] = HedefX;
            yol[mesafe][1] = HedefY;
            for (int i = mesafe - 1; i > -1; i--) {
                if (harita[yol[i + 1][0] + 1][yol[i + 1][1]] == i) {
                    yol[i][0] = yol[i + 1][0] + 1;
                    yol[i][1] = yol[i + 1][1];
                } else if (harita[yol[i + 1][0] - 1][yol[i + 1][1]] == i) {
                    yol[i][0] = yol[i + 1][0] - 1;
                    yol[i][1] = yol[i + 1][1];
                } else if (harita[yol[i + 1][0]][yol[i + 1][1] + 1] == i) {
                    yol[i][0] = yol[i + 1][0];
                    yol[i][1] = yol[i + 1][1] + 1;
                } else if (harita[yol[i + 1][0]][yol[i + 1][1] - 1] == i) {
                    yol[i][0] = yol[i + 1][0];
                    yol[i][1] = yol[i + 1][1] - 1;
                }
            }
            
            move(yol[1][0] - getTileX(), yol[1][1] - getTileY());
            adim++;
            
           

        }

    }
      public void YolBul(int DegerX, int DegerY, int mesafe, int col,int row) {
        if ((DegerX > -1) && (DegerY > -1) && (DegerX < col) && (DegerY < row)) {
            
           
                if (harita[DegerX][DegerY] > mesafe) {
                    harita[DegerX][DegerY] = mesafe;
                    YolBul(DegerX - 1, DegerY, mesafe + 1,col,row);
                    YolBul(DegerX + 1, DegerY, mesafe + 1,col,row);
                    YolBul(DegerX, DegerY - 1, mesafe + 1, col,row);
                    YolBul(DegerX, DegerY + 1, mesafe + 1, col,row);
                }

            

        }

    }
}
