package demo10;

import ch.usi.dag.disl.annotation.AfterReturning;
import ch.usi.dag.disl.dynamiccontext.DynamicContext;
import ch.usi.dag.disl.marker.BytecodeMarker;

public class Instrumentation {

	@AfterReturning(marker = BytecodeMarker.class, args = "getfield", scope = "GetFieldTest.*", guard = FieldAccessGuards.ObjectField.class)
	static void traceGetObjectField(DynamicContext dc) {
		Tracer.getfield(dc.getStackValue(0, Object.class));
	}

	@AfterReturning(marker = BytecodeMarker.class, args = "getfield", scope = "GetFieldTest.*", guard = FieldAccessGuards.IntField.class)
	static void traceGetIntField(DynamicContext dc) {
		Tracer.getfield(dc.getStackValue(0, int.class));
	}

}
