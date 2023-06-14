package oop.inheritance;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		var con = System.console();
		System.out.println(con == null);
		
		int num = 0;
		if (con != null) {
			Scanner scanner = new Scanner(con.reader());
			System.out.println("Enter a number");
			num = scanner.nextInt();
		}
		System.out.println("Num : " + num);
	}
}
