package assignments;

import java.util.Scanner;

public class Assiignment_14
{

	public static void main(String[] args) 
	{
		// Formula for Area of triangle: Area = (height×base)/2
		
		Scanner sc = new Scanner (System.in);
		int height,base;
		float area;
		System.out.println("Enter the height of traingle:");
		height=sc.nextInt();
		System.out.println("Enter the base of traingle:");
		base=sc.nextInt();
		area = height*base/2;
		System.out.println("Area of traingle is:" +area);
		
		
	}

}
