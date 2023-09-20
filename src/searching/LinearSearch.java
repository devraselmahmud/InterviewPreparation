package searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the value of array: ");
		
		for(int i=0; i<n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the value of k: ");
		
		int k = sc.nextInt();
		sc.close();
		
		int result = search(arr, n, k);
		if(result == -1) 
		{
			System.out.println("Value is not present in the array");
		}
		else
		{
			System.out.println("value is in "+ result +" index.");
		}
	}
	
	public static int search(int arr[],int n,int k) 
	{
		for(int i=0; i<n; i++) 
		{
			if(arr[i] == k) 
				return i;
		}
		return -1;
	}

}
