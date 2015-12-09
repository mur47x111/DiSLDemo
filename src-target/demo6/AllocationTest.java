package demo6;

public class AllocationTest {

	private static void foo() {
		for (int i = 0; i < 2000; i++) {
			new Object();
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			new Thread(AllocationTest::foo).start();
		}
	}

}
