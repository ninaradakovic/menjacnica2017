package interfejs;

import java.util.GregorianCalendar;
import valuta.Valuta;
import valuta.Valuta.Kurs;
public interface RadSaMenjacnicom
{
	public void ubaci_kurs(Valuta valuta, GregorianCalendar datum, double prodajni, double kupovni ,double srednji);
	
	public void obrisi_kurs(Valuta valuta, GregorianCalendar datum);
	
	public Kurs vrati_kurs(Valuta valuta, GregorianCalendar datum);
}
