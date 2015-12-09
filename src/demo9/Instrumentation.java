package demo9;

import ch.usi.dag.disl.annotation.After;
import ch.usi.dag.disl.annotation.Before;
import ch.usi.dag.disl.annotation.SyntheticLocal;
import ch.usi.dag.disl.marker.BodyMarker;
import ch.usi.dag.disl.staticcontext.MethodStaticContext;

public class Instrumentation {
	
	@SyntheticLocal
	static long wallClockStart;

	@Before(marker = BodyMarker.class, guard = GuardUnitTest.class)
	static void onMethodEntry(MethodStaticContext msc) {
		wallClockStart = System.nanoTime();
	}
	
	@After(marker = BodyMarker.class, guard = GuardUnitTest.class)
	static void onMethodExit(MethodStaticContext msc) {
		long elapsed = System.nanoTime() - wallClockStart;
		Profiler.fireTestExecution(msc.thisMethodFullName(), elapsed);
	}

}
