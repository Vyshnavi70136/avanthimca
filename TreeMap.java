package com.collections;
import java.util.TreeMap;
//Class Declaration
public class DemoTreeMap {
	//Main Method
	public static void main(String[] args) {
		//Initializing Objects for TreeMap
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		//Adding Students Roll number and Names
		tmap.put(1, "Vyshu");
		tmap.put(3, "Sampath");
		tmap.put(5, "Akhila");
		tmap.put(2, "Bablu");
		tmap.put(4, "Srinivas");
		tmap.put(6, "Swampna");
		//Accepting Null values 
		tmap.put(0, "null");
		//Accepting Negative Values
		tmap.put(-1, "Lahari");
		//Printing Tree Map values
		System.out.println(tmap);
		//Printing key values
		System.out.println(tmap.keySet());
		//Prints a Boolean Value
		System.out.println(tmap.isEmpty());	
		//Printing Size
		System.out.println(tmap.size());

	}
}