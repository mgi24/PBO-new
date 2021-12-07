
package sewaconsole;
import java.time.LocalDateTime;
import java.time.Duration;

public class Prosessor extends Input{
    int days;
    int duration(){
        LocalDateTime from = LocalDateTime.of(thP, blnP, tglP,
                0, 0, 0);
        LocalDateTime to = LocalDateTime.of(thK, blnK, tglK,
                0, 0, 0);

        Duration duration = Duration.between(from, to);
        this.days=(int)(duration.toDays());
        return days;
        
    
    
    }
    void tgl(){
        System.out.println("Tanggal Pinjam      :"+tglP+"-"+ blnP+"-"+thP );
        System.out.println("Tanggal kembali     :"+tglK+"-"+ blnK+"-"+thK);
    }
    
    
        
        
        
    
}
