package test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import tipos.EntidadBiblioteca;
import tipos.EntidadLibro;

public class TestProyecto {
    public static void main(String[] args) {

        // ENTIDAD LIBRO
        EntidadLibro libro = new EntidadLibro(123456789123l, "libroso", 1, LocalDate.of(2008, 1, 1), 10.5);
		
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

        // ENTIDAD BIBLIOTECA
		EntidadBiblioteca biblioteca = new EntidadBiblioteca("biblioteca publica");
		System.out.println(biblioteca.agregar(null));
    }
}
