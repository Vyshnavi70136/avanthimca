package anudip;

import java.util.Scanner;

//parent class//

public class Shape {
	
	float pi=3.14f;
	//method to draw shape//
	void draw()
	{
	System.out.println("Drawing a shape");
	}
	
	}

//child class//

public class Circle extends Shape {

		double radius;
		void circleinfo()
		{
		System.out.println("Enter radius:");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextDouble();
		}
		//method to calculate area of circle//
		void area()
		{
		System.out.println("Area of circle:"+(pi*radius*radius));
		}
		
		public static void main(String args[])
		{
		//creating object for child class//
		Circle c=new Circle();
		c.draw();
		c.circleinfo();
		c.area();
	
		}
}