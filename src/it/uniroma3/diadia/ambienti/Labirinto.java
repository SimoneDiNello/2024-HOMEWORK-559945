package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;

import it.uniroma3.diadia.Partita;

/**
 * Classe che gestice il labirinto
 * @see Stanza
 * @author docente di POO & matricola 559945
 * @version v0.1
 * 
 */

public class Labirinto {

	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	private Partita partita;

	public Labirinto() {
		this.partita = partita;
		this.creaStanze();
	}


	/**Getter e Setter per i parametri di Labirinto
	 * @param stanzaIniziale
	 * @param stanzaVincente
	 * @param Partita
	 * @return
	 */

	public Stanza getStanzaCorrente() {
		return stanzaCorrente;
	}


	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}


	public Stanza getStanzaVincente() {
		return stanzaVincente;
	}


	public void setStanzaVincente(Stanza stanzaVincente) {
		this.stanzaVincente = stanzaVincente;
	}


	public Partita getPartita() {
		return partita;
	}


	public void setPartita(Partita partita) {
		this.partita = partita;
	}


	/**Inizializza un Labirinto
     * Crea tutte le stanze e le porte di collegamento
     * Inserisce oggetti in alcune stanze predefinite
     */

    private void creaStanze() {

		/* crea gli attrezzi */
    	Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo osso = new Attrezzo("osso",1);

		/* crea stanze del labirinto */
		Stanza atrio = new Stanza("Atrio");
		Stanza aulaN11 = new Stanza("Aula N11");
		Stanza aulaN10 = new Stanza("Aula N10");
		Stanza laboratorio = new Stanza("Laboratorio Campus");
		Stanza biblioteca = new Stanza("Biblioteca");

		/* collega le stanze */
		atrio.impostaStanzaAdiacente("nord", biblioteca);
		atrio.impostaStanzaAdiacente("est", aulaN11);
		atrio.impostaStanzaAdiacente("sud", aulaN10);
		atrio.impostaStanzaAdiacente("ovest", laboratorio);
		aulaN11.impostaStanzaAdiacente("est", laboratorio);
		aulaN11.impostaStanzaAdiacente("ovest", atrio);
		aulaN10.impostaStanzaAdiacente("nord", atrio);
		aulaN10.impostaStanzaAdiacente("est", aulaN11);
		aulaN10.impostaStanzaAdiacente("ovest", laboratorio);
		laboratorio.impostaStanzaAdiacente("est", atrio);
		laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
		biblioteca.impostaStanzaAdiacente("sud", atrio);

        /* pone gli attrezzi nelle stanze */
		aulaN10.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);

		// il gioco comincia nell'atrio
        stanzaCorrente = atrio;  
		stanzaVincente = biblioteca;
    }
}