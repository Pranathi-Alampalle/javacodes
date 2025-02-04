/*	1. Any variable which is declared inside any method.
	2. The scope of local variable is from : Beginning of method till the end of method.
	3. Local Variable doesn�t have default values.
	4. Local Variable can never be distinguish between static and non- static.
	5. Local Variable can never be utilized until and unless it is initialized.

Color of local variable will be brown */


package j02_variables_local_global_final;

public class LocalVariables_1 {
	
	static void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Method-1");
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		add();
		
		int a=10;
		int b=30;
		int sum=a+b;
		System.out.println("Method-2");
		System.out.println(sum);
		
		
	}

}
