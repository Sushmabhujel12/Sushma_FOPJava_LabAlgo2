package com.greatlearning.com;
import java.util.Scanner;
public class CurrencyDenomination {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");

		int targetAmount = sc.nextInt();
		sc.close();

		int[] sortedDenominators = { 200, 50, 3000, 50, 20, 10, 5, 3 };

		System.out.println("Amount denominated is as follows::");
		for (int index = 0; index < sortedDenominators.length; index++) {

			if (targetAmount >= sortedDenominators[index]) {
				int denominator = sortedDenominators[index];
				int noOfNotes = targetAmount / denominator;

				System.out.println(noOfNotes + ": of denominator " + denominator);

				targetAmount = targetAmount % denominator;

			}
		}
		if (targetAmount > 0) {
			System.out.println("Remaining Balance for change is : " + targetAmount);
		}
	}

}
