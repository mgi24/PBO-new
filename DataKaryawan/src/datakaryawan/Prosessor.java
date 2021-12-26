
package datakaryawan;
import java.util.*;
import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//max
public class Prosessor {
    
    //DATENOW INJECTOR
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String dateNow=myDateObj.format(myFormatObj);
    
    
    
    Scanner input=new Scanner(System.in);
    int select;
    String kodeKaryawan;
    String namaKaryawan;
    String alamat;
    String tglLahir;
    String gol;
    String deleter;
    String searcher;
    int statusNikah;
    int anak;
    int subSelect;
    int umur;
    int indexer;
    int gaji;
    double tunjanganNikah;
    double tunjanganPegawai;
    double tunjanganAnak;
    double gajiSmasher;
    ArrayList<String> kodeData = new ArrayList<>();
    ArrayList<String> namaData = new ArrayList<>();
    ArrayList<String> alamatData = new ArrayList<>();
    ArrayList<Integer> umurData = new ArrayList<>();
    ArrayList<String> golData = new ArrayList<>();
    ArrayList<Integer> statusData = new ArrayList<>();
    ArrayList<Integer> anakData = new ArrayList<>();
    void input(){
        
        while(true){
            System.out.println("MENU UTAMA");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            System.out.print("Menu Pilihan: ");
            this.select=input.nextInt();
            input.nextLine();
            if (select==5){
                
                System.exit(0);
               
            }
            else if (select==1){
                addData();  
            }
            else if (select==4){
                ShowData sd = new ShowData();
                sd.ShowData(this.kodeData, this.namaData, this.alamatData, this.umurData, this.golData, this.statusData, this.anakData);
                
                
                
                System.out.println("Pilih Sub Menu:");
                System.out.println("1. Kembali ke menu utama");
                
                System.out.print("Menu pilihan: ");
                this.subSelect=input.nextInt();
                input.nextLine();
                if (subSelect==1){
                    continue;
                }
                else{
                    continue;
                }
            }
            else if (select==2){
                DeleteData d=new DeleteData();
                d.deleteData(this.kodeData, this.namaData, this.alamatData, this.umurData, this.golData, this.statusData, this.anakData);
                
                
                
                
            }
            else if (select==3){
                searchData();
            }
        }
    }
    void injector(
    ArrayList<String> kodeData1 ,
    ArrayList<String> namaData1 ,
    ArrayList<String> alamatData1 ,
    ArrayList<Integer> umurData1 ,
    ArrayList<String> golData1 ,
    ArrayList<Integer> statusData1 ,
    ArrayList<Integer> anakData1 
    ){
        this.kodeData=kodeData1;
        this.namaData=namaData1;
        this.alamatData=alamatData1;
        this.umurData=umurData1;
        this.golData=golData1;
        this.statusData=statusData1;
        this.anakData=anakData1;
        input();
        
    }
    
    //USELESS
    ArrayList<String>kodeDataInject(){
        return this.kodeData;
    }
    ArrayList<String> namaDataInject (){
        return this.namaData;
    }
    ArrayList<String> alamatDataInject(){
        return this.alamatData;
    }
    ArrayList<Integer> umurDataInject(){
        return this.umurData;
    }
    ArrayList<String> golDataInject(){
        return this.golData;
    }
    ArrayList<Integer> statusDataInject(){
        return this.statusData;
    }
    ArrayList<Integer> anakDataInject(){
        return this.anakData;
    }
    

    
    
    void searchData(){
        while (true){
            System.out.print("Kode Karyawan yang datanya mau dicari:   ");
            this.searcher=input.next();
            input.nextLine();
            //INDEX CHECKER
            this.indexer=kodeData.indexOf(searcher);
            
            if (indexer>-1){
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("DATA PROFILE KARYAWAN");
                    System.out.println("-----------------------------------------");
                    System.out.print("Gaji Pokok            : ");
                    System.out.println("Kode Karyawan         : "+kodeData.get(indexer));
                    System.out.println("Nama Karyawan         : "+namaData.get(indexer));
                    System.out.println("Usia                  : "+umurData.get(indexer));
                    System.out.println("Golongan              : "+golData.get(indexer));
                    System.out.print("Status Menikah        : ");
                    
                    if (statusData.get(indexer)==0){
                        System.out.println("Belum Menikah");
                        
                        
                    }
                    else if (statusData.get(indexer)==1){
                        System.out.println("Menikah");
                        
                    }
                    
                    System.out.println("Jumlah Anak           : "+anakData.get(indexer));
                    System.out.println("-----------------------------------------");
                    System.out.print("Gaji Pokok            : ");
                    
                    //GAJI INJECTOR
                    if ("A".equals(golData.get(indexer))){
                        this.gaji=5000000;
                        System.out.println("Rp "+gaji);
                        
                    }
                    else if ("B".equals(golData.get(indexer))){
                        this.gaji=6000000;
                        System.out.println("Rp "+gaji);
                        
                    }
                    else if ("C".equals(golData.get(indexer))){
                        this.gaji=7000000;
                        System.out.println("Rp "+gaji);
                        
                    }
                    //SOAL DI TAMBAH DATA PILIHAN ABCD NAMUN GAJI
                    //HANYA ADA ABC, MAKA SAYA BUAT D=8JUTA
                    else if ("D".equals(golData.get(indexer))){
                        this.gaji=8000000;
                        System.out.println("Rp "+gaji);
                        
                    }
                    //TUNJANGAN NIKAH INJECTOR
                    System.out.print("Tunjangan Istri/Suami : ");
                    if (statusData.get(indexer)==0){
                        
                        this.tunjanganNikah=0;
                        System.out.println("Rp "+tunjanganNikah);
                    }
                    else if (statusData.get(indexer)==1){
                        
                        this.tunjanganNikah=0.1*gaji;
                        System.out.println("Rp "+tunjanganNikah);
                    }
                    
                    
                    //TUNJANGAN PEGAWAI INJECTOR
                    System.out.print("Tunjangan Pegawai     : ");
                    
                    if (umurData.get(indexer)>30){
                        this.tunjanganPegawai=0.15*gaji;
                        System.out.println("Rp "+tunjanganPegawai);
                    }
                    else{
                        this.tunjanganPegawai=0;
                        System.out.println("Rp "+tunjanganPegawai);
                    }
                    
                    //TUNJANGAN ANAK INJECTOR
                    System.out.print("Tunjangan Anak        : ");
                    if (anakData.get(indexer)>0){
                        
                        this.tunjanganAnak=0.05*gaji*(anakData.get(indexer));
                        System.out.println("Rp "+tunjanganAnak);
                    }
                    else{
                        this.tunjanganAnak=0;
                        System.out.println("Rp "+tunjanganAnak);
                    }
                    System.out.println("-----------------------------------------+");
                    this.gajiSmasher=gaji+tunjanganNikah+tunjanganPegawai+tunjanganAnak;
                    double potongan=gajiSmasher*0.025;
                    System.out.println("Gaji Kotor            : Rp "+(int)gajiSmasher);
                    System.out.println("Potongan              : Rp "+potongan);
                    System.out.println("----------------------------------------- -");
                    double fix=gajiSmasher-potongan;
                    System.out.println("Gaji Bersih           : Rp "+(int)fix);
                    

                    
                }
            else{
                System.out.println("Data Tidak Ditemukan, Silahkan Coba Lagi");
                    searchData();
            }
            System.out.println("Pilih Sub Menu:");
            System.out.println("1. Kembali ke menu utama");
            System.out.print("Menu pilihan: ");
                this.subSelect=input.nextInt();
                input.nextLine();
                if (subSelect==1){
                    input();
                }
                else{
                    input();
                }
            
            
        }
    }
            
    
    void addData(){
        while(true){
                System.out.print("Masukkan Kode Karyawan    :");
                this.kodeKaryawan=input.next();
                input.nextLine();
                System.out.print("Masukkan Nama Karyawan    :");
                this.namaKaryawan=input.next();
                input.nextLine();
                System.out.print("Masukkan Alamat           :");
                this.alamat=input.next();
                input.nextLine();
                System.out.print("Masukkan Tanggal Lahir    :");
                this.tglLahir=input.next();
                input.nextLine();
                System.out.print("Masukkan Golongan         :");
                this.gol=input.next();
                input.nextLine();
                
                
                //GOLONGAN CHECKER
                if (("A".equals(gol))||("B".equals(gol))||("C".equals(gol))||("D".equals(gol))){
                    
                    
                }
                else if ((!"A".equals(gol))&&(!"B".equals(gol))&&(!"C".equals(gol))&&(!"D".equals(gol))){
                    
                                System.out.println("Silahkan Masukkan Jenis Golongan Yang Benar");
                                System.out.println("A B C D");
                                addData();
                            }
                        
                    
                
                
                
                
                System.out.print("Masukkan Status Menikah   :");
                //CHECKER STATUS NIKAH
                this.statusNikah=input.nextInt();
                input.nextLine();
                if (statusNikah==1){
                    System.out.print("Masukkan Jumlah Anak      :");
                    this.anak=input.nextInt();
                    input.nextLine();
                }
                else if (statusNikah==0){
                    this.anak=0;
                }
                else if((statusNikah!=0) && (statusNikah!=1)){
                    System.out.println("Input Salah, Silahkan coba lagi");
                    addData();
                }
                //CHECKER TGL LAHIR
                CekUmur(tglLahir,dateNow);
                
                
                
                
                kodeData.add(kodeKaryawan);
                namaData.add(namaKaryawan);
                alamatData.add(alamat);
                umurData.add(this.umur);
                golData.add(gol);
                statusData.add(statusNikah);
                anakData.add(anak);
                System.out.println("Pilih Sub Menu:");
                System.out.println("1. Kembali ke menu utama");
                System.out.println("2. Tambah Data Kembali");
                System.out.print("Menu pilihan: ");
                this.subSelect=input.nextInt();
                input.nextLine();
                if (subSelect==1){
                    input();
                }
                else if(subSelect==2){
                    continue;
                }
        }
    }
    
    
    void CekUmur(String start_date,
                   String end_date)
        {
  
        // SimpleDateFormat converts the
        // string format to date object
        SimpleDateFormat sdf
            = new SimpleDateFormat(
                "yyyy-MM-dd");
  
        // Try Block
        try {
  
            // parse method is used to parse
            // the text from a string to
            // produce the date
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
  
            // Calucalte time difference
            // in milliseconds
            long difference_In_Time
                = d2.getTime() - d1.getTime();
  
            // Calucalte time difference in
            // seconds, minutes, hours, years,
            // and days
            long difference_In_Seconds
                = (difference_In_Time
                   / 1000)
                  % 60;
  
            long difference_In_Minutes
                = (difference_In_Time
                   / (1000 * 60))
                  % 60;
  
            long difference_In_Hours
                = (difference_In_Time
                   / (1000 * 60 * 60))
                  % 24;
  
            long difference_In_Years
                = (difference_In_Time
                   / (1000l * 60 * 60 * 24 * 365));
            umur=(int)difference_In_Years;
            long difference_In_Days
                = (difference_In_Time
                   / (1000 * 60 * 60 * 24))
                  % 365;
  
            // Print the date difference in
            // years, in days, in hours, in
            // minutes, and in seconds
  
            
        }
        // Catch the Exception
        catch (ParseException e) {
            System.out.println("Terdapat Kesalahan Pada Penulisan Tanggal Lahir");
            System.out.println("Pastikan Format Penulisan Tahun-Bulan-Hari (dengan angka)");
            System.out.println("Misal 2001-26-12");
            addData();
        }
        
       
    }
    
}
