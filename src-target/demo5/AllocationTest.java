package demo5;

public class AllocationTest {

	private static void foo() {
		for (int i = 0; i < 2000; i++) {
			new Object();
		}
	}

	public static void main(String[] args) {
		foo();
	}

}
