package estacion;

import java.util.concurrent.ThreadLocalRandom;

import bicicleta.BiciPalma;
import tarjetaUsuario.TarjetaUsuario;

public class Estacion {
	
	private int id,numeroAnclajes;
	private String direccion;
	private BiciPalma[] anclajes;
	
	public Estacion(int id, String direccion,int anclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = anclajes;
		this.anclajes = new BiciPalma[anclajes];
				
	}
	public int getId() {
		return this.id;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}
	
	public void consultarEstacion() {
		System.out.println("El id es " + getId() + " La direccion es " + getDireccion() + " y el número de anclajes son " + getNumeroAnclajes());
		
	}
	public int anclajesLibres() {
		int anclajesLibres = 0;
		
		for (BiciPalma anclaje:this.anclajes) {
			if(anclaje == null) {
				anclajesLibres++;
			}
			else;
				
		}
		return anclajesLibres;
	}
	public void consultarAnclajes() {
		
		int posicion = 0;
		int numeroAnclaje = 0;
		
		for(BiciPalma bicicleta: this.anclajes) {
			numeroAnclaje = posicion +1;
			if (bicicleta != null) {
				System.out.println("Anclaje " + numeroAnclaje + " " + this.anclajes[posicion].getId());
			
			}
			else {
				System.out.println("Anclaje " + numeroAnclaje + " " + " libre");
			}
			posicion++;
		}
	}
	public void anclarBicicleta(BiciPalma bicicleta) {
		int posicion = 0;
		int numeroAnclaje = posicion +1 ;
		
		for(BiciPalma anclaje: this.anclajes) {
			if (anclaje == null) {
				this.anclajes[posicion] = bicicleta;
				mostrarAnclaje(bicicleta,numeroAnclaje);
				
				break;
			}
			
			posicion++;
			numeroAnclaje++;
			
		}
	}
	
	public void mostrarAnclaje(BiciPalma bicicleta, int numeroAnclaje) {
		
		System.out.println("Bicicleta " + bicicleta.getId() + " Anclada en anclaje nº " + numeroAnclaje);
	}
	
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		return tarjetaUsuario.getActivada();
	}
	
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
		
		
		if(leerTarjetaUsuario(tarjetaUsuario) == true) {
			
			boolean biciRetirada = false;
		
			while (!biciRetirada) {
			
				int posicion = generarAnclaje();
				int numeroAnclaje = posicion +1;
			
				if(this.anclajes[posicion] != null) {
					mostrarBicicleta(this.anclajes[posicion],numeroAnclaje);
					this.anclajes[posicion] = null;
					biciRetirada = true;
				}
				else;
			}
		}
		else
			System.out.println("La tarjeta de usuario no está activa. U.u");
	}
		
	
	public void mostrarBicicleta(BiciPalma bicicleta, int numeroAnclaje) {
		System.out.println("El ID de la bicicleta retirada  es " + bicicleta.getId() + " Y el numero de anclaje es " + numeroAnclaje);
	} 
	
	public int generarAnclaje() {
		int numeroEntero = ThreadLocalRandom.current().nextInt(0, this.anclajes.length); 
		return numeroEntero;
	}
	
	
}
