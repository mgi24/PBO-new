
package projectluasbangunkompleks;


public class ProjectLuasBangunKompleks {

    
    public static void main(String[] args) {
               
        //tulis sisi dalam bangun disini
        int sisi=42;
        
        
        int r=sisi/2;
        Lingkaran L=new Lingkaran();
        float luaslingkaran=L.hitungluas(r);
        int luaspersegi =Persegi.hitungluas(sisi);       
        float hasil=luaspersegi+luaslingkaran;

                
        System.out.println("luas bangun ini adalah: "+hasil);
    }
    
}
