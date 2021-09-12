package conparameter;

public class Student {
	//default or non-parameterized constructor
	public Student() {
System.out.println("demo");
	}
	//parameterized constructor
	
	public Student(String dob) {
	System.out.println("DOB:"+ dob);
	}
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student("01.05.2021");
		
	}

}
