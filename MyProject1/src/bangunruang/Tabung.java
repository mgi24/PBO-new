/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author WorkLoad
 */
public class Tabung {
    public static void main(String[] args) {
        Tabung op1 = new Tabung();
        op1.jarijari = 10;
        op1.tinggi=10;
        op1.hitungVol();
        op1.hitungLuasSelimut();
    }
    public int jarijari;
    public int tinggi;
    
    
    
    public void hitungVol(){
        double hasil = 3.14*jarijari*jarijari*tinggi;
        System.out.println("Volume adalah: " + hasil);
    }
    public void hitungLuasSelimut(){
        double hasil = 3.14*2*jarijari*tinggi;
        System.out.println("Luas Selimut adalah: " + hasil);
    }
    
}
