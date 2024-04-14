package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest{

    private Borsa borsa;

    @BeforeEach
    public void setUp(){
        borsa = new Borsa();
    }

    @Test
    public void testBorsaEmpty() {
        assertTrue(borsa.isEmpty());
    }

    @Test
    public void testVerificaPeso() {
        assertFalse(borsa.addAttrezzo(new Attrezzo("Prova", (borsa.getPesoMax() + 1))));
    }

    @Test
    public void testRemoveAttrezzo() {
        assertEquals(null, borsa.removeAttrezzo("prova_non_presente"));
    }

}