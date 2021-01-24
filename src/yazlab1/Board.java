/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazlab1;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author ADMIN
 */
public final class Board extends JPanel implements ActionListener {

    Random r, ra, ras,rast,rastg;
    int bes, on, onbes, yirmi;
    int click;
    private Timer timer;
    private JButton buton;
    private JButton basla,ozel;
    public int end = 0, mesafe = 0, YolCizim = 0;
    // private Map m;
    private A a;
    private B b;
    private C c;
    private D d;
  
    ArrayList<g5> g5;
    ArrayList<g10> g10;
    ArrayList<g15> g15;
    ArrayList<g20> g20;
    ArrayList<gold> goldd,gold2,goldB,goldC,golda,goldd2;
    int bedo;
    int kontrol;
    private int[][] map;
    int maport,giz;
    buyuk bb=new buyuk();
    private JLabel alb,blb,clb,dlc;
    int gold, sat, sut;
int clicklb=0;
    Scanner sc = new Scanner(System.in);
    Scanner s = new Scanner(System.in);Scanner sca = new Scanner(System.in);
    Scanner hedeff = new Scanner(System.in);
    Scanner hedefff = new Scanner(System.in);Scanner hedeffff = new Scanner(System.in);
     int roww; 
     int coll; 
    int adimA=0,adimB=0,adimC=0,adimD=0;
    int harcA=0,harcB=0,harcC=0,harcD=0;
    int topA=0,topB=0,topC=0,topD=0;
int kont=0;
    //private gold go;
    public Board() {
        
        kontrol=0;
        click = 0;
        bedo=0;
        timer = new Timer(1000, this);
        setFocusable(true);
        timer.start();
        a = new A();b = new B();
        c = new C();
        d = new D();
        ra = new Random();
        ras = new Random();
        r = new Random();
        rast = new Random();
        rastg = new Random();
      
        g5=new ArrayList<>();
        g10=new ArrayList<>();
        g15=new ArrayList<>();
        g20=new ArrayList<>();
        goldd=new ArrayList<>();golda=new ArrayList<>();goldB=new ArrayList<>();
        gold2=new ArrayList<>();goldC=new ArrayList<>();goldd2=new ArrayList<>();
       
        
        

        
        buton = new JButton("Sıradaki Hamle");
        basla = new JButton("Hızlı Başlat");
        ozel = new JButton("Özel Oyun");
        setLayout(new FlowLayout());
        
         
        add(buton);
        add(basla);
        add(ozel);
        
        ozel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {

            }

            @Override
            public void mousePressed(MouseEvent me) {

            }

            @Override

            public void mouseReleased(MouseEvent e) {
                System.out.println("Satır sayısını giriniz: ");
                bb.setRow(sc.nextInt()); 
                System.out.println("Sütun sayısını giriniz: ");
                bb.setCol(s.nextInt());
                roww=bb.getRow();
                    coll= bb.getCol();
                    map = new int[roww][coll];
                     System.out.println("A oyuncusunun özelliklerini değiştirmek için 1'e basınız...");
                    System.out.println("B oyuncusunun özelliklerini değiştirmek için 2'e basınız...");
                    System.out.println("C oyuncusunun özelliklerini değiştirmek için 3'e basınız...");
                    System.out.println("D oyuncusunun özelliklerini değiştirmek için 4'e basınız...");
                    System.out.println("Varsayılan oyuncu özellikleri için 5'e basınız...");
                    int sayi=sca.nextInt();
                   
                    switch(sayi){
                        
                        case 1:
                                System.out.println("Kasadaki altın miktarını giriniz= "); a.setKasa(hedeffff.nextInt());
                               System.out.println("Hedef maliyeti giriniz = ");a.setHedef(hedeff.nextInt());
                                System.out.println("Hamle maliyetini giriniz= ");a.setHamle(hedefff.nextInt());
                            break;
                        case 2:
                            System.out.println("Kasadaki altın miktarını giriniz= "); b.setKasa(hedeffff.nextInt());
                               System.out.println("Hedef maliyeti giriniz = ");b.setHedef(hedeff.nextInt());
                                System.out.println("Hamle maliyetini giriniz= ");b.setHamle(hedefff.nextInt());
                            break;
                            case 3:
                                System.out.println("Kasadaki altın miktarını giriniz= "); c.setKasa(hedeffff.nextInt());
                               System.out.println("Hedef maliyeti giriniz = ");c.setHedef(hedeff.nextInt());
                                System.out.println("Hamle maliyetini giriniz= ");c.setHamle(hedefff.nextInt());
                            break;
                                case 4:
                                    System.out.println("Kasadaki altın miktarını giriniz= "); d.setKasa(hedeffff.nextInt());
                               System.out.println("Hedef maliyeti giriniz = ");d.setHedef(hedeff.nextInt());
                                System.out.println("Hamle maliyetini giriniz= ");d.setHamle(hedefff.nextInt());
                            break;
                                case 5:
                                    System.out.println("Varsayılan oyuncu seçenekleri aktif...");
                                    break;
                    }
                    

        a.move(1, 0);
        b.move(coll - 1, 0);
        c.move(1, roww - 1);
        d.move(coll - 1, roww - 1);
        
                haritayap();
                
                goster();
                
                click++;
                    basla();
                   
                kont=1;

            }

            @Override
            public void mouseEntered(MouseEvent me) {

            }

            @Override
            public void mouseExited(MouseEvent me) {

            }
        });
        buton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {

            }

            @Override
            public void mousePressed(MouseEvent me) {

            }

            @Override

            public void mouseReleased(MouseEvent e) {
               /*while(gold2.size()>0 && gold2.get(0).getTileX()!= a.getTileX() || gold2.get(0).getTileX()!= b.getTileX() || gold2.get(0).getTileX()!= c.getTileX()||gold2.get(0).getTileX()!= d.getTileX()
                       ||gold2.get(0).getTileY()!= a.getTileY() || gold2.get(0).getTileY()!= b.getTileY() || gold2.get(0).getTileY()!= c.getTileY()||gold2.get(0).getTileY()!= d.getTileY()){
               
               
               */ 
              
                   if(a.getKasa()>0){
                   a.setKasa(a.getKasa()-a.getHamle());
                  Aoyna();}
                   else System.out.println("A oyuncusu elendi.");
                    if(b.getKasa()>0){
                  b.setKasa(b.getKasa()-b.getHamle());
                    Boyna();}else System.out.println("B oyuncusu elendi.");
                     if(c.getKasa()>0){
                   c.setKasa(c.getKasa()-c.getHamle());
                  Coyna();}else System.out.println("C oyuncusu elendi.");
                   if(d.getKasa()>0){
                   d.setKasa(d.getKasa()-d.getHamle());
                   Doyna();}else System.out.println("D oyuncusu elendi.");
                   System.out.println("");
                System.out.println("A oyuncusunun Kasasındaki altın ="+a.getKasa());
                System.out.println("B oyuncusunun Kasasındaki altın ="+b.getKasa());   
                System.out.println("C oyuncusunun Kasasındaki altın ="+c.getKasa());
                System.out.println("D oyuncusunun Kasasındaki altın ="+d.getKasa());
                System.out.println("--------------------------------------------------");
                
                if(gold2.isEmpty()==true){
                   System.out.println("------------A oyuncusu------------");
                  System.out.println("A oyuncusunun kasasındaki altın ="+a.getKasa());
                  System.out.println("A oyuncusunun topladığı altın ="+((200-(a.getKasa()+harcA)))*-1);
                  System.out.println("A oyuncusunun harcadığı altın ="+harcA);
                  System.out.println("A oyuncusunun toplam adım sayısı ="+adimA);
                  System.out.println("------------B oyuncusu------------");
                  System.out.println("B oyuncusunun kasasındaki altın ="+b.getKasa());
                  System.out.println("B oyuncusunun topladığı altın ="+((200-(b.getKasa()+harcB)))*-1);
                  System.out.println("B oyuncusunun harcadığı altın ="+harcB);
                  System.out.println("B oyuncusunun toplam adım sayısı ="+adimB);
                  System.out.println("------------C oyuncusu------------");
                  System.out.println("C oyuncusunun kasasındaki altın ="+c.getKasa());
                  System.out.println("C oyuncusunun topladığı altın ="+((200-(c.getKasa()+harcC)))*-1);
                  System.out.println("C oyuncusunun harcadığı altın ="+harcC);
                  System.out.println("C oyuncusunun toplam adım sayısı ="+adimC);
                  System.out.println("------------D oyuncusu------------");
                  System.out.println("D oyuncusunun kasasındaki altın ="+d.getKasa());
                  System.out.println("D oyuncusunun topladığı altın ="+topD);
                  System.out.println("D oyuncusunun harcadığı altın ="+harcD);
                  System.out.println("D oyuncusunun toplam adım sayısı ="+adimD);
               }
            }

            @Override
            public void mouseEntered(MouseEvent me) {

            }

            @Override
            public void mouseExited(MouseEvent me) {

            }
        });
        basla.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {

            }

            @Override
            public void mousePressed(MouseEvent me) {

            }

            @Override

            public void mouseReleased(MouseEvent e) {
                
                if(kontrol==0){
                    roww=20;
                    coll= 20;
                    map = new int[roww][coll];

                 a.move(1, 0);
                    b.move(coll - 1, 0);
                c.move(1, roww - 1);
                 d.move(coll - 1, roww - 1);
                haritayap();
                
                goster();}
                
                click++;
                    basla();
                   
               
                
                
               kont=1;
              

            }

            @Override
            public void mouseEntered(MouseEvent me) {

            }

            @Override
            public void mouseExited(MouseEvent me) {

            }
        });
        /*roww=bb.getRow();
        coll= bb.getCol();*/
        
    }
    
    public void Aoyna(){
                enyakin2();
                System.out.println("A oyuncusunun hedefi belirlendi ="+golda.get(0).getTileX()+" "+golda.get(0).getTileY());
                
              a.HedefTakip(3, golda.get(0).getTileX(), golda.get(0).getTileY(), coll, roww);
              adimA=adimA+a.mesafe;
              bul();
               
        
    }
    public void Boyna(){
        enyakinB();
        System.out.println("B oyuncusunun hedefi belirlendi ="+goldB.get(0).getTileX()+" "+goldB.get(0).getTileY());
                b.HedefTakip(3, goldB.get(0).getTileX(), goldB.get(0).getTileY(), coll, roww);
                adimB=adimB+b.mesafe;
              bulB();
               
    }
    public void Coyna(){
        enyakinC();
        System.out.println("C oyuncusunun hedefi belirlendi ="+goldC.get(0).getTileX()+" "+goldC.get(0).getTileY());
        
                c.HedefTakip(3, goldC.get(0).getTileX(), goldC.get(0).getTileY(), coll, roww);
                adimC=adimC+c.mesafe;
              bulC();
               
    }
    public void Doyna(){
        enyakinD();
        System.out.println("D oyuncusunun hedefi belirlendi ="+goldd.get(0).getTileX()+" "+goldd.get(0).getTileY()); System.out.println("");
        
                d.HedefTakip(3, goldd.get(0).getTileX(), goldd.get(0).getTileY(), coll, roww);
                adimD=adimD+d.mesafe;
              bulD();
              
              
               
    }
public void basla(){
    int bes = 0, on = 0, onbes = 0, yirmi = 0;
                for (int row = 0; row < roww; row++) {
                    for (int col = 0; col < coll; col++) {
                        if (map[row][col] == 1 || map[row][col] == 0) {
                            // g5.move(col,row);
                            bes++;
                        }
                        if (map[row][col] == 2) {
                            on++;
                        }
                        if (map[row][col] == 3) {
                            onbes++;
                        }
                        if (map[row][col] == 4) {
                            yirmi++;
                        }
                    }

                }
                if (bes != 0) {
                  //  g5 = new g5[bes];
                } else {
                   // g5 = new g5[10];
                }
                if (on != 0) {
                   // g10 = new g10[on];
                } else {
                    //g10 = new g10[10];
                }
                if (onbes != 0) {
                  //  g15 = new g15[onbes];
                } else {
                   // g15 = new g15[10];
                }
                if (yirmi != 0) {
                   // g20 = new g20[yirmi];
                } else {
                   // g20 = new g20[10];
                }

                int i = 0, j = 0, k = 0, l = 0,to=0;
                for (int row = 0; row < roww; row++) {
                    for (int col = 0; col < coll; col++) {
                        if(map[row][col]!=9){
                        gold g=new gold();
                        g.setKac(to);
                        
                        
                        if (map[row][col] == 1 || map[row][col] == 0) {
                            g5 x=new g5();
                            
                           
                            x.setKac(i);
                            g.setDeger(5);
                            g5.add(x);
                            g5.get(i).move(col,row);
                          /*  g5[i] = new g5();
                            g5[i].move(col, row);*/
                            
                            /*g5[i].setTileX(row);
                             g5[i].setTileY(col);*/
                            i++;

                        }
                        if (map[row][col] == 2) {
                            g10 y=new g10();
                            y.setKac(j);
                            g.setDeger(10);
                            g10.add(y);
                            g10.get(j).move(col,row);
                          /* g10[j] = new g10();
                            g10[j].move(col, row);
                            g5[i].setTileX(row);
                             g5[i].setTileY(col);*/
                            j++;

                        }
                        if (map[row][col] == 3) {
                            
                            g15 z=new g15();
                            g.setDeger(15);
                            z.setKac(k);
                            g15.add(z);
                            g15.get(k).move(col,row);
                            /*g15[k] = new g15();
                            g15[k].move(col, row);*/
                            /*g5[i].setTileX(row);
                             g5[i].setTileY(col);*/
                            k++;

                        }
                        if (map[row][col] == 4) {
                            g20 v=new g20();
                            v.setKac(l);
                            g.setDeger(20);
                            g20.add(v);
                            g20.get(l).move(col,row);
                           /* g20[l] = new g20();
                            g20[l].move(col, row);*/
                            /*g5[i].setTileX(row);
                             g5[i].setTileY(col);*/
                            l++;

                        }
                        g.setGizli(false);
                        gold2.add(g);
                        gold2.get(to).move(col, row);
                        to++;
                    }}
                }
                

                if (i != 0) {
                 //   g5[0].setSayi(i);
                    g5.get(0).setSayi(i);
                } 
                else {
                   // g5[0].setSayi(0);
                    g5.get(0).setSayi(0);
                }

                if (j != 0) {
                   //g10[0].setSayi(j);
                    g10.get(0).setSayi(j);
                } else {
                    g10.get(0).setSayi(0);
                    //g10[0].setSayi(0);
                }
                if (k != 0) {
                   // g15[0].setSayi(k);
                     g15.get(0).setSayi(k);
                } else {
                   // g15[0].setSayi(0);
                     g10.get(0).setSayi(0);
                }
                if (l != 0) {
                     g20.get(0).setSayi(l);
                   // g20[0].setSayi(l);
                } else {
                     g20.get(0).setSayi(0);
                   // g20[0].setSayi(0);
                }
                int bb;
                int bbb=giz;
                for(int bm=0;bm<gold2.size();bm++){
                    bb=rast.nextInt(giz);
                    if(bm<giz){
                        bbb=rastg.nextInt(gold2.size());
                    }
                    for(int q=0;q<gold2.size();q++){
                    gold2.get(bbb).setGizli(true);
                    for(int s=0;s<bes;s++){
                    if(gold2.get(q).getDeger()==5 && gold2.get(q).getTileX()==g5.get(s).getTileX() &&gold2.get(q).getTileY()==g5.get(s).getTileY() && gold2.get(q).isGizli()==true){
                        g5.get(s).setGizli(true);
                    }}
                    for(int s=0;s<on;s++){
                    if(gold2.get(q).getDeger()==10 && gold2.get(q).getTileX()==g10.get(s).getTileX()&& gold2.get(q).getTileY()==g10.get(s).getTileY()&& gold2.get(q).isGizli()==true){
                        g10.get(s).setGizli(true);
                    }}
                    for(int s=0;s<onbes;s++){
                    if(gold2.get(q).getDeger()==15 && gold2.get(q).getTileX()==g15.get(s).getTileX()&& gold2.get(q).getTileY()==g15.get(s).getTileY()&& gold2.get(q).isGizli()==true){
                        g15.get(s).setGizli(true);
                    }}
                    for(int s=0;s<yirmi;s++){
                    if(gold2.get(q).getDeger()==20 && gold2.get(q).getTileX()==g20.get(s).getTileX()&& gold2.get(q).getTileY()==g20.get(s).getTileY()&& gold2.get(q).isGizli()==true){
                        g20.get(s).setGizli(true);
                    }}
                    
                    
                    
                }} 
                
                
                
}
   
    public void haritayap() {
        
        maport = ((coll * roww) * 20) / 100;
        Math.round(giz=(maport*10)/100);
        
        for (int row = 0; row < roww; row++) {
            for (int col = 0; col < coll; col++) {
                map[row][col] = 9;
            }

        }
        for (int i = 0; i <= maport+5; i++) {
            sat = ras.nextInt(roww);
            sut = ra.nextInt(coll);
            gold = r.nextInt(5);
               
            for (int row = 0; row < roww; row++) {
                for (int col = 0; col < coll; col++) {
                    if(sut!=0&&sat!=0)
                    map[sat][sut] = gold;
                    

                }
            }
        }
        map[0][0] = 9;
        map[0][1]=9;
        map[roww-1][1]=9;
        map[1][0]=9;
        map[0][coll-1] = 9;
        map[roww - 1][0] = 9;
        map[roww - 1][coll-1] = 9;

    }

    public void goster() {
        for (int row = 0; row < roww; row++) {
            for (int col = 0; col < coll; col++) {

                System.out.print("|"+map[row][col]+"|");
            }
            System.out.println("");
        }

    }
    public void enyakin(){
        int enkx=100;
        int enky=100;
        int enk=100;
        int top=100;
        int sat,sut,hedef;
        gold m=new gold();
            for (int i=0;i<g20.size();i++){
        
                           
                            if(g20.get(i).getUse()==false){
                            enkx=a.getTileX()-g20.get(i).getTileX();
                            enky=a.getTileY()-g20.get(i).getTileY();
                            if(enkx<0){
                                enkx=enkx*-1;
                            }
                            if(enky<0){
                                enky=enky*-1;
                            }
                            top=enkx+enky;
                            if(enk>top){
                                enk=top;
                                m.setKac(g20.get(i).getKac());
                                
                                m.setTileX(g20.get(i).getTileX());
                                m.setTileY(g20.get(i).getTileY());
                                m.setDeger(g20.get(i).getDeger());
                                
                     
                }   
                            }
                  
        }
            for (int i=0;i<g5.size();i++){
        
                            
                            if(g5.get(i).getUse()==false){
                            enkx=a.getTileX()-g5.get(i).getTileX();
                            enky=a.getTileY()-g5.get(i).getTileY();
                            if(enkx<0){
                                enkx=enkx*-1;
                            }
                            if(enky<0){
                                enky=enky*-1;
                            }
                            top=enkx+enky;
                            if(enk>top){
                                enk=top;
                                m.setKac(g5.get(i).getKac());
                                
                                m.setTileX(g5.get(i).getTileX());
                                m.setTileY(g5.get(i).getTileY());
                                m.setDeger(g5.get(i).getDeger());
                                
                            }
                }
                 
        }
            for (int i=0;i<g10.size();i++){
      
                            
                            if(g10.get(i).getUse()==false){
                            enkx=a.getTileX()-g10.get(i).getTileX();
                            enky=a.getTileY()-g10.get(i).getTileY();
                            if(enkx<0){
                                enkx=enkx*-1;
                            }
                            if(enky<0){
                                enky=enky*-1;
                            }
                            top=enkx+enky;
                            if(enk>top){
                                enk=top;
                                m.setKac(g10.get(i).getKac());
                                
                                m.setTileX(g10.get(i).getTileX());
                                m.setTileY(g10.get(i).getTileY());
                                m.setDeger(g10.get(i).getDeger());
                            }
                     
            }
                          
                  
        }
            for (int i=0;i<g15.size();i++){
        
                            
                            if(g15.get(i).getUse()==false){
                            enkx=a.getTileX()-g15.get(i).getTileX();
                            enky=a.getTileY()-g15.get(i).getTileY();
                            if(enkx<0){
                                enkx=enkx*-1;
                            }
                            if(enky<0){
                                enky=enky*-1;
                            }
                            top=enkx+enky;
                            if(enk>top){
                                enk=top;
                                m.setKac(g15.get(i).getKac());
                                
                                m.setTileX(g15.get(i).getTileX());
                                m.setTileY(g15.get(i).getTileY());
                                m.setDeger(g10.get(i).getDeger());
                                
                     
                }}
                            
                  
        }
           
           
            
                  goldB.add(m);
      
    
        
        
    }
public void enyakin2(){
        int enkx=100;
        int enky=100;
        int enk=100;
        int top=100;
        int sat,sut,hedef;
        gold m=new gold();
        //for (int j=0;j<g5.size();j++){
            for (int i=0;i<gold2.size();i++){
        
                            
                            if(gold2.get(i).isGizli()==false){
                            enkx=a.getTileX()-gold2.get(i).getTileX();
                            enky=a.getTileY()-gold2.get(i).getTileY();
                            if(enkx<0){
                                enkx=enkx*-1;
                            }
                            if(enky<0){
                                enky=enky*-1;
                            }
                            top=enkx+enky;
                            if(enk>top){
                                enk=top;
                               
                                
                                m.setTileX(gold2.get(i).getTileX());
                                m.setTileY(gold2.get(i).getTileY());
                                m.setDeger(gold2.get(i).getDeger());
                                
                            }
                }
                                golda.add(m);
                
                  
                            
        }
          
}
public void bul(){
    int sayac=1;
    if(golda.get(0).getTileX()== a.getTileX() && golda.get(0).getTileY()==a.getTileY()){
        sayac=0;
        if(sayac==0) a.setKasa(a.getKasa()-a.getHedef());harcA=harcA+a.getHedef();
               
        a.setKasa(a.getKasa()+golda.get(0).getDeger());
        topA=topA+golda.get(0).getDeger();
                    for(int s=0;s<gold2.size();s++){
                    if(gold2.get(s).getTileY()==a.getTileY() &&  gold2.get(s).getTileX()==a.getTileX()){
                        for(int i=0;i<g5.size();i++){
                        if(gold2.get(s).getTileY()==g5.get(i).getTileY() &&  g5.get(i).getTileX()==a.getTileX()){
                            g5.get(i).setg5(null);
                        }}
                        for(int i=0;i<g10.size();i++){
                        if(gold2.get(s).getTileY()==g10.get(i).getTileY() &&  g10.get(i).getTileX()==a.getTileX()){
                            g10.get(i).setg10(null);
                        }}
                        for(int i=0;i<g15.size();i++){
                        if(gold2.get(s).getTileY()==g15.get(i).getTileY() &&  g15.get(i).getTileX()==a.getTileX()){
                            g15.get(i).setg15(null);
                        }}
                        for(int i=0;i<g20.size();i++){
                        if(gold2.get(s).getTileY()==g20.get(i).getTileY() &&  g20.get(i).getTileX()==a.getTileX()){
                            g20.get(i).setg20(null);
                        }} sayac=0;
                    gold2.remove(s);
                    golda.clear();}
                    sayac++;
                    if(sayac>3){
                        golda.clear();
                    }
                    enyakin2();}
    }
}
public void enyakinB(){
     int enkx=100;
        int enky=100;
        int enk=100;
        int topmod;
        int maliyet,topmaliyet=-100;
        int top=100;
        int sat,sut,hedef;
        gold m=new gold();
        //for (int j=0;j<g5.size();j++){
            for (int i=0;i<gold2.size();i++){
        
                            
                       
                            enkx=b.getTileX()-gold2.get(i).getTileX();
                            enky=b.getTileY()-gold2.get(i).getTileY();
                            
                            if(enkx<0){
                                enkx=enkx*-1;
                            }
                            if(enky<0){
                                enky=enky*-1;
                            }
                            
                            top=enkx+enky;
                            topmod= top/3;
                            
                            maliyet=gold2.get(i).getDeger()-(Math.round(topmod)*b.getHamle());
                            /*if(top<enk){
                                enk=top;*/
                               
                            if(topmaliyet<maliyet ){
                                topmaliyet=maliyet;
                               
                                
                                m.setTileX(gold2.get(i).getTileX());
                                m.setTileY(gold2.get(i).getTileY());
                                m.setDeger(gold2.get(i).getDeger());
                                
                            }/*else if(enk>top){
                                enk=top;
                                 m.setTileX(gold2.get(i).getTileX());
                                 m.setTileY(gold2.get(i).getTileY());
                                  m.setDeger(gold2.get(i).getDeger());
                                    }*/
                
                                goldB.add(m);
                               
                  
                            
        }
            
}
public void enyakinC(){
     int enkx=100;
        int enky=100;
        int enk=100;
        int topmod;
        int maliyet,topmaliyet=-100;
        int top=100,topp;
        int sat,sut,hedef;
        gold m=new gold();
        //for (int j=0;j<g5.size();j++){
            for (int i=0;i<gold2.size();i++){
        
                            
                       
                            enkx=c.getTileX()-gold2.get(i).getTileX();
                            enky=c.getTileY()-gold2.get(i).getTileY();
                            
                            if(enkx<0){
                                enkx=enkx*-1;
                            }
                            if(enky<0){
                                enky=enky*-1;
                            }
                            
                            top=enkx+enky;
                            topmod= top/3;
                            topp=(int)Math.floor(topmod);
                            maliyet=gold2.get(i).getDeger()-(topp*c.getHamle());
                            /*if(top<enk){
                                enk=top;*/
                               
                            if(topmaliyet<maliyet ){
                                topmaliyet=maliyet;
                               
                                
                                m.setTileX(gold2.get(i).getTileX());
                                m.setTileY(gold2.get(i).getTileY());
                                m.setDeger(gold2.get(i).getDeger());
                                
                            }
                            /*else if(enk>top){
                                enk=top;
                                 m.setTileX(gold2.get(i).getTileX());
                                 m.setTileY(gold2.get(i).getTileY());
                                  m.setDeger(gold2.get(i).getDeger());
                                    }*/
                
                                goldC.add(m);
                                
                  
                            
        }
          
}

public void enyakinD(){
    
        int cenky=100;
        int cenkx=100;
        int aenky=100;
        int aenkx=100;
        int benky=100;
        int benkx=100;
        int enky=100;
        int enkx=100;
        int enk=100;
        int top=100;int atop=100;int btop=100;int ctop=100;
        int sat,sut,hedef;
        gold n=new gold();
                            
            for (int i=0;i<gold2.size();i++){
        
                            
                            if(gold2.get(i).getUse()==false){
                           
                            enkx=d.getTileX()-gold2.get(i).getTileX();
                            enky=d.getTileY()-gold2.get(i).getTileY();
                            
                            if(enkx<0){
                                enkx=enkx*-1;
                            }
                            if(enky<0){
                                enky=enky*-1;
                            }
                            atop=aenkx+aenky;btop=benkx+benky;ctop=cenkx+cenky;
                            top=enkx+enky;
                        if(enk>top ){
                                enk=top;
                               
                                
                                n.setTileX(gold2.get(i).getTileX());
                                n.setTileY(gold2.get(i).getTileY());
                                n.setDeger(gold2.get(i).getDeger());
                                
                            }
                }
                                goldd.add(n);
                
                  
                            
        } 
            
             
}
public void bulD(){
    int amesafe,bmesafe,cmesafe,dmesafe;int amesafe1,bmesafe1,cmesafe1,dmesafe1,q,w,e,r;
                            amesafe1=a.getTileX()-goldd.get(0).getTileX();
                            amesafe=a.getTileY()-goldd.get(0).getTileY();
                            bmesafe1=b.getTileX()-goldd.get(0).getTileX();
                            bmesafe=b.getTileY()-goldd.get(0).getTileY();
                            cmesafe1=c.getTileX()-goldd.get(0).getTileX();
                            cmesafe=c.getTileY()-goldd.get(0).getTileY();
                            dmesafe1=d.getTileX()-goldd.get(0).getTileX();
                            dmesafe=d.getTileY()-goldd.get(0).getTileY();
                            q=amesafe+amesafe1;w=bmesafe+bmesafe1;e=cmesafe+cmesafe1;
                            r=dmesafe+dmesafe1;
        
        
       if(goldd.get(0).getTileX()== d.getTileX() && goldd.get(0).getTileY()==d.getTileY()){
           d.setKasa(d.getKasa()-d.getHedef());
           harcD=harcD+d.getHedef();
        d.setKasa(d.getKasa()+goldd.get(0).getDeger()); 
          topD=topD+goldd.get(0).getDeger();
           
        
                    for(int s=0;s<gold2.size();s++){
                    if(gold2.get(s).getTileY()==d.getTileY() &&  gold2.get(s).getTileX()==d.getTileX()){
                        for(int i=0;i<g5.size();i++){
                        if(gold2.get(s).getTileY()==g5.get(i).getTileY() &&  g5.get(i).getTileX()==d.getTileX()){
                            g5.get(i).setg5(null);
                        }}
                        for(int i=0;i<g10.size();i++){
                        if(gold2.get(s).getTileY()==g10.get(i).getTileY() &&  g10.get(i).getTileX()==d.getTileX()){
                            g10.get(i).setg10(null);
                        }}
                        for(int i=0;i<g15.size();i++){
                        if(gold2.get(s).getTileY()==g15.get(i).getTileY() &&  g15.get(i).getTileX()==d.getTileX()){
                            g15.get(i).setg15(null);
                        }}
                        for(int i=0;i<g20.size();i++){
                        if(gold2.get(s).getTileY()==g20.get(i).getTileY() &&  g20.get(i).getTileX()==d.getTileX()){
                            g20.get(i).setg20(null);
                        }}
                    gold2.remove(s);}
                    goldd.clear();
                    }if(r<q&& r<w&& r<e)enyakinD();
    }
}
public void bulB(){
    int sayac=1;
       if(goldB.get(0).getTileX()== b.getTileX() && goldB.get(0).getTileY()==b.getTileY() ){
           sayac=0;
        if(sayac==0) b.setKasa(b.getKasa()-b.getHedef()); harcB=harcB+b.getHedef();
         
        b.setKasa(b.getKasa()+goldB.get(0).getDeger());
        topB=topB+goldB.get(0).getDeger();
                    for(int s=0;s<gold2.size();s++){
                    if(gold2.get(s).getTileY()==b.getTileY() &&  gold2.get(s).getTileX()==b.getTileX()){
                        for(int i=0;i<g5.size();i++){
                        if(gold2.get(s).getTileY()==g5.get(i).getTileY() &&  g5.get(i).getTileX()==b.getTileX()){
                            g5.get(i).setg5(null);
                        }}
                        for(int i=0;i<g10.size();i++){
                        if(gold2.get(s).getTileY()==g10.get(i).getTileY() &&  g10.get(i).getTileX()==b.getTileX()){
                            g10.get(i).setg10(null);
                        }}
                        for(int i=0;i<g15.size();i++){
                        if(gold2.get(s).getTileY()==g15.get(i).getTileY() &&  g15.get(i).getTileX()==b.getTileX()){
                            g15.get(i).setg15(null);
                        }}
                        for(int i=0;i<g20.size();i++){
                        if(gold2.get(s).getTileY()==g20.get(i).getTileY() &&  g20.get(i).getTileX()==b.getTileX()){
                            g20.get(i).setg20(null);
                        }}
                        sayac=0;
                    gold2.remove(s);
                    goldB.clear();}
                    sayac++;
                    if(sayac>3){
                        goldB.clear();
                    }
                    
                    
                    enyakinB();}
    }
       
}
  public void bulC(){
       int sayac=1;
      if(goldC.get(0).getTileX()== c.getTileX() && goldC.get(0).getTileY()==c.getTileY()){
           sayac=0;
        if(sayac==0)c.setKasa(c.getKasa()-c.getHedef());harcC=harcC+c.getHedef();
         topC=topC+goldC.get(0).getDeger();
        c.setKasa(c.getKasa()+goldC.get(0).getDeger());
        
                    for(int s=0;s<gold2.size();s++){
                    if(gold2.get(s).getTileY()==c.getTileY() &&  gold2.get(s).getTileX()==c.getTileX()){
                        for(int i=0;i<g5.size();i++){
                        if(gold2.get(s).getTileY()==g5.get(i).getTileY() &&  g5.get(i).getTileX()==c.getTileX()){
                            g5.get(i).setg5(null);
                        }}
                        for(int i=0;i<g10.size();i++){
                        if(gold2.get(s).getTileY()==g10.get(i).getTileY() &&  g10.get(i).getTileX()==c.getTileX()){
                            g10.get(i).setg10(null);
                        }}
                        for(int i=0;i<g15.size();i++){
                        if(gold2.get(s).getTileY()==g15.get(i).getTileY() &&  g15.get(i).getTileX()==c.getTileX()){
                            g15.get(i).setg15(null);
                        }}
                        for(int i=0;i<g20.size();i++){
                        if(gold2.get(s).getTileY()==g20.get(i).getTileY() &&  g20.get(i).getTileX()==c.getTileX()){
                            g20.get(i).setg20(null);
                        }}
                        sayac=0;
                    gold2.remove(s);
                    goldC.clear();}
                    sayac++;
                    if(sayac>3){
                        goldC.clear();
                    }
                    
                    
                    enyakinC();}
    
    }
}
public void gizliAc(){
     int enkx=100;
        int enky=100;
        int enk=100;
        int top=100;
        int sat,sut,hedef;
        gold m=new gold();
        //for (int j=0;j<g5.size();j++){
            for (int i=0;i<gold2.size();i++){
        
                            
                            if(gold2.get(i).isGizli()==true){
                            enkx=c.getTileX()-gold2.get(i).getTileX();
                            enky=c.getTileY()-gold2.get(i).getTileY();
                            if(enkx<0){
                                enkx=enkx*-1;
                            }
                            if(enky<0){
                                enky=enky*-1;
                            }
                            top=enkx+enky;
                            if(enk>top){
                                enk=top;
                               
                                
                                m.setTileX(gold2.get(i).getTileX());
                                m.setTileY(gold2.get(i).getTileY());
                                m.setDeger(gold2.get(i).getDeger());
                                m.setGizli(gold2.get(i).isGizli());
                                
                            }
                }
                             
                goldd2.add(m);
                 
                
                            
        }             
                    
}
public void gizlii(){
         goldd2.get(0).setGizli(false);
        System.out.println(goldd2.get(0).isGizli());
                if(goldd2.get(0).isGizli()==false){
                    
                    for(int s=0;s<g5.size();s++){
                    if(goldd2.get(0).getDeger()==5 && goldd2.get(0).getTileX()==g5.get(s).getTileX() &&goldd2.get(0).getTileY()==g5.get(s).getTileY() ){
                        g5.get(s).setGizli(false);
                    }}
                    for(int s=0;s<g10.size();s++){
                    if(goldd2.get(0).getDeger()==10 && goldd2.get(0).getTileX()==g10.get(s).getTileX()&& goldd2.get(0).getTileY()==g10.get(s).getTileY()){
                        g10.get(s).setGizli(false);
                    }}
                    for(int s=0;s<g15.size();s++){
                    if(goldd2.get(0).getDeger()==15 && goldd2.get(0).getTileX()==g15.get(s).getTileX()&& goldd2.get(0).getTileY()==g15.get(s).getTileY()){
                        g15.get(s).setGizli(false);
                    }}
                    for(int s=0;s<g20.size();s++){
                    if(goldd2.get(0).getDeger()==20 && goldd2.get(0).getTileX()==g20.get(s).getTileX()&& goldd2.get(0).getTileY()==g20.get(s).getTileY()){
                        g20.get(s).setGizli(false);
                    }}
                    
                  goldd2.clear();
                  }
                  
}
@Override
    public void actionPerformed(ActionEvent e) {
        repaint();
       
    }

    public void paint(Graphics g) {

        super.paint(g);
        if(kont==1 ){
        g.translate(50, 50);
        { 
            for (int row = 0; row < roww; row++) {
                for (int col = 0; col < coll; col++) {
                    Color color;

                    g.setColor(Color.white);
                    g.fillRect(30 * col, 30 * row, 30, 30);

                    for (int i = 1; i < a.mesafe; i++) {
                     if (a.yol[i][0] == col && a.yol[i][1] == row) {
                     g.setColor(Color.RED);
                     g.fillRect(30 * col, 30 * row, 30, 30);
                     }
                     }
                       
                     for (int i = 1; i < b.mesafe; i++) {
                     if (b.yol[i][0] == col && b.yol[i][1] == row) {
                     g.setColor(Color.blue);
                     g.fillRect(30 * col, 30 * row, 30, 30);
                     }
                     }
                     for (int i = 1; i < c.mesafe; i++) {
                     if (c.yol[i][0] == col && c.yol[i][1] == row) {
                     g.setColor(Color.PINK);
                     g.fillRect(30 * col, 30 * row, 30, 30);
                     }}
                     for (int i = 1; i < d.mesafe; i++) {
                     if (d.yol[i][0] == col && d.yol[i][1] == row) {
                     g.setColor(Color.DARK_GRAY);
                     g.fillRect(30 * col, 30 * row, 30, 30);
                     }}
                    g.setColor(Color.black);
                    g.drawRect(30 * col, 30 * row, 30, 30);

                }
            }
        }

        if (click >= 1) {
           if (g5.get(0).getSayi() != 0 ) {
                for (int i = 0; i < g5.get(0).getSayi(); i++) {
                  //  if(g5.get(i).isGizli()==false){
                    g.drawImage(g5.get(i).getg5(), (g5.get(i).getTileX() * 30), (g5.get(i).getTileY() * 30), null);}
                    
                   
              // }
            }
            if (g10.get(0).getSayi() != 0) {
                for (int i = 0; i < g10.get(0).getSayi(); i++) {
                 // if(g10.get(i).isGizli()==false)
                    g.drawImage(g10.get(i).getg10(), (g10.get(i).getTileX() * 30), (g10.get(i).getTileY() * 30), null);
                }
            }
            if (g15.get(0).getSayi() != 0) {
                for (int i = 0; i < g15.get(0).getSayi(); i++) {
                 // if(g15.get(i).isGizli()==false)
                    g.drawImage(g15.get(i).getg15(), (g15.get(i).getTileX() * 30), (g15.get(i).getTileY() * 30), null);
                }
                if (g20.get(0).getSayi() != 0) {
                for (int i = 0; i < g20.get(0).getSayi(); i++) {
                  // if(g20.get(i).isGizli()==false)
                    g.drawImage(g20.get(i).getg20(), (g20.get(i).getTileX() * 30), (g20.get(i).getTileY() * 30), null);
                }
            }
            }
        }
        g.drawImage(a.getA(), (a.getTileX() * 30), (a.getTileY() * 30), null);
         g.drawImage(b.getB(), (b.getTileX() * 30), (b.getTileY() * 30), null);
         g.drawImage(c.getC(), (c.getTileX() * 30), (c.getTileY() * 30), null);
         g.drawImage(d.getD(), (d.getTileX() * 30), (d.getTileY() * 30), null);
         if(gold2.isEmpty()==true ){
             while (1 == 1) {
                    JOptionPane.showMessageDialog(null, "GAME OVER", "GAME OVER", 2);
                    break;
                }
             
         }
        /*for (int row = 0; row < roww; row++) {
         for (int col = 0; col < coll; col++) {
                    
         }}}*/
        //g.drawImage(go.getGold20(), (go.getTileX() * 30), (go.getTileY() * 30), null);
        // a.HedefTakip(1,go.getTileX(),go.getTileY(),m);
            
    }
    }
    

}
