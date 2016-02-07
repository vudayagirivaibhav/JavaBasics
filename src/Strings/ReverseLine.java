package Strings;

import java.util.StringTokenizer;

public class ReverseLine {

	public static void main(String[] args) {
		
		
		String line = "one two three four";
	   String reverseline=   ReverseLine.stringReverse(line);
	   
	   System.out.println(reverseline);
	    
	    
	    

}

	private static String stringReverse(String line) {
		// TODO Auto-generated method stub
		  if( line== null || line.length() == 0){
			  return "";
			
		  }
		  
		  String [] arr = line.split(" ");
		  StringBuilder sb = new StringBuilder();
		  for(int i=arr.length-1; i>=0; --i)
		  {
			  if(!arr[i].equals(""))
			  {
				  sb.append(arr[i]).append(" ");
			  }
		  }
		  
	
		  	  
		return sb.length() ==0? "": sb.substring(0,sb.length() -1);
		  
		  

		  
	}
}