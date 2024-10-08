package assignments;

import java.util.Arrays;

public class Assignment34_anagram
{

	public static void main(String[] args)
	{
		String str1 = "ram";
		String str2 = "arms";
		char str1_array[] = str1.toCharArray();
		char str2_array[] = str2.toCharArray();
		
		Arrays.sort(str1_array);
		Arrays.sort(str2_array);
		
		if(Arrays.equals(str1_array, str2_array))
		{
			System.out.println("Are anagram of each other");
		}
		else
		{
			System.out.println("Not anagram of each other");
		}
		

	}
}









