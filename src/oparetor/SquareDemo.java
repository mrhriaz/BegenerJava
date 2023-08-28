package oparetor;

import java.util.Scanner;

public class SquareDemo {
	
	public static void main (String []args) {
		
		
		Scanner input =new Scanner (System.in);
		
		double lanth ,area;
		
		System.out.print("Ente lanth:");
		lanth =input.nextDouble();
		
		area= lanth*lanth;
		
		System.out.print("Area of Square :"+area );
		
	
	}
	
	
	

}
