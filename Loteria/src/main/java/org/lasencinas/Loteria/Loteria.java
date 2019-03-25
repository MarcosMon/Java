package org.lasencinas.Loteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Loteria 
{
    Random combinaciones = new Random();
    Random reintegros = new Random();
    byte dimension = 6;
    List<Integer> combinacion = new ArrayList<Integer>(dimension);
    int numero = reintegros.nextInt(10);
    int complementario = combinaciones.nextInt(50);
    
    public Loteria() {
	
    }

   public List<Integer> getNumerosAleatorios() {
       return combinacion;
   }
    
   public void setNumerosAleatorios(int numero) {
       combinacion.add(numero);
   }
   public void calculartNumerosAleatorios(){
	for ( int bolaNumero = 1; bolaNumero<=dimension ; bolaNumero++) {
	    int numeros=combinaciones.nextInt(50);
	    if(!combinacion.contains(numeros) && numeros != 0) {
	    setNumerosAleatorios(numeros);
	    }
	    else{
		bolaNumero--;
	    }
	    
	    
	}

    }
   public void mostrarResultados() {
       System.out.println("La combinacion ganadora ha sido: " + combinacion + " el complementario ha sido el: " + complementario  +  " y el reintegro: "  + numero);
   }
    
}


