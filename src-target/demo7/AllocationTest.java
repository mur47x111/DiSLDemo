package demo7;

public class AllocationTest {

	private static void foo1() {
		for (int i = 0; i < 1000; i++) {
			new Object();
			Thread.yield();
		}
	}

	private static void foo2() {
		for (int i = 0; i < 1000; i++) {
			new Object();
			Thread.yield();
		}
		foo1();
	}

	private static void foo3() {
		for (int i = 0; i < 1000; i++) {
			new Object();
			Thread.yield();
		}
		foo2();
	}

	private static void foo4() {
		for (int i = 0; i < 1000; i++) {
			new Object();
			Thread.yield();
		}
		foo3();
	}

	public static void main(String[] args) {
		new Thread(AllocationTest::foo1).start();
		new Thread(AllocationTest::foo2).start();
		new Thread(AllocationTest::foo3).start();
		new Thread(AllocationTest::foo4).start();
	}

}
