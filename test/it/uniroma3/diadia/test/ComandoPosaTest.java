package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoPosa;

class ComandoPosaTest {

	
	private Attrezzo spada;
	private Partita p;
	private Comando posa;
	
	@BeforeEach
	private void setup() {
		spada = new Attrezzo("spada",2);
		p = new Partita();
		posa = new ComandoPosa();	
	}
	
	
	
	@Test
	public void testAttrezzoPosato() {
		p.getGiocatore().getBorsa().addAttrezzo(spada);
		posa.setParametro("spada");
		posa.esegui(p);
		assertTrue(p.getLabirinto().getStanzaCorrente().hasAttrezzo("spada"));
	}

	@Test
	public void testAttrezzoNonPosato() {
		posa.setParametro("spada");
		posa.esegui(p);
		assertFalse(p.getLabirinto().getStanzaCorrente().hasAttrezzo("spada"));
	}
	
}
