
package gametebakangkaproject;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Tebakan {
    Scanner data=new Scanner(System.in);
    void guess(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        
        
        
            System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
            while (true){
                System.out.println("Masukkan Tebakan Anda: ");
                int tebak=data.nextInt();
                data.nextLine();
                if (tebak==randomNum){
                   System.out.println("TEBAKAN ANDA BENAR!!!");
                   System.out.println("=======================");
                   break;
                   

                }
                else if (tebak>randomNum){
                    System.out.println("Tebakan anda terlalu besar");
                   System.out.println("=======================");
                }
                else if (tebak<randomNum){
                    System.out.println("Tebakan anda terlalu kecil");
                   System.out.println("=======================");
                }
            }
    }
    
}
