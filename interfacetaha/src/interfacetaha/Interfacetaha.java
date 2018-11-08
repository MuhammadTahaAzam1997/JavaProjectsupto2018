/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetaha;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Muhammad Taha Azam
 */
//
//interface A{
//
//    void add();
//    void subs();
//}
//class X implements A{
//
//    @Override
//    public void add(){
//        System.out.println("Addition performed");}
//    @Override
//    public void subs(){
//        System.out.println("Substraction performed");
//    }
//    public void mul(){
//        System.out.println("multiply performed");
//    }
//}
public class Interfacetaha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
//            A obj1=new X();
//            X obj2 =new X();
//            
//            obj1.add();
//            obj1.subs();
//            obj2.mul();
//            
           URL url = new URL("https://www.facebook.com/Programming.pk/");

// Get the input stream through URL Connection
URLConnection con = url.openConnection();
InputStream is =con.getInputStream();

// Once you have the Input Stream, it's just plain old Java IO stuff.

// For this case, since you are interested in getting plain-text web page
// I'll use a reader and output the text content to System.out.

// For binary content, it's better to directly read the bytes from stream and write
// to the target file.


BufferedReader br = new BufferedReader(new InputStreamReader(is));

String line = null;

// read each line and write to System.out
while ((line = br.readLine()) != null) {
System.out.println(line);
} 
    }
    
}
