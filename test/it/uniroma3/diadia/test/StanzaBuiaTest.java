package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.StanzaBuia;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaBuiaTest {

	private StanzaBuia stanza;
	private Attrezzo torcia;
	
	@BeforeEach
	public void setUp() throws Exception {
		stanza = new StanzaBuia("StanzaBuia", "torcia");
		torcia = new Attrezzo("torcia", 2);
	}

	
	@Test
	public void testGetDescrizioneConAttrezzo() {
		stanza.addAttrezzo(torcia);
		assertEquals(stanza.toString(), stanza.getDescrizione());
	}
	
	@Test
	public void testGetDescrizioneSenzaAttrezzo() {
		String x = "qui c'è un buio pesto";
		assertEquals(x, stanza.getDescrizione());
	}
}
