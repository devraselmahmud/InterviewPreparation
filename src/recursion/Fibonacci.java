package recursion;

import java.util.Scanner;

public class Fibonacci {
	
	public static void printFibonacci(int a, int b, int n) {
		
		//base case
		if(n==0) {
			return;
		}
		
		int c = a + b;
		System.out.println(c);
		
		//recursion call
		printFibonacci(b, c, n-1);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		//closing scanner
		sc.close();
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		printFibonacci(a, b, n-2);
	}

}
