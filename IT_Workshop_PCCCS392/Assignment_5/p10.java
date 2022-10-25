 class Bike {
 final void run() {
 System.out.println("final method");
 }
 }
 class Honda extends Bike {
 void run() {
 System.out.println("Not a final method");
 }
 public static void main(String args[]) {
 Honda h = new Honda();
 h.run();
 }
 }