package demo1;

import ch.usi.dag.disl.annotation.Before;
import ch.usi.dag.disl.marker.BodyMarker;

public class HelloDiSL {

	@Before(marker = BodyMarker.class, scope = "Helloworld.main")
	public static void premain() {
		System.out.println("Hello, DiSL");
	}

}
