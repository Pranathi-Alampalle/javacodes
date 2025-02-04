//Updating a local Variable 

package j02_variables_local_global_final;

public class LocalVariables_Update_2 {
	
	static void add()
	{
		int a=10;
		int b=20;
		b=25;       //updating the value of b
		int sum=a+b;
		System.out.println("Method-1");
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
add();
		
		int a=10;
		a=15;       //updating the value of a
		int b=30;
		b=25;
		int sum=a+b;
		System.out.println("Main Method-2");
		System.out.println(sum);

	}

}
