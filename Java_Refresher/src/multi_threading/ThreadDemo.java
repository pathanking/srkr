package multi_threading;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for (int i = 1; i < 10; i++)
				System.out.println(Thread.currentThread().getName() + " : " + i);
		};

		Runnable task2 = () -> {
			for (int k = 90; k < 100; k++)
				System.out.println(Thread.currentThread().getName() + " : " + k);
		};

		Thread thread1 = new Thread(task1);
		thread1.setName("YOU-THREAD");
		Thread thread2 = new Thread(task2);
		thread2.setName("ME-THREAD");

		thread1.start();
		thread1.join();
		thread2.start();

	}
}
