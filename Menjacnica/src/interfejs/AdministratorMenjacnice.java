package interfejs;

import java.util.GregorianCalendar;

import valuta.Valuta;
import valuta.Valuta.Kurs;
import valuta.Valuta;
public class AdministratorMenjacnice implements RadSaMenjacnicom
{

	@Override
	public void ubaci_kurs(Valuta valuta, GregorianCalendar datum, double prodajni, double kupovni, double srednji)
	{
<<<<<<< HEAD
		GregorianCalendar datum1 = new GregorianCalendar();
		valuta.ubaciKurs(datum1, prodajni, kupovni, srednji);
=======
		valuta.ubaciKurs(datum, prodajni, kupovni, srednji);

>>>>>>> refs/heads/implementacijainterfejsa
	}

	@Override
	public void obrisi_kurs(Valuta valuta, GregorianCalendar datum)
	{
		for (int i=0;i<valuta.kursevi.size();i++){
			Kurs k = valuta.kursevi.get(i);
			
			if (k.datum.equals(datum)){
				valuta.kursevi.remove(k);
			}
		}

	}

	@Override
	public Kurs vrati_kurs(Valuta valuta, GregorianCalendar datum)
	{
		for (int i=0;i<valuta.kursevi.size();i++){
			Kurs k = valuta.kursevi.get(i);
			
			if (k.datum.equals(datum)){
				return k;
			}
		}
		throw new RuntimeException("Trazeni kurs nije pronadjen.");
	}

}
