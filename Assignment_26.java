package assignments;

import java.util.Arrays;

//Assignment 26 : Compare two arrays of String datatype"
public class Assignment_26 
{

	public static void main(String[] args)
	{
		String[] stringArray = new String[3]; 
		stringArray[0] = "HI";
		stringArray[1] = "PRANALI";
		stringArray[2] = "TESTING";
		
		String[] stringArray1 = new String[3]; 
		stringArray1[0] = "HI";
		stringArray1[1] = "PRANALI";
		stringArray1[2] = "TESTING";
		if (Arrays.equals(stringArray, stringArray1))
		{
            System.out.println("Both array are Same");

		}     
        else 
        {
            System.out.println("Both array are not same");

        }
          
    }

}
