class A {
	private int a;	
	protected int b;

	A() {
		a = b = 1;
		//System.out.println("A's default constructor");
	}
}

class B extends A {
	public int c;

	B() {
		c = 5;
		//System.out.println("B's default constructor");
	}
}

class C extends B {
	private int d;

	C() {
		d = 10;
		//System.out.println("C's default constructor");
	}

	void calculate() {
		System.out.println(b + c + d);
	}
}
public class SingleLevelInheritance {
	public static void main(String[] args) {
		/*C obj = new C();

	//	obj.a = 18; // Can't be accessed
		obj.c = 20;
		obj.calculate();*/

		float f = 0.0f;

		System.out.println(f);
	}
}