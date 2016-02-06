package Arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of array:");
		
		int size = sc.nextInt();
		
		
		int array[]  = new int[size];
		
		System.out.println(" Enter elements");
		for(int i =0; i<size ; i++){
			array[i] = sc.nextInt();
			
		}
		
		System.out.println(" Before sorting:");
		
		for(int i=0; i<size ; i++)
		{
			System.out.println(array[i]);
		}
		
		for ( int i =0; i<size-1; i++){
			
			for (int j=0; j< size-i-1; j++)
			{
				if( array[j] >array[j+1])
				{
				int swap = array[j];
				array[j] = array[j+1];
				array[j+1] = swap ;
				}			
			}
		}
		
		
		System.out.println("After sorting");
		
		
		for( int i=0; i<size; i++)
		{
			System.out.println(array[i]);
		}
			

	}

}
