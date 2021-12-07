
package phythagorasproject;
import java.util.Scanner;
/**
 *
 * @author max
 */
public class Input {
    Scanner data=new Scanner(System.in);
    void inputdata(){
        while (true){
            System.out.println("FEATURES: ");
            System.out.println("1. Cek Triple Pythagoras");
            System.out.println("2. Menentukan Sisi Miring Segitiga");
            System.out.println("3. Menentukan Sisi siku-siku Segitiga");
            System.out.println("4. Exit");
            System.out.println(" ");
            System.out.println("Silahkan Pilih Feature:");
            int select = data.nextInt();
            data.nextLine();
            PhytagorasProsessor P=new PhytagorasProsessor();
            switch(select){
                case 1:
                    System.out.println("Sisi A: ");
                    int A=data.nextInt();
                    data.nextLine();
                    System.out.println("Sisi B: ");                
                    int B=data.nextInt();
                    data.nextLine();
                    System.out.println("Sisi C (sisi miring): ");
                    int C=data.nextInt();
                    data.nextLine(); 
                    P.PythagorasChecker(A, B, C);
                    break;
                case 2:
                    System.out.println("Sisi A: ");
                    A=data.nextInt();
                    data.nextLine();
                    System.out.println("Sisi B: ");                
                    B=data.nextInt();
                    data.nextLine();
                    double result= P.Pythagorasmiring(A, B);
                    System.out.println("Panjang Sisi Miring C Adalah: "+result);
                    System.out.println("========================================");
                    break;
                case 3:
                    System.out.println("Sisi C (Miring): ");
                    C=data.nextInt();
                    data.nextLine();
                    System.out.println("Sisi A: ");
                    A=data.nextInt();
                    data.nextLine();
                    result= P.PythagorasSiku(C, A);
                    System.out.println("Panjang Sisi Siku B Adalah: "+result);
                    System.out.println("========================================");
                    break;
                case 4:
                    System.out.println("Quit...");
                    System.exit(0);
                default:
                    System.out.println("Silahkan Masukkan Pilihan Feature yang Sesuai");
                    System.out.println("========================================");
            }
 
        }   
    }
}
