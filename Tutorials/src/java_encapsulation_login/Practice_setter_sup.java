package java_encapsulation_login;

public class Practice_setter_sup {

	
	/*default value can change by using the setter method
    but it cannot change the data type of this variable because it private */
    private String name ="JOHN"; 
    
    //Constructor
    public Practice_setter_sup(String new_name) {
		this.name = new_name;
	}
    
    //method to show the details from the default value to the new value.
    void showDetails() {
    	System.out.println("The Default Name is \"JOHN\" ");
    	System.out.print("The New Name is: " +name);
    }
    
}
