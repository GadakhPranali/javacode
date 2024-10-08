package assignments;

public class Assignment32_Reverse 
{

	public static void main(String[] args) 
	{
		String input="Testing";
		String output="";
		
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char reverse=input.charAt(i);
			output=output+reverse;
		}		
		
		System.out.println("The reverse string is:"+output);
	}

}
