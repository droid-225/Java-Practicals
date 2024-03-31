import java.util.Random;

public class Prac12 {
	public static void main(String args[]) {
		Random ran = new Random();
		String num = "";
		int y, x = 0;
		
		while(x != 3) {
			y = ran.nextInt(91);
			if(y >= 65 && y <= 90) {
				num += (char)y;
				x++;
			}
		}
		
		x = 0;
		
		while(x != 4) {
			num += Integer.toString(ran.nextInt(10));
			x++;
		}
		
		System.out.println("Plate Number: " + num);
		
	}
}
