
package projectoverloading;


public class MyClass {
    void myMethod(){
        System.out.println("Hello!");
        
    }
    void myMethod(int x){
        System.out.println("Holla!");
    }
    void myMethod (int x,int y){
        System.out.println("Hollo!");
    }
    void myMethod (double x){
        System.out.println("Hilli!");
    }
    void myMethod (int x, double y){
        System.out.println("Hullo");
    }
    String myMethod(float x){
        return "Hello";
    }
    void myMethod(float a,int b){
        System.out.println("Holli!");
    }
    
    
}
