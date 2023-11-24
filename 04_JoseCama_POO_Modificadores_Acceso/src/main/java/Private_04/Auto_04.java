package Private_04;

// Estudiante: Jose Megun Cama La Madrid
//  Tipo Private 

public class Auto_04 {
    // Atributos privados
    private String marca;
    private String color;

    // Constructor
    public Auto_04(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    // Método privado
    private void arrancar() {
        System.out.println("Arrancando el auto " + marca);
    }

    // Método público que utiliza el método privado
    public void conducir() {
        arrancar();
        System.out.println("Conduciendo el auto " + marca);
    }

    // Métodos getters para los atributos privados
    public String getMarca() {
        return marca;
    }
    
    public String getColor() {
        return color;
    }
}
