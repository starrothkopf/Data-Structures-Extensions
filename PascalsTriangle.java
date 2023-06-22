package pascal;

import java.util.Scanner;

public class PascalsTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int N = scan.nextInt();
		
		int[][] triangle = new int[N][N];
		
		for (int col = 0; col < N; col++) // filling the array with the numbers of the triangle
	     {
	         for (int row = 0; row < N; row++)
	         {
	        	 if (col == 0 || row == col)
	        	 {
	        		 triangle[row][col] = 1;
	        	 }
	        	 else if (row < 0 || col < 0 || col > row)
	        	 {
	        		 triangle[row][col] = 0;
	        	 }
	        	 else
	        	 {
	        		 triangle[row][col] = (triangle[row - 1][col] + triangle[row - 1][col - 1]);
	        	 }
	        	 
	         }
	     }
		
		System.out.println("         column");
		System.out.print("         ");
		
		for (int col = 0; col < N; col++)
		{
			System.out.print(col + "   ");
		}
		
		System.out.print("\n ");
		System.out.print("row");
		
		for (int col = 0; col < N; col++) // printing the triangle
	     {
			System.out.print("\n ");
			if (col > 9) {
				System.out.print(col + "      ");
			}
			else {
				System.out.print(col + "       ");
			}
			for (int row = 0; row < N ; row++)
	         {
				if (triangle[col][row] != 0) 
	        	 {
	        		 if (triangle[col][row] <= 9) {
	        			 System.out.print(triangle[col][row] + "   ");
	        		 }
	        		 else if (triangle[col][row] > 9 && triangle[col][row] < 100) {
	        			 System.out.print(triangle[col][row] + "  ");
	        		 }
	        		else {
		        			 System.out.print(triangle[col][row] + " ");
	        		}
	        	 }
	 
	        		 
	         }

		 
	}
	}
}
