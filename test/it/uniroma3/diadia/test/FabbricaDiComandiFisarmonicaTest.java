package it.uniroma3.diadia.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoFine;
import it.uniroma3.diadia.comandi.ComandoNonValido;
import it.uniroma3.diadia.comandi.ComandoVai;
import it.uniroma3.diadia.comandi.FabbricaDiComandiFisarmonica;

class FabbricaDiComandiFisarmonicaTest {

	private FabbricaDiComandiFisarmonica fabbrica;
	private Comando atteso;
	private IO io;
	
	@BeforeEach
	public void setup () {
		this.io = io;
		fabbrica = new FabbricaDiComandiFisarmonica(io);
	}
	
	
	@Test
	void testComandoNonValido() {
		atteso = new ComandoNonValido();
		assertEquals(atteso.getNome(), fabbrica.costruisciComando("lancia").getNome());
	}
	
	@Test
	public void testComandoConParametro() {
		atteso = new ComandoVai();
		atteso.setParametro("est");
		Comando current = fabbrica.costruisciComando("vai est");
		assertEquals( atteso.getNome(), current.getNome());
		assertEquals( atteso.getParametro(), current.getParametro());
	}
	
	@Test
	public void testComandoSenzaParametro() {
		atteso = new ComandoFine();
		assertEquals( atteso.getNome(), fabbrica.costruisciComando("fine").getNome());
	}

}
