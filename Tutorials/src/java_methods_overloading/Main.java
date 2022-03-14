package java_methods_overloading;

/*Note: Method Overloading can change by the following.
Method 1: By changing the number of parameters. 
Method 2: By changing the Data types of the parameters 
Method 3: By changing the Order of the parameters */

public class Main {
	// Main driver method
    public static void main(String[] args)
    {
        // Creating object of above class inside main()
        Addition_Method1 ob = new Addition_Method1();
 
        // Calling method to add 3 numbers
        int sum1 = ob.add(1, 2);
 
        // Printing sum of 2 numbers
        System.out.println("sum of the two integer value :"
                           + sum1);
 
        // Calling method to add 3 numbers
        int sum2 = ob.add(1, 2, 3);
 
        // Printing sum of 3 numbers
        System.out.println(
            "sum of the three integer value :" + sum2);

        Addition_Method2 ob1 = new Addition_Method2();
        int sum21 = ob1.add(1, 2, 3);
        System.out.println(
            "sum of the three integer value :" + sum21);
        double sum3 = ob1.add(1.0, 2.0, 3.0);
        System.out.println("sum of the three double value :"
                           + sum3);

        // Creating object of above class
        Geek_Method3 geek = new Geek_Method3();
 
        // Passing name and id
        // Note: Reverssing order
        geek.geekIdentity("Neil", 28);
        geek.geekIdentity(28, "Neil");
    }
}

