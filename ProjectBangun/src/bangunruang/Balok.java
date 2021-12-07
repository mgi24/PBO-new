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
public class Balok extends BangunRuang{
    public double panjang;
    public double lebar;
    public double tinggi;
    
    public double hitungVolume(){
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
    public double hitungLuas(){
        double luas = 2 * ((2*(this.panjang+this.lebar))+(2*(this.panjang+this.tinggi))+(2*(this.lebar+this.tinggi)));
        return luas;
    }
    
}
