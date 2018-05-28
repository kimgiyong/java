package ch2;

public class CastingEx2 {
	public static void main(String args[]) {
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i,b);
		//int를 byte로 바꿀떄 정보손실 발생 byte의 용량초과
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i,b);
		//300 을 2진수로 출력
		System.out.println("i="+Integer.toBinaryString(i));
		
		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b,i);
		
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b,i);
		
		System.out.println("i="+Integer.toBinaryString(i));
	}
}
