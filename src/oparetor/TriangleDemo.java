package oparetor;

import java.util.Scanner;

public class TriangleDemo {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	
	double base,hight,area;
	
	System.out.print("Enter base :");
	base=input.nextDouble();
	
	System.out.print("Enter hight:");
	hight=input.nextDouble();
	
	area =0.5*base *hight;
	
	System .out .print("Aera of Tringle:"+area);
	
		// TODO Auto-generated method stub

	}

}
