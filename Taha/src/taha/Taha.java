class Taha{
    int a,b,c;
    
        void add(int x, int y){
        a=x;
        b=y;
    }
           void calc(){
        c=a+b;
        System.out.println(c);
    }
           
    }
    

class Azam{
    public static void main(String args[]){
        Taha obj=new Taha();
        obj.add(56,6);
        obj.calc();
        
    }
}