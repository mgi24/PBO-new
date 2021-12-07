
package project.pengubinan;


public class Ubin {
    int panjang;
    int lebar;
    
    
    int hitungluas(){
        PersegiPanjang p = new PersegiPanjang();
        
        return p.hitungluas(this.lebar,this.panjang);
    }
    
    
}
