package programs;

public class Classvariables {
	//class variable
	int i;

public void m2() {
	int  a = 1500;
	System.out.println("local variable:"+a);
	System.out.println("class variable" +i);
}
public static void main(String[] args) {
	Classvariables cv = new Classvariables();
	cv.m2();
	System.out.println("class (main)"+cv.i);
	
}
	

}