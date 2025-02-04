package j02_variables_local_global_final;
public class MultipleMethods_With2GlobalVariables {
	
	static int a=10; 
	static int b=20;
	
	static void addition()
	{
		System.out.println(a+b);
	}
	static void subtraction()
	{
		System.out.println(a-b);
	}
	void multiplication()
	{
		System.out.println(a*b);
	}
	static void division()
	{
		System.out.println(a/b);
	}
	void modulus()
	{
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		addition();
		subtraction();
	    division();
		MultipleMethods_With2GlobalVariables var = new MultipleMethods_With2GlobalVariables();	
		var.multiplication();
		var.modulus();

	}

}
