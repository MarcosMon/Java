package org.lasencinas.NumerosRomanos;


    enum NumeracionRomana {

	I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

	int numeroRomano = 0;

	private NumeracionRomana(int numeroRomano) {
	    setNumeroRomano(numeroRomano);
	}

	public int getNumeroRomano() {
	    return numeroRomano;
	}

	public void setNumeroRomano(int numeroRomano) {
	    this.numeroRomano = numeroRomano;
	}

    }

