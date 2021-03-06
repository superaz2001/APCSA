package unit13;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number>0){
			number/=10;
			count+=1;
		}
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{	
		int j = getNumDigits(number);
		int[] sorted = new int[j];
		for(int i =0;i<j;i++){
			sorted[i]=number%10;
			number/=10;
		}
		Arrays.sort(sorted);

		return sorted;
	}
}