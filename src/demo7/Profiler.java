package demo7;

import java.util.concurrent.atomic.AtomicLong;

public class Profiler {

	static {
		Runtime.getRuntime().addShutdownHook(new Thread(Profiler::dump));
	}

	public static void dump() {
		System.out.println("Total Allocation Number: " + counter.get());
	}

	private static AtomicLong counter = new AtomicLong();

	public static void fireEvent() {
		counter.incrementAndGet();
	}

}
