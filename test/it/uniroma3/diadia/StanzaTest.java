package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;


public class StanzaTest {

	
	private Stanza stanza;
	private Stanza stanzaAdiacente;
	private Attrezzo attrezzo;
	
	private Stanza atrio;
	private Stanza aulaN10;
	private Attrezzo osso;
	private Attrezzo lanterna;
	
	
	@BeforeEach
	public void setUp(){
		atrio = new Stanza("Atrio");
		aulaN10 = new Stanza("Aula N10");
		osso = new Attrezzo("Osso", 1);
		lanterna = new Attrezzo("Lanterna",2);
		atrio.impostaStanzaAdiacente("nord", aulaN10);
		aulaN10.addAttrezzo(osso);
		atrio.addAttrezzo(lanterna);	
		atrio.removeAttrezzo(lanterna);
	}
	
	
	@Test
	public void testGetStanzaAdiacente() {
		assertEquals(stanzaAdiacente.getNome(),stanza.getStanzaAdiacente("nord").getNome());
	}
	
	@Test
	public void testaddAttrezzo() {
		assertTrue(stanza.addAttrezzo(attrezzo));
	}
	
	@Test
	public void testhasAttrezzo() {
		assertTrue(atrio.hasAttrezzo("Clava"));
	}
	
	@Test
	public void testhasAttrezzo_2() {
		assertTrue(stanza.hasAttrezzo("Spada"));
	}
	@Test
	public void test_hasAttrezzo_3() {
		assertTrue(aulaN10.hasAttrezzo("Osso"));
	}
	
	@Test
    public void test_removeAttrezzo() {
		assertFalse(atrio.hasAttrezzo("Osso"));
	}
	

}
