package Default_04;
/**
 *
 * @author jose_
 */
public class Main_S8_Default {
    
    public static void main(String[] args) {
        
        // Objeto del class Computadora_04
        Computadora_04 miPC = new Computadora_04("HP", "Gamer");
        
        // Llamar a los métodos del class Computadora_04
        System.out.println("Información de la computadora:");
        miPC.encender();
        miPC.utilidad();
        
    }
}
