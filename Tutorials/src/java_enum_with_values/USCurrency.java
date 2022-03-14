package java_enum_with_values;

public enum USCurrency {
	PENNY(0.01F,"Penny"),
	NICKLE(0.05F,"Nickle"), 
	DIME(0.1F,"Dime"),
	QUARTER(0.25F,"Quarter");
    
	float val;
	String name;
	USCurrency(float val) {
		this.val = val;
	}

	/* Using Constructor Overloading i will add a String name in enum list. */
	USCurrency(float val, String name){
		this.val = val;
		this.name = name;
	}
	
	/* Note: if you want to declare a value for enum you must use a constructor
	 * ex. 
	 * enum PENNY(0.01F);
	 * 
	 * Constructor
	 * Declare a variable that pass into parameter
	 * float val;
	 * 
	 * USCurrency(float val){this.val = val;}
	 * 
	 * */
}
