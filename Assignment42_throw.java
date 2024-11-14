package assignments;

import java.util.InputMismatchException;

public class Assignment42_throw
{
	

	public static void main(String[] args)  throws NullPointerException,InputMismatchException
	{
		
		if(11==11)
		{
		throw new InputMismatchException ("InputMismatchException");
		}
		else
		{
			throw new NullPointerException("NullPointerException");
		}
		
		
	}

	
	

}
