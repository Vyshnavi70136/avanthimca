package anudip;

public class Sorting {
	//main method
	public static void main(String args[]) {
		//initilaising the array elelments
		int arr[]= {45,12,85,32,89,39,69,44,42,16,8};
		//initialising a int values
		int i=0;
		int j=0;
		//iterate the array
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			
			}
			for(i=0;i<arr.length;i++) 
				//print a values
				System.out.println(arr[i]+"");
			}
		}
		
	}
		
	}



