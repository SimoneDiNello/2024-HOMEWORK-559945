package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.*;

class LabirintoTest {

	private Labirinto labirinto;
	private Stanza atrio;
	private Stanza biblioteca;
	private Partita partita;


	@BeforeEach
	public void setup() {
		labirinto = new Labirinto();
		this.partita = new Partita();
		this.atrio = new Stanza("atrio");
		this.biblioteca = new Stanza("Biblioteca");
	}

	@Test
	public void testSetStanzaCorrenteIniziale() {
		labirinto.setStanzaCorrente(atrio);
		assertEquals(atrio.getNome(), this.labirinto.getStanzaCorrente().getNome());
	}

	@Test
	public void tesGetStanzaVincente() {
		
		assertEquals("Biblioteca",this.labirinto.getStanzaVincente().getNome());
	}
	
	
	@Test
	public void testGetStanzaAdiacente() {
		biblioteca.impostaStanzaAdiacente("sud", atrio);
		assertEquals(atrio, biblioteca.getStanzaAdiacente("sud"));
	}

}
