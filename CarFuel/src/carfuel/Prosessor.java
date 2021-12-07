
package carfuel;

public class Prosessor {
    String Sedan="Sedan";
    String SUV="SUV";
    String MPV="MPV";
    
    
    public void proses(String nama, String type, int lenght, int speed){
        
        if (type == Sedan){
            Sedan s=new Sedan();
            s.namaMobil=nama;
            s.carType=type;
            s.lenght=lenght;
            s.speed=speed;
            s.result();
            
        }
        else if (type == SUV){
            SUV suv=new SUV();
            suv.namaMobil=nama;
            suv.carType=type;
            suv.lenght=lenght;
            suv.speed=speed;
            suv.result();
            
        }
        else if (type == MPV){
            MPV m=new MPV();
            m.namaMobil=nama;
            m.carType=type;
            m.lenght=lenght;
            m.speed=speed;
            m.result();
        }
    }
}
