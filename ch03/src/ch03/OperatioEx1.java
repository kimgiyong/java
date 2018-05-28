package ch03;

public class OperatioEx1 {
	public static void main(String args[]) {
		int i = 5;
		i++;	// i=i+1;과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다.
		System.out.println(i);
		
		i = 5;	// 결과값을 비교하기 위해 다시 5초 변경
		++i;
		System.out.println(i);
		
		i = 5;
		System.out.println(i++);
		
		i = 5;
		System.out.println(++i);
	}
}
