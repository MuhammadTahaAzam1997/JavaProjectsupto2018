/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication82;
import java.util.*;
/**
 *
 * @author Muhammad Taha Azam
 */
public class JavaApplication82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner obj=new Scanner(System.in);  
//        
//        Integer x = 5;
//      
//      System.out.println(x.compareTo(6));
//      System.out.println(x.compareTo(5));
//      System.out.println(x.compareTo(8)); 
//    
//        System.out.println(x.equals(8));
//        System.out.println(x.equals(9));
//        System.out.println(x.equals(1));
//        
//        System.out.println(Math.ceil(5.2));
//        System.out.println(Math.floor(5.4));
//        System.out.println(Math.rint(5.2));
//        
//        System.out.println(Math.random()*5);
//        
        
    int day[]=new int [29];
int x=0;    
        System.out.println("Enter the daily expenses");
       for  (x=0;x<29-1;x++){            
          
           System.out.print("Day"+(x+1)+"\t");
           day[x]=obj.nextInt();
           
           
         }
            System.out.println("Expenses of Total Days"+"\t"+day[0]+day[1]+day[2]+day[3]+day[4]);
            
            }
    
}
