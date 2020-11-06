package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;
	}

	public int getLikes() {
		return likes;
	}
	
	public void doLike () {
		likes += 1;
	}
	
	public boolean erLik(Innlegg innlegg) { // Metoden sjekkar om id'en til innlegg-objektet er lik id variabelen
		if (innlegg.getId() != id) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		//return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		//Linjen over lagar ein string på den "enkle måten".
		//Linjen under lagar ein string ved bruk av format metoden i string klassen.
		return String.format("%d\n%s\n%s\n%d\n", id, bruker, dato, likes);
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
