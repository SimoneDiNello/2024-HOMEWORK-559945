package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoPrendi;

class ComandoPrendiTest {

	private Partita p;
	private Attrezzo attrezzo;
	private Attrezzo attrezzoPesante;
	private Attrezzo attrezzoNull;
	private Comando prendi;
	
	@BeforeEach
	
	public void setUp() throws Exception {
		p = new Partita();
		attrezzo = new Attrezzo("osso", 2);
		attrezzoPesante = new Attrezzo("martello", 11);
		attrezzoNull = null;
		prendi = new ComandoPrendi();
	}
	
	@Test
	public void testAttrezzoPreso() {
		p.getLabirinto().getStanzaCorrente().addAttrezzo(attrezzo);
		prendi.setParametro("osso");
		prendi.esegui(p);
		assertFalse(p.getLabirinto().getStanzaCorrente().hasAttrezzo("osso"));
	}
	@Test
	public void testAttrezzoNonPresente() {
		prendi.setParametro("osso");
		prendi.esegui(p);
		assertFalse(p.getLabirinto().getStanzaCorrente().hasAttrezzo("osso"));
	}
	
	@Test
	public void testAttrezzoPesante() {
		p.getLabirinto().getStanzaCorrente().addAttrezzo(attrezzoPesante);
		prendi.setParametro("martello");
		prendi.esegui(p);
		assertTrue(p.getLabirinto().getStanzaCorrente().hasAttrezzo("martello"));
	}
	

}
