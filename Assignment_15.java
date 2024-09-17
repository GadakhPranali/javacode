
package assignments;

import java.util.Scanner;
//Assignment 15:  WAP for calculating the area of trapezium

public class Assignment_15 
{
	public static void main(String[] args)
	{
		//formula  double area_of_trapezium = ((base_1 + base_2) * height) / 2;
		Scanner sc= new Scanner (System.in);
		double base1,base2,height;
		double area;
		
		System.out.println("Enter the base1");
		base1=sc.nextInt();
		System.out.println("Enter the base2");
		base2=sc.nextInt();
		System.out.println("Enter the height");
		height=sc.nextInt();
		area = ((base1 + base2) * height) / 2;
		System.out.println("Area of trapezium is:"+area);
		
		
	}

}
