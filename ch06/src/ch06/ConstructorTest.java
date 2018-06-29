package ch06;

class Data1{
	int value;
	
	Data1(){
		System.out.println("Data1 생성자 호출!");
	}
}
class Data2{
	int value;
	
	Data2(int x) {
		value = x;
		System.out.println("Data2 생성자 호출!");
	}
}

class ConstructorTest {
	public static void main(String args[]) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(30);
		
		System.out.println("d1 객체의 value: " + d1.value);
		System.out.println("d2 객체의 value: " + d2.value);
	}
}
