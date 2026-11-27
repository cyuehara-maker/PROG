package tipos;

import java.util.ArrayList;
import java.util.List;

public class EntidadBiblioteca {

    private final String nombre;
    private List<EntidadLibro> libros;

    public EntidadBiblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean agregar(EntidadLibro libro) {

        if (libro == null || libros.contains(libro)) {
            return false;
        }
        
        libros.add(libro);
        return true;
    }
}
