package tipos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EntidadLibro {

	// atributos
	private final Integer ID;
	private final String titulo;
	private final Integer numPaginas;
	private final LocalDate fechaPublicacion;
	private Boolean prestado;
	private Double precio;
	
	// constructor
	public EntidadLibro(Integer id, String titulo, Integer numPaginas, LocalDate fechaPublicacion, Double precio) {

		if (id == null) {
			throw new IllegalArgumentException("id no puede ser null");
		}

		if (titulo == null || titulo.isBlank()) {
			throw new IllegalArgumentException("titulo no puede estar vacio");
		}

		if (numPaginas == null || numPaginas < 1) {
			throw new IllegalArgumentException("numPaginas no puede ser negativo");
		}

		if (fechaPublicacion.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("fechaPublicacion debe ser una fecha anterior");
		}

		this.ID = id;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.fechaPublicacion = fechaPublicacion;
		setPrecio(precio);
		this.prestado = false;
	}
	
	// getters y setters
	public Integer getID() {
		return ID;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public Integer getNumPaginas() {
		return numPaginas;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public Boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(Boolean prestado) {
		this.prestado = prestado;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {

		if (precio < 0) {
			throw new IllegalArgumentException();
		}
		
		this.precio = precio;
	}

	public Integer getAntiguedad(ChronoUnit unidad) {
		return (int) fechaPublicacion.until(LocalDate.now(), unidad);
	}

	// metodos
	public void aplicarDescuento(Double descuento) {
		setPrecio(precio * (1 - descuento));
	}

	// to string
	@Override
	public String toString() {
		return "[ ID=" + ID + ", titulo=" + titulo + ", precio=" + precio + " ]";
	}

}
