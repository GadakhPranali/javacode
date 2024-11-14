package assignments;
//Assignment 48 WAP of Method Overloading
public class Assignment48_Method_Overloading 
{
		static void m1()
		{
			System.out.println("Non Parameterized method m1");
		}
		static void m2(int a)
		{
			System.out.println("Parameterized method m2- "+a);
		}
		void m3(String s)
		{
			System.out.println("Parameterized method m3 - "+s);
		}

		public static void main(String[] args) 
		{
			m1();
			m2(4);
			Assignment48_Method_Overloading M1 = new Assignment48_Method_Overloading();
			M1.m3("HI MKT");
	}

}
