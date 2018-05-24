package ch2;

public class SpecialCharEx {
	public static void main(String args[]) {
		/*
		 * 특수문자(Escape sequence) 이 영어를 검색해여 \b같은거 리스트 볼 수 있음
		 */
		System.out.println('\''); //'''처럼 할 수 없다.
		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워진다.
		System.out.println('\n'); // 개행(new line)문자 출력하고 개행(그냥 엔터)
		System.out.println("\"Hello\""); // 큰따옴표를 출력하려면 이렇게 한다.
		System.out.println("c:\\");
	}
}
