package testDni;

import dni.Dni;

public class TestDni {

	public static void main(String[] args) {
		
		Dni dni = new Dni("44444433E");
		
		
		if (dni.getDni().equalsIgnoreCase("44444433E")) {
			System.out.println("Bien");
		}
		else {
			System.out.println("Mal");
		}
		
		if (dni.getLetraDni().equals('E')) {
			
			System.out.println("Bien");
		}
		else {
			System.out.println("Malamente");
		}
		
		if (dni.getParteNumerica().equals("44444433")) {
			System.out.println("Bien");
		}
		else {
			System.out.println("Malamente tra tra");
		}
	}

}
