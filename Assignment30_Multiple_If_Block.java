package assignments;

import java.util.Scanner;

public class Assignment30_Multiple_If_Block 
{

	public static void main(String[] args)
	{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the age: ");
int age= sc.nextInt();

if(age>=18)
{
	System.out.println("Eligible for voting");
}
if(age<18)
{
	System.out.println("Not eligible for voting");
	
}
	}

}
