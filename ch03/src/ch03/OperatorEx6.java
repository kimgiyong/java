package ch03;

public class OperatorEx6 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		// +같은 연산을 하면 int형으로 바꿔서 연산을 하기 떄문에 변환이 필요
		byte c = (byte)(a + b);
		System.out.println(c);
		
		/*
		 * 자바의 정수 기본형은 int이다
		 * 따라서 계산을 할때는 다시 int형으로 변경해서 계산하게 된다.
		 * 결론은 별일 없으면 int를 사용하라.
		 */
	}

}
