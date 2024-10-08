package assignments;

public class Assignment33_Palindrome
{

	public static void main(String[] args) 
	
	{
String input="malayalam";
String output="";
for(int i=input.length()-1;i>=0;i--)
{
	char reverse=input.charAt(i);
	output=output+reverse;
	
}

	if(input.equals(output))
	{
		System.out.println("Is a palindrome");
	}
	else
	{
	System.out.println("Is a not palindrome");	
	}
	
}

	

}
