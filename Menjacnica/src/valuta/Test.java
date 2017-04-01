package valuta;
import java.util.GregorianCalendar;

public class Test
{

	public static void main(String[] args)
	{
		Valuta v = new Valuta("euro","EUR");
		GregorianCalendar gc = new GregorianCalendar();
		try
		{
			v.ubaciKurs(gc, 100, 120, 110);
			System.out.println(v.getKurs(gc));
		} catch (Exception e)
			
		{
			System.out.println(e.getMessage());
		}
	}

}
