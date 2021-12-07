
package carfuel;


public class CarFuel {

    public static void main(String[] args) {
        Prosessor P=new Prosessor();
        P.proses("A", "Sedan", 152, 60);
        P.proses("B", "Sedan", 531, 65);
        P.proses("C", "SUV", 612, 57);
        P.proses("D", "SUV", 527, 62);
        P.proses("E", "MPV", 541, 64);
        P.proses("F", "MPV", 427, 53);
    }
    
}
