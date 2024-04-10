import java.util.LinkedList;

public class Prac33 {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("Initial Linked List: " + list);
		list.remove(2);
		System.out.println("Initial Linked List After Removing Element at Index 2: " + list);
	}
}