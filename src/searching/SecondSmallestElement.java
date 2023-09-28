package searching;

import java.util.Scanner;

public class SecondSmallestElement {

	public static void secondSmallest(int arr[]) {

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < smallest) {
				
				secondSmallest = smallest;
				smallest = arr[i];
			}

			else if (arr[i] < secondSmallest && arr[i] != smallest) {
				
				secondSmallest = arr[i];
			}
		}

		if (secondSmallest == Integer.MAX_VALUE) {

			System.out.println("There is no second smallest element");
			
		} else {

			System.out.println("Second Smallest Element is: " + secondSmallest);
		}

	}

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size: ");

		int n = sc.nextInt();

		System.out.println("Enter Array Value: ");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// closing scanner
		sc.close();

		// calling method
		secondSmallest(arr);

	}

}
