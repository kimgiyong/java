package test1;

public class MethodTest {
	String str = "abc";
	
	// 데이터타입은 String
	// 함수명은 test()
	// 3개의 동일한 함수명으로 선언과
	// 호출해주시면 됩니다.
	String test(int a) {
		return "집에";
	}
	String test(double a) {
		return "가고";
	}
	String test(String a) {
		return "싶다";
	}
	public static void main(String agrs[]) {
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		System.out.println(mt1.str==mt2.str);
		System.out.println(mt1.test(1));
		System.out.println(mt1.test(1.1));
		System.out.println(mt1.test("ass"));
	}
}
