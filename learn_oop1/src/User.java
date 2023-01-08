import java.util.List;
import java.util.Objects;

public class User {
	private String firstName;
	private String lastName;
	public boolean verified = false;
	
	//custom constructor
	public User(String fn, String ln) {
		System.out.println("Creating a User...");
		firstName = fn;
		lastName = ln; 
	}
	
	public void outputtimes(int times) {
		for(int i =0;i<times;i++) {
			System.out.println(firstName+" "+lastName);
		}
	}
	
	public String output() {
		return ("Hi, my name is "+firstName+" "+lastName+".");
	}
	
	//overloading
	public String output(boolean nice) {
		if(nice) {
			return ("You are nice "+getFirstName());
		}
		return ("You are a nerd "+getFirstName());
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String fn) {
		firstName = fn.strip();
	}

	public void setLastName(String fn) {
		lastName = fn.strip();
	}
	
	public String getFullName() {
		//return(firstName+" "+lastName);
		return(getFirstName()+" "+getLastName());
	}
	
	/*public static void printUser(User u) {
		System.out.println(u.getFullName());
}*/
	
	public static void printUser(List<User> users) {
		for(User u: users) {
			System.out.println(u.getFullName());
		}
	}

	public static int searchList(List<User> users, String fn, String ln) {
		return searchList(users, fn+" "+ln);
	}
	
	public static int searchList(List<User> users, String fullName) {
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getFullName().equals(fullName)) {
				return i;
			}
		}
		return -1;
	}
	
	// Overloading the function to take a user object instead of a name
	public static int searchList(List<User> users, User u) {
		//Use the original function here
		return searchList(users,u.getFullName());
	}
	
	
	@Override
	public String toString() {
		return "User [getFullName()=" + getFullName() + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}
	
	// Returning the actual user object
	public static User findUser(List<User> users, User u) {
		for(User user : users) {
			if(user.equals(u)) {
				return user;
			}
		}
		return null;
	}
	
	/*public void sayHello() {
		System.out.println("Hi! I am a User. My name is "+firstName+" "+lastName);
	}*/
	
	public void sayHello() {
		System.out.println("Hi! I am a User. My name is "+firstName+" "+lastName);
	}
	
	
	
}











