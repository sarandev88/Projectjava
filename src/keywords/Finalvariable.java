package keywords;

public class Finalvariable {
	//final keyword in variable
	
	final int i = 500;
	private void method() {
System.out.println("final variable:::" +i);
}
	public static void main(String[] args) {
		Finalvariable fv = new Finalvariable();
		fv.method();
		System.out.println(fv.i);
		i++; //final == value cannot be changed
	}
	

}
