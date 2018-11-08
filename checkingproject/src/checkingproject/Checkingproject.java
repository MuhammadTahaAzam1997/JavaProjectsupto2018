/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkingproject;
import java.util.Scanner;
/**
 *
 * @author Muhammad Taha Azam
 */
public class Checkingproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
//        
//        String abc[]={"taha","azam"};
//        for (String x:abc){
//            System.out.println(x);
//                }    
//        int a=abc[0].length();
//        System.out.println(a);

String abc[]=new String[1];
    for(String x: abc){
        System.out.println("Enter your word");
        x=obj.nextLine();
        int a=x.length();
        System.out.println("length of the string is: "+a);
        System.out.println("Which character are you finding from  the string?");
        char ch = obj.next().charAt(0);
        int position=x.indexOf(ch)+1;
        System.out.println("The character "+ch+" is found the word"+x+" at position: "+position);
    }
    }
    
}












//
//String cid[]=new String[150];
//        String cname[]=new String[150];
//        double amount[]=new double[150];
//        int i=0;
//        for(i=0;i<cid.length;i++){
//        cid[i]=obj.nextLine();
//        }
//        
//        System.out.println("CLIENT ID \t\t\t\t\t\t\t\t Client Name \t\t\t\t\t\t\t\t Amount");
//        System.out.println(cid[i]+" \t\t\t\t\t\t\t\t  "+cname);
//        