package assignments;
//Assignment 22:WAP Check if main method can be overloaded by making sure other 
public class Assignment_22 
{
	public static void main(int number) 
	{
        System.out.println("Overloaded main method with int parameteR-->" + number);
    }

    public static void main(String text) 
    {
        System.out.println("Overloaded main method with String parameter--> " + text);
    }
		
	
	public static void main(String[] args) 
	{
System.out.println("Standered main method");
main(10);
main("PRANALI");

	}

}
