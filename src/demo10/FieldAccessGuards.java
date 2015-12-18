package demo10;

import ch.usi.dag.disl.annotation.GuardMethod;

public abstract class FieldAccessGuards {

	public abstract static class ObjectField {

		@GuardMethod
		public static boolean isApplicable(FieldAccessContext context) {
			return context.getFieldDesc().startsWith("L");
		}

	}

	public abstract static class IntField {

		@GuardMethod
		public static boolean isApplicable(FieldAccessContext context) {
			return context.getFieldDesc().startsWith("I");
		}

	}

}
