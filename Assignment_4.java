package assignments;
//WAP on calling a multiple static method in main method 


public class Assignment_4 {
			
			static void add()
			{
				int a=2;
				int b=3;
				int sum=  a + b;
				System.out.println(sum);
			}
			static void sub()
			{
				int a=2;
				int b=3;
				int sub=  a - b;
				System.out.println(sub);
			}
			static void multiplication()
			{
				int a=2;
				int b=3;
				int mul=  a * b;
				System.out.println(mul);
			}
			static void div()
			{
				int a=9;
				int b=3;
				int div=  a / b;
				System.out.println(div);
			}

			public static void main(String[] args) 
			{
				add();
				sub();
				div();
				multiplication();	
			}

		
	

}
