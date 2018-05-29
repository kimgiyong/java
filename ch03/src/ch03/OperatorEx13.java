package ch03;

public class OperatorEx13 {
	public static void main(String args[]) {
		char c1 = 'a';
		
 //		char c2 = c1+1;
		char c2 = 'a' + 1;
		
		System.out.println(c2);
		
		/* c2 = c1+1  이 안되는 이유는 c1이 계산되면서 int형으로 바뀌기 떄문에 오류가 난다.*/
	}
}
