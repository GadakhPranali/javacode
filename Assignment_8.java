package assignments;
//Assignment 8: WAP for a class to have a static and no static method in Java 
public class Assignment_8 
{

	static void add()
	{
		int a=2;
		int b=3;
		int sum=  a + b;
		System.out.println(sum);
	}
	public void m1()
	{
		System.out.println("Instance method.......");
	}

	public static void main(String[] args) 
	{
       add();
       Assignment_8 a1 =  new Assignment_8();
       a1.m1();
       
	}
}
