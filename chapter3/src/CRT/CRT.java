           package CRT;

import java.util.Scanner;

public class CRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userinput = new Scanner(System.in);
		
	int x = 5;
	double y = 6.7 ;
	
	char m = 'A' ;
	String name = "Vigor" ;
	int z = x + x ; 
	
	final double PI = 3.14 ; 
	
	//System.out.println("x + x = " + (x + x)) ;
	System.out.println("Enter an integer") ; // Prompting for int 
	int numEntered = userinput.nextInt () ; //Recording an int 
	
	System.out.println("Is theinteger you've entered : " + numEntered) ;
	System.out.println("Please type Y/N") ; 
	char ans = userinput.next().charAt(0) ;
	
	if(ans == 'Y')
	{
	System.out.println("Great! We will move on") ;
	}
	else
	{
		System.out.println("Sorry!") ;
	 }
	}
}
