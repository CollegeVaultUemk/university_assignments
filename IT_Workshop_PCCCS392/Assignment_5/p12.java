 interface Player {
 void play();
 }

class Child implements Player {
 public void play() {
 System.out.println("I am the play() method of child class");
 }
 }

 class Musician implements Player {
 public void play() {
 System.out.println("I am the play() method of Musician class");
 }
 }

 class Actor implements Player {
 public void play() {
 System.out.println("I am the play() method of Actor class");
 }
 }

 class p12 {
 public static void main(String args[]) {
 Child ch = new Child();
 Musician m = new Musician();
 Actor a = new Actor();
 ch.play();
 m.play();
 a.play();
 }
 }