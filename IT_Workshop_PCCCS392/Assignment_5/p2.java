// Java program to demonstrate working of
// interface

import java.io.*;

// A simple interface
interface In1 {
	
	// public, static and final
	final int a = 31;

	// public and abstract
	void display();
}

// A class that implements the interface.
class p2 implements In1 {
	
	// Implementing the capabilities of
	// interface.
	public void display(){
	System.out.println("Pratyaksh");
	}

	// Driver Code
	public static void main(String[] args)
	{
		p2 t = new p2();
		t.display();
		System.out.println(a);
	}
}
