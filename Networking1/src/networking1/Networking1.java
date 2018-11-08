/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking1;
import java.io.*;
import java.net.*;
/**
 *
 * @author Muhammad Taha Azam
 */
public class Networking1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try
    {
    Socket s=new Socket("192.168.1.107",6666);
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    dout.writeUTF("Hello Server");
    dout.flush();
    dout.close();
    
    
    }
    catch(Exception e){System.out.println(e);
    }
    
    }
    
}
