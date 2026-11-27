package test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import tipos.EntidadLibro;

public class TestLibro {
	public static void main(String[] args) {
		
		EntidadLibro libro = new EntidadLibro("123-45-67891-23-5", "libroso", 1, LocalDate.of(2008, 1, 1), 10.5);
		
		System.out.println(libro);
		System.out.println(libro.getISBN());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAntiguedad(ChronoUnit.YEARS));
		
		try {
			libro.aplicarDescuento(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		libro.aplicarDescuento(.10);
		System.out.println(libro);

	}
}
