/*  1. Any variable which is final will never be able to update its value.
	2. Both Local and global variable can be FINAL.
	3. If a local variable if final, we can't update its value locally.
If a global variable is final, we can't update its value globally */


package j02_variables_local_global_final;

public class Final_Variable {
	
	final static int a=10;    // final global variable
	
	public static void main(String[] args) {
		
		final double b=100.987;    //final local variable
		
		
System.out.println(a);
System.out.println(b);

	}

}
