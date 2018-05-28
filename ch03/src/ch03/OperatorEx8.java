package ch03;

public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000; //1,000,000 1백만
		int b = 2_000_000; //2,000,000 2백만
		
		long c = a * b; //int값을 넘어섬 그래서 오버플로우해서 -값이 나옴
		
		System.out.println(c);

	}

}
