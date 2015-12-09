package demo8;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Profiler {

	static {
		Runtime.getRuntime().addShutdownHook(new Thread(Profiler::dump));
	}

	public static void dump() {
		System.out.println("Allocation Profile:");
		counter.entrySet().forEach(System.out::println);
	}

	private static ConcurrentHashMap<String, AtomicLong> counter = new ConcurrentHashMap<>();

	public static void fireEvent(String methodName) {
		counter.computeIfAbsent(methodName, a -> new AtomicLong()).incrementAndGet();
	}

}
