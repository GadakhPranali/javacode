//WAP for calculating the area of rectangle

package assignments;
import java.io.InputStream;
import java.util.Scanner;
public class Assignment_12 {
	public static void main(String[] args) 
	{
//Formula for area of rectangle =L*B
		Scanner sc = new Scanner(System.in);
		int length, breadth,area;
		
		System.out.println("Enter the lenght of rectangle:" );
		length=sc.nextInt();
		System.out.println("Enter the breadth of rectangle:" );
		breadth=sc.nextInt();
		
		area = length*breadth;
		System.out.println("The area of rectangle is: " +area);	
	}


}
