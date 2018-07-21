package test1;

public class Looptest {
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) {
				// 홀수 일땐 홀수 출력
				// 짝수일땐 짝수라고 출력
				if(i%2==0) System.out.println(i + "는 짝수");
				else System.out.println(i + "는 홀수");
		}
	}
}
