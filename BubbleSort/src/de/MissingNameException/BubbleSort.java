package de.MissingNameException;

import java.util.ArrayList;

public class BubbleSort {
	
	private static ArrayList<Integer> List = new ArrayList<Integer>();
	
	
	/**
	 * returns the ArrayList
	 * @return List
	 */
	public static ArrayList<Integer> getList() {return List;}
	
	/**
	 * returns the ArrayList in form of an String
	 * @return String containing all int's
	 */
	public static String printList() {
		String temp = "";
		for (int i = 0; i < List.size(); i++) {
			temp += List.get(i) + " ";
		}
		return temp;
	}
	
	/**
	 * Adds an Integer to the List
	 * @param y Number
	 */
	public static void add(Integer y) { List.add(y);}
	
	/**
	 * Adds an whole ArrayList to the List
	 * @param y ArrayList<Integer>
	 */
	public static void add(ArrayList<Integer> y) {
		for (int i = 0; i < y.size(); i++) {
			List.add(y.get(i));
		}
	}
	
	/**
	 * Adds an whole Array to the List
	 * @param y Integer[]
	 */
	public static void add(Integer[] y) {
		for (int i = 0; i < y.length; i++) {
			List.add(y[i]);
		}
	}
	
	/**
	 * Removes an Integer from the List
	 * @param y Number
	 */
	public static void remove(Integer y) {
		List.remove(y);
	}
	/**
	 * Sorts the List
	 * @return true - when the sorting went correctly
	 */
	public static boolean sort() {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(List.size() > 0) {
			while(!check()) {
				for (int i = 0; i < List.size(); i++) {
					if(i+1 < List.size()) {
						if(List.get(i) > List.get(i+1)) {
							int y = List.get(i+1);
							List.set(i+1, List.get(i));
							List.set(i, y);
						}
					}
				}
			}
		}
		return false;
	}
	
	private static boolean check() {
		for (int i = 0; i < List.size(); i++) {
			if(i+1 < List.size()) {
				if(List.get(i) > List.get(i+1)) {
					return false;
				}
			}
		}
		return true;
	}
}
