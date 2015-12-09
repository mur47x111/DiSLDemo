package demo9;

import ch.usi.dag.disl.annotation.GuardMethod;

public abstract class GuardUnitTest {

	@GuardMethod
	public static boolean isApplicable(AnnotationContext context) {
		return context.annotatedByTest();
	}

}
