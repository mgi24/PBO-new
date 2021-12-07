
package project.pengubinan;


public class Ruang {
    int panjang;
    int lebar;
    
    int hitungluas(){
        //PersegiPanjang p=new PersegiPanjang();
        
        return PersegiPanjang.perkalian(this.panjang,this.lebar);
    }
    
}
