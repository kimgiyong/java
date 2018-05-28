package ch03;

public class OperatorEx10 {
	public static void main(String[] args) {
		int a = 1000000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a,a,a,result1);
		System.out.printf("%d / %d * %d = %d%n", a,a,a,result2);
		/*
		 * 곱한다음 나누면 실제로 계산하면 결과값은 동일하겠지만 여기선 int값을 넘어서서 -값이 되서
		 * 나눴을시의 값이 다르다
		 */
	}

}
