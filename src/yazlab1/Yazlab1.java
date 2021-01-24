/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yazlab1;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class Yazlab1 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Board map= new Board();
       /* Scanner sc=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        
        int a=s.nextInt();
         map.setRow(a);
        System.out.println("Sütun sayısını giriniz: ");
        int b=s.nextInt();
        map.setCol(b);
        System.out.println(map.getCol());*/
        
         new Yazlab1();
         
    }
    public Yazlab1() {
        
        JFrame f=new JFrame();
      
       f.add(new Board());
       
       
       
        f.setTitle("Gold Miner");
        
        f.setSize(900, 900);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       
        
    }
    
}
