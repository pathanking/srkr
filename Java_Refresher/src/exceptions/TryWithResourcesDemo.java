package exceptions;

import java.util.Scanner;

public class TryWithResourcesDemo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {

			System.err.println("Enter a number");
			int num = sc.nextInt();

			System.out.println("Number is " + num);
		}
	}
}
//