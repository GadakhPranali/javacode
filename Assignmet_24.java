package assignments;
//Assignment 24:To create array problem on double, char and boolean data type.

public class Assignmet_24
{
	public static void main(String[] args) 
	{
        // Array of double values
        double[] doubleArray = new double[3]; 
        doubleArray[0] = 10.5;
        doubleArray[1] = 20.75;
        doubleArray[2] = 30.0;
        System.out.println("Double Array:");
        for (int i = 0; i < doubleArray.length; i++) 
        {
            System.out.println("Element of doule array is  " + i + " : " + doubleArray[i]);
        }
       
       // Array of char values
        char[] charArray = new char[3]; // Initialize an array of size 4
        charArray[0] = 'A';
        charArray[1] = 'B';
        charArray[2] = 'C';
        System.out.println("\nChar Array:");
        for (int i = 0; i < charArray.length; i++)
        {
            System.out.println("Element of char array is  " + i + " : " + charArray[i]);
        }
       
        // Array of boolean values
        boolean[] booleanArray = new boolean[3]; // Initialize an array of size 3
        booleanArray[0] = true;
        booleanArray[1] = false;
        booleanArray[2] = true;
        System.out.println("\nBoolean Array:");
        for (int i = 0; i < booleanArray.length; i++)
        {
                System.out.println("Element of char array is  " + i + " : " + booleanArray[i]);

        }
    }
}