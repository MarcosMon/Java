package org.formacion.di.bbdd;

import org.formacion.di.negocio.Inventariable;

public class InventarioBBDD implements Inventariable {


	// Metodo de consulta a la base de datos
	
	public int numeroProductos(String tienda, String producto) {
		return BBDD.stocs.get(tienda).get(producto);
	}
}
