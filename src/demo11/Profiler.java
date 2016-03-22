package demo11;

public class Profiler {

	static {
		Runtime.getRuntime().addShutdownHook(new Thread(Profiler::dump));
	}

	public static void dump() {
		System.out.println("Actual Allocation: " + counter);
	}

	private static int counter = 0;

	public static void fireCompiledEvent() {
		counter++;
	}

}
