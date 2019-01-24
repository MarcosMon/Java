package tarjetaUsuario;

public class TarjetaUsuario {
	private String id;
	private boolean activa;
	public TarjetaUsuario(String id, boolean activa) {
		this.id = id;
		this.activa = activa;
	}
	public void setActivada(boolean activa) {
		this.activa = activa;
	}
	
	public boolean getActivada(){
		return this.activa;
	}
}
