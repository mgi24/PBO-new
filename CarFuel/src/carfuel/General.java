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
public abstract class General {
    public String namaMobil;
    public String carType;
    public double speed;
    public double lenght;
    
    
    public abstract double fuel();
    public double timeSpent(){
        double jam = (double)(this.lenght/this.speed);
        return jam;
    }
    
    public void result(){
        System.out.println("==========================================================================");
        System.out.println("Mobil : "+this.namaMobil);
        System.out.println("Jenis Mobil: "+this.carType);
        System.out.println("Jarak perjalanan: "+this.lenght+" Km");
        System.out.println("Jumlah bahan bakar minimal untuk perjalanan adalah: "+fuel()+" Liter");
        System.out.println("Estimasi waktu perjalanan adalah: "+timeSpent()+" Jam");
    }
}
