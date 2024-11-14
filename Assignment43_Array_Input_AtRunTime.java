package assignments;

import java.util.Arrays;
import java.util.Scanner;

//Assignment 43 - Write program Accept the value of yout array at the runtime , if it is of int datatype size os 4



public class Assignment43_Array_Input_AtRunTime
{

	public static void main(String[] args)
	{
		
        int intArray[] = new int[4];
		
		for(int i=0; i<intArray.length; i++)
		{
			System.out.println("Enter int value at index - "+i);
			Scanner s1 = new Scanner(System.in);
			intArray[i] = s1.nextInt();
		}
		System.out.println("Final Array - "+Arrays.toString(intArray));


	}

}
