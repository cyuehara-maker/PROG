package tipos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EntidadLibro {

	private final Long ISBN;
	private final String titulo;
	private final Integer numPaginas;
	private final LocalDate fechaPublicacion;
	private Boolean prestado;
	private Double precio;
	
	public EntidadLibro(Long isbn, String titulo, Integer numPaginas, LocalDate fechaPublicacion, Double precio) {

		if (isbn == null) {
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

		this.ISBN = isbn;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.fechaPublicacion = fechaPublicacion;
		setPrecio(precio);
		this.prestado = false;
	}
	
	public Long getISBN() {
		return ISBN;
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

	public void aplicarDescuento(Double descuento) {

		if (descuento == null || descuento > 1 || descuento < 0) {
			throw new IllegalArgumentException("descuento debe ser entre 0.0 y 1.0");
		}
		
		double precioNuevo = precio * (1 - descuento);
		precioNuevo = Math.round(precioNuevo * 100) / 100.;
		setPrecio(precioNuevo);
	}

	@Override
	public String toString() {
		return "Libro(ISBN=" + ISBN + ", titulo=" + titulo + ", precio=" + precio + ")";
	}

}
