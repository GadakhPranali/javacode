package assignments;
//Assignmnet 44Create a array of size of 5 and just check 34 is present in array or not
public class Assignment44_chkarray 
{

	public static void main(String[] args) 
	{
		 int intArray[] = new int[5];
		    intArray[0] = 32;
			intArray[1] = 33;
			intArray[2] = 36;
			intArray[3] = 37;
			intArray[4] = 34;
			int value = 34;
			
			for(int i=0; i<intArray.length; i++)
			{
				if(value==intArray[i])
				{
					System.out.println("Given no. "+ value+ " is present in Array");
				}
							}
			
		

	}
	

}
