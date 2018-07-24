package test4;

import java.util.*;

public class MapTest3 {
	
	public static void main(String args[]) {
		ArrayList<HashMap<String,String>> animal = new ArrayList<HashMap<String,String>>();
		animal.add(new HashMap());
		animal.get(0).put("동물이름", "도롱뇽");
		animal.get(0).put("나이", "5세");
		
		animal.add(new HashMap());
		animal.get(1).put("동물이름", "금붕어");
		animal.get(1).put("나이", "1세");
		
		animal.add(new HashMap());
		animal.get(2).put("동물이름", "늑대");
		animal.get(2).put("나이", "4세");
		
		animal.add(new HashMap());
		animal.get(3).put("동물이름", "움파루파");
		animal.get(3).put("나이", "2세");
		
		for(int a=0;a<animal.size();a++) {
			System.out.println(animal.get(a));
		}
	}
}
