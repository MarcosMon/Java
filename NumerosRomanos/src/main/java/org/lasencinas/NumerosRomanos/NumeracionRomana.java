package org.lasencinas.NumerosRomanos;

enum NumeracionRomana {

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    int numeroDecimal = 0;

    private NumeracionRomana(int numeroDecimal) {
	setNumeroDecimal(numeroDecimal);
    }

    public int getNumeroDecimal() {
	return this.numeroDecimal;
    }

    public void setNumeroDecimal(int numeroRomano) {
	this.numeroDecimal = numeroRomano;
    }

}
