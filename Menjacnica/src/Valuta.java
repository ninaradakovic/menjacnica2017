import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Valuta
{
	private String naziv;
	private String skracenica;
	
	private static class Kurs{
		GregorianCalendar datum;
		double prodajni;
		double kupovni;
		double srednji;
		
		public Kurs(GregorianCalendar datum, double prodajni, double kupovni ,double srednji){
			this.kupovni=kupovni;
			this.prodajni=prodajni;
			this.srednji=srednji;
			this.datum=datum;
		}

		@Override
		public String toString()
		{
			return "Kurs [prodajni=" + prodajni + ", kupovni=" + kupovni + ", srednji=" + srednji
					+ "]";
		}
		
		
	}
	
	private LinkedList<Kurs> kursevi = new LinkedList<>();
	
	public Valuta(String naziv, String skracenica){
		this.naziv=naziv;
		this.skracenica=skracenica;
	}
	
	public void ubaciKurs(GregorianCalendar datum, double prodajni, double kupovni ,double srednji){
		Kurs novi = new Kurs(datum, prodajni, kupovni ,srednji);
		kursevi.add(novi);
		
	}

	public String getNaziv()
	{
		return naziv;
	}

	public void setNaziv(String naziv)
	{
		this.naziv = naziv;
	}

	public String getSkracenica()
	{
		return skracenica;
	}

	public void setSkracenica(String skracenica)
	{
		this.skracenica = skracenica;
	}
	
	public Kurs getKurs(GregorianCalendar datum){
		
		for (int i=0;i<kursevi.size();i++){
			Kurs k = kursevi.get(i);
			if (k.datum.compareTo(datum) == 0){
				return k;
			}
		}
		
		throw new RuntimeException("Pogresan datum je unet.");
	}

	@Override
	public String toString()
	{
		return "Valuta [naziv=" + naziv + ", skracenica=" + skracenica + ", kursevi=" + kursevi + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kursevi == null)
		{
			if (other.kursevi != null)
				return false;
		} else if (!kursevi.equals(other.kursevi))
			return false;
		if (naziv == null)
		{
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skracenica == null)
		{
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		return true;
	}
	
	
	
}
