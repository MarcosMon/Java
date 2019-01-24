package empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Marcos");
		
		
		System.out.println(empleado1.getPuesto());
		empleado1.setSueldo(700);
		System.out.println(empleado1.getSueldo());
		System.out.println(empleado1.getPuesto());

	}

}
