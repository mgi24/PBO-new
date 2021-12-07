/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;
import bangundatar.*;
import bangunruang.*;
/**
 *
 * @author WorkLoad
 */
public class MainClass {
    public static void main(String[] args) {
        Persegi P =new Persegi();
        P.sisi=4;
        System.out.println("PERSEGI");
        P.tampilHasil();
        PersegiPanjang PP = new PersegiPanjang();
        PP.panjang=4;
        PP.lebar=5;
        System.out.println("PERSEGI PANJANG");
        PP.tampilHasil();
        Lingkaran L = new Lingkaran();
        L.r=7;
        System.out.println("LINGKARAN");
        L.tampilHasil();
        Bola B = new Bola();
        B.r=7;
        System.out.println("BOLA");
        B.tampilHasil();
        Balok b=new Balok();
        b.panjang=3;
        b.lebar=4;
        b.tinggi=5;
        System.out.println("BALOK");
        b.tampilHasil();
        Tabung T=new Tabung();
        T.r=7;
        T.tinggi=10;
        System.out.println("TABUNG");
        T.tampilHasil();
    }

}
