
package projectrerata;
import java.util.Arrays;
import java.util.Scanner;
//max
public class ArrayProssesing {
    Scanner input=new Scanner(System.in);
    int [] databil=new int [100];
    
    //inject ? data
    int many;
    
    void input(){
        System.out.println("Masukkan jumlah data (n): ");
        this.many=input.nextInt();
        for (int i=0; i<many;i++){
            System.out.println("Masukkan bilangan ke-"+(i+1)+" : ");
            this.databil[i]=input.nextInt();
        }
    }
    double hitungrerata(int[] data){
        int total=0;
        for (int i=0;i<this.many;i++){
            total+=data[i];
        }
        double result=total/this.many;
        return result;
    }
    void output(){
        System.out.println("Rata Rata bilangan adalah :"+this.hitungrerata(this.databil));
        System.out.println("Bilangan terbesar adalah :"+this.cariMax(this.databil));
        System.out.println("Bilangan terkecil adalah :"+this.cariMin(this.databil));
        urutkan(this.databil);
    }
    int cariMax(int[] data){
        int bilBig=0;
        int newData;
        for (int i=0;i<this.many;i++){
            newData=data[i];
            if (newData>bilBig){
                bilBig=newData;
            }
            else if (newData<bilBig){
            }
            
        }
        
        return bilBig;
        
    }
    int cariMin(int[] data){
        int bilSmall=999999999;
        int newData;
        for (int i=0;i<this.many;i++){
            newData=data[i];
            if (newData<bilSmall){
                bilSmall=newData;
            }
            else if (newData>bilSmall){
            }
            
        }
        
        return bilSmall;
        
    }
    void urutkan(int[] data){
        
        
        
        int switchcount=0;
        int bilSmall=0;
        int newData;
        int repeat=many;
        while (true){
            
            for (int i=0;i<(this.many-1);){
                if (data[i]>data[i+1]){
                    
                    newData=data[i];
                    data[i]=data[i+1];
                    data[i+1]=newData;
                    switchcount++;
                    
                }
            i++;
                                 
            }
            repeat--;
            
            if (repeat==0){
                break;
            }  
        }  
        System.out.println(Arrays.toString(data));
    }  
}
