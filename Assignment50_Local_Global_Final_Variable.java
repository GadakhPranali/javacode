package assignments;

public class Assignment50_Local_Global_Final_Variable 
{
		final String s1 = "Automation Testing"; // final variable
		char a = 'P';// Global variable
		static double r = 14.5; // Static Global variable
	
		
		void m2()
		{
			System.out.println(this.r);
			a='f';
		
		}
		public static void main(String[] args) 
		{
			float x = 3.124f; // local variable
			
			Assignment50_Local_Global_Final_Variable v1= new Assignment50_Local_Global_Final_Variable();
			
			System.out.println("Final Variable - "+ v1.s1);
			System.out.println("Global Variable - "+ v1.a);
			System.out.println("Static Gloabal Variable - "+ r);
			System.out.println("Local Variable - "+ x);

	}

}
