class p5{  
    void m(p5 obj){  
    System.out.println("Method is invoked.");  
    }  
    void p(){  
    m(this);  
    }  
    public static void main(String args[]){  
    p5 s1 = new p5();  
    s1.p();  
    }  
  }  