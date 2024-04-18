package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;
import it.uniroma3.diadia.*;

class PartitaTest {

	private Partita partita;
	private Giocatore giocatore;
	private Stanza stanzaCorrente;
	private Labirinto labirinto;

	@BeforeEach
	public void setUp () {
		this.partita = new Partita();
		this.giocatore = new Giocatore ();
		this.stanzaCorrente = new Stanza("Aula Campus");
		this.labirinto = new Labirinto();

		//giocatore.setCfu(-5);
		partita.setGiocatore(giocatore);
		partita.getLabirinto().setStanzaCorrente(stanzaCorrente);
	}


	@Test
	public void testIsFinita() {
		assertFalse(this.partita.isFinita());
	}

	@Test
	public void testSetStanzaCorrente() {
		assertEquals(stanzaCorrente, partita.getLabirinto().getStanzaCorrente());
	}

	@Test
	public void testSetGiocatore() {
		assertEquals(giocatore, partita.getGiocatore());
	}
	
	@Test
	public void  testSetLabirinto() {
		partita.setLabirinto(labirinto);
		assertEquals(labirinto, partita.getLabirinto());
	}
}