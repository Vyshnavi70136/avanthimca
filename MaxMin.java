package anudip;

public class MaxMin {
	public static void main(String args[]) {
		//initialise the array of integers
		int[] numbers = {3,5,7,2,8};
		
		//initialise the min and max of array
		
		int max = numbers[0];
		int min = numbers[0];
		
		//iterate the array
		
		for(int i = 1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
			if (numbers[i]<min) {
				min = numbers[i];
				
			}
		}
		//print the results
		System.out.println("Maximum value in the array is:" + max);
		System.out.println("Minimum value in the array is:" + min);
	}

}
