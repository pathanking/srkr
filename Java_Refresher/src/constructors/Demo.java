package constructors;

public class Demo {
	private Demo() {
	}

	void show() {
		System.out.println("show from Demo");
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.show();
	}
}
