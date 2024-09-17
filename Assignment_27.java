package assignments;
//"Assignment 27: Print [2,4,6,8,10] array in reverse order in new array

public class Assignment_27 
{

	public static void main(String[] args)
	{
		 int [] arr = new int [] {2,4,6,8,10};  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++)
	        {  
	            System.out.print(arr[i] + " ");  
            }
	        System.out.println("Array in reverse order: ");  
	        
	        
	        for (int i = arr.length-1; i >= 0; i--)
	        {  
	            System.out.print(arr[i] + ", ");  
	        }
	}
}