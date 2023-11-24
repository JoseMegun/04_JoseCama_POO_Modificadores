package Default_04;

// Estudiante: Jose Megun Cama La Madrid
// Tipo Default 

public class Computadora_04 {
    // Atributos Default
    String marca;
    String tipo;

    // Constructor
    Computadora_04(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    // Método del class Default
    void encender() {
        System.out.println("Encendiendo la computadora de marca: " + marca);
    }
    
    void utilidad() {
        System.out.println("Mi computadora es tipo: " + tipo);
    }
}
