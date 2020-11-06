package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] tabell;
	private int ledig;

	public Blogg() {
		ledig = 0;
		tabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		ledig = 0;
		tabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return ledig;
	}
	
	public Innlegg[] getSamling() {
		return tabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for (int i = 0; i < ledig; i++) {
			if (tabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (Innlegg i : tabell) {
			if (i != null && i.erLik(innlegg) ) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		 return ledig < tabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if (ledigPlass() && !finnes(innlegg)) {
			 tabell[ledig] = innlegg;
			 ledig++;
			 
			 return true;
		 } else {
			 return false;
		 }
	}
	
	public String toString() {
		
		String str = ledig + "\n";
		
		for (Innlegg i : tabell) {
			str += i.toString();
		}
		
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}