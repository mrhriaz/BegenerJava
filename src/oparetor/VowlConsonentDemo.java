package oparetor;

import java.util.Scanner;

public class VowlConsonentDemo {
	
	public static void main(String[]args) {
		
		
		Scanner input =new Scanner(System.in);
		
		char alphabet;
		System.out.print("Enter any Alphabet:");
		alphabet=input.next().charAt(0);
		
		if(alphabet=='a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o'|| alphabet=='u') {
			System.out.print("This alphabet is vowel.");		
			
		}
		
		else
		{
			System.out.println("Consonent");
		}
		
		
		
		
		
		
		
		
	}

}
