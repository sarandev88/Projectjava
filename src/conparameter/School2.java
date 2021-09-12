package conparameter;

public class School2 extends School {
	
	
	public void demo() {
		System.out.println(super.i);
			}

	public static void main(String[] args) {
		School2 sch = new School2();
		sch.demo();
	}
}


//super--->parent class reference