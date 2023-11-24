package Public_04;

// Estudiante: Jose Megun Cama La Madrid
// Tipo Public

public class Libro_04 {
    // Atributos públicos
    public String titulo;
    public int stock;
    public String genero;

    // Constructor
    public Libro_04(String titulo, int stock, String genero) {
        this.titulo = titulo;
        this.stock = stock;
        this.genero = genero;
    }

    // Métodos públicos
    public void abrir() {
        System.out.println("Voy a leer el libro titulado '" + titulo + "'");
    }
    public void cantidad() {
        System.out.println("En la biblioteca, solo quedan " + stock + " libros similares");
    }
    public void tipo() {
        System.out.println("El libro que elegí es de género de " + genero);
    }

}
