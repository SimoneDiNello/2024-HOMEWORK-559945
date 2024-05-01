package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.ambienti.StanzaBloccata;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaBloccataTest {
	private StanzaBloccata bloccata;
	private Stanza stanza;
	private Attrezzo attrezzo;

	@BeforeEach
	public void setUp() throws Exception {
		bloccata = new StanzaBloccata("StanzaBloccata", "nord", "grimaldello");
		stanza = new Stanza("Stanza");
		attrezzo = new Attrezzo("chiave", 1);
		bloccata.impostaStanzaAdiacente("nord", stanza);

	}

	@Test
	public void testGetStanzaAdiacenteDirezioneBloccata() {
		assertEquals(bloccata, bloccata.getStanzaAdiacente("nord"));
	}

	@Test
	public void testGetStanzaAdiacenteDirezioneSbloccata() {
		bloccata.addAttrezzo(attrezzo);
		assertEquals(stanza, bloccata.getStanzaAdiacente("nord"));

	}

	@Test
	public void testGetDescrizioneDirezioneSbloccata() {
		bloccata.addAttrezzo(attrezzo);
		assertEquals(bloccata.toString(), bloccata.getDescrizione());
	}

	@Test
	public void testGetDescrizioneDirezioneBloccata() {
		String x = "Stanza bloccata nella direzione: nord"+"\nPrendi la chiave e posala nella stanza";
		assertEquals(x, bloccata.getDescrizione());

	}

}
