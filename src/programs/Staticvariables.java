package programs;

public class Staticvariables {
	//static
	static int i;//==>>static i will be italics and blue in colour
	private void m2() {
	int a=5600;
	System.out.println("local variable:"+a);
	System.out.println("class variable"+i);
	}
	public static void main(String[] args) {
		Staticvariables sv = new Staticvariables();
		sv.m2();
		System.out.println("static(main)"+i);

	}
	

}
