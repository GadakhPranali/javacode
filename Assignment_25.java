package assignments;

import java.util.Arrays;

//Assignment 25: Compare two arrays of Char datatype
public class Assignment_25
{

	public static void main(String[] args) 
	{
        char[] charArray = new char[3]; 
        charArray[0] = 'A';
        charArray[1] = 'B';
        charArray[2] = 'C';
        
        char[] charArray1 = new char[3]; 
        charArray1[0] = 'A';
        charArray1[1] = 'B';
        charArray1[2] = 'C';
        if (Arrays.equals(charArray, charArray1))
         
            System.out.println("Both array are Same");
        else
          
            System.out.println("Both array are not same");
    }
 }

	


