package oparetor;

import java.util.Scanner;

public class EvenOddDemo {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		Double number;
		
		System.out.print("Enter the posetive number:");
		number=input.nextDouble();
		
		if(number%2==0) {
			System.out.println("Eveen Number");//jor sonkka.
			
		}
		else {
			System.out.print("Odd Number");//bizor sonkka.
			
		}
		
		// TODO Auto-generated method stub

	}

}
