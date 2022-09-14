   

package skillbilding;

import java.util.Scanner;

public class slillbilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userinput = new Scanner(System.in);
		
	int age;
	double salary;
	String name;
	char Firstinitial;

	
	System.out.println ("Please enter your full name");
	name = userinput.nextLine(); 
	System.out.println( "The name you've entered is: " + name );
	
	System.out.println("Please enter your age "); 
	age= userinput.nextInt();
	
	System.out.println( "Please enter your salary");
	salary = userinput.nextDouble();
	
	System.out.println( "The name you've entered is: " + name + " and your age is: " + age);

	
	System.out.println( "Your age is " + age  + " and your salary is "+ salary);
	
	

	
	
	
	
	
	
	}

}
