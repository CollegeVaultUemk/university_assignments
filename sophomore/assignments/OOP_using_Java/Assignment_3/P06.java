class B{  
    p6 obj;  
    B(p6 obj){  
      this.obj=obj;  
    }  
    void display(){  
      System.out.println(obj.data);//using data member of A4 class  
    }  
  }  
    
  class p6{  
    int data=10;  
    p6(){  
     B b=new B(this);  
     b.display();  
    }  
    public static void main(String args[]){  
     p6 a=new p6();  
    }  
  }  