package demo9;

import java.util.concurrent.ConcurrentHashMap;

public class Profiler {

	static {
		Runtime.getRuntime().addShutdownHook(new Thread(Profiler::dump));
	}

	public static void dump() {
		System.out.println("[DiSL] Test Method Profile:");
		profile.entrySet().forEach(System.out::println);
	}

	private static ConcurrentHashMap<String, Long> profile = new ConcurrentHashMap<>();

	public static void fireTestExecution(String methodName, long elapsed) {
		profile.putIfAbsent(methodName, elapsed);
	}

}
