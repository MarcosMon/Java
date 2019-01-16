package dni;



public class Dni{
	
	private String dni = null;
	/*private TablaAsignacion tablaAsignacion = new tablaAsignacion*/
	public Dni() {};
	
	public Dni(String dni) {
		
		this.dni=dni;
	}
	
	public String getDni() {
		return this.dni;
		
	}
	
	public Character getLetra() {
		return this.dni.charAt(this.dni.length()-1);
	}
	/* private String getParteNumericaDNI() {
		return 
		
	}*/
	
}