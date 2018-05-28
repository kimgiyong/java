package ch03;

public class OperatorEx4 {
	public static void main(String args[]) {
		int i = -10;
		i = +i;	// i는 -10 (+는 곱하기 +1 한 것과 동일)
		System.out.println(i);
		
		i = -10;
		i = -i; // i는 10 (-는 곱하기 -1한 것과 동잉)
		System.out.println(i);
	}
}
