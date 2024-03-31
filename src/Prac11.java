import java.util.Random;

public class Prac11 {
	public static void main(String args[]) {
		Random ran = new Random();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(ran.nextInt(49) + " ");
		}
	}
}
