package recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void NaturalNumbers(int i, int n, int sum) {
		if (i == n) {
			sum = sum + i;
			System.out.println("Sum = " + sum);
			return;
		}

		sum = sum + i;

		NaturalNumbers(i + 1, n, sum);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int i = 0; // beginning

		System.out.println("Enter the limit: ");
		int n = sc.nextInt();
		sc.close();

		int sum = 0;
		
		NaturalNumbers(i, n, sum); //calling methods

	}

}
