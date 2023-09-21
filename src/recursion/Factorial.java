package recursion;

import java.util.Scanner;

public class Factorial {

	public static int calculateFactorial(int n) {

		if (n == 1 || n == 0) {
			return 1;
		}

		// recursive call
		int fact_n = n * calculateFactorial(n - 1);

		return fact_n;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();

		int result = calculateFactorial(n);

		System.out.println("Factorial of " + n + " : " + result);
	}

}
