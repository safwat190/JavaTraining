import java.util.ArrayList;
import java.util.List;

public class oop1 {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		User me = new User();
		//user.firstName = "Ahmed";
		me.setFirstName("Ahmed");
		
		//user.lastName = "Safwat";
		me.setLastName("Safwat");
		
		User you = new User();
		you.setFirstName("Omar");
		you.setLastName("Safwat");
		
		//user.outputtimes(5);
		//String message = user.output();
		//System.out.println(message);
	
		//System.out.println(user.getFullName());
		
		List<User> users = new ArrayList<User>();
		
		//users.add(me);
		//users.add(you);
		
		//System.out.println(users.get(0).getFirstName());
		//System.out.println(users.get(1).getFirstName());
		
		String[] firstNames = {"Ahmed","Mohamed","Sara","Omar"};
		String[] lastNames = {"Safwat","Safwat","Safwat","Safwat"};
		
		for(int i=0;i<firstNames.length;i++) {
			User u = new User();
			u.setFirstName(firstNames[i]);
			u.setLastName(lastNames[i]);
			users.add(u);
		}
		
		for(User u : users) {
			System.out.println(u.getFullName());
		}
		
		//User.printUser(users.get(2));
		*/
		/*oop1 m = new oop1();
		m.printUser(users.get(0));*/
		
		/*System.out.println("\n"+"Mark 1:");
		User.printUser(users);
		
		System.out.println("\n"+"Mark 2:");
		System.out.println(users.get(0).getFirstName());
		
		System.out.println("\n"+"Mark 3:");
		System.out.println(users.get(0).output(true));
		System.out.println(users.get(0).output(false));
		
		System.out.println("\n"+"Mark 4:");
		System.out.println(User.searchList(users, "Ahmed","Safwat"));
		
		System.out.println("\n"+"Mark 5:");
		System.out.println(me.toString());
		
		System.out.println("\n"+"Mark 6:");
		System.out.println(me.equals(you));
		System.out.println(me.hashCode() == you.hashCode());
		
		System.out.println("\n"+"Mark 7:");
		System.out.println(User.searchList(users,me));
		System.out.println(users.get(0).getFirstName());
		
		System.out.println("\n"+"Mark 8:");
		User found = User.findUser(users, you);
		System.out.println(found.getFirstName());
		// Changing found will change the original object
		
		System.out.println("\n"+"Inheritance:");
		Student s = new Student();
		s.setFirstName("Salah");
		s.setLastName("Salem");
		System.out.println(s.getFirstName());
		s.major = "Biotechnology";
		s.sayHello();
		
		System.out.println("\n"+"Polymorphism:");
		
		Teacher t = new Teacher();
		t.setFirstName("Mohamed");
		t.setLastName("Ali");
		
		List<User> newUsers = new ArrayList<User>();
		newUsers.add(s);
		newUsers.add(t);
		
		for(User u : newUsers) {
			u.sayHello();
		}
		
		Student ss = new Student("Omar","Kamal");
		System.out.println(ss.getFullName());
		*/
		
		Student s = new Student("Ahmed","Abouhashem");
		s.sayHello();
	}
	// To go to the User class to be static method
	/*public void printUser(User u) {
		System.out.println(u.getFullName());
	}*/
}













