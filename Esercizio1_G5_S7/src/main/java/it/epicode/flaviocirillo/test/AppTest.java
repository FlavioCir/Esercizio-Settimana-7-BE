package it.epicode.flaviocirillo.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import it.epicode.flaviocirillo.models.CentroDiControllo;
import it.epicode.flaviocirillo.models.ProcessoDiControllo;
import it.epicode.flaviocirillo.models.ProxyProcessoDiControllo;
import it.epicode.flaviocirillo.models.Sonda;

public class AppTest {
	
	Random r = new Random();

	private ProcessoDiControllo p;

    @Before
    public void setUp() {
        p = new ProxyProcessoDiControllo();
    }

    @Test
    public void testComunicazioneAllarmeFumoBasso() {
    	Sonda s1 = new Sonda(1, r.nextLong(), r.nextLong(), 3);
    	Sonda s2 = new Sonda(2, r.nextLong(), r.nextLong(), 4);
    	Sonda s3 = new Sonda(3, r.nextLong(), r.nextLong(), 5);
    	List<Sonda> fumoBasso = Arrays.asList(s1, s2, s3);

        p.comunicazioneAllarme(fumoBasso);

        CentroDiControllo ca = ((ProxyProcessoDiControllo) p).getCentroDiControllo();
        assertEquals(0, ca.getNumComunicazioni());

    }
    
    @Test
    public void testComunicazioneAllarmeFumoAlto() {
    	
    	Sonda s4 = new Sonda(4, r.nextLong(), r.nextLong(), 6);
    	Sonda s5 = new Sonda(5, r.nextLong(), r.nextLong(), 9);
    	Sonda s6 = new Sonda(6, r.nextLong(), r.nextLong(), 11);
    	List<Sonda> fumoAlto = Arrays.asList(s4, s5, s6);
    	
    	CentroDiControllo ca = ((ProxyProcessoDiControllo) p).getCentroDiControllo();
    	
    	p.comunicazioneAllarme(fumoAlto);
    	assertEquals(3, ca.getNumComunicazioni());
    	
    }
	
}

