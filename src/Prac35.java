public class Prac35 {
	public static void main(String args[]) {
		new classA().start();
		new classB().start();
	}
}

class classA extends Thread {
	public void run() {
		while(true) {
		System.out.println("Hello");
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class classB extends Thread{
	public void run() {
		while(true) {
		System.out.println("World");
			try {
				sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}