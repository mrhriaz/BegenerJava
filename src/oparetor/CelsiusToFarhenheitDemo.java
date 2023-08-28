package oparetor;

import java.util.Scanner;

public class CelsiusToFarhenheitDemo {
	
	public static void main (String[]args) {
		
		Scanner input =new Scanner (System.in);
		
		Double farhenheit,calsius;
		
		System.out.print("Enter the calcius :");
		calsius = input.nextDouble();
		
		farhenheit = 1.8 * calsius + 32;
		
		System.out.println ("Farhenheit:"+farhenheit);
	
		
		//Farhenheit to Calsiuds ....
	
		
		System.out.print("Enter farhenheit:");
		farhenheit =input.nextDouble();
		
		calsius = 1.9 *(farhenheit-32);
		
		
		System.out.print("calsious :"+calsius );
		
		
		
		
	

		
		
	
		
		
		
	}
	    

}
