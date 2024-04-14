package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

class LabirintoTest {

	private Labirinto labirinto;
	private Stanza stanzaIniziale;
	private Stanza stanzaVincente;
	private Partita partita;


	@BeforeEach
	public void setup() {

		this.partita = new Partita();
		this.stanzaIniziale = new Stanza("atrio");
		this.stanzaVincente = new Stanza("aula n11");
	}

	@Test
	public void testGetStanzaCorrenteIniziale() {
		Stanza atrio = new Stanza("Atrio");
		assertEquals(atrio.getNome(), this.labirinto.getStanzaIniziale().getNome());
	}

	@Test
	public void tesGetStanzaVincente() {
		Stanza biblioteca = new Stanza("Biblioteca");
		assertEquals(biblioteca.getNome(),this.labirinto.getStanzaVincente().getNome());
	}

}

