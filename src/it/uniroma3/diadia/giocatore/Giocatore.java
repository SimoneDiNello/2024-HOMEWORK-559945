package it.uniroma3.diadia.giocatore;

public class Giocatore {
	private final static int CFU_INIZIALI_DEFAULT = 20;
	private int cfu;
	private Borsa borsa;

	public Giocatore() {
		this.borsa = new Borsa();
		this.cfu = CFU_INIZIALI_DEFAULT;
	}

	public int getCfu() {
		return cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;
	}

	public Borsa getBorsa() {
		return borsa;
	}

	public void setBorsa(Borsa borsa) {
		this.borsa = borsa;
	}
	
}

