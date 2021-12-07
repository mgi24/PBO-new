
package project.pengubinan;


public class ProjectPengubinan {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ruang A =new Ruang();
        A.panjang=3;
        A.lebar=3;
       Ruang B=new Ruang();
       B.panjang=5;
       B.lebar=5;
       Ruang C=new Ruang();
       C.panjang=4;
       C.lebar=3;
       
       int totalluas=A.hitungluas()+B.hitungluas()+C.hitungluas();
       
       Ubin U=new Ubin();
       U.panjang=40;
       U.lebar=40;
       //tidak bisa keluar hasil apabila langsung dibagi
       //hasil 0.0
       double luasubin=U.hitungluas();
       double LuasUbin= luasubin/10000;
       
       
       double totalubin=totalluas/LuasUbin;
       System.out.println("Banyaknya ubin yang diperlukan: "+totalubin);
    }
    
}
