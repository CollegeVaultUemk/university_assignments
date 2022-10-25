 class Animal {
 Animal() {
 System.out.println("Animal constructor is created");
 }
 }

 class Dog extends Animal {
 Dog() {
 super();
 System.out.println("Dog constructor is created");
 }
 }

 class p7 {
 public static void main(String args[]) {
 Dog d = new Dog();
 }
 }
