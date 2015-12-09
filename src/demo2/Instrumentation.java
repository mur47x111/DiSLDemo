package demo2;

import ch.usi.dag.disl.annotation.Before;
import ch.usi.dag.disl.marker.BodyMarker;

public class Instrumentation {

	@Before(marker = BodyMarker.class, scope = "java.io.PrintStream.println")
	public static void premain() {
		System.out.println("[PrintStream.println] Hello, DiSL");
	}

}
