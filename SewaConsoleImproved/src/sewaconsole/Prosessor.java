
package sewaconsole;
import java.time.LocalDateTime;
import java.time.Duration;

public class Prosessor extends Input{
    String whois;
    Encapsulate E=new Encapsulate();
    
    public void prosessor(){
        
        E.initiate();
        E.setBlnP();
        E.setBlnK();
        E.setTglP();
        E.setTglK();
        E.setThK();
        this.whois=E.who;
        //debug
        //System.out.println("tgl P="+E.tglP);
        //System.out.println("tgl K="+E.tglK);
        //System.out.println("bln P="+E.blnP);
        //System.out.println("bln K="+E.blnK);
        //System.out.println("th K="+E.thK);
        //System.out.println("th P="+E.thP);
        
    }
    
        
        
        
    int days;
    int duration(){
        
        LocalDateTime from = LocalDateTime.of(E.thP, E.blnP, E.tglP,
                0, 0, 0);
        LocalDateTime to = LocalDateTime.of(E.thK, E.blnK, E.tglK,
                0, 0, 0);

        Duration duration = Duration.between(from, to);
        this.days=(int)(duration.toDays());
        if (days>0){
            return days;
        }
        else{
            days=0;
            return days;
        }
        
        
    
    
    }
    void tgl(){
        
        System.out.println("Tanggal Pinjam      :"+E.tglP+"-"+ E.blnP+"-"+E.thP );
        System.out.println("Tanggal kembali     :"+E.tglK+"-"+ E.blnK+"-"+E.thK);
    }
    
    
        
        
        
    
}
