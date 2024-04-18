package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest{

	Borsa borsa= new Borsa();
	Attrezzo chiave;
	Attrezzo mazza;
    @BeforeEach
    public void setUp(){
       
        chiave = new Attrezzo("Chiave", 2);
        mazza = new Attrezzo("Mazza", 13);
        
    }

    
    @Test
    public void testBorsaEmpty() {
        assertTrue(borsa.isEmpty());
    }

    @Test
    public void testVerificaPeso() {
        assertFalse(borsa.addAttrezzo(new Attrezzo("Clava", (borsa.getPesoMax() + 1))));
    }
    
    @Test
    public void testAddAttrezzoMaggioreDiPesoMax() {
		assertFalse(borsa.addAttrezzo(mazza));
    }
    
    public void testAddAttrezzoMinorePesoMax() {
    	assertTrue(borsa.addAttrezzo(chiave));
    }

    @Test
    public void testRemoveAttrezzo() {
        assertEquals(null, borsa.removeAttrezzo("prova_non_presente"));
    }

    @Test
    public void testRemoveAttrezzoPresente() {
    	borsa.addAttrezzo(mazza);
    	assertEquals(null, borsa.removeAttrezzo("Mazza"));
    }
    
    @Test
    public void testHasAttrezzoPresente() {
    	borsa.addAttrezzo(chiave);
    	assertTrue(borsa.hasAttrezzo("Chiave"));
    }	
} 