package exceptions;

public class ExceptionDemo4 {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i < 20; i++) {
			Thread.sleep(6000);
			System.out.println(i);
		}
	}
}
