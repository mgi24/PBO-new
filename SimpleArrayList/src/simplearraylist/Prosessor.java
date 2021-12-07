//mx
package simplearraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author WorkLoad
 */
public class Prosessor {
    Scanner input=new Scanner(System.in);
    ArrayList<String> arr = new ArrayList<>();
    int select;
    String injector;
    int indexer;
    
    void input(){
        while (true){
            System.out.println("Menu Data ArrayList:");
            System.out.println("1. Tambah data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.println("Pilih nomor berapa :");
            this.select=input.nextInt();
            if (select==5){
                System.out.println("=======================================");
                break;
                
            }
            else if (select==1){
                System.out.println("Masukkan data string: ");
                this.injector=input.next();
                input.nextLine();
                System.out.println("=======================================");
                
                arr.add(injector);
                System.out.println("Daftar String dalam array list: "+arr);
                System.out.println("=======================================");
                input.nextLine();
            }
            else if (select==2){
                System.out.println("String yang dicari: ");
                this.injector=input.next();
                input.nextLine();
                System.out.println("=======================================");
                if ((arr.indexOf(injector))<0){
                    System.out.println("String "+injector+" tidak ada dalam data");
                    System.out.println("=======================================");
                    input.nextLine();
                }
                else{
                    System.out.println("String "+injector+" ada du index ke "+arr.indexOf(injector)+" di dalam data." );
                    System.out.println("=======================================");
                    input.nextLine();
                }
                
                
            }
            else if (select==3){
                System.out.println("String yang mau dihapus: ");
                this.injector=input.next();
                input.nextLine();
                System.out.println("=======================================");
                if ((arr.indexOf(injector))<0){
                    System.out.println("String "+injector+" tidak ada dalam data");
                    System.out.println("=======================================");
                    input.nextLine();
                }
                else{
                    indexer=arr.indexOf(injector);
                    arr.remove(indexer);
                    System.out.println("String "+injector+" sudah dihapus dari data" );
                    System.out.println("Daftar String dalam array list: "+arr);
                    System.out.println("=======================================");
                    input.nextLine();
                }
            }
            else if (select==4){
                 System.out.println("Daftar String dalam array list: "+arr);
                    System.out.println("=======================================");
                    input.nextLine();
            }
            
        }
        
    }
        
    
    
    
}
