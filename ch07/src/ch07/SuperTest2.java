package ch07;

public class SuperTest2 {
	public static void main(String args[]) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2{
	int x=10;
	Parent2(){
		System.out.println("Parent 기본생성자 호출!");
	}
}

class Child2 extends Parent {
	int x=20;
	Child2(){
		System.out.println("Child 기본생성자 호출!");
	}
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}
