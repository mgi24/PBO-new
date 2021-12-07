
package sewaconsole;
import java.util.ArrayList;
import java.util.Scanner;

/*max*/
public class Db {
    Scanner input=new Scanner(System.in);
    //id,name,jenis punya INDEX SAMA
    ArrayList<String> id = new ArrayList<String>();
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> jenis = new ArrayList<String>();
    void databases() { 
    
    id.add("M001");
    id.add("M002");
    id.add("M003");
    
    name.add("Mr.X");
    name.add("Mr.Y");
    name.add("Mr.Z");
    
    jenis.add("Silver");
    jenis.add("Gold");
    jenis.add("Platinum");   
  } 
    
    
}
