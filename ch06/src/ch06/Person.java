package ch06;

class Person {
	//속성(인스턴스 변수)
	//1. 이름
	//2. 나이
	//3. 주소
	String name;
	int age;
	String home;
	
	Person(){
		
	}
	
	Person(String name){
		this(name,19,"없음");
		System.out.println("생성자 호출!");
		
	}
	//[2-1] 이름, 나이, 주소 인스턴스 변수를 초기화하는 생성자를 작성하시오.
	Person(String name, int age, String home){
		this.name = name;
		this.age = age;
		this.home = home;
	}
	
	//행동(메서드)
	//1. 자기소개
	// "저는[나이]살 [주소]에 사는 [이름]입니다."
	void How() {
		System.out.printf("저는 " + age +"살 " + home + "에 사는 " +name + "입니다.");
	}
}
