public class Student extends User{
	public boolean verified = true;
	public String major;
	
	// default constructor
	/*
	public Student() {
		System.out.println("Creating a student...");
	}
	*/
	
	//custom constructor
	public Student(String fn, String ln) {
		super(fn,ln);
		System.out.println("Creating a student...");

	}
	
	@Override
	public void sayHello() {
		System.out.println("Hi! My major is "+major);
	}
	
}
