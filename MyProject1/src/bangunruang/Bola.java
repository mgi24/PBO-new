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
public class Bola {
    public static void main(String[] args) {
        Bola op1 = new Bola();
        op1.jarijari = 10;
        op1.hitungVol();
        op1.hitungLuasSelimut();
    }
    public int jarijari;
    
    
    
    public void hitungVol(){
        double hasil = 3.14*jarijari*jarijari*jarijari*4/3;
        System.out.println("Volume adalah: " + hasil);
    }
    public void hitungLuasSelimut(){
        double hasil = 3.14*4*jarijari*jarijari;
        System.out.println("Luas Selimut adalah: " + hasil);
    }
    
}
