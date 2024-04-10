// Does not work in IDE
// Use Command line:
// javac Prac30.java
// java Prac30 arg1 arg2
// Output: More than one argument used!

public class Prac30 {
	public static void main(String args[]) {
		try {
			if (args.length > 1) {
				throw new ArgumentGreaterThanOne("More than one argument used!");
			}
			else {
				System.out.println("Argument Provided: " + args[0]);
			}
		}
		catch (ArgumentGreaterThanOne e) {
			System.out.println(e.getMessage());
		}
	}
}

class ArgumentGreaterThanOne extends Exception {
	ArgumentGreaterThanOne(String message) {
		super(message);
	}
}