package de.MissingNameException;

/**
 * just a Test class
 * @author MissingNameException	
 *
 */
public class App {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			BubbleSort.add((int)(Math.random() * 999));
			int l = (int) (Math.random() * 100);
			String temp = "";
			for (int j = 0; j < l; j++) {
				temp += intToChar((int) (Math.random() * 999) + 1);
			}
//			System.out.println(temp);
			BubbleSort.add(temp);
		}
		System.out.println("---------------");
		System.out.println(BubbleSort.printIntList());
		BubbleSort.sortIntList();
		System.out.println(BubbleSort.printIntList());
		
		System.out.println("---------------");
		System.out.println(BubbleSort.printStrList());
		BubbleSort.sortStrList();
		System.out.println(BubbleSort.printStrList());
	}
	
	private static char intToChar(int x) {
		switch (x%26) {
		case 1:
			return 'a';
		case 2:
			return 'b';
		case 3:
			return 'c';
		case 4:
			return 'd';
		case 5:
			return 'e';
		case 6:
			return 'f';
		case 7:
			return 'g';
		case 8:
			return 'h';
		case 9:
			return 'i';
		case 10:
			return 'j';
		case 11:
			return 'k';
		case 12:
			return 'l';
		case 13:
			return 'm';
		case 14:
			return 'n';
		case 15:
			return 'o';			
		case 16:
			return 'p';
		case 17:
			return 'q';
		case 18:
			return 'r';
		case 19:
			return 's';
		case 20:
			return 't';
		case 21:
			return 'u';
		case 22:
			return 'v';
		case 23:
			return 'w';
		case 24:
			return 'x';
		case 25:
			return 'y';			
		case 26:
			return 'z';
		default:
			return '#';
		}
	}
	
}
