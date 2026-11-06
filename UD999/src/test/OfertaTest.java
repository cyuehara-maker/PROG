package test;

import oferta.Oferta;

public class OfertaTest {

	public static void main(String[] args) {
		System.out.println(Oferta.oferta(new int[] { 40, 35, 30, 25, 20, 15, 10 })); // 45
		System.out.println(Oferta.oferta(new int[] { 50, 10, 30 })); // 10
		System.out.println(Oferta.oferta(new int[] { 25, 20 })); // 0
		System.out.println(Oferta.oferta(new int[] { 1, 2, 3, 1, 2, 3 })); // 3
	}
}
