package demo6;

import ch.usi.dag.disl.annotation.AfterReturning;
import ch.usi.dag.disl.marker.BytecodeMarker;

public class Instrumentation {

	@AfterReturning(marker = BytecodeMarker.class, args = "new", scope = "AllocationTest.foo")
	static void profile() {
		Profiler.fireEvent();
	}

}
