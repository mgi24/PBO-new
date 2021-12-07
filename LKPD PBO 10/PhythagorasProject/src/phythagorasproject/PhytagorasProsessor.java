

package phythagorasproject;
import java.lang.Math;
public class PhytagorasProsessor {
    void PythagorasChecker(int a,int b,int c){
        double kuadrat=(a*a)+(b*b);
        double result= (double)(Math.sqrt(kuadrat));
        if (c==result){
            System.out.println("Segitiga ini adalah segitiga Pythagoras");
            System.out.println("========================================");
        }
        else{
            System.out.println("Segitiga ini bukan segitiga Pythagoras");
            System.out.println("========================================");
        }
    }
    double Pythagorasmiring(int a,int b){
        double kuadrat=(a*a)+(b*b);
        double result= (double)(Math.sqrt(kuadrat));
        return result;
    }
    double PythagorasSiku(int c,int a){
        double b=(c*c)-(a*a);
        double result= (double)(Math.sqrt(b));
        return result;
    }
}
