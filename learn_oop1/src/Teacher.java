public class Teacher extends User{
	
	public Teacher(String fn, String ln) {
		super(fn, ln);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayHello() {
		System.out.println("I am a teacher");
	}
}
