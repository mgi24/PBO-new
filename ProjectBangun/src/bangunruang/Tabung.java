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
public class Tabung extends BangunRuang {
    public double r;
    public double tinggi;
    
    public double hitungVolume(){
        double volume = this.r * this.r * this.tinggi *3.14;
        return volume;
    }
    public double hitungLuas(){
        double luas =  (2*3.14*this.r*this.r)+(2*this.r*3.14*this.tinggi);
        return luas;
    }
    
}
