/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yazlab1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class buyuk {
    int col=20;
    int row=20;

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    public int rowdegis(int row){
        Scanner sc=new Scanner(System.in);
        System.out.println("Satir buyuklugu giriniz: ");
        row=sc.nextInt();
        
        return row;
    }
     public int coldegis(int col){
        Scanner sc=new Scanner(System.in);
        System.out.println("Sutun buyuklugu giriniz: ");
        col=sc.nextInt();
        
        return col;
    }
}
