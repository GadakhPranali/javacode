package assignments;
//Assignment 23 : Find out Area of 10 Circles where for every circle radius come from math.random
public class Assignment_23 
{
final static double pi=Math.PI;

		public static void main(String[] args) 
		{
			
			for(int i = 0;i<10;i++)
			{
	double r= Math.random();
	System.out.println("The value of r is" +r);
	double area= pi*r*r;
	System.out.println(area);
			}
			
		}	

}
