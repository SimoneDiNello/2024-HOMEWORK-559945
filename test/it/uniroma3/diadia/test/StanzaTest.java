package it.uniroma3.diadia.test;



import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;


public class StanzaTest {


	private Stanza stanza;
	private Attrezzo attrezzo;

	private Stanza atrio;
	private Stanza aulaN10;
	private Attrezzo lanterna;


	@BeforeEach
	public void setUp(){
		atrio = new Stanza("Atrio");
		aulaN10 = new Stanza("Aula N10");
		lanterna = new Attrezzo("Lanterna",2);
		
		
	}


	@Test
	public void testImpostaStanzaAdiacente() {
		atrio.impostaStanzaAdiacente("nord", aulaN10);
		assertEquals(aulaN10,atrio.getStanzaAdiacente("nord"));
	}

	@Test
	public void testGetStanzaAdiacenteNulla() {
		assertNull(atrio.getStanzaAdiacente("sud"));
	}
	
	@Test 
	public void testAddAttrezzo() {
		assertTrue(atrio.addAttrezzo(lanterna));
	}

	@Test
	public void testHasAttrezzo() {
		atrio.addAttrezzo(lanterna);
		assertTrue(atrio.hasAttrezzo("Lanterna"));
	}
	
	@Test
	public void testGetAttrezzoNullo() {
		assertNull(atrio.getAttrezzo(null));
	}
	
	@Test
	public void testGetAttrezzo() {
		atrio.addAttrezzo(lanterna);
		assertEquals(lanterna,atrio.getAttrezzo("Lanterna"));
	}
}

