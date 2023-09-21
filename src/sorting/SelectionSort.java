package sorting;

import java.util.Scanner;

public class SelectionSort {

	// time complexity o(n^2)

	public static void printArray(int arr[]) {
		System.out.println("Sorted Array: ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void sortArray(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}

			// swapping values
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter The Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		// calling methods
		sortArray(arr);
		printArray(arr);

	}
}
