package anudip;

//using a enum department
enum Department {
	Accounts,
	Devops,
	Testing,
	HR,
}

public class DemoEnum {
	public static void main(String args[]) {
		Department d=Department.Testing;
		Department d1=Department.Accounts;
		//printing a value
		System.out.println(d);
		d.compareTo(d1);
		//printing a values by using different methods
		System.out.println(d.compareTo(d1));
		System.out.println(d.equals(d1));
		
	}

}
