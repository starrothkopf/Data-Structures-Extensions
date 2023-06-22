package mario;

import java.util.Scanner;

public class Mario {

	public static void main(String[] args) {

		//
		// Surprise! This part is done for you.
		// Don't change this and don't ask for any other inputs
		// or testing will fail
		//
		Scanner in = new Scanner(System.in);
		System.out.println("What size mountain do you want?");
		int size = in.nextInt();
		System.out.println("What pattern (1, 2, 3, or 4)?");
		int pattern = in.nextInt();

		if (size < 1)
			throw new IllegalArgumentException("Size must be at least 1");
		if (pattern < 1 || pattern > 4)
			throw new IllegalArgumentException("Invalid pattern, must be 1, 2, 3, or 4.  Mario aborts");

		//
		// Create the mountain by printing to System.out
		//
		
		boolean[][] array = new boolean[size][size];
		
		
		if (pattern == 1)
   	 	{
			int step = 1; // positive slope
			for (int row = 0; row < size; row++)
   		 	{
   		 		for (int j = 0; j + row < size; j++)
   		 		{
   		 			array[j + row][size - step] = true; // full column down at far side of array
   		 			
   		 		}
   		 		step ++;
   		 	}
   		 		
   		 }
		else if (pattern == 2)
   	 	{
			int step = size; // negative slope
			for (int row = 0; row < size; row++)
   		 	{
   		 		for (int j = 0; j + row < size; j++)
   		 		{
   		 			array[size - step][j + row] = true; // full column down at beginning of array
   		 			
   		 		}
   		 		step --;
   		 	}
   		 		
   		 }
		else if (pattern == 3)
   	 	{
			int step = size; // negative slope
			for (int row = 0; row < size; row++)
   		 	{
   		 		for (int j = 0; j + row < size; j++)
   		 		{
   		 			array[j + row][size - step] = true; // full column down at far side of array
   		 			
   		 		}
   		 		step --;
   		 	}
   		 		
   		 }
		else if (pattern == 4)
   	 	{
			int step = 1; // positive slope
			for (int row = 0; row < size; row++)
   		 	{
   		 		for (int j = size; j > row; j--)
   		 		{
   		 			array[row][j-1-row] = true; // full column down at beginning of array
   		 			
   		 		}
   		 		step ++;
   		 	}
   		 		
   		 }
		
   	 	
		
		/*
		for (int row = 0; row < size; row++)
	     {
	         for (int col = 0; col < size; col++)
	         {
	        	 if (pattern == 1)
	        	 {
	        		 for (int i = 1; i <= size; i++)
	        		 {
	        			 for (int j = 0; j < size; j++)
	        			 {
	        				 array[j][size - i] = true;
	        			 }
	        		 }
	        		 
	        		 
	        		 
	        		 
	        	 }
	        	 
	         }
	         


	     }
	*/
		
		for (int col = 0; col < size; col++)
	     {
			System.out.print("\n ");
	         for (int row = 0; row < size; row++)
	         {
	        	 if (array[row][col] == true)
	        	 {
	        		 System.out.print("#");
	        	 }
	        	 else
	        	 {
	        		 System.out.print(" ");
	        	 }
	  
	         }
	     }
		/*
		 Pattern 1:
		 array[0][size - 1 (step)] = true; starts at top right
		 array[1][size - 1] = true;
		 array[2][size - 1] = true;
		 array[3][size - 1] = true;
		 
		 array[1][size - 2] = true;
		 array[2][size - 2] = true;
		 array[3][size - 2] = true;
		 
		 array[2][size - 3] = true;
		 array[3][size - 3] = true;
		 
		 array[3][size - 4] = true;
		 
		 Pattern 2:
		 array[0][size - 4 (step)] = true; starts at top left
		 array[1][size - 4] = true;
		 array[2][size - 4] = true;
		 array[3][size - 4] = true;
		 
		 array[1][size - 3] = true;
		 array[2][size - 3] = true;
		 array[3][size - 3] = true;
		 
		 array[2][size - 2] = true;
		 array[3][size - 2] = true;
		 
		 array[3][size - 1] = true;
		 
		 Pattern 3:
		 array[0][size - 1 (step)] = true;  starts at top right
		 array[0][size - 2] = true;
		 array[0][size - 3] = true;
		 array[0][size - 4] = true;
		 
		 array[1][size - 1] = true;
		 array[1][size - 2] = true;
		 array[1][size - 3] = true;
		 
		 array[2][size - 1] = true;
		 array[2][size - 2] = true;
		 
		 array[3][size - 1] = true;
		 
		 Pattern 4:
		 array[3][size - 1 (step)] = true; starts at bottom right
		 array[3][size - 2] = true;
		 array[3][size - 3] = true;
		 array[3][size - 4] = true;
		 
		 array[2][size - 1] = true;
		 array[2][size - 2] = true;
		 array[2][size - 3] = true;
		 
		 array[1][size - 1] = true;
		 array[1][size - 2] = true;
		 
		 array[0][size - 1] = true;
		 
		 
		 */

		
	}
}