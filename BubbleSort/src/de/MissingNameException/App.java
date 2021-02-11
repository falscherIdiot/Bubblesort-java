package de.MissingNameException;

public class App {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			BubbleSort.add((int)(Math.random() * 999));
		}
		System.out.println(BubbleSort.printList());
		BubbleSort.sort();
		System.out.println(BubbleSort.printList());
	}
	
}
