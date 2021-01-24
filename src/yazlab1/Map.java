/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yazlab1;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Map{
    
        private Scanner m;
    private FileReader fr;
    private String Map[] = new String[14];
    
    private Image patch,wall;

   /* public Map() {
        
        try {
            m = new Scanner(new File("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\Harita1.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Harita Yüklenirken Hata oluştu.");
        }
        openFile();
        readFile();
        closeFile();

    }

    public Image getPatch() {
        return patch;
    }

    public Image getWall() {
        return wall;
    }

    public String getMap(int x, int y) {
        String index = Map[y].substring(x, x + 1);
       
        }
        //Map[y].split(" ");
        return index;
    }

    public void openFile() {
        try {
            m = new Scanner(new File("C:\\Users\\ADMIN\\Desktop\\Maze\\Harita1.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Harita Yüklenirken Hata oluştu.");
        }
    }

    public void readFile() {
        while (m.hasNext()) {
           
            for (int i = 0; i < 11; i++) {
                
                Map[i] = m.next();
                //System.out.println(Map[i]);
           }
        }
    }

    public void closeFile() {
        m.close();
    }*/

  
       

   

}
