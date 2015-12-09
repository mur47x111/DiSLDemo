package demo6;

import java.util.HashSet;
import java.util.Set;

public class Profiler {

	static {
		Runtime.getRuntime().addShutdownHook(new Thread(Profiler::dump));
	}

	public static void dump() {
		int sum = 0;
		synchronized (counters) {
			for (Counter counter : counters) {
				sum += counter.count;
			}
		}
		System.out.println("Total Allocation Number: " + sum);
	}

	static class Counter {
		int count = 0;

		void increment() {
			count++;
		}
	}

	final static Set<Counter> counters = new HashSet<>();

	public static Counter newCounter() {
		Counter counter = new Counter();
		synchronized (counters) {
			counters.add(counter);
		}
		return counter;
	}

	final static ThreadLocal<Counter> current = ThreadLocal.withInitial(Profiler::newCounter);

	public static void fireEvent() {
		current.get().increment();
	}

}
