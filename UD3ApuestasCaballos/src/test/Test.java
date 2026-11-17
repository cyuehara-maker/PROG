package test;

import java.time.LocalDate;

import clases.Caballo;
import clases.Raza;
import clases.Usuario;

public class Test {
	public static void main(String[] args) {
		
		Usuario usr = new Usuario("dni", "usr", LocalDate.of(2000, 12, 15), 1000.);
		System.out.println(usr);
		
		Caballo cab = new Caballo("C-123", "potrito", Raza.JAMELGO_CUTRE);
		System.out.println(cab);
	}
}
