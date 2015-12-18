package demo10;

public class GetFieldTest {

	public Object f1 = new Object();
	public int f2 = 1;

	public static void main(String[] args) {
		GetFieldTest t = new GetFieldTest();
		System.out.println(t.f1);
		System.out.println(t.f2);
	}

}
