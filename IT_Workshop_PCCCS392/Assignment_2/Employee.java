class Employee {
    String firstName;
    String lastName;
    int age;
    
    //constructor
    public Employee(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public static void main(String args[]) {
        Employee myEmployee = new Employee("John", "Doe", 42);
      System.out.println(myEmployee.age);
    }
  
  }