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
public class GlobalVariables__StaticVariable1 {

static int a=20;
static double b;
static boolean c;

	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b); //default value 
		System.out.println(c); //default value		
	}

}
