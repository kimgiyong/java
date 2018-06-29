package ch06;

public class PersonTest {
	public static void main(String args[]) {
		//1. 사람 3명(객체 3개) 만들기
		Person pepole[] = new Person[3];
		pepole[0] = new Person("김기용", 19, "인천 부평구 부평동");
		pepole[1] = new Person("조은향", 19, "경기도 부천");
		pepole[2] = new Person("홍길동", 40, "율도국 왕궁");
		//2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		//(자기 자신 포함해서 옆사람 정보 작성하기)

		//3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		for(int a=0;a<3;a++) {
			pepole[a].How();
			System.out.println();
		}
		Person a = new Person("흥민");
		
		a.How();
	}
}
