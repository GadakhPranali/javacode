package assignments;

import java.util.Date;

public class Assignment38_futuretime 
{

	public static void main(String[] args)
	{
Date d1= new Date();
Date futuretime =new Date(d1.getTime()+1000*60*60*24*1);
System.out.println("Future time is:"+futuretime);
	}

}
