package demo3;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {

	@Test
	public void test() {
		Assert.assertEquals(Math.max(1, 2), 2);
	}

}
