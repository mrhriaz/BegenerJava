package oparetor;

import java.util.Scanner;

public class ArithmaticOparetor {
	public static void main (String []args) {
		
		Scanner input=new Scanner(System.in);
		
		int num1;
		int num2;
		int result;
		 
		System.out .print("Enter Frist Number:");
		
		num1 =input.nextInt();
		
		System.out .print("Enter Sceond Number:");
		
		num2 = input.nextInt();
		
		
	
		
		result=num1+num2;
		System.out.println("sum ="+result);
		
		result =num1-num2;
		System.out .println("subtrction="+result);
		
		result=num1*num2;
		System.out.println("Multiplication="+result);
		
		Double result2=(double)num1/num2;
		System.out.println("Devided="+result2);
		
		result=num1%num2;
		System.out.println("Reminder="+result);
		
		
	}

}
