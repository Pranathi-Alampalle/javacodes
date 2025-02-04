package j02_variables_local_global_final;

public class Global_NonStaticVariable_Update_2 {
	
	int a=10;

	public static void main(String[] args) {
		
		
// We can update non static global variable with the help of reference variable
		
		
		Global_NonStaticVariable_Update_2 var = new Global_NonStaticVariable_Update_2();
		var.a =100;

System.out.println(var.a);

	}

}
