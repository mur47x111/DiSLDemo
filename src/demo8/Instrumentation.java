package demo8;

import ch.usi.dag.disl.annotation.AfterReturning;
import ch.usi.dag.disl.marker.BytecodeMarker;
import ch.usi.dag.disl.staticcontext.MethodStaticContext;

public class Instrumentation {

	@AfterReturning(marker = BytecodeMarker.class, args = "new", scope = "AllocationTest.*")
	static void profile(MethodStaticContext msc) {
		Profiler.fireEvent(msc.thisMethodName());
	}

}
