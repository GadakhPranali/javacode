
//WAP for area of square
package assignments;

import java.io.InputStream;
import java.util.Scanner;

public class Assignment_13 
{

	public static void main(String[] args)
	{
//Formula for area of square=a*a
		Scanner sc = new Scanner(System.in);
		int length;
		int area;
		System.out.println("Enter th lenght of square:");
		
		length=sc.nextInt();
		area=length*length;
		System.out.println("The area of square is:" +area);
		
	}

	

}
