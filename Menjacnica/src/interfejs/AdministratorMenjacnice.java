package interfejs;

import java.util.GregorianCalendar;

import valuta.Valuta;
import valuta.Valuta.Kurs;

public class AdministratorMenjacnice implements RadSaMenjacnicom
{

	@Override
	public void ubaci_kurs(Valuta valuta, GregorianCalendar datum, double prodajni, double kupovni, double srednji)
	{
		GregorianCalendar datum1 = new GregorianCalendar();
		valuta.ubaciKurs(datum1, prodajni, kupovni, srednji);
	}

	@Override
	public void obrisi_kurs(Valuta valuta, GregorianCalendar datum)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs vrati_kurs(Valuta valuta, GregorianCalendar datum)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
