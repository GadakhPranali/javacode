package assignments;

public class Assignment_7 {

	public static void main(String[] args)
	{
		
		 int age=37;
		 char gender='m';

		 
		 if(gender=='f')
		 {
		  System.out.println("female free travel");
		  
		 }//end of IF
		 else
			 
		 {// else begin
			 
		  if((age<=2)|| (age>=60))
		  {
		   System.out.println("infant free ticket");
		  }
		  
		  else if((age>2) && (age<=12))
		  {
		   System.out.println("half ticket");
		  }
		  else
		  {
		   System.out.println("full ticket"); 
		  }
		  
		  
	  }//end of else
	}

}
