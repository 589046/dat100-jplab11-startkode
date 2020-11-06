package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		PrintWriter print = null;
	
        try {
            print = new PrintWriter(mappe + filnavn);
            String str = samling.toString();
            print.write(str);
        }
        catch (FileNotFoundException e) {
            System.out.println("Filen finnst ikkje!");
        }
        finally {
            if (print != null) {
                print.close();
                return true; 
            }
        }
        return false;
	}
}
