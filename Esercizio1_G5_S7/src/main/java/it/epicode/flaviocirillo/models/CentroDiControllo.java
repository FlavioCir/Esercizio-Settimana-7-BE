package it.epicode.flaviocirillo.models;

public class CentroDiControllo {
	
	private int numeroComunicazioni = 0;

	public void comunicazioni(Sonda s) {

		String url = String.format("http://host/alarm?=idsonda=%d&lat=%d&lon=%d&smokelevel=%d", s.getIdSonda(),
				s.getLatitudine(), s.getLongitudine(), s.getLivelloFumo());

		System.out.println("URL SONDA IN ALLARME: " + url);
		System.out.println("La sonda numero: " + s.getIdSonda() + " ha rilevato una presenza di fumo elevata!");
		System.out.println("--------------------------------------");
		
		numeroComunicazioni++;

	}
	
	public int getNumComunicazioni() {
		return numeroComunicazioni;
	}
	
}
