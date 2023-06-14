package exceptions;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number");
		int n1 = scanner.nextInt();

		System.out.println("Enter second number");
		int n2 = scanner.nextInt();
		try {
			System.out.printf("%d / %d = %d \n", n1, n2, (n1 / n2));
		} catch (ArithmeticException exception) {
			System.out.println(exception.getMessage());
		}

		System.out.println("to be continued......");
		
		scanner.close();
	}
}
