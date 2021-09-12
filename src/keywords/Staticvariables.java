package keywords;


public class Staticvariables {
	//static variables
	static int i = 100;
	
	private void m1() {
System.out.println("static "+ i);
	}	
private void m2() {
System.out.println("static:::"+i);
}	
	public static void main(String[] args) {
	Staticvariables sv = new Staticvariables();
	sv.m1();
	sv.m2();
	System.out.println(i);
	i++; //100+1
	System.out.println(i);
	
	}

}
