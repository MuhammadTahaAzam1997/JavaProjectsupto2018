/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahaa;
import java.util.Scanner;
/**
 *
 * @author Muhammad Taha Azam
 */
public class Calculator {
    public static void main(String ar[]){
        Scanner obj=new Scanner(System.in);
        
        double a,b,c,d,e,f,g,h;
        
        System.out.println("welcome to the calculator of Muhammad Taha Azam");
        System.out.println("For addition");
        System.out.println("Insert the first number for addition");
        a=obj.nextDouble();
        System.out.println("Insert the next number for addition");
        b=obj.nextDouble();
        
        
        c=a+b;
        System.out.println("the answer of addition calculatrion is:"+c );
        
        
        System.out.println("for substraction");
        System.out.println("enter first number");
        d=obj.nextDouble();
        System.out.println("enter second number");
        e=obj.nextDouble();
        
        f=d-e;
        System.out.println("the answer of the substarction is"+f);
        
        System.out.println("for multiplication");
        System.out.println("enter first number for mutiplication");
        g=obj.nextDouble();
        System.out.println("enter second number for multiplication");
        h=obj.nextDouble();
        
        double i= g*h;
        System.out.println("the product is"+i);
        
        double j,k,l;
        System.out.println("enter first number for division");
        j=obj.nextDouble();
        System.out.println("enter second number for division");
        k=obj.nextDouble();
        l=k/j;
       System.out.println(l);
                
        }
    }
    

