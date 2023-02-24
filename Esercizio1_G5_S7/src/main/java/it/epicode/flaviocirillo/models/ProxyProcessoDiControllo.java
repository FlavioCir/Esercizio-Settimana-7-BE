package it.epicode.flaviocirillo.models;

import java.util.List;

public class ProxyProcessoDiControllo implements ProcessoDiControllo {

	private CentroDiControllo ca;

	public ProxyProcessoDiControllo() {
		ca = new CentroDiControllo();
	}
	
	@Override
	public void comunicazioneAllarme(List<Sonda> s) {

		for(int i = 0; i < s.size(); i++) {
			Sonda sonda = s.get(i);
			
			if(sonda.getLivelloFumo() > 5) {
				ca.comunicazioni(sonda);
			} else {
				System.out.println("La sonda numero: " + sonda.getIdSonda() + " NON ha rilevato una presenza di fumo elevata!");
				System.out.println("--------------------------------------");
			}
			
		}
		
	}
	
	public CentroDiControllo getCentroDiControllo() {
		return ca;
	}
	
}
