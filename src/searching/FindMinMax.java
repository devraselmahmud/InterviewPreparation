package searching;

import java.util.Scanner;

public class FindMinMax {

	public static void max(int arr[]) {
		// Find Maximum
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum Element: " + max);
	}

	public static void min(int arr[]) {
		// Find Minimum
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Element: " + min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size: ");

		int n = sc.nextInt();

		System.out.println("Enter Array Value: ");
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		//closing scanner
		sc.close();

		// calling min
		min(arr);

		// calling max
		max(arr);

	}

}
