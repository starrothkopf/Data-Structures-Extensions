package sortanalysis;

import java.util.Scanner;

public class DataSortingAndAnalysis {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		boolean validInput = false;
		int size = 0;
		
		while (!validInput)
		{
			System.out.println("Collection size: ");
			size = scan.nextInt();
			
			if (size < 0)
			{
				System.out.println("Please input a size of at least 0.");
			}
			else
			{
				validInput = true;
			}
			
		}
		
		int[] array = new int[size];
		
		for (int i = 0; i < size; i ++)
		{
			System.out.println("Input value at index " + i + ": ");
			array[i] = scan.nextInt();
		}
		
		System.out.print("Input: ");
		for (int i = 0; i < size; i++)
		{
			System.out.print(array[i] + " ");
		
		}
		
		
		for (int minimumIndex = 0; minimumIndex < size; minimumIndex++) // create variable for minimum index
		{
			
			for (int j = minimumIndex; j <= size - 1; j++)
			{
				if (array[j] < array[minimumIndex]) // if current variable is less than variable at minimum index
				{
					
					int storage = array[minimumIndex]; // switch
					array[minimumIndex] = array[j];
					array[j] = storage;
				
				}
			}
		}
		
		
		System.out.print("\nSorted: ");
		for (int i = 0; i < size; i++)
		{
			System.out.print(array[i] + " ");
		
		}
		
		int totalSum = 0;
		
		for (int i = 0; i < size; i++)
		{
			totalSum = totalSum + array[i];
		
		}
		
		System.out.println("\nMean: " + (double) totalSum / size);
		
		double median = 0;
		if (size % 2 == 0) { // if even
			median = ( array[(size / 2) - 1] + array[(size / 2)]) / 2.0;
		}
		else {
			median = array[(size / 2)];
		}
		
		System.out.println("Median: " + median);
		
		System.out.println("Min: " + array[0]);
		System.out.println("Max: " + array[size - 1]);
		
		System.out.println("Range: " + (array[size - 1] - array[0]));
		
		
		
	}
}
