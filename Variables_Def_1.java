package j02_variables_local_global_final;

public class Variables_Def_1 {

	public static void main(String[] args) {
		/*Variables are containers for storing data values.

		In Java, there are different types of variables, for example:

		String - stores text, such as "Hello". String values are surrounded by double quotes
		int - stores integers (whole numbers), without decimals, such as 123 or -123
		float - stores floating point numbers, with decimals, such as 19.99 or -19.99
		char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
		boolean - stores values with two states: true or false */
		
		int myNum = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		
		System.out.println(myNum*15);
		System.out.println(myFloatNum);
		System.out.println(myLetter+"EF");
		System.out.println(myBool);
		System.out.println(myText +myText);


	}

}
