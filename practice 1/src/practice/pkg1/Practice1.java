/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg1;

/**
 *
 * @author Muhammad Taha Azam
 */ 
    class EmpRec{
    int a,s,b; String d;
    
    
    int id;
String name;
    }
   class Design extends EmpRec{  
    Design(){
    }
    Design(int sal, int bonus, String des,int age, int id, String name ){
    s=sal;
    b=bonus;
    d=des;
    a=age;
    this.id=id;
    this.name=name;
    
    
       
    }
    Design(int sal, int bonus, String des,int id,String name, int age ){
    s=sal;
    b=bonus;
    d=des;
    a=age;
    this.name=name;
    this.id=id;
 
        
    }
    Design(int sal, String des,int id,String name, int age ){
    s=sal;
    d=des;
    a=age;
    this.name=name;
    this.id=id;
    
        
    }
    Design(int sal,int id, String des, String name, int age ){
    s=sal;
    a=age;
    d=des;
    this.name=name;
    this.id=id;
    }
        public void display()
        {
               System.out.println("Name: "+name);
        System.out.println("Id Number: "+id);
        System.out.println("age: "+a);
        System.out.println("Designation: "+d);
        System.out.println("Salary: "+s);
        System.out.println("Bonus: "+b);
            System.out.println();
        }
        
        void disp(){
            System.out.println("Name: "+name);
        System.out.println("Id Number: "+id);
        System.out.println("age: "+a);
        System.out.println("Designation: "+d);
        System.out.println("Salary: "+s);
        System.out.println();
        }
        
    
    }
    
    
        // TODO code application logic here
  

public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        System.out.println("Here is the employeer record");
    Design obj1=new Design(500000, 10000, "Manager", 25, 101, "Muhammad Taha Azam");
    obj1.display();
    Design obj2=new Design(50000, 10000, "Assistant Manager", 102, "Maaz Iqbal", 25);
     obj2.display();
    Design obj3=new Design(5000, "Supervisior", 103, "Muzafar Iqbal", 100);
     obj3.disp();
    Design obj4=new Design(2000, 104, "Security Guard", "George Brut", 200);
    obj4.disp();
   
    
    }
    
}
    
