package ch2;

class CastingEx5 {
	public static void main(String args[]) {
		float f = 1234;
		byte b = (byte)1000; //에러 byte값을 넘는 값을 저장
		char ch = (char)1000;
		
		int i = 3;
		double d = 1.0 + i; //double d = 1.0 + (double)i;와 같음
		
		/*
		 * 자동 형변환의 규칙
		 * byte>short(char)>int>long>float>double
		 * 왼쪽에서 오른쪽으로는 (int)같은 명령어없이 자동 변환된다.
		 * 더 크기 떄문이다.
		 */
	}
}
