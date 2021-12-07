/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewaconsole;


public class Encapsulate {
    //injected value
    int injtglP;
    int injblnP;
    int injthP;
    int injtglK;
    int injblnK;
    int injthK;
    //finished value
    int tglP;
    int blnP;
    int thP;
    int tglK;
    int blnK;
    int thK;
    String who;
     
    
    public void initiate(){
        
        Input i = new Input();
        i.input();
        this.injtglP=i.getTglP();
        this.thP=i.getThP();
        this.injblnP=i.getBlnP();
        this.injtglK=i.getTglK();
        this.injblnK=i.getBlnK();
        this.injthK=i.getThK();
        this.who=i.who;
        
        
        
        
    }
    public void setTglP(){
              
                //debug System.out.println("TGL P"+injtglP+"BULAN P"+injblnP+"TAHUN P"+injthP);
        if ((blnP==1)||(blnP==3)||(blnP==5)||(blnP==7)||(blnP==8)||(blnP==10)||(blnP==12)){
            if ((injtglP<32)&&(injtglP>0)){
                this.tglP=injtglP;
            }
            else if (injtglP<0){
                this.tglP=1;
            }
            else if (injtglP>31){
                this.tglP=31;
            }
            
        }
        if ((blnP==4)||(blnP==6)||(blnP==9)||(blnP==11)){
            if ((injtglP<31)&&(injtglP>0)){
                this.tglP=injtglP;
            }
            else if (injtglP<0){
                this.tglP=1;
            }
            else if (injtglP>30){
                this.tglP=30;
            }
            
        }
        if (blnP==2){
            if ((injtglP<30)&&(injtglP>0)&&(injthP%4==0)){
                this.tglP=injtglP;
            }
            else if ((injtglP<29)&&(injtglP>0)&&(injthP%4>0)){
                this.tglP=injtglP;
            }
            else if ((injtglP>29)&&(injthP%4==0)){
                this.tglP=29;
            
            }
            else if ((injtglP>28)&&(injthP%4>0)){
                this.tglP=28;
            
            }
            else if (injtglP<0){
                this.tglP=1;
            }
            
        }
        
    }
    public void setTglK(){
        
        
        if ((blnK==1)||(blnK==3)||(blnK==5)||(blnK==7)||(blnK==8)||(blnK==10)||(blnK==12)){
            if ((injtglK<32)&&(injtglK>0)){
                this.tglK=injtglK;
            }
            else if (injtglK<0){
                this.tglK=1;
            }
            else if (injtglK>31){
                this.tglK=31;
            }
            
        }
        if ((blnK==4)||(blnK==6)||(blnK==9)||(blnK==11)){
            if ((injtglK<31)&&(injtglK>0)){
                this.tglK=injtglK;
            }
            else if (injtglK<0){
                this.tglK=1;
            }
            else if (injtglK>30){
                this.tglK=30;
            }
            
        }
        if (blnK==2){
            
            if ((injtglK<30)&&(injtglK>0)&&(injthK%4==0)){
                this.tglK=injtglK;
            }
            else if ((injtglK<29)&&(injtglK>0)&&(injthK%4>0)){
                this.tglK=injtglK;
            }
            else if ((injtglK>29)&&(injthK%4==0)){
                this.tglK=29;
            
            }
            else if ((injtglK>28)&&(injthK%4>0)){
                this.tglK=28;
            
            }
            else if (injtglK<0){
                this.tglK=1;
            }
            
        }
    }
    public void setBlnP(){
        if (injblnP>0&&injblnP<13){
            this.blnP=injblnP;
        }
        else if (injblnP>12){
            blnP=12;
        }
        else if (injblnP<0){
            blnP=1;
        }
    }
    public void setBlnK(){
        
        if (injblnK>0&&injblnK<13){
            this.blnK=injblnK;
        }
        else if (injblnK>12){
            blnK=12;
        }
        
        else if (injblnK<0){
            blnK=1;
        }
    }
    public void setThK(){
        //System.out.println("TGL P"+injtglP+"TH P"+thP+"TAHUN K"+injthK);
        if (injthK>thP){
            this.thK=injthK;
        }
        if (injthK<thP){
            this.thK=thP;
        }
    }
    
}
