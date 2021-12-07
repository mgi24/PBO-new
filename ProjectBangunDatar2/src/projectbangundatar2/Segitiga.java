
package projectbangundatar2;
import java.lang.Math;

public class Segitiga {
    double luas (int alas, int tinggi){
        return (0.5*alas*tinggi);
    }
    double luas (double alas, int tinggi){
        return (0.5*alas*tinggi);
    }
    double luas (int alas, double tinggi){
        return (0.5*alas*tinggi);
    }
    double luas (double alas, double tinggi){
        return (0.5*alas*tinggi);
    }
    double keliling (int alas, int tinggi){
        
        return (alas+tinggi+(Math.sqrt((alas*alas)+(tinggi*tinggi))));
    }
    double keliling (double alas, double tinggi){
        
        return (alas+tinggi+(Math.sqrt((alas*alas)+(tinggi*tinggi))));
    }
    double keliling (int alas, double tinggi){
        
        return (alas+tinggi+(Math.sqrt((alas*alas)+(tinggi*tinggi))));
    }
    double keliling (double alas, int tinggi){
        
        return (alas+tinggi+(Math.sqrt((alas*alas)+(tinggi*tinggi))));
    }
}
