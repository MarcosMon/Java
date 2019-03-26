package org.lasencinas.NumerosRomanos;

public class Main {

    public static void main(String[] args) {
	
	for (NumeracionRomana NR : NumeracionRomana.values()) {
	    
	    
	    System.out.println(NR.getNumeroRomano());
	}
	NumeracionRomana num = NumeracionRomana.C;
	System.out.println(num.getNumeroRomano());
	
	
	
	

    }
}
