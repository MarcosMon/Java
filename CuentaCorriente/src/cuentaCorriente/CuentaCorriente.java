package cuentaCorriente;

public class CuentaCorriente {
	
	private String nombre,apellidos,direccion,telefono;

	private double saldo;
	
	public CuentaCorriente(String nombre, String apellidos, String direccion, String telefono) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.saldo = 100;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public String getApellidos() {
		
		return this.apellidos;
	}
	
	public String getDireccion() {
		
		return this.direccion;
	}
	
	public String getTelefono() {
		
		return this.telefono;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNombre() {
		
		this.nombre = nombre;
	}
	
	public void setApellidos() {
		this.apellidos = apellidos;
	}
	
	public void setDireccion() {
		this.direccion = direccion;
	}
	
	public void setTelefono() {
		this.telefono = telefono;
	}
	public void setSaldo(double gastos) {
		this.saldo += gastos;
	}
	
	public void  retirarDinero(double retirar) {
		this.setSaldo(-retirar);
	}
	
	public void  ingresarDinero(double ingresar) {
		this.setSaldo(ingresar);
	}
	public void consultarCuenta() {
		System.out.println("Tu saldo es de " + getSaldo() + " Tu nombre es " + getNombre() + " Tu apellido es " + " Tu direccion es " + getDireccion() + " Y tu telefono es " + getTelefono()  );
	}
	public  boolean saldoNegativo() {
		if (getSaldo() < 0) {
			return true;
		}
		else {
			return false;
		}
	}


}

