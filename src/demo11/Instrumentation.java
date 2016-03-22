package demo11;

import com.oracle.graal.api.directives.GraalDirectives;

import ch.usi.dag.disl.annotation.AfterReturning;
import ch.usi.dag.disl.marker.BytecodeMarker;

public class Instrumentation {

	@AfterReturning(marker = BytecodeMarker.class, args = "new", scope = "AllocationTest.foo")
	static void profile() {
		GraalDirectives.instrumentationBegin(-1);
		Profiler.fireCompiledEvent();
		GraalDirectives.instrumentationEnd();
	}

}
