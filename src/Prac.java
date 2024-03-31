public class Prac {
	public static void main(String args[]) {
		int[] arr = {23, 5, 32, 5, 36, 3, 6, 2, 53};
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		for(int i: arr) {
			if(i > max)
				max = i;
			if(i < min)
				min = i;
		}
		
		System.out.println("Largest Number in Array: " + max);
		System.out.println("Smallest Number in Array: " + min);
	}
}

class Rectangle {
	double width, height;
	
	Rectangle() {
		width = 4.5;
		height = 6.5;
	}
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height * Math.PI * Math.pow(2, 2);
	}
	
	double getPerimeter() {
		return (2 * width) + (2 * height);
	} 
}
