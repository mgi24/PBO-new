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
public class Lingkaran {
    public static void main(String[] args) {
        Lingkaran op1 = new Lingkaran();
        op1.jarijari = 25;
        op1.hitungLuas();
        op1.hitungKeliling();
        op1.jarijari=37;
        op1.hitungLuas();
        op1.hitungKeliling();
    }
    public int jarijari;
    
    
    
    public void hitungLuas(){
        double hasil = 3.14*jarijari*jarijari ;
        System.out.println("Luasnya adalah: " + hasil);
    }
    public void hitungKeliling(){
        double hasil = 3.14*2*jarijari;
        System.out.println("kelilingnya adalah: " + hasil);
    }
    
}
