package assignments;
//Assignment 31In the given String Ex;-"My Name is Java"remove all spacese involved using ReplaceAll function
public class Assignment31_Remove_Spaces_from_String 
{

	public static void main(String[] args) 
	{
       String str ="My Name is Java";
       System.out.println("The given string is :"+str);
	   String str1= str.replaceAll(" ", "");
       //String str1= str.replaceAll("Java", "Selenium");
	   System.out.println("Removing of all spaces string is  :"+str1);

	}

}
