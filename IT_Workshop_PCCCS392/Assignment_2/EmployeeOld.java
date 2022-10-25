public class EmployeeOld {
    String firstName;
    String lastName;
    int age;
    int id;
  
    public EmployeeOld(){
        firstName = "john";
        lastName = "doe";
        age = 42;
        id = 69;
    }
    
    public static void main(String args[]) {
        EmployeeOld myEmployee = new EmployeeOld();
        System.out.println("ID is" +myEmployee.id);
    }
  }