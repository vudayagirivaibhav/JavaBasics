package Strings;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String num ="123";
      
     int number =  StringtoInteger(num);
     
     System.out.println(number);
	}

	private static int StringtoInteger(String num) {
		
		int number = 0, x = 1;
	    for (int i = num.length()-1; i >= 0; i--) {
	        number += (num.charAt(i) - '0') * x;
	        x *= 10;
	    }
	  
		
		return number;
		// TODO Auto-generated method stub
		
	}

}
