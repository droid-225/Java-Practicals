// Stack using array

public class Prac20 {
	public static void main(String args[]) {
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.pop();
		stack.push(3);
		
		System.out.println("Stack:");
		stack.display();
		
	}
}

class Stack {
	int[] stack = new int[100];
	int top = 0;
	
	void push(int x) {
		if(top >= 100)
			System.out.println("Stack Overflow!");
		else {
			stack[top] = x;
			top++;
		}
	}
	
	void pop() {
		if(top < 0)
			System.out.println("Stack Underflow!");
		else {
			stack[top] = 0;
			top--;
		}
	}
	
	void display() {
		for(int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
