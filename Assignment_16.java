package assignments;

import java.util.Scanner;

//Assignment 16:  WAP for calculating the circumference of circle

public class Assignment_16 {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
//Formula for  circumference of circle  = 2*pi*r
int r;
double pi=3.14,circumference;
System.out.println("Enter the radius of circle-->");
r=sc.nextInt();
circumference=2*pi*r;
System.out.println("The circumference of circle is-->"+circumference);



	}

}
