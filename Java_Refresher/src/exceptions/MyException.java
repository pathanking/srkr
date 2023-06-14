package exceptions;

import java.util.Scanner;

public class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}
}

class ExceptionDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number >>");
		int num = sc.nextInt();

		try {
			process(num);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally always run!");
		}
		System.out.println("code continues...");
	}

	public static void process(int number) throws MyException {
		if (number % 2 == 0)
			System.out.printf("%d is an even number \n", number);
		else
			throw new MyException(number + " is not even!");
	}
}
