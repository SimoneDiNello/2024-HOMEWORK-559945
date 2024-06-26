package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

class PartitaTest {

	private Partita partita;
	private Giocatore giocatore;
	private Stanza stanzaCorrente;
	
	@BeforeEach
	public void setUp () {
		this.partita = new Partita();
		this.giocatore = new Giocatore ();
		this.stanzaCorrente = new Stanza("Aula Campus");
		
		giocatore.setCfu(-5);
		partita.setGiocatore(giocatore);
		partita.setStanzaCorrente(stanzaCorrente);
	}
	
	
	@Test
	public void testIsFinita() {
		assertTrue(this.partita.isFinita());
	}
	
	@Test
	public void testSetStanzaCorrente() {
		assertEquals(stanzaCorrente, partita.getStanzaCorrente());
	}

	@Test
	public void testSetGiocatore() {
		assertEquals(giocatore, partita.getGiocatore());
	}
}
