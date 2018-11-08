/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;
import java.util.*;
/**
 *
 * @author Muhammad Taha Azam
 */

 class Samia {
    int rollno=43;
    String name="Samia Shakeel";
    int age=19;
    String section="A";
    public void gett(){
    System.out.println("Name of Student "+name);
    System.out.println("RollNo of Student "+rollno);
    System.out.println("Age of Student"+age);
    System.out.println("Section Of Student"+section);
}}
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
Samia s1=new Samia();

ArrayList list=new ArrayList();
   list.add(0);
   list.add("sir syed university");
   list.add("Taha");
   System.out.println("I am the student of "+list.get(0)+"rd semester of "+list.get(1)+"  "+list.get(2));
    }}