import java.util.Scanner;
public class TernaryOperatorDemo{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Number");
		int m = scanner.nextInt();

	System.out.println("Enter Second Number");
		int n = scanner.nextInt();

	String message = m > n ? m + " is bigger" : n + " is bigger";

	System.out.println(message);
	}
}