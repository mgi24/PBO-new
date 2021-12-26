/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan;

import java.util.*;

/**
 *
 * @author WorkLoad
 */
public class ShowData extends Abstract{
    public void ShowData(
    ArrayList<String> kodeData1 ,
    ArrayList<String> namaData1 ,
    ArrayList<String> alamatData1 ,
    ArrayList<Integer> umurData1 ,
    ArrayList<String> golData1 ,
    ArrayList<Integer> statusData1 ,
    ArrayList<Integer> anakData1 )
    {
        
        System.out.println("==========================================");
                System.out.println("DATA KARYAWAN");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("KODE KARY   NAMA KARYAWAN   GOL USIA    STATUS NIKAH    JUMLAH ANAK");
                System.out.println("---------------------------------------------------------------------");
                for (int i = 0; i < kodeData1.size(); i++) {
                    System.out.print(kodeData1.get(i)+"          "+namaData1.get(i)+"         "+golData1.get(i)+"  "+umurData1.get(i)+"         "+statusData1.get(i)+"               "+anakData1.get(i));
                    System.out.println();
                }
                System.out.println();
                
                System.out.println("---------------------------------------------------------------------");
    }
    
}
