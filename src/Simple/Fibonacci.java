package Simple;

import java.util.Scanner;

public class Fibonacci {

	
		public static void main(String args[]){

			 System.out.println("Find Fibonacci series for the number:");
			 Scanner sc = new Scanner(System.in);
			 
			 int num = sc.nextInt();
			 
			 int fibonacci  = fib(num);
			 
			 System.out.println(" The fibonacci series is :");
			 
			 for( int i=0; i<= num ; i++){
				 System.out.print(" "+fib(i));
			 }
			
		}

		private static int fib(int num) {
			// TODO Auto-generated method stub
			
			
			if(num ==1 || num ==0)
			{
				return 1;
				
			}
		
			
			else  {
				return fib(num-1)+ fib(num-2); 
			}
			
			
		}
}
