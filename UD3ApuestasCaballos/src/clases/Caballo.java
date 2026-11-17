package clases;

public class Caballo {

	final private String ID;
	private String nombre;
	final private Raza raza;
	final Integer victorias;
	
	public Caballo(String id, String nombre, Raza raza) {
		this.ID = id;
		this.nombre = nombre;
		this.raza = raza;
		victorias = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getID() {
		return ID;
	}

	public Raza getRaza() {
		return raza;
	}

	public Integer getVictorias() {
		return victorias;
	}
	
	@Override
	public String toString() {
		return "[ " + ID + ", " + nombre + " ]";
	}
	
}
