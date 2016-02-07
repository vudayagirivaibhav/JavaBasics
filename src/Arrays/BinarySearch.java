package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

	System.out.println("Enter size :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
			
		int a[] = new int[size];
		
			
		System.out.println(" Enter elements");
		for(int i =0; i<size ; i++){
			a[i] = sc.nextInt();
			
		}
		
      	int low = 0;
		int high = size -1;
		
		
	System.out.println("Enter the element to search :");
	
	int num = sc.nextInt();
	
	// Logic starts
	
	while(high<=low)
	{
		int middle= (high + low)/2;
		
		if(a[middle] == num)
		{
			System.out.println("Found");
		}
	    if (a[middle]<num)
		{
			low = middle+1;
			
		}
	    if(a[middle]>num)
	    {
	    	high = middle-1;
	    	
	    }
		
		
	}
	System.out.println("Not Found");
	}

}
