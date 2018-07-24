package test2;

public class Exec2 {
	public static void printObject(Action a) {
		a.run();
		a.sleep();
		a.wark();
	}
	public static void main(String args[]) {
		Action a = new Person("홍길동", 33);
		printObject(a);
		a = new Cat("럭키", 3);
		printObject(a);
		a = new Dog("누렁이", 5);
		printObject(a);
	}
}
