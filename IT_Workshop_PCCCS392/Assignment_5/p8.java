 class Animal {
 String name;

 Animal(String name) {
 this.name = name;
 System.out.println(name);
 }
 }

 class Dog extends Animal {
 Dog(String name) {
 super(name);
 }
 }

 class p8 {
 public static void main(String args[]) {
 Dog d = new Dog("Dogo");
 }
 }