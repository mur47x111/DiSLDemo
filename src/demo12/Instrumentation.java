package demo12;

import com.oracle.graal.api.directives.GraalDirectives;

import ch.usi.dag.disl.annotation.AfterReturning;
import ch.usi.dag.disl.marker.BytecodeMarker;

public class Instrumentation {

	@AfterReturning(marker = BytecodeMarker.class, args = "new", scope = "AllocationTest.foo", order = 1)
	static void profile() {
		GraalDirectives.instrumentationBegin(-1);
		if (GraalDirectives.inCompiledCode()) {
			Profiler.fireCompiledEvent();
		}
		GraalDirectives.instrumentationEnd();
	}

	@AfterReturning(marker = BytecodeMarker.class, args = "new", scope = "AllocationTest.foo", order = 2)
	static void profileAll() {
		GraalDirectives.instrumentationBegin(0);
		Profiler.fireAllEvent();
		GraalDirectives.instrumentationEnd();
	}

}
