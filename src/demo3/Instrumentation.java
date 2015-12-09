package demo3;

import java.util.Arrays;

import ch.usi.dag.disl.annotation.Before;
import ch.usi.dag.disl.dynamiccontext.DynamicContext;
import ch.usi.dag.disl.marker.BodyMarker;

public class Instrumentation {

	@Before(marker = BodyMarker.class, scope = "java.lang.ProcessImpl.start")
	static void profile(DynamicContext dc) {
		String[] cmd = (String[]) dc.getMethodArgumentValue(0, Object.class);
		System.out.println("[Intercepted by DiSL] " + Arrays.toString(cmd));
	}

}
