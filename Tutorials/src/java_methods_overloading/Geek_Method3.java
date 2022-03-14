package java_methods_overloading;

public class Geek_Method3 {
	// Method 1
	public void geekIdentity(String name, int id) {
		// Method 3: By changing the Order of the parameters
		// Printing name and id o person
		System.out.println("geekName :" + name + " " + "Id :" + id);
	}

	// Method 2
	public void geekIdentity(int id, String name) {

		// Again printing name and id o person
		System.out.println("Id :" + id + " " + "geekName :" + name);
	}
}
