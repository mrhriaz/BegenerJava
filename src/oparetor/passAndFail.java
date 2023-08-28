package oparetor;

import java.util.Scanner;

public class passAndFail {
	public static void main (String[]args) {
		Scanner input  = new Scanner (System.in);
		
		Double number;
		
		System.out.println("Enter the any number:");
		number=input.nextDouble();
		
		if(number>33) {
			System.out.print("You are pass in the Exam.");
			
		}
		
		else if(number>80) {
			System.out.print("Your CGpa is A+");
			
		}
		else {
			System.out.println("You are failed in the exam.");
			
		}
		
		
		
		
		
	}

}
