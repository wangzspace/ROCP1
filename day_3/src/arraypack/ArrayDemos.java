package arraypack;

import java.util.Arrays;

public class ArrayDemos {

	public static void main(String[] args) {
		
		int arr[] = new int [50];
		
		for (int i = 1; i <=50; i++) {
			arr[i-1] = i;
		}
		System.out.println("Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n\nPrime Selection:");
		for (int i = 0; i < arr.length; i++) {
			int div = 0;
			for (int j = 2; j < i; j++) {
				if (arr[i] % j == 0) {
					div++;
				}	
			}
			if (div > 0) {
				arr[i] = 0;
			}
		}
		for (int n = 0; n < arr.length; n++) {
			System.out.print(arr[n] + " ");
		}
		
		System.out.println("\n\nRemove 0s:");
		for (int i = 0; i < arr.length; i++) {
			int temp;
			if (arr[i] == 0) {
				temp = arr[arr.length - i];
				arr[i] = temp;
				arr[arr.length - i] = 0;
			}
		}
		int c = 0;
		int temparr[] = Arrays.copyOf(arr, arr.length);
		for (int i  = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temparr[c] = arr[i];
				c++;
			}
		}	
		arr = Arrays.copyOf(temparr, c);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n\nSorted:");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n\nSearching for numbers in the 30s:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 30 && arr[i] < 40) {
				System.out.println("Found " + arr[i] + " at position " + i);
			}
		}
	}
}
