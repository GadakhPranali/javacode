package assignments;

import java.util.Scanner;

//Assignment 17: WAP for calculating the circumference of rectangle
public class Assinment_17
{

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
//Formula for  circumference of rectangle = 2(L+B)
int length,breadth;
double circumference;
System.out.println("Enter the length-->");
length=sc.nextInt();
System.out.println("Enter the breadth-->");
breadth=sc.nextInt();

circumference=2*(length+breadth);
System.out.println("Circumference of rectangle is-->   "+circumference);
	}

}
