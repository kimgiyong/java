package test2;

public class Dog implements Action {

	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void pr(Object o) {
		System.out.println(o);
	}
	@Override
	public void sleep() {
		pr(this.age + "살 강아지" + this.name + "가 잡니다.");

	}

	@Override
	public void run() {
		pr(this.age + "살 강아지" + this.name + "가 뜁니다.");

	}

	@Override
	public void wark() {
		pr(this.age + "살 강아지" + this.name + "가 걷습니다.");

	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breakUp() {
		// TODO Auto-generated method stub

	}

}
