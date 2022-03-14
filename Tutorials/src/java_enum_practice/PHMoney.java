package java_enum_practice;

public enum PHMoney {
   PESO(1,"ONE PESO"),
   FIVE(5,"FIVE PESOS"),
   TEN(10,"TEN PESOS"),
   TWENTY(20,"TWENTY PESOS"),
   FIFTY(50, "FIFTY PESOS"),
   ONEHUNDRED(100,"ONE HUNDRED"),
   TWOHUNDRED(200,"TWO HUNDRED"),
   ONETHOUSAND(1000,"ONE THOUSAND");
	
	int val;
	String name;
	
	PHMoney(int val, String name){
		this.val = val;
		this.name = name;
	}


}
