package demo10;

import ch.usi.dag.disl.annotation.AfterReturning;
import ch.usi.dag.disl.dynamiccontext.DynamicContext;
import ch.usi.dag.disl.marker.BytecodeMarker;

public class Instrumentation {

	@AfterReturning(marker = BytecodeMarker.class, args = "getfield", scope = "GetFieldTest.*")
	static void traceGetObjectField(DynamicContext dc) {
		Tracer.getfield(dc.getStackValueAsObject(0));
	}

}
