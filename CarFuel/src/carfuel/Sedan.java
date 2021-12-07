/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfuel;

/**
 *
 * @author WorkLoad
 */
public class Sedan extends General{
     public double fuel(){
        double fuel=(double)(this.lenght/10);
        return fuel;
    }
}
