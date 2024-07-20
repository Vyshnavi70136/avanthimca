package anudip;

public class BubbleSort {
    public static void main(String[] args) {
//initialsing the array elements
        int[] arr = {3, 2, 8, 7, 6};
       //declaring bubbleSort 
        bubbleSort(arr);
        //printing a Sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
//initialsing the array length
        int n = arr.length;
//iterat using for loop
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}