package searching;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int arr[], int k) {
		int left = 0, right = arr.length - 1;

		while (left <= right) {
			// calculating mid
			int mid = left + (right - left) / 2;

			// check k is in mid or not
			if (arr[mid] == k) {
				return mid;
			}

			// if k is greater than mid, ignore first half
			if (arr[mid] < k) {
				left = mid + 1;
			} else {
				// ignoring right half
				right = mid - 1;
			}
		}

		return -1;
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

		// enter value to be search
		System.out.println("Enter the value of k: ");
		int k = sc.nextInt();
		sc.close();

		int result = binarySearch(arr, k);

		System.out.println("K found at: " + result + " index");
	}
}
