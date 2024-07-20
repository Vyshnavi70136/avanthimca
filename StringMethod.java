package anudip;
public class StringMethods {
	public static void main(String[] args) {
		String name="Anudip";
		System.out.println("Name:"+name);
		String name1="Foundation";
		System.out.println("Name:"+name1);
	    //defining string using constructor
	    String course=new String("APJFSA Course");
	    System.out.println("Course:"+course);
	    //defining string using character 
		char[] courseType= {'a','w','s'};
		String course1=new String(courseType);
		System.out.println("Course Type:"+course1);
		//string concatenation
		System.out.println("Combine String:"+name.concat(name1));	
		//string length of name and name1
		System.out.println("Length of String:name="+name.length());
		System.out.println("name1=:"+name1.length());
		//some string methods
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareToIgnoreCase(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		//printing according to index
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('n'));
		System.out.println(name1.lastIndexOf('n'));
		System.out.println(name1.indexOf('n',2));
	}

}