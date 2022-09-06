import java.util.*;

public class BubbleSort {
	
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Number of elements to be entered: ");
		int n = s.nextInt();
		
		int [] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element "+(i+1)+" :");
			arr[i] = s.nextInt();
		}
		
		System.out.println("Array before bubble sort :-");
		
		for (int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		bubbleSort(arr);
		
		System.out.println("Array after bubble sort :-");
		
		for (int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
}
