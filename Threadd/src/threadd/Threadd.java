/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadd;
import java.util.Scanner;

class PrintNameThread implements Runnable{
    String name;

    public PrintNameThread(String name) {this.name=name;
    for(int i=10;i>0;i--){
        System.out.print(name+" ");
    }
    }
    @Override
    public void run(){
        
    }
        
    

        
}
class PrintNameThread2 extends Thread{
String name;

    public PrintNameThread2(String name) {this.name=name;
    for(int i=10;i>0;i--){
        System.out.print(name+" ");try{
        Thread.sleep(100);}
        catch(InterruptedException e){}
        }
    }
    
    @Override
    public void run(){
        
    }
        
}

class PrintNameThread3 extends Thread{
String name;

    public PrintNameThread3(String name) {this.name=name;
    for(int i=10;i>0;i--){
        System.out.print(name+" ");
    try{Thread.sleep(60);}catch(InterruptedException e){}
    }
    
    }
    @Override
    public void run(){
        
    }
            
}
public class Threadd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        PrintNameThread obj1=new PrintNameThread("A");
        Thread t1=new Thread(obj1);
        t1.start();  try{Thread.sleep(100);}catch(InterruptedException e){}
        
        PrintNameThread2 obj2=new PrintNameThread2("B");
        Thread t2=new Thread(obj2);
        t2.start();try{Thread.sleep(100);}catch(InterruptedException e){}
        
        PrintNameThread3 obj3=new PrintNameThread3("C");
        Thread t3=new Thread(obj2);
        obj3.start();try{Thread.sleep(100);}catch(InterruptedException e){}
        
    }   
}
