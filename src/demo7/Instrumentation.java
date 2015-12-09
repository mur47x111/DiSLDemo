package demo7;

import ch.usi.dag.disl.annotation.AfterReturning;
import ch.usi.dag.disl.marker.BytecodeMarker;

public class Instrumentation {

	@AfterReturning(marker = BytecodeMarker.class, args = "new", scope = "AllocationTest.foo")
	static void profilefoo() {
		Profiler.fireEvent();
	}

	@AfterReturning(marker = BytecodeMarker.class, args = "new", scope = "AllocationTest.foo1")
	static void profilefoo1() {
		Profiler.fireEvent();
	}

	@AfterReturning(marker = BytecodeMarker.class, args = "new", scope = "AllocationTest.foo2")
	static void profilefoo2() {
		Profiler.fireEvent();
	}

	@AfterReturning(marker = BytecodeMarker.class, args = "new", scope = "AllocationTest.foo3")
	static void profilefoo3() {
		Profiler.fireEvent();
	}

	@AfterReturning(marker = BytecodeMarker.class, args = "new", scope = "AllocationTest.foo4")
	static void profilefoo4() {
		Profiler.fireEvent();
	}

}
