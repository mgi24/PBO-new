
package sewaconsole;
import java.util.Scanner;

public class Input {
    
    public int getTglP(){
        return this.tglP;
    }
    public int getBlnP(){
        return this.blnP;
    }
    public int getThP(){
        return this.thP;
    }
    public int getTglK(){
        return this.tglK;
    }
    public int getBlnK(){
        return this.blnK;
    }
    public int getThK(){
        return this.thK;
    }
    
    
    
    Scanner input=new Scanner(System.in);
    String who;
     private int tglP;
     private int blnP;
     private int thP;
     private int tglK;
     private int blnK;
     private int thK;
     
    
    
    void input(){
        System.out.println("Masukkan ID Member  :");
        who=input.next();
        input.nextLine();
        System.out.println("Masukkan Tanggal Pinjam(1-31)  :");
        
        tglP=input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Bulan Pinjam(1-12) :");
        blnP=input.nextInt();
        input.nextLine();
        System.out.println("Masukkan tahun Pinjam :");
        thP=input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Tanggal Kembali(1-31) :");
        tglK=input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Bulan Kembali(1-12) :");
        blnK=input.nextInt();
        input.nextLine();
        System.out.println("Masukkan tahun Kembali :");
        thK=input.nextInt();
        input.nextLine();
        
        
    }
    
    
    
    
}
