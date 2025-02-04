package j02_variables_local_global_final;

public class Local_Static_NonStatic_GlobalVariables_update {
	
	static int a=10;
	int b=20;

	public static void main(String[] args) {
		
		int c=30;
		a=11; //update global static variable
		c=31; //update local variable
		
		
		//updating global not static variable:
		
		Local_Static_NonStatic_GlobalVariables_update var = new Local_Static_NonStatic_GlobalVariables_update();
		var.b=21;
		System.out.println(a);
		System.out.println(var.b);
		System.out.println(c);

	}

}
