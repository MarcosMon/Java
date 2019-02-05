package org.lasencinas.Porb;

public class Ventas {

    // ------------------Iniciación de Variables--------------------//

    double tiendaMayorIngresos = 0;
    double tiendaMenorIngresos = 0;
    double totalTiendasGanancias = 0;
    int idTiendaMayorIngresos = 0;
    int idTiendaMenorIngresos = 0;
    String nombreComercio = "";
    private double[] ventas;

    // ----------------Fin iniciación -------------------------//

    // ---------------------Iniciación de Constructor------------------------//
    public Ventas(double[] ventas, String nombreComercio) {
	this.ventas = ventas;
	this.nombreComercio = nombreComercio;
	tiendaMayorIngresos = getVentas()[0];
	tiendaMenorIngresos = getVentas()[0];
    }

    // ------------------------Getters y Setters-------------------------------//
    public int getCantidadTiendas() {
	return getVentas().length;
    }
    public String getNombreComercio() {
	return this.nombreComercio;
   }

    public double[] getVentas() {
	return this.ventas;
    }

    public double getTiendaMasIngresos() {
	return this.tiendaMayorIngresos;
    }

    public double getTiendaMenosIngresos() {
	return this.tiendaMenorIngresos;
    }

    public int getTiendaIdMenosVentas() {
	return idTiendaMenorIngresos + 1;
    }

    public int getTiendaIdMasVentas() {
	return idTiendaMayorIngresos + 1;
    }

    public double getTotalGananciasTiendas() {
	return this.totalTiendasGanancias;
    }

    public void setMenorIngresosTienda(double venta) {
	this.tiendaMenorIngresos = venta;
    }

    public void setMayorIngresosTienda(double venta) {
	this.tiendaMayorIngresos = venta;
    }

    public void setTiendaIdMenosVentas(int id) {
	idTiendaMenorIngresos = id;
    }

    public void setTiendaIdMasVentas(int id) {
	idTiendaMenorIngresos = id;
    }

    public void setTiendasGananciaTotal(double ganancias) {
	totalTiendasGanancias += ganancias;
    }

    // ----------------Fin de Getters y Setters--------------------------//

    // ----------------Inicio de métodos de lógica-------------------------//

    public void calcularVentas() {

	for (int tienda = 0; tienda < getCantidadTiendas(); tienda++) {
	    if (getVentas()[tienda] > getTiendaMasIngresos()) {
		setMayorIngresosTienda(getVentas()[tienda]);
		setTiendaIdMasVentas(tienda);
	    } else if (getVentas()[tienda] < getTiendaMenosIngresos()) {
		setMenorIngresosTienda(getVentas()[tienda]);
		setTiendaIdMenosVentas(tienda);
	    }
	    setTiendasGananciaTotal(getVentas()[tienda]);

	}

    }
    // ----------------Fin de métodos de lógica-------------------------//

    public void mostrarTiendaMenosIngresos() {
	System.out.println("La tienda que menos ha vendido de " + getNombreComercio() + " fue la " + (idTiendaMenorIngresos + 1) + ",que vendió "
		+ tiendaMenorIngresos + " €");

    }

    public void mostrarTiendaMasIngresos() {
	System.out.println("La tienda que más ha vendido de  " + getNombreComercio()+ " fue la " + (idTiendaMayorIngresos + 1) + ", que  vendió "
		+ tiendaMayorIngresos + " €");
    }

    public void mostrarTotalGananciasTiendas() {
	System.out.println("El total de las ventas de " + getNombreComercio() + " es: " + totalTiendasGanancias + " €");

    }
}
