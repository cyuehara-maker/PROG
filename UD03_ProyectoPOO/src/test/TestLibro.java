package test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import tipos.EntidadLibro;

public class TestLibro {
	public static void main(String[] args) {
		
		EntidadLibro libro = new EntidadLibro(1, "libroso", 1, LocalDate.of(2008, 1, 1), 10.5);
		
		System.out.println(libro);
		System.out.println(libro.getID());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAntiguedad(ChronoUnit.YEARS));

	}
}
