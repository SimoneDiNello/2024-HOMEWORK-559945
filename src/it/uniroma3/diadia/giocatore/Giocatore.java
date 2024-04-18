package it.uniroma3.diadia.giocatore;


/**
 * Classe che modella e gestisce un giocatore 
 * Un giocatore può spostarsi tra le stanze e
 * interaggire con esse ve gli oggetti al loro interno.
 * @author docente di POO & matricola 559945
 * @see Borsa
 * @version v0.1
 * 
 */
public class Giocatore {
	private final static int CFU_INIZIALI_DEFAULT = 20;
	private int cfu;
	private Borsa borsa;

	public Giocatore() {
		this.borsa = new Borsa();
		this.cfu = CFU_INIZIALI_DEFAULT;
	}

	public int getCfu() {
		return this.cfu;
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
	
	public String toString() {
		return "CFU: " + this.getCfu();
	}
	

}