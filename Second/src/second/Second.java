/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

/**
 *
 * @author Muhammad Taha Azam
 */import java.util.Scanner;
public class Second {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        
        double a,b,c;
        
        System.out.println("enter your first number");
        a=obj.nextDouble();
        
        System.out.println("enter your first number");
        b=obj.nextDouble();
        
        c=a+b;
        
        System.out.println(c);
        
                    }
    
}
