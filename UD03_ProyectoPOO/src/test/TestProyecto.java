package test;

import java.time.LocalDate;

import tipos.EntidadBiblioteca;
import tipos.EntidadLibro;

public class TestProyecto {
	public static void main(String[] args) {

		EntidadBiblioteca biblioteca = new EntidadBiblioteca("mi biblioteca");

		biblioteca.agregar(new EntidadLibro("123-45-67891-23-5", "libroso", 1, LocalDate.of(2008, 1, 1), 10.5));
		biblioteca.agregar(new EntidadLibro("234-34-34342-33-2", "tresdoscinco", 3, LocalDate.of(1234, 2, 4), 3.3));
		biblioteca.agregar(new EntidadLibro("676-67-67676-67-6", "xd", 234, LocalDate.of(2000, 1, 2), 334.));
		biblioteca.agregar(new EntidadLibro("267-34-34742-77-2", "lmao", 33, LocalDate.of(1234, 3, 4), 23.));
		biblioteca.agregar(new EntidadLibro("234-34-34469-38-2", "djshfhs", 3, LocalDate.of(2000, 12, 4), 1.3));
		biblioteca.agregar(new EntidadLibro("111-11-11111-11-1", "repetido", 3, LocalDate.of(2021, 6, 3), 22.3));

		try {
			biblioteca.agregar(new EntidadLibro("111-11-11111-11-1", "repetido", 3, LocalDate.of(2021, 6, 3), 22.3));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			biblioteca.agregar(new EntidadLibro(null, "inexistente", 3, LocalDate.of(2021, 6, 3), 22.3));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			biblioteca.agregar(
					new EntidadLibro("111-11-45747-11-1", "libro del futuro", 3, LocalDate.of(3333, 6, 3), 22.3));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			biblioteca.agregar(new EntidadLibro("111-11-45746-12-0", "ingresos negativos", 999999, LocalDate.of(2021, 6, 3), -999.));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		System.out.println("\nBUSCAR");
		System.out.println("676-67-67676-67-6: " + biblioteca.buscar("676-67-67676-67-6"));
		System.out.println("000-00-00000-00-0: " + biblioteca.buscar("000-00-00000-00-0"));

		System.out.println("\nELIMINAR");
		System.out.println("eliminado: " + biblioteca.eliminar("676-67-67676-67-6"));
		System.out.println("eliminado: " + biblioteca.eliminar("676-67-67676-67-6"));
		
		System.out.println("\nCONTAR ELEMENTOS");
		biblioteca.printarLibros();

		EntidadLibro eliminado = biblioteca.eliminar("456");
		System.out.println(eliminado);
	}
}
