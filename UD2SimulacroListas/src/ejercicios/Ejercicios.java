package ejercicios;

import java.util.List;
import java.util.Objects;

import utiles.Utiles;

public class Ejercicios {

    // 1. Sumar una lista mediante for-each.
    public static Integer suma1(List<Integer> numeros) {
        Integer suma = 0;

        for (Integer numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    // 2. Sumar una lista mediante for clásico (con índice).
    public static Integer suma2(List<Integer> numeros) {
        Integer suma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }

        return suma;
    }

    // 3. Sumar una lista mediante while.
    public static Integer suma3(List<Integer> numeros) {
        Integer suma = 0;
        int i = 0;

        while (i < numeros.size()) {
            suma += numeros.get(i);
            i++;
        }

        return suma;
    }

    // 4. Contar los números pares, incluido el 0.
    public static Integer contarPares(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    // 5. Contar los números primos mediante la clase Utiles.
    public static Integer contarPrimos(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (Utiles.esPrimo(numero)) {
                contador++;
            }
        }

        return contador;
    }

    // 6. Contar los números perfectos mediante la clase Utiles.
    public static Integer contarPerfectos(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (Utiles.esPerfecto(numero)) {
                contador++;
            }
        }

        return contador;
    }

    // 7. Calcular la media mediante for-each.
    public static Double media1(List<Integer> numeros) {

        Integer suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.size();
    }

    // 8. Calcular la media mediante for clásico.
    public static Double media2(List<Integer> numeros) {

        Integer suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }

        return (double) suma / numeros.size();
    }

    // 9. Calcular la media mediante while.
    public static Double media3(List<Integer> numeros) {

        Integer suma = 0;
        int i = 0;
        while (i < numeros.size()) {
            suma += numeros.get(i);
            i++;
        }

        return (double) suma / numeros.size();
    }

    // Ejercicios del examen
    // 1. Control de acceso al baile de monstruos
    public static boolean puedeEntrar(Integer edad, boolean acompanado, String criatura) {
        return edad >= 18 || acompanado || criatura.equals("vampiro");
    }

    // 2. clasificador de caramelos
    public static Integer cuentaCaramelos(List<String> caramelos, String tipo) {
        return (int) caramelos.stream().filter(Objects::nonNull).filter(e -> e.equals(tipo)).count();
    }

    // 3. contador de pasos en el laberinto
    public static Integer pasosLaberinto(List<Integer> pasos) {
        return pasos.stream().takeWhile(e -> e > 0).reduce(0, (a, b) -> a + b);
    }

    // 4. nivel medio de magia en las calabazas
    public static Double promedioMagia(List<Integer> niveles) {

        if (niveles.isEmpty()) {
            return null;
        }

        Integer count = 0;
        Double sum = 0.;

        for (Integer nivel : niveles) {
            if (nivel >= 5) {
                count++;
                sum += nivel;
            }
        }

        Double res = sum / count;
        return (double) Math.round(res * 100) / 100;
    }

    // 5. recursividad: cuenta atrás de sustos
    public static void cuentaAtrasSustos(Integer n) {
        if (n == null) {
            throw new IllegalArgumentException();
        }

        if (n <= 0) {
            System.out.println("¡Susto final!");
        } else {
            System.out.println("Boo " + n);
            cuentaAtrasSustos(n - 1);
        }
    }

    // 6. suma entre los dos ceros
    public static Integer sumaEntreCeros(List<Integer> numeros) {
        List<Integer> subList = numeros.subList(numeros.indexOf(0), numeros.lastIndexOf(0));
        return suma1(subList);
    }
}
