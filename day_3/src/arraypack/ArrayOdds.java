package arraypack;

public class ArrayOdds {

	public static void main(String[] args) {
		
		int nums[] = new int[20];
		
		// Fill and print array
		System.out.println("New array:");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * (50 - 1)) + 1;
			System.out.print(nums [i] + " ");
		}
		
		// Print odd numbers
		System.out.println("\nOdd numbers from array:");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				System.out.print(nums[i] + " ");
			}
		}
		
	}

}
