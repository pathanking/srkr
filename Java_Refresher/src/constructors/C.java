package constructors;

public class C {

	int x;

	public C(int x) {
		this.x = x;
	}

	public C() {}

	void print() {
		System.out.println("x : " + x);
	}
}

class D extends C {
	D() {
		super(100);
	}
}

class TestConstructors2 {
	public static void main(String[] args) {
		D dObject = new D();
		dObject.print();
	}
}
