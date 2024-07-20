package anudip;
import java.util.Stack;
//class declaration
public class DemoStack {
//main method
    public static void main(String[] args) {
		//initializing stack object
		Stack<String> stack=new Stack<String>();
		//inserting elements into stack
		stack.push("Delhi");
		stack.push("Mumbai");
		stack.push("Hyderabad");
		stack.push("pune");
		stack.push("Bengaluru");
		//printing stack elements
		System.out.println(stack);
		//returns the top most element from the stack
		System.out.println(stack.peek());
		//delete the top most element from the stack
	    System.out.println(stack.pop());
		System.out.println(stack.peek());
		// returns distance of top element
		System.out.println(stack.search("Hyderabad"));
		System.out.println(stack);
		//prints the boolean value 
		System.out.println(stack.empty());
		stack.push("Benguluru");
		System.out.println("cities based in literacy percentage are:");
		System.out.println(stack);
    }
}