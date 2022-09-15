package skillbilding;

import java.text.DecimalFormat;

public class Distancep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	DecimalFormat dc = new DecimalFormat("0.0");
		
		double segment1 = 12.2 ;
		double segment2 = 10.6 ;
		double segment3 = 5.8 ;
		
		
	   double total = segment1 + segment2 + segment3 ;
		System.out.println ( "Distance ; " +  dc.format(total) );


	}

}
