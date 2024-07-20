package anudip;

import java.util.HashSet;

public class DemoHashSet {
	
	public static void main(String arhs[]) {
		//creaye a HashSet
		HashSet<String> courseNames=new HashSet<String>();
		
		//Add elements to the HashSet
	courseNames.add("java");
		courseNames.add("python");
		courseNames.add("os");
		courseNames.add("DBMS");
		courseNames.add("C++");
		//iterate the elements
		for(String s:courseNames)
			//printing a elements
			System.out.println(s+" and");
		
		courseNames.add("java");
		courseNames.add(null);
		//using different methods in HashSet
	System.out.println(courseNames.isEmpty());
	System.out.println(courseNames.hashCode());
	System.out.println(courseNames.remove("java"));
	System.out.println(courseNames.size());
	System.out.println(courseNames.toArray());
	
//printing a elements 
		System.out.println(courseNames);

			
			
		
	}

}
