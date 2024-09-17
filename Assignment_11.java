

//WAP for calculating the area of circle

package assignments;

import java.util.Scanner;

public class Assignment_11 {

	public static void main(String[] args) 
	{
		// Formula for Area of circle = pi * r * r; 
				Scanner sc= new Scanner(System.in);
				int r; 
				double pi = 3.14, area; 
				System.out.print("Enter radius of circle:"); 
				r = sc.nextInt(); 
				area = pi * r * r; 
				System.out.println("Area of circle:"+area);

	}

}
