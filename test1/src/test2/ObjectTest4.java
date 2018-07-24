package test2;

public class ObjectTest4 {
	private int speed;
	private int power;
	private String heroName;
	
	public ObjectTest4(int speed, int power, String heroName) {
		this.speed = speed;
		this.power = power;
		this.heroName = heroName;
	}
	
	public String toString() {
		return "내이름은 " + this.heroName + "이며 " + this.power + "정도의 힘과 " + this.speed + "정도로 빠르지";
	}
	public static void main(String argg[]) {
		ObjectTest4[] ot4s = new ObjectTest4[2];
		ot4s[0] = new ObjectTest4(5, 10, "menmen");
		ot4s[1] = new ObjectTest4(50, 20, "Hellk");
		System.out.println(ot4s[0]);
		System.out.println(ot4s[1]);
	}
}
