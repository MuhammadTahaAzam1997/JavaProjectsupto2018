/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication91;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaApplication91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Date obj=new Date();
        System.out.println(obj.toString());
SimpleDateFormat obj1=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz ");
        System.out.println("Todays is :"+ (obj1.format(obj)));

    }
    
}
