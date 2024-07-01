package com.collections;
import java.util.HashMap;
public class DemoHashMap {
	public static void main(String[] args) {
		//Initializing Objects for HashMap
		HashMap<String,Integer> countrycodes=new HashMap<String,Integer>();
		//Adding Elements
		countrycodes.put("US",1);
		countrycodes.put("India",91);
		countrycodes.put("Russia",7);
		countrycodes.put("China",86);
		countrycodes.put("Pakistan",92);
		countrycodes.put("Australia",61);
		//Printing country codes
	    System.out.println(countrycodes);
		//Printing size of the Map
		System.out.println(countrycodes.size());
		//Printing Key Values
		System.out.println(countrycodes.values());
		//Printing Boolean Values
		System.out.println(countrycodes.isEmpty());
		//Removing an element
		countrycodes.remove("Pakistan",92);
	    System.out.println(countrycodes);
	}
}