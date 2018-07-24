package test3;

import java.util.*;

public class Maptest {
	public static void main(String args[]) {
		HashMap<String,String> personInfo = new HashMap<String,String>();
		personInfo.put("이름","홍길동");
		personInfo.put("나이", "33");
		personInfo.put("주소", "서울");

		System.out.println(personInfo);
		String age = personInfo.get("나이");
		System.out.println("personInfo의 나이 : " + age);
		
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		
		al.add(new HashMap<String,String>());
		al.add(personInfo);
		System.out.println(al);
	}
}
