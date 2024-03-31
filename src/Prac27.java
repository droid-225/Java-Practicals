public class Prac27 {
	public static void main(String args[]) {
		A1 a1 = new A1();
		A2 a2 = new A2();
	
		a1.display();
		a2.display();
	}
}

abstract class A {
	abstract void display();
}

class A1 extends A {
	void display() {
		System.out.println("Hello From A1!");
	}
}

class A2 extends A {
	void display() {
		System.out.println("Hello From A2!");
	}
}