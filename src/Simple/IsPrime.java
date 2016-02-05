package Simple;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tmp = 0;
		boolean isPrime = true;		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter your number :" );		
		int number = sc.nextInt();
		for(int i =2; i<= number/2; i++)
		{
			tmp = number%i;
			if(tmp ==0)
			{
				isPrime = false;
				break;
			}
				
		}
		
		if(isPrime)
		{
			System.out.println(+number +" is prime ");
			
		}
		else{
			System.out.println(+number +" is not  prime ");
		}
		

	}

}
