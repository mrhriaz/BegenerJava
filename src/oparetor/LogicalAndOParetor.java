package oparetor;

import java.util.Scanner;

public class LogicalAndOParetor {
	public static void main (String []args) {
		
		Scanner input =new Scanner(System.in);
		
		char ch;
		System.out.print("Eanter an any letter:");
		ch =input.next().charAt(0);
		
		if (ch>='a' && ch<='z')
		{
			System.out.println("This is an Small letter");
			
		}
		else if (ch>='A'  &&  ch<='Z')
		{
			System.out.println("This numvber is an Capital letter:");
			
		}else{
		 
			System.out.println("Not a letter");
		}
	
	}
}
