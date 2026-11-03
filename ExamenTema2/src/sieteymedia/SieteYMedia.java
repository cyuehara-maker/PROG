package sieteymedia;

import java.util.Random;
import java.util.Scanner;

public class SieteYMedia {
	
	final static Double LIMITE = 7.5;

	public static void main(String[] args) {
	
		Double p1 = 0.;
		Double p2 = 0.;
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenidos al juego de las Siete y Media");
		
		p1 = jugarTurno(1, s);
		p2 = jugarTurno(2, s);
		decirGanador(p1, p2);
		
		s.close();
	}
	
	private static Double jugarTurno(Integer p, Scanner s) {
		
		System.out.println("\nEs el turno del jugador " + p);
		Double puntuacion = 0.;
		Boolean jugando = true;
		
		do {			
			System.out.print("¿Quieres sacar una carta (s/n)? ");			
			
			switch (s.nextLine().toLowerCase()) {
			case "s":
				
				Double carta = cartaRandom();
				puntuacion += carta;
				System.out.printf("Tu carta es: %.1f de %s\n", carta, paloRandom());
				System.out.printf("Tienes %.1f puntos\n", puntuacion);
				
				jugando = puntuacion <= LIMITE;
				if (!jugando) {
					System.out.println("¡Te has pasado!");
				}
				
				break;
			
			case "n":
				jugando = false;
				break;
			
			default:
				System.out.println("s/n");
				continue;
			}
		} while(jugando);
		
		return puntuacion;
	}
	
	private static Double cartaRandom() {
		
		Double carta = (double) new Random().nextInt(1, 11); // [1, 11)
		
		if (carta >= 8) {
			carta = .5;
		}
		
		return carta;
	}
	
	private static String paloRandom() {
		
		String[] palos = {"oros", "copas", "espadas", "bastos"};
		return palos[new Random().nextInt(0, 4)];
	}
	
	private static void decirGanador(Double p1, Double p2) {
		
		System.out.printf("El JUGADOR 1 tiene %.1f puntos y el jugador 2 tiene %.1f puntos\n", p1, p2);
		
		if (p1.equals(p2)) {
			System.out.println("empate");
			
		} else {
			Integer ganador = p1 > p2 ? 1 : 2;
			System.out.printf("Enhorabuena, JUGADOR %d, has ganado la partida", ganador);
		}
		
	}
}
