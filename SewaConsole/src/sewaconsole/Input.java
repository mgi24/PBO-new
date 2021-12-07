
package sewaconsole;
import java.util.Scanner;

public class Input {
    Scanner input=new Scanner(System.in);
    String who;
     protected int tglP;
     protected int blnP;
     protected int thP;
     protected int tglK;
     protected int blnK;
     protected int thK;
    
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
