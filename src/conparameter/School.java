package conparameter;

public class School {
	int i =10;
	
	
	public void m1() {
System.out.println(this.i);

	}
public static void main(String[] args) {
	School s = new School();
	s.m1();
}
}
/// this current class reference