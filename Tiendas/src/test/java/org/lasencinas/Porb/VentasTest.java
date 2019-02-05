package org.lasencinas.Porb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VentasTest {

    @Test
    public void testTiendasPortoPi() {
	// Total de ventas del comercio //
	double[] ventas = { 8000, 320.35, 930, 1020.99, 650 };
	// Iniciación de supuestos a testear //
	int totalTiendas = 5;
	String nombreComercio = "PortoPi";
	double cantidadTotal = 10921.34;
	double menorIngreso = 320.35;
	double mayorIngreso = 8000;
	int tiendaID1 = 1;
	int tiendaID2 = 2;
	Ventas portoPi = new Ventas(ventas, nombreComercio);
	
	// Llamada al método calcular Ventas //
	portoPi.calcularVentas();
	
	// Obtener el total de nuestras tiendas PortoPi //
	assertEquals(totalTiendas, portoPi.getCantidadTiendas());

	// Obtener el mayor ingreso de nuestras tiendas //
	assertEquals(mayorIngreso, portoPi.getTiendaMasIngresos(), 0.001);

	// Obtener el menor ingreso de nuestras tiendas //
	assertEquals(menorIngreso, portoPi.getTiendaMenosIngresos(), 0.001);
	
	// Obtener el total de ingresos de nuestras tiendas
	assertEquals(cantidadTotal, portoPi.getTotalGananciasTiendas(), 0.001);
	
	// Obtener el ID de la tienda con más Ventas //
	assertEquals(tiendaID1, portoPi.getTiendaIdMasVentas());
	
	// Obtener el ID de la tienda con menos Ventas //
	assertEquals(tiendaID2, portoPi.getTiendaIdMenosVentas());
	
	// Mostrar la información de la tienda con menos Ventas //
	portoPi.mostrarTiendaMenosIngresos();

    }
    
    @Test
    public void testTiendasFestivalPark() {
	// Total de ventas del comercio //
	double[] ventas = { 5000, 720.35, 230, 999.99, 540, 100, 950 };
	// Iniciación de supuestos a testear //
	int totalTiendas = 7;
	String nombreComercio = "FestivalPark";
	double cantidadTotal = 8540.34;
	double menorIngreso = 100;
	double mayorIngreso = 5000;
	int tiendaID1 = 1;
	int tiendaID2 = 6;
	Ventas festivalPark = new Ventas(ventas, nombreComercio);
	// Llamada al método calcular Ventas //
	
	festivalPark.calcularVentas();
	
	// Obtener el total de nuestras tiendas FestivalPark //
	assertEquals(totalTiendas, festivalPark.getCantidadTiendas());

	// Obtener el mayor ingreso de nuestras tiendas //
	assertEquals(mayorIngreso, festivalPark.getTiendaMasIngresos(), 0.001);

	// Obtener el menor ingreso de nuestras tiendas //
	assertEquals(menorIngreso, festivalPark.getTiendaMenosIngresos(), 0.001);
	
	// Obtener el total de ingresos de nuestras tiendas
	assertEquals(cantidadTotal, festivalPark.getTotalGananciasTiendas(), 0.001);
	
	// Obtener el ID de la tienda con más Ventas //
	assertEquals(tiendaID1, festivalPark.getTiendaIdMasVentas());
	
	// Obtener el ID de la tienda con menos Ventas //
	assertEquals(tiendaID2, festivalPark.getTiendaIdMenosVentas());
	
	// Mostrar la información de la tienda con menos Ventas //
	festivalPark.mostrarTiendaMenosIngresos();

    }
}
