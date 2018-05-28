package ch03;

public class OperatorEx9 {
	public static void main(String args[]) {
		long a = 1_000_000 * 1_000_000; //int타입의 최대값을 넘어서서 -72~~가나옴
		long b = 1_000_000 * 1_000_000L; //이건 제대로 나옴
		/*
		 * long를 썻지만 숫자뒤에 L를 쓰지 않았기 때문에 int타입으로 계산한 결과 최대값을 넘어서
		 * -값이 나오게 되었고 이 -값은 long에 넣어도 이미 -값이 됬기 떄문에 바뀌지 않는다.
		 */
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
