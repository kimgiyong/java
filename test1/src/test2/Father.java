package test2;

public class Father {
	Father(){
		System.out.println("난 아빠 생성자!");
	}
	void test() {
		System.out.println("아니 넌 누구냐");
	}
	protected void test2() {
		System.out.println("패키지 상관없이 상속하면 다됨");
	}
	private void test3() {
		System.out.println("이건 프라이빗으로 나만쓴다.");
	}
}
