package test2;

class Test{
	public final void test() {
		System.out.println("abc");
	}
}

public class FinalTest extends Test {
	public static final int NUM = 1;
	
	public static void main(String args[]) {
		System.out.println(FinalTest.NUM);
	}
}
