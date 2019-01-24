package empleado;

public class Empleado {
	
	private String nombre;
	private int sueldo;
	private String puesto;

	public Empleado(String nombre) {
		this.nombre=nombre;
		this.sueldo = 1000;
		this.puesto = "administrador";
	}
	public void setSueldo(int subido) {
		this.sueldo+=subido;
		
	
	}
	public void setPuesto() {
		if (this.sueldo > 1500) {
			this.puesto = "RRHHH";
		}
		else {
			this.puesto = "Administradorcito";
		}
	}
	public int getSueldo() {
		return this.sueldo;
	}
	public String getPuesto() {
		return this.puesto;
	}
}
