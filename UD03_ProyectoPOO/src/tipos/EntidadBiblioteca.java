package tipos;

import java.util.ArrayList;
import java.util.List;

public class EntidadBiblioteca {

    private final String nombre;
    private final List<EntidadLibro> libros;

    public EntidadBiblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<EntidadLibro> getLibros() {
        return new ArrayList<>(libros);
    }

    public Boolean agregar(EntidadLibro libro) {

        if (libro == null || libros.contains(libro)) {
            return false;
        }

        libros.add(libro);
        return true;
    }

    public EntidadLibro buscar(String isbn) {

        for (EntidadLibro libro : libros) {
            if (libro.getISBN().equals(isbn)) {
                return libro;
            }
        }

        return null;
    }

    public EntidadLibro eliminar(String isbn) {

        EntidadLibro libro = buscar(isbn);
        libros.remove(libro);
        return libro;
    }

    public void printarLibros() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(i + 1 + ". " + libros.get(i));
        }
    }

    @Override
    public String toString() {
        return "Biblioteca(nombre=" + nombre + ", libros=" + libros + ")";
    }

}
