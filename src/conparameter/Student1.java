package conparameter;

public class Student1 {
	
	//constructor chaining
	//this----->> current class reference
	
	public Student1() {
System.out.println("demo");
	}
public Student1(int id) {
this();
System.out.println("ID:"+id);
}
public Student1(long dob) {
	this(45);
	System.out.println("DOB:"+dob);
	
}
public static void main(String[] args) {
	Student1 s1 = new Student1(212454l);
	
}
}
	

