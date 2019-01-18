package testDni;

import dni.TablaAsignacion;

public class TestTablaAsignacion {

	public static void main(String[] args) {
        
	    TablaAsignacion nuevaTabla = new  TablaAsignacion();
	    nuevaTabla.setTablaAsignacion();
	    nuevaTabla.getLongitudDni();//Esto te devuelve la longitud de la tabla de asignacion de Dni ,en este caso 23 int
	    String [] test = {"94256003W","44333323H","77762316Y","77762316S"};
	    for (String dni : test) {
	    	
	    
	        char letra= dni.charAt(dni.length() -1);
	        String letraDni = String.valueOf(letra);
	        String parteNumerica = dni.substring(0, dni.length()-1);
	        
	    	if (nuevaTabla.calcularLetraDni(parteNumerica).equalsIgnoreCase(letraDni)) { 
	    		System.out.println("La letra del DNI " + dni +" Es correcta");// este caso test te muestra la letra que va en esa posici�n  
	    	}
	    	else{
	    		System.out.println("La letra del DNI " + dni +" Es incorrecta");
	    }
	    }

	    }
	}