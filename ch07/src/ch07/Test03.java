package ch07;

public class Test03 {
	public static void main(String args[]) {
		Student1 s = new Student1("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}
class Student1 {
	int sum;
	float avg;
	String name;
	int is[];
	Student1(String name,int...is ){
		for(int a=0;a<is.length;a++) {
			this.name = name;
			this.is = is;
			if(a>1) sum+=is[a];
		}
		avg = Math.round(((float)sum/3)*10)/(float)10;
	}
	
	String info() {
		return name + "," + is[0] + "," + is[1] + "," + is[2] + "," + is[3] + "," + is[4] + "," + sum + "," + avg;
	}
}
