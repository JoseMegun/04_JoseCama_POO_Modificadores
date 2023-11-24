package Private_04;
/**
 *
 * @author jose_
 */
public class Main_S8_Private {
    
    public static void main(String[] args) {
        
        // Objeto del class Auto_04
        Auto_04 miAuto = new Auto_04("Toyota", "Rojo");

        // Acceder a métodos públicos para interactuar con la clase
        System.out.println("Información del Auto:");
        System.out.println("Marca: " + miAuto.getMarca());
        System.out.println("Color: " + miAuto.getColor());

        // Llamar al método público para conducir, que a su vez utiliza el método privado
        System.out.println("\nConduciendo el Auto:");
        miAuto.conducir();
    }
}
