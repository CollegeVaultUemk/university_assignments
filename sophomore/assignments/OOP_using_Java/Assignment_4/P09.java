class Base { 
    public static void display() { 
        System.out.println("Base class display() method"); 
    } 
} 
     
class Derived extends Base { 
    public static void display() { 
        System.out.println("Derived class display() method"); 
    } 
} 
     
public class P9 { 
    public static void main(String[] args) { 
        Base b = new Derived(); 
        b.display(); 
    } 
} 