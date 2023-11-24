package Public_04;

/**
 *
 * @author jose_
 */
public class Main_S8_Public {

    public static void main(String[] args) {
        
        // Objeto del class Libro_04
        Libro_04 miLibro = new Libro_04("La guerra de los mundos", 10, "Ciencia Ficción");

        // Acceder a métodos públicos para interactuar con el class
        System.out.println("Información del Libro:");
        miLibro.abrir();
        miLibro.cantidad();
        miLibro.tipo();
    }
}
