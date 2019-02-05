package org.lasencinas.Porb;

public class Ventas {
    double mayor = 0;
    double menor = 0;
    double total = 0;
    int posicionMayor = 0;
    int posicionMenor = 0;
    private double[] ventas;

    public Ventas(double[] ventas) {
	this.ventas = ventas;
    }

    public int getCantidadTiendas() {
	return this.ventas.length;
    }

    public double getTiendaMasIngresos() {
	return this.mayor;
    }

    public double getTiendaMenosIngresos() {
	return this.menor;
    }

    public int getTiendaIdMenosVentas() {
	return posicionMenor + 1;
    }

    public int getTiendaIdMasVentas() {
	return posicionMayor + 1;
    }

    public double getTotalTiendasVentas() {
	return this.total;
    }

    public void calcularVentas() {
	mayor = ventas[0];
	menor = ventas[0];
	for (int i = 0; i < ventas.length; i++) {
	    if (ventas[i] > mayor) {
		mayor = ventas[i];
		posicionMayor = i;
	    } else if (ventas[i] < menor) {
		menor = ventas[i];
		posicionMenor = i;
	    }
	    total += ventas[i];

	}

    }

    public void mostrarInformacion() {
	System.out.println("La tienda que menos ha vendido fue la " + (posicionMenor + 1)
		+ ",                  que vendió " + menor + " €");
	System.out.println("La tienda que mas ha vendido fue la " + (posicionMayor + 1)
		+ ", que                 vendió " + mayor + " €");
	System.out.println("El total de las ventas es: " + total + " €");
    }
}
