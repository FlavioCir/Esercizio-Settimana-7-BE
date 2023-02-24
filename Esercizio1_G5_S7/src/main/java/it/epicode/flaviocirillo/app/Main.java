package it.epicode.flaviocirillo.app;

import java.util.Arrays;
import java.util.Random;

import it.epicode.flaviocirillo.models.ProcessoDiControllo;
import it.epicode.flaviocirillo.models.ProxyProcessoDiControllo;
import it.epicode.flaviocirillo.models.Sonda;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();		
		
		Sonda s1 = new Sonda(1, r.nextLong(), r.nextLong(), r.nextInt(11));
		Sonda s2 = new Sonda(2, r.nextLong(), r.nextLong(), r.nextInt(11));
		Sonda s3 = new Sonda(3, r.nextLong(), r.nextLong(), r.nextInt(11));
		Sonda s4 = new Sonda(4, r.nextLong(), r.nextLong(), r.nextInt(11));
		Sonda s5 = new Sonda(5, r.nextLong(), r.nextLong(), r.nextInt(11));
		
		System.out.println("-------- SONDE ATTIVE --------");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("--------------------------------------");
		
		ProcessoDiControllo p1 = new ProxyProcessoDiControllo();
		p1.comunicazioneAllarme(Arrays.asList(s1, s2, s3, s4, s5));

	}

}
