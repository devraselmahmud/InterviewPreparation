package searching;

import java.util.Scanner;

public class SecondLargestElement {
	
	public static void secondLargest(int arr[]) {
		
		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		System.out.println("Second Largest Element is: " + arr[1]);
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

		secondLargest(arr);

	}

}
