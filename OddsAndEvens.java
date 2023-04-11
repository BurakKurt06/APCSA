//Burak Kurt

import java.util.Scanner;
public class OddsAndEvens
{
	
	private static int countEm(int[] array, boolean odd)
	{
	int count = 0; 
	
	if (odd) 
	{

	for(int i = 0; i < array.length; i++)
	{
	if(array[i] % 2 == 1)
	{
	count++;
	}
	}	
	}
	else
	{
	
	for(int i = 0; i < array.length; i++)
	{
	if(array[i] % 2 == 0)
	{
	count++;
	}
	}
	}
	
	return count; 
	}
	public static int[] getAllEvens(int[] array)
	{

	int numEvens = countEm(array,false);

	int [] tempArray = new int[numEvens];

	
	int k = 0; 
	
	for (int i=0; i<array.length; i++)
	{
	if(array[i] % 2 == 0)
	{
	tempArray[k] = array[i];
	k++;
	}
	}

	return tempArray; 
	
	}

	public static int[] getAllOdds(int[] array)
	{

	int k = 0;
	int numOdds = countEm(array,true);
	int [] tempArray = new int[numOdds];
	
	for (int i=0; i<array.length; i++)
	{
	if(array[i] % 2 == 1)
	{
	tempArray[k] = array[i];
	k++;
	}
	}
	return tempArray; 
	}
}

