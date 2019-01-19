package cuentaCorriente;

public class TestCuentaCorriente {

	public static void main(String[] args) {
		
		CuentaCorriente cuentaCorrienteJose = new CuentaCorriente("Jose","Zamora","Calle pepito n 35","616402211");
		
		System.out.println(cuentaCorrienteJose.getNombre().equalsIgnoreCase("Jose"));
	}

}
