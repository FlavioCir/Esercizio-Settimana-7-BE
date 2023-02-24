package it.epicode.flaviocirillo.models;

public class Sonda {

	private int idSonda;
	private long latitudine;
	private long longitudine;
	private int livelloFumo;

	public Sonda(int idSonda, long latitudine, long longitudine, int livelloFumo) {
		super();
		this.idSonda = idSonda;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.livelloFumo = livelloFumo;
	}

	public int getIdSonda() {
		return idSonda;
	}

	public void setIdSonda(int idSonda) {
		this.idSonda = idSonda;
	}

	public long getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(long latitudine) {
		this.latitudine = latitudine;
	}

	public long getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(long longitudine) {
		this.longitudine = longitudine;
	}

	public int getLivelloFumo() {
		return livelloFumo;
	}

	public void setLivelloFumo(int livelloFumo) {
		this.livelloFumo = livelloFumo;
	}

	@Override
	public String toString() {
		return "- SONDA: " + this.idSonda + " | Latitudine: " + this.latitudine + " | Longitudine: " + this.longitudine + " | Livello Fumo: " + this.livelloFumo;
	}
	
}
