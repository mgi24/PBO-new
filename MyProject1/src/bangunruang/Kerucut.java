/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

import static java.lang.Math.sqrt;

/**
 *
 * @author WorkLoad
 */
public class Kerucut {
    public static void main(String[] args) {
        Kerucut op1 = new Kerucut();
        op1.jarijari = 6;
        op1.tinggi=8;
        op1.hitungVol();
        op1.hitungLuasSelimut();
    }
    public int jarijari;
    public int tinggi;
    public int sisi;
    
    
    
    public void hitungVol(){
        double hasil = 3.14*jarijari*jarijari*tinggi/3;
        System.out.println("Volume adalah: " + hasil);
    }
    public void hitungLuasSelimut(){
        sisi=(jarijari*jarijari)+(tinggi*tinggi);
        double hasil = 3.14*jarijari*sqrt(sisi);
        System.out.println("Luas Selimut adalah: " + hasil);
        System.out.println(sisi);
    }
    
}
