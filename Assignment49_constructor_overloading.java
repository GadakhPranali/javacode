package assignments;

public class Assignment49_constructor_overloading 
{
	Assignment49_constructor_overloading()
	{
		System.out.println("No para constructor");
	}
	Assignment49_constructor_overloading(int a)
	{
		System.out.println("para constructor  "  +a);

	}
	Assignment49_constructor_overloading(String a)
	{
		System.out.println("para constructor  "  +a);

	}
	public static void main(String[] args)
	{
new Assignment49_constructor_overloading();
new Assignment49_constructor_overloading(10);
new Assignment49_constructor_overloading("Panu");



	}

}
