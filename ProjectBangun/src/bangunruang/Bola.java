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
public class Bola extends BangunRuang {
    
    public double r;
    public double hitungVolume(){
        double volume = 3.14*this.r*this.r*this.r*4/3;
        return volume;
    }
    public double hitungLuas(){
        double volume = 4*3.14*this.r*this.r;
        return volume;
    }
}
