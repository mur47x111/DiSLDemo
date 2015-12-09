package demo5;

public class Profiler {

	static {
		Runtime.getRuntime().addShutdownHook(new Thread(Profiler::dump));
	}

	public static void dump() {
		System.out.println("Total Allocation Number: " + counter);
	}

	private static int counter = 0;

	public static void fireEvent() {
		counter++;
	}

}
