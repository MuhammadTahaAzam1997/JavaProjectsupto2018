/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projesct;
import java.util.*;



class Reservation{
String pname;
Long cnic;
int nom;  //num of member
int noi;  // num of item
public void get(){
    System.out.println("Enter passenger cnic: "+cnic);

        
}
}
        
public class Projesct {

    public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
Reservation obj1=new Reservation();
obj1.cnic=obj.nextLong();              
obj1.get();
  }
    
}
