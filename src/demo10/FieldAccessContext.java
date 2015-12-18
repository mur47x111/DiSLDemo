package demo10;

import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;

import ch.usi.dag.disl.staticcontext.AbstractStaticContext;

public class FieldAccessContext extends AbstractStaticContext {

	public String getFieldDesc() {
		AbstractInsnNode start = staticContextData.getRegionStart();

		if (start instanceof FieldInsnNode) {
			return ((FieldInsnNode) start).desc;
		}

		return "null";
	}

}
