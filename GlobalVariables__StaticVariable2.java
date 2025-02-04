/*	1. Any variable which is declared in the class but outside any method is called Global Variable.
	2. The scope of Global variable is from : Beginning of class till the end of class.
	3. Global Variables will have default values.
	4. Global Variable can be distinguish between static and non- static.
	5. Global Variable can be utilized without initializing
	
Global variables will have Default values if we wont initialize
integer, short, byte, long: 0;           float and double: 0.00          
char: non defined         string: null      boolean: false
        

Color of global variable will be blue */


package j02_variables_local_global_final;

public class GlobalVariables__StaticVariable2 {

static double pi=20;

static void area() {
	
	int r=10;
	double Area1 = pi*r*r;
	
	System.out.println(Area1);
	
}

	public static void main(String[] args) {
		
		area();
		int r=25;
		double Area2 = pi*r*r;
		System.out.println("Area");
		System.out.println(Area2);
				
	}

}
