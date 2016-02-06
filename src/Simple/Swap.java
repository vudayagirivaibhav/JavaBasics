package Simple;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		System.out.println("Enter 1st number");
		 Scanner sc = new Scanner(System.in);
		 	 int num1 = sc.nextInt();
		 	 
		 	 int num2 = sc.nextInt();
		 	 
		 	 System.out.println("Before Swapping :" +num1+" "+num2);
		 	 
		 	 num2 = num1+num2;
		 	 num1 = num2-num1;
		 	 num2 = num2 - num1;
		 	 
		 	 
		 	 System.out.println("After Swapping :" +num1+" "+num2);
		 	 
		 	 
		 	 
		 	 
		 	 
		
		
		
		
		
		
		
		
		
	}

}
