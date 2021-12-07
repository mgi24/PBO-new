/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author WorkLoad
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        PersegiPanjang p=new PersegiPanjang();
        System.out.println("PERSEGI PANJANG");
        System.out.println("");
        System.out.println("Luas persegi panjang tersebut adalah: "+p.luas(10,5)); 
        System.out.println("Keliling persegi panjang tersebut adalah: "+p.keliling(10,5));
        System.out.println("Luas persegi panjang tersebut adalah: "+p.luas(3.6,8));
        System.out.println("Keliling persegi panjang tersebut adalah :"+p.keliling(3.6,8));
        System.out.println("Luas persegi panjang tersebut adalah: "+p.luas(6,8.3));
        System.out.println("Keliling persegi panjang tersebut adalah: "+p.keliling(6,8.3));
        System.out.println("Luas persegi panjang tersebut adalah: "+p.luas(5.6,8.8));
        System.out.println("Keliling persegi panjang tersebut adalah: "+p.keliling(5.6,8.8));
        System.out.println("");
        System.out.println("PERSEGI");
        System.out.println("");
        
        Persegi P=new Persegi();
        System.out.println("Luas persegi tersebut adalah: "+P.luas(4.5));
        System.out.println("Keliling persegi tersebut adalah: "+P.keliling(4.5));
        System.out.println("Luas persegi tersebut adalah: "+P.luas(7));
        System.out.println("Keliling persegi tersebut adalah: "+P.keliling(7));
        System.out.println("Luas persegi tersebut adalah: "+P.luas(5));
        System.out.println("Keliling persegi tersebut adalah: "+P.keliling(5));
        System.out.println("Luas persegi tersebut adalah: "+P.luas(7.4));
        System.out.println("Keliling persegi tersebut adalah: "+P.keliling(7.4));
        System.out.println("");
        System.out.println("LINGKARAN");
        System.out.println("");
        
        Lingkaran l=new Lingkaran();
        System.out.println("Luas lingkaran tersebut adalah: "+l.luas(5));
        System.out.println("Keliling lingkaran tersebut adalah: "+l.keliling(5));
        System.out.println("Luas lingkaran tersebut adalah: "+l.luas(7.4));
        System.out.println("Keliling lingkaran tersebut adalah: "+l.keliling(7.4));
        
        System.out.println("");
        System.out.println("SEGITIGA");
        System.out.println("");
        
        Segitiga s=new Segitiga();
        System.out.println("Luas lingkaran tersebut adalah: "+s.luas(8,10));
        System.out.println("Keliling lingkaran tersebut adalah: "+s.keliling(8,10));
        System.out.println("Luas lingkaran tersebut adalah: "+s.luas(8,11.5));
        System.out.println("Keliling lingkaran tersebut adalah: "+s.keliling(8,11.5));
        System.out.println("Luas lingkaran tersebut adalah: "+s.luas(12.2,9));
        System.out.println("Keliling lingkaran tersebut adalah: "+s.keliling(12.2,9));
        System.out.println("Luas lingkaran tersebut adalah: "+s.luas(13.9,20.7));
        System.out.println("Keliling lingkaran tersebut adalah: "+s.keliling(13.9,20.7));
    }}