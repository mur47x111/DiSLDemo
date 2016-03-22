package demo12;

public class Profiler {

	static {
		Runtime.getRuntime().addShutdownHook(new Thread(Profiler::dump));
	}

	public static void dump() {
		System.out.println("Heap Allocation (Compiled): " + counter_compiled + "/" + counter_all);
	}

	private static int counter_compiled = 0;
	private static int counter_all = 0;

	public static void fireCompiledEvent() {
		counter_compiled++;
	}

	public static void fireAllEvent() {
		counter_all++;
	}

}
