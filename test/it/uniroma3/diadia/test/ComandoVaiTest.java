package it.uniroma3.diadia.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.comandi.*;
import it.uniroma3.diadia.ambienti.*;

class ComandoVaiTest {

	private Stanza s1;
	private Stanza s2;
	private Partita p;
	private Comando vai;




	@BeforeEach
	private void setup() {
		s1= new Stanza("aula n10");
		s2 = new Stanza("aula camspus");
		vai = new ComandoVai();
		p = new Partita();

	}


	@Test
	public void testEseguiNull() {
		p.getLabirinto().setStanzaCorrente(s1);
		vai.esegui(p);
		assertEquals(p, p.getLabirinto().getStanzaCorrente());	
	}

	@Test
	public void testEseguiEsistente() {
		p.getLabirinto().setStanzaCorrente(s1);
		s1.impostaStanzaAdiacente("nord", s2);
		vai.setParametro("nord");
		vai.esegui(p);
		assertEquals(s2,p.getLabirinto().getStanzaCorrente());
	}


	@Test
	public void testEseguiNonEsistente() {
		p.getLabirinto().setStanzaCorrente(s1);
		s1.impostaStanzaAdiacente("nord", s2);
		vai.setParametro("sud");
		vai.esegui(p);
		assertNotEquals(s2,p.getLabirinto().getStanzaCorrente());
	}

	
}

