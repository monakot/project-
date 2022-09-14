   

package skillbilding;

import java.util.Scanner;

public class slillbilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userinput = new Scanner(System.in);
		
	int age = 45;
	double salary;
	String name;
	char Firstinitial;

	age= userinput.nextInt();
	
	salary = userinput.nextDouble();
	
	System.out.println ("Please enter your full name");
	System.out.println( "Your age is" + age + "and your salary is"+ salary);
	
	name = userinput.nextLine(); 
	
	System.out.println( "The name you've entered is; " + name );
	
	System.out.println("Please enter you age "); 
	
	
	System.out.println( "The name you've entered is; " + name + "and your age is: " + age);
	
	
	
	}

}
