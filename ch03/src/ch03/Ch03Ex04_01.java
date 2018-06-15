package ch03;

public class Ch03Ex04_01 {
	public static void main(String[] args) {
		int a = 5;
		a +=10;
		a = a-1; //15
		debugTest(a);
		System.out.printf("%d%n", a);
	}
	
	private static void debugTest(int b) {
		System.out.println(b + 10);
	}
}
