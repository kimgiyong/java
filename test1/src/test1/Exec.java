package test1;

public class Exec {
	public static void main(String args[]) {
		Calc c = new Calc();
		c.minus(1,2);
		System.out.println(c.minus(1,2));
		System.out.println(c.multiple(1,2));
	}
}
