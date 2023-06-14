package constructors;

public class A {

	int i;
	int j;

	public A() {
	}

	public A(int i) {
		this.i = i;
	}

	public A(int i, int j) {
		this(i);
		this.j = j;
	}

	public void show() {
		System.out.println("show from A");
		System.out.println("i : " + i);
		System.out.println("j : " + j);
	}

	public static void main(String[] args) {
		A a1 = new A(2, 7);
		a1.show();
	}
}
