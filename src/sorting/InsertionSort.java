package sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the value of array: ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// closing scanner
		sc.close();

		// Sorting
		int temp, j;
		
		for (int i = 1; i < arr.length; i++) {
			// for comparing
			temp = arr[i];
			// j for reducing complexity of i
			j = i;

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}

		//printing values
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
