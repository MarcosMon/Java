package cuentaCorriente;
import dni.Dni;

public class TestCuentaCorriente {

	public static void main(String[] args) {

		/*
		 * CuentaCorriente[] cuentasCorrientes = new CuentaCorriente[2];
		 * 
		 * cuentasCorrientes[0] = new
		 * CuentaCorriente("Marcos","Monjon","Calle lomo n 35","616584422");
		 * cuentasCorrientes[1] = new
		 * CuentaCorriente("Jose","Zamora","Calle pepito n 35","616402211");
		 * 
		 * for(CuentaCorriente e: cuentasCorrientes) {
		 * 
		 * 
		 * if(e.getApellidos() == "Monjon") {
		 * System.out.println("Es correcto el apellido es " + e.getApellidos()); } else
		 * { System.out.println("Es incorrecto el apellido no es  " + e.getApellidos());
		 * } if(e.getApellidos() == "Zamora") {
		 * System.out.println("Es correcto el apellido es " + e.getApellidos()); } else
		 * { System.out.println("Es incorrecto el apellido no es " + e.getApellidos());
		 * } }
		 */

		CuentaCorriente cuentaCorrienteJose = new CuentaCorriente("Jose", "Zamora", "Calle pepito n 35", "616402211","43235169e");

		if (cuentaCorrienteJose.getNombre().equalsIgnoreCase("Jose")) {
			System.out.println("Es correcto");
		} else {
			System.out.println("Es incorrecto");
		}
		if (cuentaCorrienteJose.getApellidos().equalsIgnoreCase("Zamora")) {
			System.out.println("Es correcto");
		} else {
			System.out.println("Es incorrecto");
		}
		if (cuentaCorrienteJose.getDireccion().equalsIgnoreCase("Calle pepito n 35")) {
			System.out.println("Es correcto");
		} else {
			System.out.println("Es incorrecto");
		}
		if (cuentaCorrienteJose.getTelefono().equals("616402211")) {
			System.out.println("Es correcto");
		} else {
			System.out.println("Es Incorrecto");
		}

		cuentaCorrienteJose.ingresarDinero(200);

		if (cuentaCorrienteJose.getSaldo() == (300)) {
			System.out.println("Es correcto");
		} else {
			System.out.println("Es incorrecto");
		}

		cuentaCorrienteJose.retirarDinero(400);

		if (cuentaCorrienteJose.getSaldo() == (-100)) {
			System.out.println("Es correcto");
		} else {
			System.out.println("Es incorrecto");
		}

		if (cuentaCorrienteJose.saldoNegativo() == true) {
			System.out.println("Tu saldo esta en negativo");
		} else {
			System.out.println("Tu saldo esta en positivo");
		}
	}

}