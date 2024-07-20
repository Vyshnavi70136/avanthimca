package anudip;

public class Merging {
	public static void main(String args[]) {
		//initialising the arrays elements
		int arr1[]= {2,4,5,8};
		int arr2[]= {6,7,1,3};
		//initialsing the arrays
		int a=arr1.length;
		int b=arr2.length;
		int c=a+b;
		int arr3[]=new int[c];
		//iterate using the for loop
		for(int i=0;i<arr1.length;i++) {
			//declaring a array
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[a+i]=arr2[i];
		}
for(int i=0;i<c;i++) {
	//printing a result
	System.out.println(arr3[i]);
}
	}		
}	
		
		
		
		
		
		
		
				
