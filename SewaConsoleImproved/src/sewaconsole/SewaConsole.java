/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewaconsole;
import java.util.Scanner;

/**
 *
 * @author WorkLoad
 */
public class SewaConsole {
    

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        Db db=new Db();
        Prosessor p = new Prosessor();
        //p.input();
        Input I=new Input();
        
        
       p.prosessor();
        
        db.databases();
        
        
    String status;
    String nama;
    int index;
    String silver="Silver";
    String gold="Gold";
    String platinum="Platinum";
    double sewa;
    double diskon;
    double total = 0;
    int point = 0;
    int cashback = 0;
    int pulsa = 0;
    int price;
    //debug System.out.println(p.whois);
    
        if(db.id.indexOf(p.whois)>-1){
            index=db.id.indexOf(p.whois);
            nama=db.name.get(index);
            status=db.jenis.get(index);     
            System.out.println("======================================");
            System.out.println("ID Member           :"+p.whois);
            System.out.println("Nama Member         :"+nama);
            System.out.println("Jenis Member        :"+status);
            System.out.println("");
            p.tgl();
            System.out.println("Lama Sewa           :"+p.duration());
            System.out.println("");
            if(status=="Silver"){
                sewa=25000*p.duration();
                diskon=sewa*1/100;
                total=sewa-diskon;
                point=1*p.duration();
            }
            if (status=="Gold"){
                sewa=30000*p.duration();
                diskon=sewa*2/100;
                total=sewa-diskon;
                point=5*p.duration();
                cashback=5000;
                
            }
            if (status=="Platinum"){
                sewa=45000*p.duration();
                diskon=sewa*3/100;
                total=sewa-diskon;
                point=10*p.duration();
                cashback=10000;
                pulsa=5000*p.duration();
            }
            System.out.println("Total Sewa          :"+total);
            System.out.println("Jumlah Poin         :"+point);
            if (status=="Gold"){
                System.out.println("Jumlah Cashback     :"+cashback);
                
            }
            if (status=="Platinum"){
                System.out.println("Jumlah Cashback     :"+cashback);
                System.out.println("Bonus Pulsa         :"+pulsa);
            }
            
            
        }
        else{
            System.out.println("======================================");
            System.out.println("ID Tidak Ditemukan");
            
        }
        
        
        
        
        
        
    }
    
    
}
