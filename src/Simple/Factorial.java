package Simple;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int fact =1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Find factorial for this number:");
                int num = sc.nextInt();
                
            int factorial = fact(num);
            
            
                System.out.println("Factorial of number is :" +factorial);
           
                       
	}

	
	private static int fact(int num) {
		// TODO Auto-generated method stub
		
		int fact = 0;
		if(num==1){
			fact=1;
		}
		else if (num ==2)
		{
			fact =2;
		}
		else 
		{
			fact = fact(num-1) * num; 
		}
		
		return fact;
  	}

}
