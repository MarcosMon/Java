package org.lasencinas.Porb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * Unit test for simple App.
 */
public class VentasTest 
{
    
    
    
    @Test 
    public void testTiendas() {
	double[] ventas = { 8000, 320.35, 930, 1020.99, 650 };
	Ventas tiendas = new Ventas(ventas);
	tiendas.calcularVentas();
	tiendas.mostrarInformacion();
	assertEquals(5, tiendas.getCantidadTiendas());
	
	assertEquals(8000,tiendas.getTiendaMasIngresos(), 0.001);
	
	assertEquals(320.35, tiendas.getTiendaMenosIngresos(), 0.001);
	
	assertEquals(10921.34, tiendas.getTotalTiendasVentas(), 0.001);
	
	assertEquals(1, tiendas.getTiendaIdMasVentas());
	assertEquals(2, tiendas.getTiendaIdMenosVentas());
    
}
}


