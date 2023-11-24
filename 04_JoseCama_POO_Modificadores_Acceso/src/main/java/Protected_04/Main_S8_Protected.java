package Protected_04;

/**
 *
 * @author jose_
 */
public class Main_S8_Protected {
    
    public static void main(String[] args) {
        // Objeto del class Mascota_04
        Mascota_04 miMascota = new Mascota_04("Max", 3, "Perro");

        // Acceder a métodos protegidos para interactuar con el class
        System.out.println("Información de la Mascota:");
        miMascota.alimentar();
        miMascota.años();
        miMascota.tipo();
        
    }
}
