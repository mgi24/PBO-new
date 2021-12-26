
package datakaryawan;
//max

import java.util.ArrayList;

public class DeleteData extends Prosessor{
    
    //USELESS ARRAYLIST, JUST FOR DOCUMENTATION
    ArrayList<String> kodeData2 = new ArrayList<>();
    ArrayList<String> namaData2 = new ArrayList<>();
    ArrayList<String> alamatData2 = new ArrayList<>();
    ArrayList<Integer> umurData2 = new ArrayList<>();
    ArrayList<String> golData2 = new ArrayList<>();
    ArrayList<Integer> statusData2 = new ArrayList<>();
    ArrayList<Integer> anakData2 = new ArrayList<>();
    
    //FAILED TRY, NEVER USED
    void initiateEncapsulation(){
        Prosessor p =new Prosessor();
        p.input();
    
}
    
    
    void deleteData(
    ArrayList<String> kodeData1 ,
    ArrayList<String> namaData1 ,
    ArrayList<String> alamatData1 ,
    ArrayList<Integer> umurData1 ,
    ArrayList<String> golData1 ,
    ArrayList<Integer> statusData1 ,
    ArrayList<Integer> anakData1 
    
    
    ){
        while(true){
                
                
                System.out.print("Kode Karyawan yang Mau dihapus:   ");
                this.deleter=input.next();
                input.nextLine();
                //INDEX CHECKER
                this.indexer=kodeData1.indexOf(deleter);
                
                if (indexer>-1){
                    kodeData1.remove(indexer);
                    namaData1.remove(indexer);
                    alamatData1.remove(indexer);
                    umurData1.remove(indexer);
                    golData1.remove(indexer);
                    statusData1.remove(indexer);
                    anakData1.remove(indexer);
                }
                else{
                    System.out.println("Data Tidak Ditemukan, Silahkan Coba Lagi");
                    continue;
                }
                Prosessor p =new Prosessor();
                
                
                
                
                System.out.println();
                System.out.println("Pilih Sub Menu:");
                System.out.println("1. Kembali ke menu utama");
                System.out.println("2. Hapus Data Kembali");
                System.out.print("Menu pilihan: ");
                this.subSelect=input.nextInt();
                input.nextLine();
                if (subSelect==1){
                    p.injector(
                    kodeData1,
                    namaData1,
                    alamatData1,
                    umurData1,
                    golData1,
                    statusData1,
                    anakData1
                );
                    
                }
                else if(subSelect==2){
                    continue;
                }
                
                
                
                
                
                
        }
        
    }
}
