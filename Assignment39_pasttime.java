package assignments;
// Find past date
import java.util.Date;

public class Assignment39_pasttime 
{

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		Date presentDate = new Date(d1.getTime());
		Date PastDate = new Date(d1.getTime()-(1000*60*60*24*2));
		System.out.println("Present Date - "+presentDate);
		System.out.println("Past Date - "+PastDate);

	}

}

