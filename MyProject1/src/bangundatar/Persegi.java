/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author WorkLoad
 */
public class Persegi {
    
    public static void main(String[] args) {
        Persegi op1 = new Persegi();
        //a.persegi 10 satuan
        op1.panjang = 10;
        op1.hitungLuas();
        op1.hitungKeliling();
        //b.persegi 15 satuan
        op1.panjang=15;
        op1.hitungLuas();
        op1.hitungKeliling();
    }
    public int panjang;
    
    
    
    public void hitungLuas(){
        int hasil = panjang * panjang;
        System.out.println("Luasnya adalah: " + hasil);
    }
    public void hitungKeliling(){
        int hasil = 4*(panjang);
        System.out.println("kelilingnya adalah: " + hasil);
    }
    
}
