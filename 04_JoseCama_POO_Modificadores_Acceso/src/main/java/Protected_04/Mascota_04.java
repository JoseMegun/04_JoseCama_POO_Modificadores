package Protected_04;

// Estudiante: Jose Megun Cama La Madrid
// Tipo Protected

public class Mascota_04 {
    // Atributos protegidos
    protected String nombre;
    protected int edad;
    protected String especie;

    // Constructor
    protected Mascota_04(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    // Métodos protegidos
    protected void alimentar() {
        System.out.println("Alimentando a la mascota llamada " + nombre);
    }
    
    protected void años() {
        System.out.println("Mi mascota tiene: " + edad + " años");
    }
    
    protected void tipo() {
        System.out.println("Mi mascota es: " + especie);
    }
    
}
