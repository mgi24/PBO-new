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
public class Lingkaran extends BangunDatar {
    // atribut jari-jari
    public double r;
    
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
       double luas=this.r*this.r*3.14;
       return luas;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling(){
 	 double keliling=this.r*2*3.14;
           return keliling;
    }
}

