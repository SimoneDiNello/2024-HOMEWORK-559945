package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.giocatore.Borsa;
import it.uniroma3.diadia.giocatore.Giocatore;

public class GiocatoreTest {

	private Giocatore giocatore;
	private Borsa borsa;

	@BeforeEach
	public void setUp() {
		giocatore = new Giocatore();
	}

	@Test
    public void testGetBorsa() {
        assertNotNull(giocatore.getBorsa());
    }

    @Test
    public void testSetCFU() {
    	giocatore.setCfu(15);
        assertEquals(15, giocatore.getCfu());
    }
    
    @Test 
    public void testGetCFU() {
    	assertEquals(20,giocatore.getCfu());
    }
  
}
