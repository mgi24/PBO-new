/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author WorkLoad
 */
public class Project2 {
    public static void main(String[] args) {
               
        //tulis data disini
        int diameter=28;
        int r=diameter/2;
        int setengahr=r/2;
        
        Lingkaran L=new Lingkaran();
        double setengahlingkaran=L.hitungluas(r)/2;
        double seperempatlingkaran=L.hitungluas(setengahr);
        double result=setengahlingkaran-seperempatlingkaran;
        System.out.println("Luas bangun tersebut adalah: "+result);
        
              
        
    }
    
    
}
