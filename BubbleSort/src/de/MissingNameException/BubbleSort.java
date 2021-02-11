package de.MissingNameException;

import java.util.ArrayList;
/**
 * BubbleSort
 * @author MissingNameException
 *
 */
public class BubbleSort {
	
	private static ArrayList<Integer> intList = new ArrayList<Integer>();
	
	private static ArrayList<String> strList = new ArrayList<String>();
	
	/**
	 * returns the String-ArrayList
	 * @return intList
	 */
	public static ArrayList<String> getStrList() {return strList;}
	
	/**
	 * returns the Integer-ArrayList
	 * @return intList
	 */
	public static ArrayList<Integer> getintList() {return intList;}
	
	/**
	 * returns the String-ArrayList in form of an String
	 * @return String containing all int's
	 */
	public static String printStrList() {
		String temp = "";
		for (int i = 0; i < strList.size(); i++) {
			temp += strList.get(i) + "(" + strList.get(i).length()+ ") ";
		}
		return temp;
	}
	
	/**
	 * returns the Integer-ArrayList in form of an String
	 * @return String containing all int's
	 */
	public static String printIntList() {
		String temp = "";
		for (int i = 0; i < intList.size(); i++) {
			temp += intList.get(i) + " ";
		}
		return temp;
	}
	
	/**
	 * Adds an String to the List
	 * @param y String
	 */
	public static void add(String y) { strList.add(y);}
	
	/**
	 * Adds an Integer to the List
	 * @param y Number
	 */
	public static void add(Integer y) { intList.add(y);}
	/**
	 * Adds an whole ArrayList to the List
	 * @param y ArrayintList of type String
	 */
	public static void addStr(ArrayList<String> y) {
		for (int i = 0; i < y.size(); i++) {
			strList.add(y.get(i));
		}
	}
	
	/**
	 * Adds an whole ArrayList to the List
	 * @param y ArrayintList of type Integer
	 */
	public static void addInt(ArrayList<Integer> y) {
		for (int i = 0; i < y.size(); i++) {
			intList.add(y.get(i));
		}
	}
	
	/**
	 * Adds an whole Array to the List
	 * @param y String[]
	 */
	public static void add(String[] y) {
		for (int i = 0; i < y.length; i++) {
			strList.add(y[i]);
		}
	}
	
	/**
	 * Adds an whole Array to the List
	 * @param y Integer[]
	 */
	public static void add(Integer[] y) {
		for (int i = 0; i < y.length; i++) {
			intList.add(y[i]);
		}
	}
	
	/**
	 * Removes an String from the List
	 * @param y String
	 */
	public static void remove(String y) {
		strList.remove(y);
	}
	
	/**
	 * Removes an Integer from the List
	 * @param y Number
	 */
	public static void remove(Integer y) {
		intList.remove(y);
	}
	
	/**
	 * Sorts the String-List
	 * @return true - when the sorting went correctly
	 */
	public static boolean sortStrList() {
		if(strList.size() > 0) {
			int steps = 0;
			while(!checkStr()) {
				for (int i = 0; i < strList.size(); i++) {
					if(i+1 < strList.size()) {
						if(strList.get(i).length() > strList.get(i+1).length()) {
							String y = strList.get(i+1);
							strList.set(i+1, strList.get(i));
							strList.set(i, y);
							System.out.println(steps + 1 + " > " + BubbleSort.printStrList());
							steps++;
						}
					}
				}
			}
			System.out.println("Steps :: " + steps);
		}
		return false;
	}
	
	/**
	 * Sorts the Integer-List
	 * @return true - when the sorting went correctly
	 */
	public static boolean sortIntList() {
		if(intList.size() > 0) {
			int steps = 0;
			while(!checkInt()) {
				for (int i = 0; i < intList.size(); i++) {
					if(i+1 < intList.size()) {
						if(intList.get(i) > intList.get(i+1)) {
							int y = intList.get(i+1);
							intList.set(i+1, intList.get(i));
							intList.set(i, y);
							System.out.println(steps + 1 + " > " + BubbleSort.printIntList());
							steps++;
						}
					}
				}
			}
			System.out.println("Steps :: " + steps);
		}
		return false;
	}
	
	private static boolean checkInt() {
		for (int i = 0; i < intList.size(); i++) {
			if(i+1 < intList.size()) {
				if(intList.get(i) > intList.get(i+1)) {
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean checkStr() {
		for (int i = 0; i < strList.size(); i++) {
			if(i+1 < strList.size()) {
				if(strList.get(i).length() > strList.get(i+1).length()) {
					return false;
				}
			}
		}
		return true;
	}
}
