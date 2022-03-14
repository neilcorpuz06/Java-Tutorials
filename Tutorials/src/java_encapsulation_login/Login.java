package java_encapsulation_login;

public class Login {

	private String user_name, first_name, last_name, password, confirm_password;

	// Setter
	public void setUsername(String new_username) {
		this.user_name = new_username;
	}
	// Getter
	String getUsername() {
		System.out.println("\n\nUsername: " + user_name);
		return user_name;
	}
	// Setter
	public void setFirstName(String new_firstname) {
		this.first_name = new_firstname;
	}
	// Getter
	String getFirstName() {
		System.out.println("First name: " + first_name);
		return first_name;
	}
	// Setter
	public void setLastName(String new_lastname) {
		this.last_name = new_lastname;
	}
    //Getter
	String getLastName() {
		System.out.println("Last name: " +last_name);
		return last_name;
	}
    //Setter
	public void setPassword(String new_password) {
		this.password = new_password;
	}
    //Getter
	String getPassword() {
		System.out.println("Password: " +password);
		return password;
	}
    //Setter
	public void setConfirmPassword(String new_confirmpassword) {
		this.confirm_password = new_confirmpassword;
	}
    //Getter
	String getConfirmPassword() {
		System.out.println("Confirm password: " +confirm_password);
		return confirm_password;
	}
}
